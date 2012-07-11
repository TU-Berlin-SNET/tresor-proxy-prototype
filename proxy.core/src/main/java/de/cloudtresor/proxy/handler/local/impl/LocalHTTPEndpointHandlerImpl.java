package de.cloudtresor.proxy.handler.local.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.grizzly.http.server.ServerConfiguration;

import de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpointConfiguration;
import de.cloudtresor.proxy.handler.local.LocalEndpointHandler;
import de.cloudtresor.proxy.handler.local.impl.grizzly.LocalHTTPEndpointGrizzlyHandler;

public class LocalHTTPEndpointHandlerImpl implements LocalEndpointHandler {
	private static Integer DEFAULT_PORT = 80;
	
	private List<InetAddress> adresses = new ArrayList<InetAddress>(2);
	private int port = DEFAULT_PORT;
	
	private HttpServer server;
	
	public LocalHTTPEndpointHandlerImpl(LocalHTTPEndpointConfiguration endpointConfiguration) {
		for(String adressString : endpointConfiguration.getBoundInterfaces()) {
			try {
				InetAddress address = InetAddress.getByName(adressString);
				
				adresses.add(address);
			} catch (UnknownHostException e) {
				throw new RuntimeException(e);
			}
		}
		
		if(endpointConfiguration.getUrl().getPort() != 0) {
			port = endpointConfiguration.getUrl().getPort();
		}
		
		server = HttpServer.createSimpleServer(null, port);
		ServerConfiguration serverConfiguration = server.getServerConfiguration();
		serverConfiguration.addHttpHandler(new LocalHTTPEndpointGrizzlyHandler(endpointConfiguration));
	}

	public void startup() {
		try {
			server.start();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void shutdown() {
		server.stop();
	}
}