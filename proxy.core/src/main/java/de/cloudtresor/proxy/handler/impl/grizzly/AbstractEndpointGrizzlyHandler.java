package de.cloudtresor.proxy.handler.impl.grizzly;

import java.io.CharConversionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import org.glassfish.grizzly.http.server.HttpHandler;
import org.glassfish.grizzly.http.server.Request;

import de.cloudtresor.model.proxy.ServiceConfigurationItem;
import de.cloudtresor.model.proxy.auth.AuthenticationMethod;
import de.cloudtresor.model.proxy.auth.AuthorizationConfiguration;
import de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem;
import de.cloudtresor.model.proxy.auth.AuthorizationMethod;
import de.cloudtresor.model.proxy.endpoint.EndpointConfiguration;

abstract class AbstractEndpointGrizzlyHandler extends HttpHandler {
	List<AuthenticationMethod> authenticationMethods = new LinkedList<AuthenticationMethod>();
	List<AuthorizationMethod> authorizationMethods = new LinkedList<AuthorizationMethod>();
	AuthorizationConfiguration authorizationConfiguration;
	
	Map<Pattern, AuthorizationConfigurationItem> patternMap = new HashMap<Pattern, AuthorizationConfigurationItem>(5);
	
	AbstractEndpointGrizzlyHandler(EndpointConfiguration configuration) {
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
	List<AuthorizationConfigurationItem> getAuthorizationItems(final Request request) {
		List<AuthorizationConfigurationItem> items = new ArrayList<AuthorizationConfigurationItem>(5); 
		
		if(authorizationConfiguration != null) {
			try {
				String requestUri = request.getDecodedRequestURI();
				
				for(Entry<Pattern, AuthorizationConfigurationItem> entry : patternMap.entrySet()) {
					if(entry.getKey().matcher(requestUri).matches()) {
						items.add(entry.getValue());
					}
				}
			} catch (CharConversionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
}