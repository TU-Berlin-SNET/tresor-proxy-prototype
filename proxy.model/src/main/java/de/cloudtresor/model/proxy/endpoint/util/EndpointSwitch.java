/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint.util;

import de.cloudtresor.model.proxy.ConfigurationItem;

import de.cloudtresor.model.proxy.endpoint.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage
 * @generated
 */
public class EndpointSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EndpointPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointSwitch() {
		if (modelPackage == null) {
			modelPackage = EndpointPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EndpointPackage.LOCAL_HTTP_ENDPOINT: {
				LocalHTTPEndpoint localHTTPEndpoint = (LocalHTTPEndpoint)theEObject;
				T result = caseLocalHTTPEndpoint(localHTTPEndpoint);
				if (result == null) result = caseConfigurationItem(localHTTPEndpoint);
				if (result == null) result = caseEndpointConfiguration(localHTTPEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.LOCAL_SSL_ENDPOINT: {
				LocalSSLEndpoint localSSLEndpoint = (LocalSSLEndpoint)theEObject;
				T result = caseLocalSSLEndpoint(localSSLEndpoint);
				if (result == null) result = caseLocalHTTPEndpoint(localSSLEndpoint);
				if (result == null) result = caseSecureEndpoint(localSSLEndpoint);
				if (result == null) result = caseConfigurationItem(localSSLEndpoint);
				if (result == null) result = caseEndpointConfiguration(localSSLEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.LOCAL_TSTP_ENDPOINT: {
				LocalTSTPEndpoint localTSTPEndpoint = (LocalTSTPEndpoint)theEObject;
				T result = caseLocalTSTPEndpoint(localTSTPEndpoint);
				if (result == null) result = caseLocalSSLEndpoint(localTSTPEndpoint);
				if (result == null) result = caseTSTPEndpoint(localTSTPEndpoint);
				if (result == null) result = caseLocalHTTPEndpoint(localTSTPEndpoint);
				if (result == null) result = caseSecureEndpoint(localTSTPEndpoint);
				if (result == null) result = caseConfigurationItem(localTSTPEndpoint);
				if (result == null) result = caseEndpointConfiguration(localTSTPEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.REMOTE_HTTP_ENDPOINT: {
				RemoteHTTPEndpoint remoteHTTPEndpoint = (RemoteHTTPEndpoint)theEObject;
				T result = caseRemoteHTTPEndpoint(remoteHTTPEndpoint);
				if (result == null) result = caseConfigurationItem(remoteHTTPEndpoint);
				if (result == null) result = caseEndpointConfiguration(remoteHTTPEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.REMOTE_SSL_ENDPOINT: {
				RemoteSSLEndpoint remoteSSLEndpoint = (RemoteSSLEndpoint)theEObject;
				T result = caseRemoteSSLEndpoint(remoteSSLEndpoint);
				if (result == null) result = caseRemoteHTTPEndpoint(remoteSSLEndpoint);
				if (result == null) result = caseSecureEndpoint(remoteSSLEndpoint);
				if (result == null) result = caseConfigurationItem(remoteSSLEndpoint);
				if (result == null) result = caseEndpointConfiguration(remoteSSLEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.REMOTE_TSTP_ENDPOINT: {
				RemoteTSTPEndpoint remoteTSTPEndpoint = (RemoteTSTPEndpoint)theEObject;
				T result = caseRemoteTSTPEndpoint(remoteTSTPEndpoint);
				if (result == null) result = caseLocalSSLEndpoint(remoteTSTPEndpoint);
				if (result == null) result = caseTSTPEndpoint(remoteTSTPEndpoint);
				if (result == null) result = caseLocalHTTPEndpoint(remoteTSTPEndpoint);
				if (result == null) result = caseSecureEndpoint(remoteTSTPEndpoint);
				if (result == null) result = caseConfigurationItem(remoteTSTPEndpoint);
				if (result == null) result = caseEndpointConfiguration(remoteTSTPEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.ENDPOINT_CONFIGURATION: {
				EndpointConfiguration endpointConfiguration = (EndpointConfiguration)theEObject;
				T result = caseEndpointConfiguration(endpointConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.SECURE_ENDPOINT: {
				SecureEndpoint<?> secureEndpoint = (SecureEndpoint<?>)theEObject;
				T result = caseSecureEndpoint(secureEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.TSTP_ENDPOINT: {
				TSTPEndpoint<?> tstpEndpoint = (TSTPEndpoint<?>)theEObject;
				T result = caseTSTPEndpoint(tstpEndpoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.SSL_CONFIGURATION: {
				SSLConfiguration sslConfiguration = (SSLConfiguration)theEObject;
				T result = caseSSLConfiguration(sslConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.CLIENT_SSL_CONFIGURATION: {
				ClientSSLConfiguration clientSSLConfiguration = (ClientSSLConfiguration)theEObject;
				T result = caseClientSSLConfiguration(clientSSLConfiguration);
				if (result == null) result = caseSSLConfiguration(clientSSLConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.SERVER_SSL_CONFIGURATION: {
				ServerSSLConfiguration serverSSLConfiguration = (ServerSSLConfiguration)theEObject;
				T result = caseServerSSLConfiguration(serverSSLConfiguration);
				if (result == null) result = caseSSLConfiguration(serverSSLConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local HTTP Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local HTTP Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalHTTPEndpoint(LocalHTTPEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local SSL Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local SSL Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalSSLEndpoint(LocalSSLEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local TSTP Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local TSTP Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalTSTPEndpoint(LocalTSTPEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote HTTP Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote HTTP Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteHTTPEndpoint(RemoteHTTPEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote SSL Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote SSL Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteSSLEndpoint(RemoteSSLEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote TSTP Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote TSTP Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteTSTPEndpoint(RemoteTSTPEndpoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointConfiguration(EndpointConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secure Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secure Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C extends SSLConfiguration> T caseSecureEndpoint(SecureEndpoint<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSTP Endpoint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSTP Endpoint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C extends SSLConfiguration> T caseTSTPEndpoint(TSTPEndpoint<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SSL Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SSL Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSSLConfiguration(SSLConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client SSL Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client SSL Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClientSSLConfiguration(ClientSSLConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server SSL Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server SSL Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerSSLConfiguration(ServerSSLConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationItem(ConfigurationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EndpointSwitch
