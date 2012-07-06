package de.cloudtresor.proxy.handler.impl.grizzly;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
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
import org.glassfish.grizzly.http.util.Base64Utils;
import org.glassfish.grizzly.http.util.Header;
import org.glassfish.grizzly.http.util.HttpStatus;

import de.cloudtresor.model.proxy.ServiceConfigurationItem;
import de.cloudtresor.model.proxy.auth.AuthenticationMethod;
import de.cloudtresor.model.proxy.auth.AuthorizationConfiguration;
import de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem;
import de.cloudtresor.model.proxy.auth.AuthorizationMethod;
import de.cloudtresor.model.proxy.auth.AuthorizationRequireValidUser;
import de.cloudtresor.model.proxy.endpoint.EndpointConfiguration;
import de.cloudtresor.proxy.handler.impl.AuthenticationMethodHandler;

abstract class AbstractEndpointGrizzlyHandler extends HttpHandler {
	List<AuthenticationMethod> authenticationMethods = new LinkedList<AuthenticationMethod>();
	List<AuthorizationMethod> authorizationMethods = new LinkedList<AuthorizationMethod>();
	AuthorizationConfiguration authorizationConfiguration;
	
	Map<Pattern, AuthorizationConfigurationItem> patternMap = new HashMap<Pattern, AuthorizationConfigurationItem>(5);
	Map<AuthenticationMethod, AuthenticationMethodHandler> authenticationMethodHandlerMap = new HashMap<AuthenticationMethod, AuthenticationMethodHandler>();
	
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
			authenticationMethodHandlerMap.put(authenticationMethod, AuthenticationMethodHandler.createAuthenticationMethodHandler(authenticationMethod));
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
	
	/**
	 * Subclasses should implement this, if the requests headers can be trusted
	 * @return
	 */
	boolean isTrustedRequest() {
		return false;
	}

	void authorize(final Request request, final Response response) throws Exception {
		String requestUri = request.getRequestURI();
		
		boolean isValid = false;
		
		for(AuthorizationConfigurationItem authorizationConfigurationItem : getAuthorizationItems(requestUri)) {
			if(authorizationConfigurationItem instanceof AuthorizationRequireValidUser) {
				String authorizationString = request.getHeader(Header.Authorization); 
				
				if(authorizationString == null) {
					isValid = false;
				} else {
					for(Entry<AuthenticationMethod, AuthenticationMethodHandler> entry : authenticationMethodHandlerMap.entrySet()) {
						boolean thisIsValid = entry.getValue().isValid(authorizationString);
						
						if(thisIsValid) {
							isValid = true;
							
							break;
						}
					}
				}
			}
		}
		
		if(!isValid) {
			response.setStatus(HttpStatus.UNAUTHORIZED_401);
			response.setHeader(Header.WWWAuthenticate, "Basic realm='TRESOR service " + configuration.getService().getName() + "'");
			response.getWriter().append("Authentication information not valid!");
		}
	}

	@Override
	protected void customizedErrorPage(Request req, Response res) throws Exception {

	}
}