/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.ProxyConfiguration#getServices <em>Services</em>}</li>
 *   <li>{@link de.cloudtresor.model.proxy.ProxyConfiguration#getConfigurationItems <em>Configuration Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cloudtresor.model.proxy.ProxyPackage#getProxyConfiguration()
 * @model
 * @generated
 */
public interface ProxyConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link de.cloudtresor.model.proxy.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see de.cloudtresor.model.proxy.ProxyPackage#getProxyConfiguration_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Configuration Items</b></em>' containment reference list.
	 * The list contents are of type {@link de.cloudtresor.model.proxy.ConfigurationItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Items</em>' containment reference list.
	 * @see de.cloudtresor.model.proxy.ProxyPackage#getProxyConfiguration_ConfigurationItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationItem> getConfigurationItems();

} // ProxyConfiguration
