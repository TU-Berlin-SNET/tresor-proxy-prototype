package de.cloudtresor.proxy.handler.impl;

import java.util.HashMap;
import java.util.Map;

import de.cloudtresor.model.proxy.endpoint.EndpointConfiguration;
import de.cloudtresor.proxy.handler.EndpointHandler;
import de.cloudtresor.proxy.handler.EndpointHandlerFactory;

public class EndpointHandlerFactoryImpl implements EndpointHandlerFactory {
	static Map<String, EndpointHandlerFactory> endpointHandlerFactoryRegistry = new HashMap<String, EndpointHandlerFactory>(3); 
	
	public EndpointHandlerFactoryImpl() {
		endpointHandlerFactoryRegistry.put("http", new LocalHTTPEndpointHandlerFactoryImpl());
	}
	
	public EndpointHandler createHandlerForConfiguration(EndpointConfiguration configuration) {
		return endpointHandlerFactoryRegistry.get(configuration.getUrl().getProtocol()).createHandlerForConfiguration(configuration);
	}
}