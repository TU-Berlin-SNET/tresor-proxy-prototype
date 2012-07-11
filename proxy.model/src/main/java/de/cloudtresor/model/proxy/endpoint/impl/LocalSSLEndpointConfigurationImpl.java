/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint.impl;

import de.cloudtresor.model.proxy.endpoint.ClientSSLConfiguration;
import de.cloudtresor.model.proxy.endpoint.EndpointPackage;
import de.cloudtresor.model.proxy.endpoint.LocalSSLEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.SecureEndpointConfiguration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local SSL Endpoint Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.impl.LocalSSLEndpointConfigurationImpl#getSslConfiguration <em>Ssl Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalSSLEndpointConfigurationImpl extends LocalHTTPEndpointConfigurationImpl implements LocalSSLEndpointConfiguration {
	/**
	 * The cached value of the '{@link #getSslConfiguration() <em>Ssl Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSslConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ClientSSLConfiguration sslConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalSSLEndpointConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EndpointPackage.Literals.LOCAL_SSL_ENDPOINT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientSSLConfiguration getSslConfiguration() {
		return sslConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSslConfiguration(ClientSSLConfiguration newSslConfiguration, NotificationChain msgs) {
		ClientSSLConfiguration oldSslConfiguration = sslConfiguration;
		sslConfiguration = newSslConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EndpointPackage.LOCAL_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION, oldSslConfiguration, newSslConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSslConfiguration(ClientSSLConfiguration newSslConfiguration) {
		if (newSslConfiguration != sslConfiguration) {
			NotificationChain msgs = null;
			if (sslConfiguration != null)
				msgs = ((InternalEObject)sslConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EndpointPackage.LOCAL_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION, null, msgs);
			if (newSslConfiguration != null)
				msgs = ((InternalEObject)newSslConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EndpointPackage.LOCAL_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION, null, msgs);
			msgs = basicSetSslConfiguration(newSslConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EndpointPackage.LOCAL_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION, newSslConfiguration, newSslConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EndpointPackage.LOCAL_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION:
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
			case EndpointPackage.LOCAL_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION:
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
			case EndpointPackage.LOCAL_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION:
				setSslConfiguration((ClientSSLConfiguration)newValue);
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
			case EndpointPackage.LOCAL_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION:
				setSslConfiguration((ClientSSLConfiguration)null);
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
			case EndpointPackage.LOCAL_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION:
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
				case EndpointPackage.LOCAL_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION: return EndpointPackage.SECURE_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION;
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
				case EndpointPackage.SECURE_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION: return EndpointPackage.LOCAL_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //LocalSSLEndpointConfigurationImpl
