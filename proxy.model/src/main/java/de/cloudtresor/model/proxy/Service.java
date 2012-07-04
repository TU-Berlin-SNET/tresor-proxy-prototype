/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.Service#getServiceConfigurationItem <em>Service Configuration Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cloudtresor.model.proxy.ProxyPackage#getService()
 * @model
 * @generated
 */
public interface Service extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Service Configuration Item</b></em>' containment reference list.
	 * The list contents are of type {@link de.cloudtresor.model.proxy.ServiceConfigurationItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Configuration Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Configuration Item</em>' containment reference list.
	 * @see de.cloudtresor.model.proxy.ProxyPackage#getService_ServiceConfigurationItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceConfigurationItem> getServiceConfigurationItem();

} // Service
