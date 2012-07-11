package de.cloudtresor.proxy.handler.local.impl;

import de.cloudtresor.model.proxy.endpoint.LocalEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpointConfiguration;
import de.cloudtresor.proxy.handler.local.LocalEndpointHandler;
import de.cloudtresor.proxy.handler.local.LocalEndpointHandlerFactory;

public class LocalHTTPEndpointHandlerFactoryImpl implements LocalEndpointHandlerFactory {
	LocalHTTPEndpointHandlerFactoryImpl() { };
	
	public LocalEndpointHandler createHandlerForConfiguration(LocalEndpointConfiguration configuration) {
		return new LocalHTTPEndpointHandlerImpl((LocalHTTPEndpointConfiguration) configuration);
	}
}
