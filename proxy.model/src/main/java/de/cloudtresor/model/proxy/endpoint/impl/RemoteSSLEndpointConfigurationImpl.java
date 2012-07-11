/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint.impl;

import de.cloudtresor.model.proxy.endpoint.EndpointPackage;
import de.cloudtresor.model.proxy.endpoint.RemoteSSLEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.SecureEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote SSL Endpoint Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.impl.RemoteSSLEndpointConfigurationImpl#getSslConfiguration <em>Ssl Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoteSSLEndpointConfigurationImpl extends RemoteHTTPEndpointConfigurationImpl implements RemoteSSLEndpointConfiguration {
	/**
	 * The cached value of the '{@link #getSslConfiguration() <em>Ssl Configuration</em>}' containment reference.
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
	protected RemoteSSLEndpointConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EndpointPackage.Literals.REMOTE_SSL_ENDPOINT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerSSLConfiguration getSslConfiguration() {
		return sslConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSslConfiguration(ServerSSLConfiguration newSslConfiguration, NotificationChain msgs) {
		ServerSSLConfiguration oldSslConfiguration = sslConfiguration;
		sslConfiguration = newSslConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EndpointPackage.REMOTE_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION, oldSslConfiguration, newSslConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSslConfiguration(ServerSSLConfiguration newSslConfiguration) {
		if (newSslConfiguration != sslConfiguration) {
			NotificationChain msgs = null;
			if (sslConfiguration != null)
				msgs = ((InternalEObject)sslConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EndpointPackage.REMOTE_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION, null, msgs);
			if (newSslConfiguration != null)
				msgs = ((InternalEObject)newSslConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EndpointPackage.REMOTE_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION, null, msgs);
			msgs = basicSetSslConfiguration(newSslConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EndpointPackage.REMOTE_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION, newSslConfiguration, newSslConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EndpointPackage.REMOTE_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION:
				return basicSetSslConfiguration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EndpointPackage.REMOTE_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION:
				return getSslConfiguration();
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
			case EndpointPackage.REMOTE_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION:
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
			case EndpointPackage.REMOTE_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION:
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
			case EndpointPackage.REMOTE_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION:
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
		if (baseClass == SecureEndpointConfiguration.class) {
			switch (derivedFeatureID) {
				case EndpointPackage.REMOTE_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION: return EndpointPackage.SECURE_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION;
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
		if (baseClass == SecureEndpointConfiguration.class) {
			switch (baseFeatureID) {
				case EndpointPackage.SECURE_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION: return EndpointPackage.REMOTE_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RemoteSSLEndpointConfigurationImpl
