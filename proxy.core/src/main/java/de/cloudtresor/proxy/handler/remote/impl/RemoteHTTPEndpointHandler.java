package de.cloudtresor.proxy.handler.remote.impl;

import java.io.Closeable;
import java.io.IOException;
import java.net.SocketAddress;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.management.RuntimeErrorException;

import org.glassfish.grizzly.Buffer;
import org.glassfish.grizzly.Connection;
import org.glassfish.grizzly.filterchain.BaseFilter;
import org.glassfish.grizzly.filterchain.FilterChain;
import org.glassfish.grizzly.filterchain.FilterChainBuilder;
import org.glassfish.grizzly.filterchain.FilterChainContext;
import org.glassfish.grizzly.filterchain.NextAction;
import org.glassfish.grizzly.filterchain.TransportFilter;
import org.glassfish.grizzly.http.HttpClientFilter;
import org.glassfish.grizzly.http.HttpContent;
import org.glassfish.grizzly.http.HttpHeader;
import org.glassfish.grizzly.http.HttpRequestPacket;
import org.glassfish.grizzly.http.Protocol;
import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;
import org.glassfish.grizzly.http.util.Header;
import org.glassfish.grizzly.nio.transport.TCPNIOTransport;
import org.glassfish.grizzly.nio.transport.TCPNIOTransportBuilder;
import org.glassfish.grizzly.utils.IdleTimeoutFilter;
import org.springframework.http.HttpHeaders;

import de.cloudtresor.model.proxy.endpoint.RemoteEndpointConfiguration;
import de.cloudtresor.proxy.handler.remote.RemoteEndpointHandler;

public class RemoteHTTPEndpointHandler extends AbstractRemoteEndpointHandler {
	FilterChainBuilder filterChainBuilder = FilterChainBuilder.stateless();
	
	public RemoteHTTPEndpointHandler(RemoteEndpointConfiguration configuration) {
		super(configuration);
		
		filterChainBuilder.add(new TransportFilter());
		filterChainBuilder.add(new IdleTimeoutFilter(null, 10, TimeUnit.SECONDS));
		filterChainBuilder.add(new HttpClientFilter());
	}

	public void handle(Request request, Response response) {
		FilterChain filterChain = filterChainBuilder.build();
		
		filterChain.add(new RemoteHTTPEndpointFilter(request, response));
		
		TCPNIOTransport transport = TCPNIOTransportBuilder.newInstance().build();
		
		transport.setProcessor(filterChain);
		
		try {
			transport.start();
			
			Connection connection = null;
			
			Future<Connection> connectFuture = transport.connect(remoteHost, remotePort);
			
			connection = connectFuture.get(10, TimeUnit.SECONDS);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		} catch (ExecutionException e) {
			throw new RuntimeException(e);
		} catch (TimeoutException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				transport.stop();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	private class RemoteHTTPEndpointFilter extends BaseFilter {
		private final Request request;
		private final Response response;
		
		RemoteHTTPEndpointFilter(final Request request, final Response response) {
			this.request = request;
			this.response = response;
		}
		
		/**
	     * The method is called, when a client connection gets connected to a web
	     * server.
	     * 
	     * When this method gets called by a framework - it means that client connection
	     * has been established and we can send HTTP request to the web server.
	     *
	     * @param ctx Client connect processing context
	     *
	     * @return {@link NextAction}
	     * @throws IOException
	     */
		@Override
		public NextAction handleConnect(FilterChainContext ctx) throws IOException {
			final HttpRequestPacket httpRequest = HttpRequestPacket.builder().method(request.getMethod()).uri(request.getDecodedRequestURI()).protocol(Protocol.HTTP_1_1).build();
			
			for(String headerName : request.getHeaderNames()) {
				if(!headerName.equals(Header.Authorization.name()) && !headerName.equals(Header.WWWAuthenticate.name())) {
					httpRequest.addHeader(headerName, request.getHeader(headerName));
				}
			}
			
			// TODO Handle post
			ctx.write(httpRequest);
			
			// Return the stop action, which means we don't expect next filter to process connect event
			return ctx.getStopAction();
		}
		
		/**
	     * The method is called, when we receive a {@link HttpContent} from a server.
	     * 
	     * @param ctx Request processing context
	     *
	     * @return {@link NextAction}
	     * @throws IOException
	     */
		@Override
		public NextAction handleRead(FilterChainContext ctx) throws IOException {
			try {
				final HttpContent httpContent = (HttpContent) ctx.getMessage();
				
				final Buffer buffer = httpContent.getContent();
				
				if(buffer.remaining() > 0) {
					response.getOutputBuffer().writeBuffer(buffer);
				}
				
				if(httpContent.isLast()) {
					response.finish();
				}
			} catch (IOException e) {
				response.finish();
				
				throw new RuntimeException(e);
			}
			
			// Return the stop action, which means we don't expect next filter to process connect event
			return ctx.getStopAction();
		}
		
		/**
	     * The method is called, when the client connection will get closed.
	     * Intercepting this method let's use release resources, like local FileChannel,
	     * if it wasn't released before.
	     *
	     * @param ctx Request processing context
	     *
	     * @return {@link NextAction}
	     * @throws IOException
	     */
		public NextAction handleClose(FilterChainContext ctx) throws IOException {
			response.finish();
			
			return ctx.getStopAction();
		}

	}
}