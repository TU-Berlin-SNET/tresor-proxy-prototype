package de.cloudtresor.proxy.handler.local.impl.grizzly;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import org.glassfish.grizzly.http.server.HttpHandler;
import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;
import org.glassfish.grizzly.http.util.Header;
import org.glassfish.grizzly.http.util.HttpStatus;

import de.cloudtresor.model.proxy.ServiceConfigurationItem;
import de.cloudtresor.model.proxy.auth.AuthenticationMethod;
import de.cloudtresor.model.proxy.auth.AuthorizationConfiguration;
import de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem;
import de.cloudtresor.model.proxy.auth.AuthorizationMethod;
import de.cloudtresor.model.proxy.auth.AuthorizationRequireValidUser;
import de.cloudtresor.model.proxy.endpoint.EndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.RemoteEndpointConfiguration;
import de.cloudtresor.proxy.handler.local.LocalAuthenticationMethodHandler;
import de.cloudtresor.proxy.handler.remote.RemoteEndpointHandler;
import de.cloudtresor.proxy.handler.remote.RemoteEndpointHandlerFactory;

abstract class AbstractEndpointGrizzlyHandler extends HttpHandler {
	List<AuthenticationMethod> authenticationMethods = new LinkedList<AuthenticationMethod>();
	List<AuthorizationMethod> authorizationMethods = new LinkedList<AuthorizationMethod>();
	AuthorizationConfiguration authorizationConfiguration;
	
	Map<Pattern, AuthorizationConfigurationItem> patternMap = new HashMap<Pattern, AuthorizationConfigurationItem>(5);
	Map<AuthenticationMethod, LocalAuthenticationMethodHandler> authenticationMethodHandlerMap = new HashMap<AuthenticationMethod, LocalAuthenticationMethodHandler>();
	
	RemoteEndpointHandler remoteHandler;
	
	EndpointConfiguration configuration;
	
	AbstractEndpointGrizzlyHandler(EndpointConfiguration configuration) {
		this.configuration = configuration;
		
		for(ServiceConfigurationItem item : configuration.getService().getServiceConfigurationItem()) {
			// TODO: Modular Auth Interface
			if(item instanceof AuthenticationMethod) {
				authenticationMethods.add((AuthenticationMethod) item);
			} else if (item instanceof AuthorizationMethod) {
				authorizationMethods.add((AuthorizationMethod) item);
			} else if (item instanceof AuthorizationConfiguration) {
				authorizationConfiguration = (AuthorizationConfiguration) item;
			}
		}
		
		for(AuthorizationConfigurationItem item : authorizationConfiguration.getAuthorizationConfigurationItems()) {
			patternMap.put(Pattern.compile(item.getPattern()), item);
		}
		
		for(AuthenticationMethod authenticationMethod : authenticationMethods) {
			authenticationMethodHandlerMap.put(authenticationMethod, LocalAuthenticationMethodHandler.createAuthenticationMethodHandler(authenticationMethod));
		}
		
		for(EndpointConfiguration endpointConfiguration : configuration.getService().getEndpoints()) {
			if(endpointConfiguration instanceof RemoteEndpointConfiguration) {
				remoteHandler = RemoteEndpointHandlerFactory.INSTANCE.createHandlerForConfiguration((RemoteEndpointConfiguration) endpointConfiguration);
			}
		}
	}
	
	/**
	 * Get the {@link AuthorizationConfigurationItem}s, which are relevant for this request.
	 * 
	 * Normally, the URL of the request is parsed and matched against the pattern of {@link AuthorizationConfigurationItem}.
	 * 
	 * @param request
	 * @return
	 * 	
	 */
	List<AuthorizationConfigurationItem> getAuthorizationItems(final String requestUri) {
		List<AuthorizationConfigurationItem> items = new ArrayList<AuthorizationConfigurationItem>(5); 
		
		if(authorizationConfiguration != null) {
			for(Entry<Pattern, AuthorizationConfigurationItem> entry : patternMap.entrySet()) {
				if(entry.getKey().matcher(requestUri).matches()) {
					items.add(entry.getValue());
				}
			}
		}
		
		return items;
	}
	
	RemoteEndpointConfiguration getRemoteEndpoint() {
		for(EndpointConfiguration endpoint : configuration.getService().getEndpoints()) {
			// TODO Multiple endpoints
			if(endpoint instanceof RemoteEndpointConfiguration) {
				return (RemoteEndpointConfiguration) endpoint;
			}
		}
		
		return null;
	}
	
	/**
	 * Subclasses should implement this, if the requests headers can be trusted
	 * @return
	 */
	boolean isTrustedRequest() {
		return false;
	}

	/**
	 * Authorizes an HTTP request.
	 * 
	 * If any one AuthorizationConfigurationItems are not satisfied, a 401 response is
	 * generated for the client to authenticate itself and false is returned.
	 * 
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	boolean isAuthorized(final Request request, final Response response) {
		String requestUri = request.getRequestURI();
		
		boolean isValid = true;
		
		for(AuthorizationConfigurationItem authorizationConfigurationItem : getAuthorizationItems(requestUri)) {
			if(authorizationConfigurationItem instanceof AuthorizationRequireValidUser) {
				String authorizationString = request.getHeader(Header.Authorization); 
				
				if(authorizationString == null) {
					isValid = false;

					break;
				} else {
					for(Entry<AuthenticationMethod, LocalAuthenticationMethodHandler> entry : authenticationMethodHandlerMap.entrySet()) {
						if(!entry.getValue().isValid(authorizationString)) {
							isValid = false;
							
							break;
						}
					}
				}
			}
		}
		
		if(!isValid) {
			response.setStatus(HttpStatus.UNAUTHORIZED_401);
			response.setHeader(Header.WWWAuthenticate, "Basic realm='TRESOR service " + configuration.getService().getName() + "'");
			try {
				response.getWriter().append("Authentication information not valid!");
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			
			return false;
		}
		
		return true;
	}

	@Override
	protected void customizedErrorPage(Request req, Response res) throws Exception {

	}
}