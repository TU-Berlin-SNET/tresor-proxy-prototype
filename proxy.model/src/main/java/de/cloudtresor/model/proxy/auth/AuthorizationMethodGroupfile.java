/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.auth;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Method Groupfile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.auth.AuthorizationMethodGroupfile#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cloudtresor.model.proxy.auth.AuthPackage#getAuthorizationMethodGroupfile()
 * @model
 * @generated
 */
public interface AuthorizationMethodGroupfile extends AuthorizationMethod {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see de.cloudtresor.model.proxy.auth.AuthPackage#getAuthorizationMethodGroupfile_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link de.cloudtresor.model.proxy.auth.AuthorizationMethodGroupfile#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // AuthorizationMethodGroupfile
