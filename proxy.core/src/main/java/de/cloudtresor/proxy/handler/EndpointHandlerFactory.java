package de.cloudtresor.proxy.handler;

import de.cloudtresor.model.proxy.endpoint.EndpointConfiguration;

public interface EndpointHandlerFactory {
	public EndpointHandler createHandlerForConfiguration(EndpointConfiguration configuration);
}