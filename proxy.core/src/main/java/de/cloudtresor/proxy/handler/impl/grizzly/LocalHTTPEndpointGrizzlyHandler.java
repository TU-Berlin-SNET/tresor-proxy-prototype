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
		for(AuthorizationConfigurationItem item : getAuthorizationItems(request)) {
			if(item instanceof AuthorizationRequireValidUser) {
				if(request.getAuthorization() == null) {
					final String responseString = "401 Unauthorized.";
					
					/*response.suspend();*/
					/*response.setStatus(HttpStatus.UNAUTHORIZED_401);*/
					response.setHeader(Header.WWWAuthenticate, "Basic realm=\"TRESOR Service " + endpoint.getService().getName() + "\"");
					response.setContentLength(responseString.length());
					
					response.getNIOWriter().notifyCanWrite(new WriteHandler() {
						public void onWritePossible() throws Exception {
							response.getNIOWriter().write(responseString);
							response.finish();
						}
						
						public void onError(Throwable e) {
							throw new RuntimeException(e);
						}
					}, responseString.length());
				}
			}
		}
	}

}
