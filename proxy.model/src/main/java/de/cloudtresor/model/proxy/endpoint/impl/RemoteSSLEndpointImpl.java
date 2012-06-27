/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint.impl;

import de.cloudtresor.model.proxy.endpoint.EndpointPackage;
import de.cloudtresor.model.proxy.endpoint.RemoteSSLEndpoint;
import de.cloudtresor.model.proxy.endpoint.SecureEndpoint;
import de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote SSL Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.impl.RemoteSSLEndpointImpl#getSslConfiguration <em>Ssl Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoteSSLEndpointImpl extends RemoteHTTPEndpointImpl implements RemoteSSLEndpoint {
	/**
	 * The cached value of the '{@link #getSslConfiguration() <em>Ssl Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSslConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ServerSSLConfiguration sslConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteSSLEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EndpointPackage.Literals.REMOTE_SSL_ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerSSLConfiguration getSslConfiguration() {
		if (sslConfiguration != null && sslConfiguration.eIsProxy()) {
			InternalEObject oldSslConfiguration = (InternalEObject)sslConfiguration;
			sslConfiguration = (ServerSSLConfiguration)eResolveProxy(oldSslConfiguration);
			if (sslConfiguration != oldSslConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EndpointPackage.REMOTE_SSL_ENDPOINT__SSL_CONFIGURATION, oldSslConfiguration, sslConfiguration));
			}
		}
		return sslConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerSSLConfiguration basicGetSslConfiguration() {
		return sslConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSslConfiguration(ServerSSLConfiguration newSslConfiguration) {
		ServerSSLConfiguration oldSslConfiguration = sslConfiguration;
		sslConfiguration = newSslConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EndpointPackage.REMOTE_SSL_ENDPOINT__SSL_CONFIGURATION, oldSslConfiguration, sslConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EndpointPackage.REMOTE_SSL_ENDPOINT__SSL_CONFIGURATION:
				if (resolve) return getSslConfiguration();
				return basicGetSslConfiguration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EndpointPackage.REMOTE_SSL_ENDPOINT__SSL_CONFIGURATION:
				setSslConfiguration((ServerSSLConfiguration)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EndpointPackage.REMOTE_SSL_ENDPOINT__SSL_CONFIGURATION:
				setSslConfiguration((ServerSSLConfiguration)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EndpointPackage.REMOTE_SSL_ENDPOINT__SSL_CONFIGURATION:
				return sslConfiguration != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SecureEndpoint.class) {
			switch (derivedFeatureID) {
				case EndpointPackage.REMOTE_SSL_ENDPOINT__SSL_CONFIGURATION: return EndpointPackage.SECURE_ENDPOINT__SSL_CONFIGURATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SecureEndpoint.class) {
			switch (baseFeatureID) {
				case EndpointPackage.SECURE_ENDPOINT__SSL_CONFIGURATION: return EndpointPackage.REMOTE_SSL_ENDPOINT__SSL_CONFIGURATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RemoteSSLEndpointImpl
