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
 * A representation of the model object '<em><b>Secure Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.SecureEndpoint#getSslConfiguration <em>Ssl Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage#getSecureEndpoint()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SecureEndpoint<C extends SSLConfiguration> extends EObject {
	/**
	 * Returns the value of the '<em><b>Ssl Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssl Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssl Configuration</em>' reference.
	 * @see #setSslConfiguration(SSLConfiguration)
	 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage#getSecureEndpoint_SslConfiguration()
	 * @model required="true"
	 * @generated
	 */
	C getSslConfiguration();

	/**
	 * Sets the value of the '{@link de.cloudtresor.model.proxy.endpoint.SecureEndpoint#getSslConfiguration <em>Ssl Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssl Configuration</em>' reference.
	 * @see #getSslConfiguration()
	 * @generated
	 */
	void setSslConfiguration(C value);

} // SecureEndpoint
