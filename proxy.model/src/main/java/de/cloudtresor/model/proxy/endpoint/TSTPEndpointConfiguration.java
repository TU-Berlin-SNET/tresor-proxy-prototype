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
 * A representation of the model object '<em><b>TSTP Endpoint Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.TSTPEndpointConfiguration#getTstpConfiguration <em>Tstp Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage#getTSTPEndpointConfiguration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TSTPEndpointConfiguration<C extends SSLConfiguration> extends EObject {
	/**
	 * Returns the value of the '<em><b>Tstp Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tstp Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tstp Configuration</em>' reference.
	 * @see #setTstpConfiguration(SSLConfiguration)
	 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage#getTSTPEndpointConfiguration_TstpConfiguration()
	 * @model required="true"
	 * @generated
	 */
	C getTstpConfiguration();

	/**
	 * Sets the value of the '{@link de.cloudtresor.model.proxy.endpoint.TSTPEndpointConfiguration#getTstpConfiguration <em>Tstp Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tstp Configuration</em>' reference.
	 * @see #getTstpConfiguration()
	 * @generated
	 */
	void setTstpConfiguration(C value);

} // TSTPEndpointConfiguration
