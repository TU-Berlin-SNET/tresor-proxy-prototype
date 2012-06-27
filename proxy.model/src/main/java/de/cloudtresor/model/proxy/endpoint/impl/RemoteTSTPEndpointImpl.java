/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint.impl;

import de.cloudtresor.model.proxy.endpoint.EndpointPackage;
import de.cloudtresor.model.proxy.endpoint.RemoteTSTPEndpoint;
import de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration;
import de.cloudtresor.model.proxy.endpoint.TSTPEndpoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote TSTP Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.impl.RemoteTSTPEndpointImpl#getTstpConfiguration <em>Tstp Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoteTSTPEndpointImpl extends LocalSSLEndpointImpl implements RemoteTSTPEndpoint {
	/**
	 * The cached value of the '{@link #getTstpConfiguration() <em>Tstp Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTstpConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ServerSSLConfiguration tstpConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteTSTPEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EndpointPackage.Literals.REMOTE_TSTP_ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerSSLConfiguration getTstpConfiguration() {
		if (tstpConfiguration != null && tstpConfiguration.eIsProxy()) {
			InternalEObject oldTstpConfiguration = (InternalEObject)tstpConfiguration;
			tstpConfiguration = (ServerSSLConfiguration)eResolveProxy(oldTstpConfiguration);
			if (tstpConfiguration != oldTstpConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EndpointPackage.REMOTE_TSTP_ENDPOINT__TSTP_CONFIGURATION, oldTstpConfiguration, tstpConfiguration));
			}
		}
		return tstpConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerSSLConfiguration basicGetTstpConfiguration() {
		return tstpConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTstpConfiguration(ServerSSLConfiguration newTstpConfiguration) {
		ServerSSLConfiguration oldTstpConfiguration = tstpConfiguration;
		tstpConfiguration = newTstpConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EndpointPackage.REMOTE_TSTP_ENDPOINT__TSTP_CONFIGURATION, oldTstpConfiguration, tstpConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EndpointPackage.REMOTE_TSTP_ENDPOINT__TSTP_CONFIGURATION:
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
			case EndpointPackage.REMOTE_TSTP_ENDPOINT__TSTP_CONFIGURATION:
				setTstpConfiguration((ServerSSLConfiguration)newValue);
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
			case EndpointPackage.REMOTE_TSTP_ENDPOINT__TSTP_CONFIGURATION:
				setTstpConfiguration((ServerSSLConfiguration)null);
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
			case EndpointPackage.REMOTE_TSTP_ENDPOINT__TSTP_CONFIGURATION:
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
				case EndpointPackage.REMOTE_TSTP_ENDPOINT__TSTP_CONFIGURATION: return EndpointPackage.TSTP_ENDPOINT__TSTP_CONFIGURATION;
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
				case EndpointPackage.TSTP_ENDPOINT__TSTP_CONFIGURATION: return EndpointPackage.REMOTE_TSTP_ENDPOINT__TSTP_CONFIGURATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RemoteTSTPEndpointImpl
