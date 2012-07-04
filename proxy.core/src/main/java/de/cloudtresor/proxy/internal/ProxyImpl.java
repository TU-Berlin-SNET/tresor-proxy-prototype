package de.cloudtresor.proxy.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;

import de.cloudtresor.model.proxy.ConfigurationItem;
import de.cloudtresor.model.proxy.ProxyConfiguration;
import de.cloudtresor.model.proxy.endpoint.EndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpoint;
import de.cloudtresor.proxy.Proxy;
import de.cloudtresor.proxy.handler.EndpointHandler;
import de.cloudtresor.proxy.handler.EndpointHandlerFactory;
import de.cloudtresor.util.ModelUtil;

public class ProxyImpl implements Proxy {
	private Logger log = Logger.getLogger(this.getClass().getName());

	private ModelUtil modelUtil;
	private ProxyConfiguration configuration;
	private List<EndpointHandler> configuredHandlers;

	public ProxyImpl(ModelUtil modelUtil, EndpointHandlerFactory factory) {
		this.modelUtil = modelUtil;

		configuration = modelUtil.readProxyConfiguration(URI.createURI("file://c:/daten/tresorproxy/proxy.core/src/main/resources/config/proxy_configuration.proxy"));

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
