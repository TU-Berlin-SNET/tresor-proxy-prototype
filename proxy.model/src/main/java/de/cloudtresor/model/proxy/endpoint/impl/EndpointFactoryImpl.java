/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint.impl;

import de.cloudtresor.model.proxy.endpoint.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EndpointFactoryImpl extends EFactoryImpl implements EndpointFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EndpointFactory init() {
		try {
			EndpointFactory theEndpointFactory = (EndpointFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cloud-tresor.de/model/proxy/endpoint"); 
			if (theEndpointFactory != null) {
				return theEndpointFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EndpointFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EndpointPackage.LOCAL_HTTP_ENDPOINT: return createLocalHTTPEndpoint();
			case EndpointPackage.LOCAL_SSL_ENDPOINT: return createLocalSSLEndpoint();
			case EndpointPackage.LOCAL_TSTP_ENDPOINT: return createLocalTSTPEndpoint();
			case EndpointPackage.REMOTE_HTTP_ENDPOINT: return createRemoteHTTPEndpoint();
			case EndpointPackage.REMOTE_SSL_ENDPOINT: return createRemoteSSLEndpoint();
			case EndpointPackage.REMOTE_TSTP_ENDPOINT: return createRemoteTSTPEndpoint();
			case EndpointPackage.CLIENT_SSL_CONFIGURATION: return createClientSSLConfiguration();
			case EndpointPackage.SERVER_SSL_CONFIGURATION: return createServerSSLConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalHTTPEndpoint createLocalHTTPEndpoint() {
		LocalHTTPEndpointImpl localHTTPEndpoint = new LocalHTTPEndpointImpl();
		return localHTTPEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalSSLEndpoint createLocalSSLEndpoint() {
		LocalSSLEndpointImpl localSSLEndpoint = new LocalSSLEndpointImpl();
		return localSSLEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalTSTPEndpoint createLocalTSTPEndpoint() {
		LocalTSTPEndpointImpl localTSTPEndpoint = new LocalTSTPEndpointImpl();
		return localTSTPEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteHTTPEndpoint createRemoteHTTPEndpoint() {
		RemoteHTTPEndpointImpl remoteHTTPEndpoint = new RemoteHTTPEndpointImpl();
		return remoteHTTPEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteSSLEndpoint createRemoteSSLEndpoint() {
		RemoteSSLEndpointImpl remoteSSLEndpoint = new RemoteSSLEndpointImpl();
		return remoteSSLEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteTSTPEndpoint createRemoteTSTPEndpoint() {
		RemoteTSTPEndpointImpl remoteTSTPEndpoint = new RemoteTSTPEndpointImpl();
		return remoteTSTPEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientSSLConfiguration createClientSSLConfiguration() {
		ClientSSLConfigurationImpl clientSSLConfiguration = new ClientSSLConfigurationImpl();
		return clientSSLConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerSSLConfiguration createServerSSLConfiguration() {
		ServerSSLConfigurationImpl serverSSLConfiguration = new ServerSSLConfigurationImpl();
		return serverSSLConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointPackage getEndpointPackage() {
		return (EndpointPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EndpointPackage getPackage() {
		return EndpointPackage.eINSTANCE;
	}

} //EndpointFactoryImpl
