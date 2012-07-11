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
			case EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION: return createLocalHTTPEndpointConfiguration();
			case EndpointPackage.LOCAL_SSL_ENDPOINT_CONFIGURATION: return createLocalSSLEndpointConfiguration();
			case EndpointPackage.LOCAL_TSTP_ENDPOINT_CONFIGURATION: return createLocalTSTPEndpointConfiguration();
			case EndpointPackage.REMOTE_HTTP_ENDPOINT_CONFIGURATION: return createRemoteHTTPEndpointConfiguration();
			case EndpointPackage.REMOTE_SSL_ENDPOINT_CONFIGURATION: return createRemoteSSLEndpointConfiguration();
			case EndpointPackage.REMOTE_TSTP_ENDPOINT_CONFIGURATION: return createRemoteTSTPEndpointConfiguration();
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
	public LocalHTTPEndpointConfiguration createLocalHTTPEndpointConfiguration() {
		LocalHTTPEndpointConfigurationImpl localHTTPEndpointConfiguration = new LocalHTTPEndpointConfigurationImpl();
		return localHTTPEndpointConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalSSLEndpointConfiguration createLocalSSLEndpointConfiguration() {
		LocalSSLEndpointConfigurationImpl localSSLEndpointConfiguration = new LocalSSLEndpointConfigurationImpl();
		return localSSLEndpointConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalTSTPEndpointConfiguration createLocalTSTPEndpointConfiguration() {
		LocalTSTPEndpointConfigurationImpl localTSTPEndpointConfiguration = new LocalTSTPEndpointConfigurationImpl();
		return localTSTPEndpointConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteHTTPEndpointConfiguration createRemoteHTTPEndpointConfiguration() {
		RemoteHTTPEndpointConfigurationImpl remoteHTTPEndpointConfiguration = new RemoteHTTPEndpointConfigurationImpl();
		return remoteHTTPEndpointConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteSSLEndpointConfiguration createRemoteSSLEndpointConfiguration() {
		RemoteSSLEndpointConfigurationImpl remoteSSLEndpointConfiguration = new RemoteSSLEndpointConfigurationImpl();
		return remoteSSLEndpointConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteTSTPEndpointConfiguration createRemoteTSTPEndpointConfiguration() {
		RemoteTSTPEndpointConfigurationImpl remoteTSTPEndpointConfiguration = new RemoteTSTPEndpointConfigurationImpl();
		return remoteTSTPEndpointConfiguration;
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
