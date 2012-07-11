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
			case EndpointPackage.ENDPOINT_CONFIGURATION: {
				EndpointConfiguration endpointConfiguration = (EndpointConfiguration)theEObject;
				T result = caseEndpointConfiguration(endpointConfiguration);
				if (result == null) result = caseConfigurationItem(endpointConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.LOCAL_ENDPOINT_CONFIGURATION: {
				LocalEndpointConfiguration localEndpointConfiguration = (LocalEndpointConfiguration)theEObject;
				T result = caseLocalEndpointConfiguration(localEndpointConfiguration);
				if (result == null) result = caseEndpointConfiguration(localEndpointConfiguration);
				if (result == null) result = caseConfigurationItem(localEndpointConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION: {
				LocalHTTPEndpointConfiguration localHTTPEndpointConfiguration = (LocalHTTPEndpointConfiguration)theEObject;
				T result = caseLocalHTTPEndpointConfiguration(localHTTPEndpointConfiguration);
				if (result == null) result = caseLocalEndpointConfiguration(localHTTPEndpointConfiguration);
				if (result == null) result = caseEndpointConfiguration(localHTTPEndpointConfiguration);
				if (result == null) result = caseConfigurationItem(localHTTPEndpointConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.LOCAL_SSL_ENDPOINT_CONFIGURATION: {
				LocalSSLEndpointConfiguration localSSLEndpointConfiguration = (LocalSSLEndpointConfiguration)theEObject;
				T result = caseLocalSSLEndpointConfiguration(localSSLEndpointConfiguration);
				if (result == null) result = caseLocalHTTPEndpointConfiguration(localSSLEndpointConfiguration);
				if (result == null) result = caseSecureEndpointConfiguration(localSSLEndpointConfiguration);
				if (result == null) result = caseLocalEndpointConfiguration(localSSLEndpointConfiguration);
				if (result == null) result = caseEndpointConfiguration(localSSLEndpointConfiguration);
				if (result == null) result = caseConfigurationItem(localSSLEndpointConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.LOCAL_TSTP_ENDPOINT_CONFIGURATION: {
				LocalTSTPEndpointConfiguration localTSTPEndpointConfiguration = (LocalTSTPEndpointConfiguration)theEObject;
				T result = caseLocalTSTPEndpointConfiguration(localTSTPEndpointConfiguration);
				if (result == null) result = caseLocalSSLEndpointConfiguration(localTSTPEndpointConfiguration);
				if (result == null) result = caseTSTPEndpointConfiguration(localTSTPEndpointConfiguration);
				if (result == null) result = caseLocalHTTPEndpointConfiguration(localTSTPEndpointConfiguration);
				if (result == null) result = caseSecureEndpointConfiguration(localTSTPEndpointConfiguration);
				if (result == null) result = caseLocalEndpointConfiguration(localTSTPEndpointConfiguration);
				if (result == null) result = caseEndpointConfiguration(localTSTPEndpointConfiguration);
				if (result == null) result = caseConfigurationItem(localTSTPEndpointConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.REMOTE_ENDPOINT_CONFIGURATION: {
				RemoteEndpointConfiguration remoteEndpointConfiguration = (RemoteEndpointConfiguration)theEObject;
				T result = caseRemoteEndpointConfiguration(remoteEndpointConfiguration);
				if (result == null) result = caseEndpointConfiguration(remoteEndpointConfiguration);
				if (result == null) result = caseConfigurationItem(remoteEndpointConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.REMOTE_HTTP_ENDPOINT_CONFIGURATION: {
				RemoteHTTPEndpointConfiguration remoteHTTPEndpointConfiguration = (RemoteHTTPEndpointConfiguration)theEObject;
				T result = caseRemoteHTTPEndpointConfiguration(remoteHTTPEndpointConfiguration);
				if (result == null) result = caseRemoteEndpointConfiguration(remoteHTTPEndpointConfiguration);
				if (result == null) result = caseEndpointConfiguration(remoteHTTPEndpointConfiguration);
				if (result == null) result = caseConfigurationItem(remoteHTTPEndpointConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.REMOTE_SSL_ENDPOINT_CONFIGURATION: {
				RemoteSSLEndpointConfiguration remoteSSLEndpointConfiguration = (RemoteSSLEndpointConfiguration)theEObject;
				T result = caseRemoteSSLEndpointConfiguration(remoteSSLEndpointConfiguration);
				if (result == null) result = caseRemoteHTTPEndpointConfiguration(remoteSSLEndpointConfiguration);
				if (result == null) result = caseSecureEndpointConfiguration(remoteSSLEndpointConfiguration);
				if (result == null) result = caseRemoteEndpointConfiguration(remoteSSLEndpointConfiguration);
				if (result == null) result = caseEndpointConfiguration(remoteSSLEndpointConfiguration);
				if (result == null) result = caseConfigurationItem(remoteSSLEndpointConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.REMOTE_TSTP_ENDPOINT_CONFIGURATION: {
				RemoteTSTPEndpointConfiguration remoteTSTPEndpointConfiguration = (RemoteTSTPEndpointConfiguration)theEObject;
				T result = caseRemoteTSTPEndpointConfiguration(remoteTSTPEndpointConfiguration);
				if (result == null) result = caseLocalSSLEndpointConfiguration(remoteTSTPEndpointConfiguration);
				if (result == null) result = caseTSTPEndpointConfiguration(remoteTSTPEndpointConfiguration);
				if (result == null) result = caseLocalHTTPEndpointConfiguration(remoteTSTPEndpointConfiguration);
				if (result == null) result = caseSecureEndpointConfiguration(remoteTSTPEndpointConfiguration);
				if (result == null) result = caseLocalEndpointConfiguration(remoteTSTPEndpointConfiguration);
				if (result == null) result = caseEndpointConfiguration(remoteTSTPEndpointConfiguration);
				if (result == null) result = caseConfigurationItem(remoteTSTPEndpointConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.SECURE_ENDPOINT_CONFIGURATION: {
				SecureEndpointConfiguration<?> secureEndpointConfiguration = (SecureEndpointConfiguration<?>)theEObject;
				T result = caseSecureEndpointConfiguration(secureEndpointConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EndpointPackage.TSTP_ENDPOINT_CONFIGURATION: {
				TSTPEndpointConfiguration<?> tstpEndpointConfiguration = (TSTPEndpointConfiguration<?>)theEObject;
				T result = caseTSTPEndpointConfiguration(tstpEndpointConfiguration);
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
	 * Returns the result of interpreting the object as an instance of '<em>Local Endpoint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Endpoint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalEndpointConfiguration(LocalEndpointConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local HTTP Endpoint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local HTTP Endpoint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalHTTPEndpointConfiguration(LocalHTTPEndpointConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local SSL Endpoint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local SSL Endpoint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalSSLEndpointConfiguration(LocalSSLEndpointConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local TSTP Endpoint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local TSTP Endpoint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalTSTPEndpointConfiguration(LocalTSTPEndpointConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote Endpoint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote Endpoint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteEndpointConfiguration(RemoteEndpointConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote HTTP Endpoint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote HTTP Endpoint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteHTTPEndpointConfiguration(RemoteHTTPEndpointConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote SSL Endpoint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote SSL Endpoint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteSSLEndpointConfiguration(RemoteSSLEndpointConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remote TSTP Endpoint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remote TSTP Endpoint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoteTSTPEndpointConfiguration(RemoteTSTPEndpointConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secure Endpoint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secure Endpoint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C extends SSLConfiguration> T caseSecureEndpointConfiguration(SecureEndpointConfiguration<C> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSTP Endpoint Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSTP Endpoint Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <C extends SSLConfiguration> T caseTSTPEndpointConfiguration(TSTPEndpointConfiguration<C> object) {
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
