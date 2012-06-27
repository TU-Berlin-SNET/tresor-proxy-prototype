/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint.impl;

import de.cloudtresor.model.proxy.endpoint.EndpointPackage;
import de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration;

import java.security.cert.Certificate;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server SSL Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.impl.ServerSSLConfigurationImpl#getServerCertificate <em>Server Certificate</em>}</li>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.impl.ServerSSLConfigurationImpl#getAcceptedClientCertificates <em>Accepted Client Certificates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServerSSLConfigurationImpl extends EObjectImpl implements ServerSSLConfiguration {
	/**
	 * The default value of the '{@link #getServerCertificate() <em>Server Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerCertificate()
	 * @generated
	 * @ordered
	 */
	protected static final Certificate SERVER_CERTIFICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerCertificate() <em>Server Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerCertificate()
	 * @generated
	 * @ordered
	 */
	protected Certificate serverCertificate = SERVER_CERTIFICATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAcceptedClientCertificates() <em>Accepted Client Certificates</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedClientCertificates()
	 * @generated
	 * @ordered
	 */
	protected EList<Certificate> acceptedClientCertificates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerSSLConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EndpointPackage.Literals.SERVER_SSL_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Certificate getServerCertificate() {
		return serverCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerCertificate(Certificate newServerCertificate) {
		Certificate oldServerCertificate = serverCertificate;
		serverCertificate = newServerCertificate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EndpointPackage.SERVER_SSL_CONFIGURATION__SERVER_CERTIFICATE, oldServerCertificate, serverCertificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Certificate> getAcceptedClientCertificates() {
		if (acceptedClientCertificates == null) {
			acceptedClientCertificates = new EDataTypeUniqueEList<Certificate>(Certificate.class, this, EndpointPackage.SERVER_SSL_CONFIGURATION__ACCEPTED_CLIENT_CERTIFICATES);
		}
		return acceptedClientCertificates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EndpointPackage.SERVER_SSL_CONFIGURATION__SERVER_CERTIFICATE:
				return getServerCertificate();
			case EndpointPackage.SERVER_SSL_CONFIGURATION__ACCEPTED_CLIENT_CERTIFICATES:
				return getAcceptedClientCertificates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EndpointPackage.SERVER_SSL_CONFIGURATION__SERVER_CERTIFICATE:
				setServerCertificate((Certificate)newValue);
				return;
			case EndpointPackage.SERVER_SSL_CONFIGURATION__ACCEPTED_CLIENT_CERTIFICATES:
				getAcceptedClientCertificates().clear();
				getAcceptedClientCertificates().addAll((Collection<? extends Certificate>)newValue);
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
			case EndpointPackage.SERVER_SSL_CONFIGURATION__SERVER_CERTIFICATE:
				setServerCertificate(SERVER_CERTIFICATE_EDEFAULT);
				return;
			case EndpointPackage.SERVER_SSL_CONFIGURATION__ACCEPTED_CLIENT_CERTIFICATES:
				getAcceptedClientCertificates().clear();
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
			case EndpointPackage.SERVER_SSL_CONFIGURATION__SERVER_CERTIFICATE:
				return SERVER_CERTIFICATE_EDEFAULT == null ? serverCertificate != null : !SERVER_CERTIFICATE_EDEFAULT.equals(serverCertificate);
			case EndpointPackage.SERVER_SSL_CONFIGURATION__ACCEPTED_CLIENT_CERTIFICATES:
				return acceptedClientCertificates != null && !acceptedClientCertificates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (serverCertificate: ");
		result.append(serverCertificate);
		result.append(", acceptedClientCertificates: ");
		result.append(acceptedClientCertificates);
		result.append(')');
		return result.toString();
	}

} //ServerSSLConfigurationImpl
