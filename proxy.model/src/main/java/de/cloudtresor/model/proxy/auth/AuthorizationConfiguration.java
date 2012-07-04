/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.auth;

import de.cloudtresor.model.proxy.ServiceConfigurationItem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.auth.AuthorizationConfiguration#getDefault <em>Default</em>}</li>
 *   <li>{@link de.cloudtresor.model.proxy.auth.AuthorizationConfiguration#getAuthorizationConfigurationItems <em>Authorization Configuration Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cloudtresor.model.proxy.auth.AuthPackage#getAuthorizationConfiguration()
 * @model
 * @generated
 */
public interface AuthorizationConfiguration extends ServiceConfigurationItem {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * The literals are from the enumeration {@link de.cloudtresor.model.proxy.auth.AuthorizationState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationState
	 * @see #setDefault(AuthorizationState)
	 * @see de.cloudtresor.model.proxy.auth.AuthPackage#getAuthorizationConfiguration_Default()
	 * @model required="true"
	 * @generated
	 */
	AuthorizationState getDefault();

	/**
	 * Sets the value of the '{@link de.cloudtresor.model.proxy.auth.AuthorizationConfiguration#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationState
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(AuthorizationState value);

	/**
	 * Returns the value of the '<em><b>Authorization Configuration Items</b></em>' containment reference list.
	 * The list contents are of type {@link de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization Configuration Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Configuration Items</em>' containment reference list.
	 * @see de.cloudtresor.model.proxy.auth.AuthPackage#getAuthorizationConfiguration_AuthorizationConfigurationItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<AuthorizationConfigurationItem> getAuthorizationConfigurationItems();

} // AuthorizationConfiguration
