package de.cloudtresor.proxy.handler.remote.impl;

import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.URL;

import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;

import de.cloudtresor.model.proxy.endpoint.RemoteEndpointConfiguration;
import de.cloudtresor.proxy.handler.remote.RemoteEndpointHandler;

public abstract class AbstractRemoteEndpointHandler implements RemoteEndpointHandler {
	protected RemoteEndpointConfiguration configuration;
	
	protected String remoteHost;
	protected int remotePort;
	
	public AbstractRemoteEndpointHandler(RemoteEndpointConfiguration configuration) {
		this.configuration = configuration;
		
		URL url = configuration.getUrl();
		
		remoteHost = url.getHost();
		remotePort = url.getPort();
		
		if(remotePort == -1) {
			if(url.getProtocol().equals("http")) {
				remotePort = 80;
			} else if(url.getProtocol().equals("https") || url.getProtocol().equals("tstp")){
				remotePort = 443;
			} else {
				throw new InstantiationError("Port of remote URL is missing for RemoteEndpoint '" + url.toString() + "'");
			}
		}
	}
	
	public abstract void handle(Request request, Response response);
}
