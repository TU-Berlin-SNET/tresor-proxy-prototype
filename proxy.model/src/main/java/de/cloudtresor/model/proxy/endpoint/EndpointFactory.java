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
	 * Returns a new object of class '<em>Local HTTP Endpoint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local HTTP Endpoint Configuration</em>'.
	 * @generated
	 */
	LocalHTTPEndpointConfiguration createLocalHTTPEndpointConfiguration();

	/**
	 * Returns a new object of class '<em>Local SSL Endpoint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local SSL Endpoint Configuration</em>'.
	 * @generated
	 */
	LocalSSLEndpointConfiguration createLocalSSLEndpointConfiguration();

	/**
	 * Returns a new object of class '<em>Local TSTP Endpoint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local TSTP Endpoint Configuration</em>'.
	 * @generated
	 */
	LocalTSTPEndpointConfiguration createLocalTSTPEndpointConfiguration();

	/**
	 * Returns a new object of class '<em>Remote HTTP Endpoint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote HTTP Endpoint Configuration</em>'.
	 * @generated
	 */
	RemoteHTTPEndpointConfiguration createRemoteHTTPEndpointConfiguration();

	/**
	 * Returns a new object of class '<em>Remote SSL Endpoint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote SSL Endpoint Configuration</em>'.
	 * @generated
	 */
	RemoteSSLEndpointConfiguration createRemoteSSLEndpointConfiguration();

	/**
	 * Returns a new object of class '<em>Remote TSTP Endpoint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remote TSTP Endpoint Configuration</em>'.
	 * @generated
	 */
	RemoteTSTPEndpointConfiguration createRemoteTSTPEndpointConfiguration();

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
