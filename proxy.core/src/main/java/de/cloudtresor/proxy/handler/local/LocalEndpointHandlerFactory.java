package de.cloudtresor.proxy.handler.local;

import de.cloudtresor.model.proxy.endpoint.LocalEndpointConfiguration;
import de.cloudtresor.proxy.handler.local.impl.LocalEndpointHandlerFactoryImpl;

public interface LocalEndpointHandlerFactory {
	public static LocalEndpointHandlerFactory INSTANCE = LocalEndpointHandlerFactoryImpl.init();
	
	public LocalEndpointHandler createHandlerForConfiguration(LocalEndpointConfiguration configuration);
}