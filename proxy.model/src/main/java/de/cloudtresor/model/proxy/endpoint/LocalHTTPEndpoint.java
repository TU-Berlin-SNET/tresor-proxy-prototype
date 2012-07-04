/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint;

import de.cloudtresor.model.proxy.ConfigurationItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local HTTP Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpoint#getBoundInterfaces <em>Bound Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage#getLocalHTTPEndpoint()
 * @model
 * @generated
 */
public interface LocalHTTPEndpoint extends ConfigurationItem, EndpointConfiguration {
	/**
	 * Returns the value of the '<em><b>Bound Interfaces</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Interfaces</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Interfaces</em>' attribute list.
	 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage#getLocalHTTPEndpoint_BoundInterfaces()
	 * @model
	 * @generated
	 */
	EList<String> getBoundInterfaces();

} // LocalHTTPEndpoint
