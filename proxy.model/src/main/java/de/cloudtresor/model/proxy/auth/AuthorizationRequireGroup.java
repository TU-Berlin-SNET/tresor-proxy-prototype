/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.auth;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Require Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.auth.AuthorizationRequireGroup#getGroupIdentifier <em>Group Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cloudtresor.model.proxy.auth.AuthPackage#getAuthorizationRequireGroup()
 * @model
 * @generated
 */
public interface AuthorizationRequireGroup extends AuthorizationConfigurationItem {
	/**
	 * Returns the value of the '<em><b>Group Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Identifier</em>' attribute.
	 * @see #setGroupIdentifier(String)
	 * @see de.cloudtresor.model.proxy.auth.AuthPackage#getAuthorizationRequireGroup_GroupIdentifier()
	 * @model required="true"
	 * @generated
	 */
	String getGroupIdentifier();

	/**
	 * Sets the value of the '{@link de.cloudtresor.model.proxy.auth.AuthorizationRequireGroup#getGroupIdentifier <em>Group Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Identifier</em>' attribute.
	 * @see #getGroupIdentifier()
	 * @generated
	 */
	void setGroupIdentifier(String value);

} // AuthorizationRequireGroup
