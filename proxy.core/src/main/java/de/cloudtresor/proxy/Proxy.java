package de.cloudtresor.proxy;

import java.util.List;

import de.cloudtresor.model.proxy.ProxyConfiguration;
import de.cloudtresor.proxy.handler.EndpointHandler;

public interface Proxy {
	public ProxyConfiguration getProxyConfiguration();
	
	public List<EndpointHandler> getConfiguredHandlers();
}