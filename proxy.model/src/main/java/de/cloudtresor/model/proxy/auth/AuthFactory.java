/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.auth;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cloudtresor.model.proxy.auth.AuthPackage
 * @generated
 */
public interface AuthFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AuthFactory eINSTANCE = de.cloudtresor.model.proxy.auth.impl.AuthFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Authentication Method Htpasswd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authentication Method Htpasswd</em>'.
	 * @generated
	 */
	AuthenticationMethodHtpasswd createAuthenticationMethodHtpasswd();

	/**
	 * Returns a new object of class '<em>Authorization Method Groupfile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Method Groupfile</em>'.
	 * @generated
	 */
	AuthorizationMethodGroupfile createAuthorizationMethodGroupfile();

	/**
	 * Returns a new object of class '<em>Authorization Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Configuration</em>'.
	 * @generated
	 */
	AuthorizationConfiguration createAuthorizationConfiguration();

	/**
	 * Returns a new object of class '<em>Authorization Require Valid User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Require Valid User</em>'.
	 * @generated
	 */
	AuthorizationRequireValidUser createAuthorizationRequireValidUser();

	/**
	 * Returns a new object of class '<em>Authorization Require Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Require Group</em>'.
	 * @generated
	 */
	AuthorizationRequireGroup createAuthorizationRequireGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AuthPackage getAuthPackage();

} //AuthFactory
