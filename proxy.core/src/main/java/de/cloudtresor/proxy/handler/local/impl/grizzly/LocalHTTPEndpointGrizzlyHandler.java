package de.cloudtresor.proxy.handler.local.impl.grizzly;

import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;

import de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpointConfiguration;

public class LocalHTTPEndpointGrizzlyHandler extends AbstractEndpointGrizzlyHandler {
	public LocalHTTPEndpointGrizzlyHandler(LocalHTTPEndpointConfiguration configuration) {
		super(configuration);
	}
	
	@Override
	public void service(final Request request, final Response response) throws Exception {
		if(isAuthorized(request, response)) {
			remoteHandler.handle(request, response);
		}
	}
}