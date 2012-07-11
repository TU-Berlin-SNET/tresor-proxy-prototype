package de.cloudtresor.proxy.handler.local.impl;

import java.util.HashMap;
import java.util.Map;

import de.cloudtresor.model.proxy.endpoint.LocalEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpointConfiguration;
import de.cloudtresor.proxy.handler.local.LocalEndpointHandler;
import de.cloudtresor.proxy.handler.local.LocalEndpointHandlerFactory;

public class LocalEndpointHandlerFactoryImpl implements LocalEndpointHandlerFactory {
	private Map<String, LocalEndpointHandlerFactory> endpointHandlerFactoryRegistry = new HashMap<String, LocalEndpointHandlerFactory>(3); 
	
	public static LocalEndpointHandlerFactoryImpl init() {
		LocalEndpointHandlerFactoryImpl factoryImpl = new LocalEndpointHandlerFactoryImpl();
		
		factoryImpl.registerEndpointHandlerFactory(LocalHTTPEndpointConfiguration.class.getSimpleName(), new LocalHTTPEndpointHandlerFactoryImpl());
		
		return factoryImpl; 
	}
	
	public void registerEndpointHandlerFactory(String className, LocalEndpointHandlerFactory factory) {
		endpointHandlerFactoryRegistry.put(className, factory);
	}
	
	public LocalEndpointHandler createHandlerForConfiguration(LocalEndpointConfiguration configuration) {
		return endpointHandlerFactoryRegistry.get(configuration.getClass().getSimpleName().replace("Impl", "")).createHandlerForConfiguration(configuration);
	}
}