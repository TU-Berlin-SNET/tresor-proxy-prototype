package de.cloudtresor.proxy.handler.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.grizzly.http.server.ServerConfiguration;

import de.cloudtresor.model.proxy.endpoint.EndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpoint;
import de.cloudtresor.proxy.handler.LocalHTTPEndpointHandler;
import de.cloudtresor.proxy.handler.impl.grizzly.LocalHTTPEndpointGrizzlyHandler;

public class LocalHTTPEndpointHandlerImpl implements LocalHTTPEndpointHandler {
	private static Integer DEFAULT_PORT = 80;
	
	private LocalHTTPEndpoint endpoint;
	
	private List<InetAddress> adresses = new ArrayList<InetAddress>(2);
	private int port = DEFAULT_PORT;
	
	private HttpServer server;
	
	public LocalHTTPEndpointHandlerImpl(EndpointConfiguration configuration) {
		endpoint = (LocalHTTPEndpoint) configuration;
		
		for(String adressString : endpoint.getBoundInterfaces()) {
			try {
				InetAddress address = InetAddress.getByName(adressString);
				
				adresses.add(address);
			} catch (UnknownHostException e) {
				throw new RuntimeException(e);
			}
		}
		
		if(endpoint.getUrl().getPort() != 0) {
			port = endpoint.getUrl().getPort();
		}
		
		server = HttpServer.createSimpleServer(null, port);
		
		ServerConfiguration serverConfiguration = server.getServerConfiguration();
		serverConfiguration.addHttpHandler(new LocalHTTPEndpointGrizzlyHandler(configuration), null);
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