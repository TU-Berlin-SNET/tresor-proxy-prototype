package de.cloudtresor.proxy;

import java.util.List;

import de.cloudtresor.model.proxy.ProxyConfiguration;
import de.cloudtresor.proxy.handler.local.LocalEndpointHandler;

public interface Proxy {
	public ProxyConfiguration getProxyConfiguration();
	
	public List<LocalEndpointHandler> getConfiguredHandlers();
}