/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint;

import java.security.cert.Certificate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client SSL Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.ClientSSLConfiguration#getAcceptedServerCertificates <em>Accepted Server Certificates</em>}</li>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.ClientSSLConfiguration#getClientCertificate <em>Client Certificate</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage#getClientSSLConfiguration()
 * @model
 * @generated
 */
public interface ClientSSLConfiguration extends SSLConfiguration {
	/**
	 * Returns the value of the '<em><b>Accepted Server Certificates</b></em>' attribute list.
	 * The list contents are of type {@link java.security.cert.Certificate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accepted Server Certificates</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Server Certificates</em>' attribute list.
	 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage#getClientSSLConfiguration_AcceptedServerCertificates()
	 * @model dataType="de.cloudtresor.model.proxy.Certificate"
	 * @generated
	 */
	EList<Certificate> getAcceptedServerCertificates();

	/**
	 * Returns the value of the '<em><b>Client Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Certificate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Certificate</em>' attribute.
	 * @see #setClientCertificate(Certificate)
	 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage#getClientSSLConfiguration_ClientCertificate()
	 * @model dataType="de.cloudtresor.model.proxy.Certificate"
	 * @generated
	 */
	Certificate getClientCertificate();

	/**
	 * Sets the value of the '{@link de.cloudtresor.model.proxy.endpoint.ClientSSLConfiguration#getClientCertificate <em>Client Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Certificate</em>' attribute.
	 * @see #getClientCertificate()
	 * @generated
	 */
	void setClientCertificate(Certificate value);

} // ClientSSLConfiguration
