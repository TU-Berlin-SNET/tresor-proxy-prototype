package de.cloudtresor.proxy.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import de.cloudtresor.model.proxy.ConfigurationItem;
import de.cloudtresor.model.proxy.ProxyConfiguration;
import de.cloudtresor.model.proxy.ProxyPackage;
import de.cloudtresor.model.proxy.endpoint.EndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpoint;
import de.cloudtresor.model.proxy.impl.ProxyConfigurationImpl;
import de.cloudtresor.proxy.Proxy;
import de.cloudtresor.proxy.handler.EndpointHandler;
import de.cloudtresor.proxy.handler.EndpointHandlerFactory;

public class ProxyImpl implements Proxy {
	private ProxyConfiguration configuration;
	private List<EndpointHandler> configuredHandlers;

	public ProxyImpl(EndpointHandlerFactory factory) {
		// Without this, there will be a ClassCastException. See
		// EPackageRegistryImpl.createGlobalRegistry for hints.
		ProxyPackage pp = ProxyPackage.eINSTANCE;
		
		URI proxyConfigurationUri = URI.createURI("platform:/plugin/de.cloudtresor.proxy.core/config/proxy_configuration.proxy");
		
		XMIResource proxyConfigurationResource = new XMIResourceImpl(proxyConfigurationUri); 
		
		try {
			proxyConfigurationResource.load(new HashMap());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		configuration = (ProxyConfiguration) proxyConfigurationResource.getContents().get(0);
		
		configuredHandlers = new ArrayList<EndpointHandler>(configuration.getConfigurationItems().size());
		
		for(ConfigurationItem item : configuration.getConfigurationItems()) {
			if(item instanceof LocalHTTPEndpoint) {
				configuredHandlers.add(factory.createHandlerForConfiguration((EndpointConfiguration) item));
			}
		}
		
		startup();
	}

	public ProxyConfiguration getProxyConfiguration() {
		return configuration;
	}

	public List<EndpointHandler> getConfiguredHandlers() {
		return configuredHandlers;
	}
	
	public void startup() {
		for(EndpointHandler handler : configuredHandlers) {
			handler.startup();
		}
	}
	
	public void shutdown() {
		for(EndpointHandler handler : configuredHandlers) {
			handler.shutdown();
		}
	}
}
