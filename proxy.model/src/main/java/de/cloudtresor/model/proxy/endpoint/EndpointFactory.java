/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage
 * @generated
 */
public interface EndpointFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EndpointFactory eINSTANCE = de.cloudtresor.model.proxy.endpoint.impl.EndpointFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Local HTTP Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local HTTP Endpoint</em>'.
	 * @generated
	 */
	LocalHTTPEndpoint createLocalHTTPEndpoint();

	/**
	 * Returns a new object of class '<em>Local SSL Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local SSL Endpoint</em>'.
	 * @generated
	 */
	LocalSSLEndpoint createLocalSSLEndpoint();

	/**
	 * Returns a new object of class '<em>Local TSTP Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local TSTP Endpoint</em>'.
	 * @generated
	 */
	LocalTSTPEndpoint createLocalTSTPEndpoint();

	/**
	 * Returns a new object of class '<em>Remote HTTP Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote HTTP Endpoint</em>'.
	 * @generated
	 */
	RemoteHTTPEndpoint createRemoteHTTPEndpoint();

	/**
	 * Returns a new object of class '<em>Remote SSL Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote SSL Endpoint</em>'.
	 * @generated
	 */
	RemoteSSLEndpoint createRemoteSSLEndpoint();

	/**
	 * Returns a new object of class '<em>Remote TSTP Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote TSTP Endpoint</em>'.
	 * @generated
	 */
	RemoteTSTPEndpoint createRemoteTSTPEndpoint();

	/**
	 * Returns a new object of class '<em>Client SSL Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client SSL Configuration</em>'.
	 * @generated
	 */
	ClientSSLConfiguration createClientSSLConfiguration();

	/**
	 * Returns a new object of class '<em>Server SSL Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server SSL Configuration</em>'.
	 * @generated
	 */
	ServerSSLConfiguration createServerSSLConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EndpointPackage getEndpointPackage();

} //EndpointFactory
