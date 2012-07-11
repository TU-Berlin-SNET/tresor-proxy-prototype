package de.cloudtresor.proxy.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.springframework.web.filter.OncePerRequestFilter;

import de.cloudtresor.model.proxy.ConfigurationItem;
import de.cloudtresor.model.proxy.ProxyConfiguration;
import de.cloudtresor.model.proxy.ProxyPackage;
import de.cloudtresor.model.proxy.Service;
import de.cloudtresor.model.proxy.endpoint.EndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.LocalEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.RemoteEndpointConfiguration;
import de.cloudtresor.proxy.Proxy;
import de.cloudtresor.proxy.handler.local.LocalEndpointHandler;
import de.cloudtresor.proxy.handler.local.LocalEndpointHandlerFactory;
import de.cloudtresor.proxy.handler.remote.RemoteEndpointHandlerFactory;

public class ProxyImpl implements Proxy {
	private ProxyConfiguration configuration;
	
	private List<LocalEndpointHandler> configuredHandlers;
	
	public ProxyImpl() {
		// Without this, there will be a ClassCastException. See
		// EPackageRegistryImpl.createGlobalRegistry for hints.
		@SuppressWarnings("unused")
		ProxyPackage pp = ProxyPackage.eINSTANCE;
		
		// TODO: Externalize proxy configuration URL
		URI proxyConfigurationUri = URI.createURI("platform:/plugin/de.cloudtresor.proxy.core/config/proxy_configuration.proxy");
		
		XMIResource proxyConfigurationResource = new XMIResourceImpl(proxyConfigurationUri); 
		
		try {
			proxyConfigurationResource.load(new HashMap<Object, Object>());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
		configuration = (ProxyConfiguration) proxyConfigurationResource.getContents().get(0);
		
		configuredHandlers = new ArrayList<LocalEndpointHandler>(configuration.getConfigurationItems().size());
		
		// Creates Handlers
		for(ConfigurationItem item : configuration.getConfigurationItems()) {
			if(item instanceof LocalEndpointConfiguration) {
				configuredHandlers.add(LocalEndpointHandlerFactory.INSTANCE.createHandlerForConfiguration((LocalEndpointConfiguration) item));
			}
		}
		
		startup();
	}

	public ProxyConfiguration getProxyConfiguration() {
		return configuration;
	}

	public List<LocalEndpointHandler> getConfiguredHandlers() {
		return configuredHandlers;
	}
	
	public void startup() {
		for(LocalEndpointHandler handler : configuredHandlers) {
			handler.startup();
		}
	}
	
	public void shutdown() {
		for(LocalEndpointHandler handler : configuredHandlers) {
			handler.shutdown();
		}
	}
}
