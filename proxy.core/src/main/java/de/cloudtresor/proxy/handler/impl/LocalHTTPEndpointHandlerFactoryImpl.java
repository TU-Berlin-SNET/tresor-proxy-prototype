package de.cloudtresor.proxy.handler.impl;

import de.cloudtresor.model.proxy.endpoint.EndpointConfiguration;
import de.cloudtresor.proxy.handler.EndpointHandler;
import de.cloudtresor.proxy.handler.EndpointHandlerFactory;

public class LocalHTTPEndpointHandlerFactoryImpl implements EndpointHandlerFactory {
	LocalHTTPEndpointHandlerFactoryImpl() { };
	
	public EndpointHandler createHandlerForConfiguration(EndpointConfiguration configuration) {
		return new LocalHTTPEndpointHandlerImpl(configuration);
	}
}
