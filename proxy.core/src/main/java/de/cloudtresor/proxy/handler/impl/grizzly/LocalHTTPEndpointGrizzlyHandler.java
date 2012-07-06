package de.cloudtresor.proxy.handler.impl.grizzly;

import org.glassfish.grizzly.WriteHandler;
import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;
import org.glassfish.grizzly.http.util.Header;
import org.glassfish.grizzly.http.util.HttpStatus;

import de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem;
import de.cloudtresor.model.proxy.auth.AuthorizationRequireValidUser;
import de.cloudtresor.model.proxy.endpoint.EndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpoint;

public class LocalHTTPEndpointGrizzlyHandler extends AbstractEndpointGrizzlyHandler {
	private LocalHTTPEndpoint endpoint;
	
	public LocalHTTPEndpointGrizzlyHandler(EndpointConfiguration configuration) {
		super(configuration);
		
		endpoint = (LocalHTTPEndpoint) configuration;
	}
	
	@Override
	public void service(final Request request, final Response response) throws Exception {
		authorize(request, response);
	}
}
