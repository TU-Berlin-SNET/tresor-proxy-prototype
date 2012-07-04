/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.auth;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Configuration Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cloudtresor.model.proxy.auth.AuthPackage#getAuthorizationConfigurationItem()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AuthorizationConfigurationItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see de.cloudtresor.model.proxy.auth.AuthPackage#getAuthorizationConfigurationItem_Pattern()
	 * @model required="true"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

} // AuthorizationConfigurationItem
