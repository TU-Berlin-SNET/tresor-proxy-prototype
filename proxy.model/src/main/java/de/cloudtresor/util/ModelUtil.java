package de.cloudtresor.util;

import org.eclipse.emf.common.util.URI;

import de.cloudtresor.model.proxy.ProxyConfiguration;

public interface ModelUtil {
	public ProxyConfiguration readProxyConfiguration(URI uri);
}