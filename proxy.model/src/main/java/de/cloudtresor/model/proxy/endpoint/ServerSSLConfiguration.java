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
 * A representation of the model object '<em><b>Server SSL Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration#getServerCertificate <em>Server Certificate</em>}</li>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration#getAcceptedClientCertificates <em>Accepted Client Certificates</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage#getServerSSLConfiguration()
 * @model
 * @generated
 */
public interface ServerSSLConfiguration extends SSLConfiguration {
	/**
	 * Returns the value of the '<em><b>Server Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Certificate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Certificate</em>' attribute.
	 * @see #setServerCertificate(Certificate)
	 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage#getServerSSLConfiguration_ServerCertificate()
	 * @model dataType="de.cloudtresor.model.proxy.Certificate" required="true"
	 * @generated
	 */
	Certificate getServerCertificate();

	/**
	 * Sets the value of the '{@link de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration#getServerCertificate <em>Server Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Certificate</em>' attribute.
	 * @see #getServerCertificate()
	 * @generated
	 */
	void setServerCertificate(Certificate value);

	/**
	 * Returns the value of the '<em><b>Accepted Client Certificates</b></em>' attribute list.
	 * The list contents are of type {@link java.security.cert.Certificate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accepted Client Certificates</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Client Certificates</em>' attribute list.
	 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage#getServerSSLConfiguration_AcceptedClientCertificates()
	 * @model dataType="de.cloudtresor.model.proxy.Certificate"
	 * @generated
	 */
	EList<Certificate> getAcceptedClientCertificates();

} // ServerSSLConfiguration
