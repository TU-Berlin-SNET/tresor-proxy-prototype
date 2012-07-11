/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secure Endpoint Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.SecureEndpointConfiguration#getSslConfiguration <em>Ssl Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage#getSecureEndpointConfiguration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SecureEndpointConfiguration<C extends SSLConfiguration> extends EObject {
	/**
	 * Returns the value of the '<em><b>Ssl Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssl Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssl Configuration</em>' containment reference.
	 * @see #setSslConfiguration(SSLConfiguration)
	 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage#getSecureEndpointConfiguration_SslConfiguration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	C getSslConfiguration();

	/**
	 * Sets the value of the '{@link de.cloudtresor.model.proxy.endpoint.SecureEndpointConfiguration#getSslConfiguration <em>Ssl Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssl Configuration</em>' containment reference.
	 * @see #getSslConfiguration()
	 * @generated
	 */
	void setSslConfiguration(C value);

} // SecureEndpointConfiguration
