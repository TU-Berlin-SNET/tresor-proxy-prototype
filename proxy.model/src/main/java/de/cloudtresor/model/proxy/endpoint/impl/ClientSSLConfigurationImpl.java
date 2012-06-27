/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint.impl;

import de.cloudtresor.model.proxy.endpoint.ClientSSLConfiguration;
import de.cloudtresor.model.proxy.endpoint.EndpointPackage;

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
 * An implementation of the model object '<em><b>Client SSL Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.impl.ClientSSLConfigurationImpl#getAcceptedServerCertificates <em>Accepted Server Certificates</em>}</li>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.impl.ClientSSLConfigurationImpl#getClientCertificate <em>Client Certificate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClientSSLConfigurationImpl extends EObjectImpl implements ClientSSLConfiguration {
	/**
	 * The cached value of the '{@link #getAcceptedServerCertificates() <em>Accepted Server Certificates</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedServerCertificates()
	 * @generated
	 * @ordered
	 */
	protected EList<Certificate> acceptedServerCertificates;

	/**
	 * The default value of the '{@link #getClientCertificate() <em>Client Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientCertificate()
	 * @generated
	 * @ordered
	 */
	protected static final Certificate CLIENT_CERTIFICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientCertificate() <em>Client Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientCertificate()
	 * @generated
	 * @ordered
	 */
	protected Certificate clientCertificate = CLIENT_CERTIFICATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientSSLConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EndpointPackage.Literals.CLIENT_SSL_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Certificate> getAcceptedServerCertificates() {
		if (acceptedServerCertificates == null) {
			acceptedServerCertificates = new EDataTypeUniqueEList<Certificate>(Certificate.class, this, EndpointPackage.CLIENT_SSL_CONFIGURATION__ACCEPTED_SERVER_CERTIFICATES);
		}
		return acceptedServerCertificates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Certificate getClientCertificate() {
		return clientCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientCertificate(Certificate newClientCertificate) {
		Certificate oldClientCertificate = clientCertificate;
		clientCertificate = newClientCertificate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EndpointPackage.CLIENT_SSL_CONFIGURATION__CLIENT_CERTIFICATE, oldClientCertificate, clientCertificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EndpointPackage.CLIENT_SSL_CONFIGURATION__ACCEPTED_SERVER_CERTIFICATES:
				return getAcceptedServerCertificates();
			case EndpointPackage.CLIENT_SSL_CONFIGURATION__CLIENT_CERTIFICATE:
				return getClientCertificate();
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
			case EndpointPackage.CLIENT_SSL_CONFIGURATION__ACCEPTED_SERVER_CERTIFICATES:
				getAcceptedServerCertificates().clear();
				getAcceptedServerCertificates().addAll((Collection<? extends Certificate>)newValue);
				return;
			case EndpointPackage.CLIENT_SSL_CONFIGURATION__CLIENT_CERTIFICATE:
				setClientCertificate((Certificate)newValue);
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
			case EndpointPackage.CLIENT_SSL_CONFIGURATION__ACCEPTED_SERVER_CERTIFICATES:
				getAcceptedServerCertificates().clear();
				return;
			case EndpointPackage.CLIENT_SSL_CONFIGURATION__CLIENT_CERTIFICATE:
				setClientCertificate(CLIENT_CERTIFICATE_EDEFAULT);
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
			case EndpointPackage.CLIENT_SSL_CONFIGURATION__ACCEPTED_SERVER_CERTIFICATES:
				return acceptedServerCertificates != null && !acceptedServerCertificates.isEmpty();
			case EndpointPackage.CLIENT_SSL_CONFIGURATION__CLIENT_CERTIFICATE:
				return CLIENT_CERTIFICATE_EDEFAULT == null ? clientCertificate != null : !CLIENT_CERTIFICATE_EDEFAULT.equals(clientCertificate);
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
		result.append(" (acceptedServerCertificates: ");
		result.append(acceptedServerCertificates);
		result.append(", clientCertificate: ");
		result.append(clientCertificate);
		result.append(')');
		return result.toString();
	}

} //ClientSSLConfigurationImpl
