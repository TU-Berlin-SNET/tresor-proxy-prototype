package de.cloudtresor.proxy.handler.remote.impl;

import de.cloudtresor.model.proxy.endpoint.RemoteEndpointConfiguration;
import de.cloudtresor.proxy.handler.remote.RemoteEndpointHandler;
import de.cloudtresor.proxy.handler.remote.RemoteEndpointHandlerFactory;

public class RemoteHTTPEndpointHandlerFactoryImpl implements RemoteEndpointHandlerFactory {
	public RemoteEndpointHandler createHandlerForConfiguration(RemoteEndpointConfiguration configuration) {
		return new RemoteHTTPEndpointHandler(configuration);
	}

}
