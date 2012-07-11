package de.cloudtresor.proxy.handler.remote.impl;

import java.util.HashMap;
import java.util.Map;

import de.cloudtresor.model.proxy.endpoint.LocalEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.RemoteEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.RemoteHTTPEndpointConfiguration;
import de.cloudtresor.proxy.handler.local.LocalEndpointHandler;
import de.cloudtresor.proxy.handler.local.LocalEndpointHandlerFactory;
import de.cloudtresor.proxy.handler.local.impl.LocalEndpointHandlerFactoryImpl;
import de.cloudtresor.proxy.handler.local.impl.LocalHTTPEndpointHandlerFactoryImpl;
import de.cloudtresor.proxy.handler.remote.RemoteEndpointHandler;
import de.cloudtresor.proxy.handler.remote.RemoteEndpointHandlerFactory;

public class RemoteEndpointHandlerFactoryImpl implements RemoteEndpointHandlerFactory {
	private Map<String, RemoteEndpointHandlerFactory> endpointHandlerFactoryRegistry = new HashMap<String, RemoteEndpointHandlerFactory>(3); 
	
	public static RemoteEndpointHandlerFactoryImpl init() {
		RemoteEndpointHandlerFactoryImpl factoryImpl = new RemoteEndpointHandlerFactoryImpl();
		
		factoryImpl.registerEndpointHandlerFactory(RemoteHTTPEndpointConfiguration.class.getSimpleName(), new RemoteHTTPEndpointHandlerFactoryImpl());
		
		return factoryImpl;
	}
	
	public void registerEndpointHandlerFactory(String className, RemoteEndpointHandlerFactory factory) {
		endpointHandlerFactoryRegistry.put(className, factory);
	}
	
	public RemoteEndpointHandler createHandlerForConfiguration(RemoteEndpointConfiguration configuration) {
		return endpointHandlerFactoryRegistry.get(configuration.getClass().getSimpleName().replace("Impl", "")).createHandlerForConfiguration(configuration);
	}
}
