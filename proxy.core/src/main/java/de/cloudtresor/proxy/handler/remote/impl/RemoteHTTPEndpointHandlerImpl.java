package de.cloudtresor.proxy.handler.remote.impl;

import java.io.IOException;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.glassfish.grizzly.Buffer;
import org.glassfish.grizzly.Connection;
import org.glassfish.grizzly.WriteHandler;
import org.glassfish.grizzly.Connection.CloseListener;
import org.glassfish.grizzly.Connection.CloseType;
import org.glassfish.grizzly.attributes.AttributeHolder;
import org.glassfish.grizzly.filterchain.BaseFilter;
import org.glassfish.grizzly.filterchain.FilterChain;
import org.glassfish.grizzly.filterchain.FilterChainBuilder;
import org.glassfish.grizzly.filterchain.FilterChainContext;
import org.glassfish.grizzly.filterchain.NextAction;
import org.glassfish.grizzly.filterchain.TransportFilter;
import org.glassfish.grizzly.http.ContentEncoding;
import org.glassfish.grizzly.http.GZipContentEncoding;
import org.glassfish.grizzly.http.HttpClientFilter;
import org.glassfish.grizzly.http.HttpContent;
import org.glassfish.grizzly.http.HttpHeader;
import org.glassfish.grizzly.http.HttpRequestPacket;
import org.glassfish.grizzly.http.HttpResponsePacket;
import org.glassfish.grizzly.http.Method;
import org.glassfish.grizzly.http.ParsingResult;
import org.glassfish.grizzly.http.Protocol;
import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;
import org.glassfish.grizzly.http.server.io.NIOOutputStream;
import org.glassfish.grizzly.http.server.io.OutputBuffer;
import org.glassfish.grizzly.http.util.Header;
import org.glassfish.grizzly.http.util.MimeHeaders;
import org.glassfish.grizzly.impl.SafeFutureImpl;
import org.glassfish.grizzly.nio.transport.TCPNIOTransport;
import org.glassfish.grizzly.nio.transport.TCPNIOTransportBuilder;
import org.springframework.http.client.support.HttpAccessor;

import de.cloudtresor.model.proxy.endpoint.RemoteEndpointConfiguration;

public class RemoteHTTPEndpointHandlerImpl extends AbstractRemoteEndpointHandler {
	public RemoteHTTPEndpointHandlerImpl(RemoteEndpointConfiguration configuration) {
		super(configuration);
	}

	public void handle(final Request request, final Response response) {
		response.suspend();
		
		SafeFutureImpl<Boolean> completeFuture = new SafeFutureImpl<Boolean>();
		
		FilterChainBuilder filterChainBuilder = FilterChainBuilder.stateless();
		filterChainBuilder.add(new TransportFilter());
		
		// Remove ContentEncoding because we want to send messages "as is"
		HttpClientFilter clientFilter = new HttpClientFilter();
		for(ContentEncoding encoding : clientFilter.getContentEncodings()) {
			clientFilter.removeContentEncoding(encoding);
		}
		
		filterChainBuilder.add(clientFilter);
		filterChainBuilder.add(new RemoteHTTPEndpointFilter(request, response, completeFuture));
		
		FilterChain filterChain = filterChainBuilder.build();
		
		TCPNIOTransport transport = TCPNIOTransportBuilder.newInstance().build();
		
		transport.setProcessor(filterChain);
		
		try {
			transport.start();
			
			Connection connection = null;
			
			connection = transport.connect(remoteHost, remotePort).get(15, TimeUnit.SECONDS);
			
			Boolean complete = completeFuture.get();
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
		private final SafeFutureImpl<Boolean> completeFuture;
		private boolean firstPacket = true;
		
		RemoteHTTPEndpointFilter(final Request request, final Response response, final SafeFutureImpl<Boolean> completeFuture) {
			this.request = request;
			this.response = response;
			this.completeFuture = completeFuture;
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
			Method method = request.getMethod();
			String requestUri = request.getDecodedRequestURI();
			
			final HttpRequestPacket httpRequest = HttpRequestPacket.builder().method(method.getMethodString()).uri(requestUri).protocol(Protocol.HTTP_1_1).build();
			
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
			final HttpContent httpContent = (HttpContent) ctx.getMessage();
			final HttpResponsePacket httpResponse = (HttpResponsePacket) httpContent.getHttpHeader();
			final Buffer buffer = httpContent.getContent();
			
			if(firstPacket) {
				response.setStatus(httpResponse.getStatus());
				
				MimeHeaders httpHeaders = httpResponse.getHeaders();
				
				for(String mimeHeaderName : httpHeaders.names()) {
					Header httpHeader = Header.find(mimeHeaderName);
					
					//i.e. keep-alive is no defined HTTP Header (because it is set in other ways)
					if(httpHeader != null) {
						String headerValue = httpResponse.getHeader(httpHeader);
						
						if(headerValue != null) {
							response.setHeader(httpHeader, headerValue);
						}
					}
				}
				
				firstPacket = false;
			}
			
			if(buffer.hasRemaining()) {
				final int remaining = buffer.remaining();
				final NIOOutputStream outputStream = response.getNIOOutputStream();
				
				outputStream.notifyCanWrite(new WriteHandler() {
					
					public void onWritePossible() throws Exception {
						outputStream.write(buffer);
					}
					
					public void onError(Throwable t) {
						throw new RuntimeException(t);
					}
				}, remaining);
			}
			
			if(httpContent.isLast()) {
				completeFuture.result(true);
				
				response.getNIOOutputStream().flush();
				response.resume();
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
			return ctx.getStopAction();
		}

	}
}