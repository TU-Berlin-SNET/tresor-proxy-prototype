package de.cloudtresor.proxy.handler.remote;

import de.cloudtresor.model.proxy.endpoint.RemoteEndpointConfiguration;
import de.cloudtresor.proxy.handler.remote.impl.RemoteEndpointHandlerFactoryImpl;

public interface RemoteEndpointHandlerFactory {
	public static RemoteEndpointHandlerFactory INSTANCE = RemoteEndpointHandlerFactoryImpl.init();
	
	public RemoteEndpointHandler createHandlerForConfiguration(RemoteEndpointConfiguration configuration);
}
