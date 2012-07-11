package de.cloudtresor.proxy.handler.remote;

import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;

public interface RemoteEndpointHandler {
	public void handle(final Request request, final Response response);
}
