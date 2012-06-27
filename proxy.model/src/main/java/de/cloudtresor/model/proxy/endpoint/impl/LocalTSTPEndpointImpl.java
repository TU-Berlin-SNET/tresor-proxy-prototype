/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint.impl;

import de.cloudtresor.model.proxy.endpoint.ClientSSLConfiguration;
import de.cloudtresor.model.proxy.endpoint.EndpointPackage;
import de.cloudtresor.model.proxy.endpoint.LocalTSTPEndpoint;
import de.cloudtresor.model.proxy.endpoint.TSTPEndpoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local TSTP Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.impl.LocalTSTPEndpointImpl#getTstpConfiguration <em>Tstp Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalTSTPEndpointImpl extends LocalSSLEndpointImpl implements LocalTSTPEndpoint {
	/**
	 * The cached value of the '{@link #getTstpConfiguration() <em>Tstp Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTstpConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ClientSSLConfiguration tstpConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalTSTPEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EndpointPackage.Literals.LOCAL_TSTP_ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientSSLConfiguration getTstpConfiguration() {
		if (tstpConfiguration != null && tstpConfiguration.eIsProxy()) {
			InternalEObject oldTstpConfiguration = (InternalEObject)tstpConfiguration;
			tstpConfiguration = (ClientSSLConfiguration)eResolveProxy(oldTstpConfiguration);
			if (tstpConfiguration != oldTstpConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EndpointPackage.LOCAL_TSTP_ENDPOINT__TSTP_CONFIGURATION, oldTstpConfiguration, tstpConfiguration));
			}
		}
		return tstpConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientSSLConfiguration basicGetTstpConfiguration() {
		return tstpConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTstpConfiguration(ClientSSLConfiguration newTstpConfiguration) {
		ClientSSLConfiguration oldTstpConfiguration = tstpConfiguration;
		tstpConfiguration = newTstpConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EndpointPackage.LOCAL_TSTP_ENDPOINT__TSTP_CONFIGURATION, oldTstpConfiguration, tstpConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EndpointPackage.LOCAL_TSTP_ENDPOINT__TSTP_CONFIGURATION:
				if (resolve) return getTstpConfiguration();
				return basicGetTstpConfiguration();
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
			case EndpointPackage.LOCAL_TSTP_ENDPOINT__TSTP_CONFIGURATION:
				setTstpConfiguration((ClientSSLConfiguration)newValue);
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
			case EndpointPackage.LOCAL_TSTP_ENDPOINT__TSTP_CONFIGURATION:
				setTstpConfiguration((ClientSSLConfiguration)null);
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
			case EndpointPackage.LOCAL_TSTP_ENDPOINT__TSTP_CONFIGURATION:
				return tstpConfiguration != null;
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
		if (baseClass == TSTPEndpoint.class) {
			switch (derivedFeatureID) {
				case EndpointPackage.LOCAL_TSTP_ENDPOINT__TSTP_CONFIGURATION: return EndpointPackage.TSTP_ENDPOINT__TSTP_CONFIGURATION;
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
		if (baseClass == TSTPEndpoint.class) {
			switch (baseFeatureID) {
				case EndpointPackage.TSTP_ENDPOINT__TSTP_CONFIGURATION: return EndpointPackage.LOCAL_TSTP_ENDPOINT__TSTP_CONFIGURATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //LocalTSTPEndpointImpl
