package de.cloudtresor.proxy.internal;

import de.cloudtresor.proxy.Proxy;

public class ProxyImpl implements Proxy {
	public ProxyImpl() {
		
	}
	
	public void shutDown() {
		System.exit(-1);
	}
}
