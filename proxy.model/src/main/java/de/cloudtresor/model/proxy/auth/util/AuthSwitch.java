/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.auth.util;

import de.cloudtresor.model.proxy.ServiceConfigurationItem;

import de.cloudtresor.model.proxy.auth.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cloudtresor.model.proxy.auth.AuthPackage
 * @generated
 */
public class AuthSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AuthPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthSwitch() {
		if (modelPackage == null) {
			modelPackage = AuthPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AuthPackage.AUTHENTICATION_METHOD: {
				AuthenticationMethod authenticationMethod = (AuthenticationMethod)theEObject;
				T result = caseAuthenticationMethod(authenticationMethod);
				if (result == null) result = caseServiceConfigurationItem(authenticationMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthPackage.AUTHENTICATION_METHOD_HTPASSWD: {
				AuthenticationMethodHtpasswd authenticationMethodHtpasswd = (AuthenticationMethodHtpasswd)theEObject;
				T result = caseAuthenticationMethodHtpasswd(authenticationMethodHtpasswd);
				if (result == null) result = caseAuthenticationMethod(authenticationMethodHtpasswd);
				if (result == null) result = caseServiceConfigurationItem(authenticationMethodHtpasswd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthPackage.AUTHORIZATION_METHOD: {
				AuthorizationMethod authorizationMethod = (AuthorizationMethod)theEObject;
				T result = caseAuthorizationMethod(authorizationMethod);
				if (result == null) result = caseServiceConfigurationItem(authorizationMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthPackage.AUTHORIZATION_METHOD_GROUPFILE: {
				AuthorizationMethodGroupfile authorizationMethodGroupfile = (AuthorizationMethodGroupfile)theEObject;
				T result = caseAuthorizationMethodGroupfile(authorizationMethodGroupfile);
				if (result == null) result = caseAuthorizationMethod(authorizationMethodGroupfile);
				if (result == null) result = caseServiceConfigurationItem(authorizationMethodGroupfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthPackage.AUTHORIZATION_CONFIGURATION: {
				AuthorizationConfiguration authorizationConfiguration = (AuthorizationConfiguration)theEObject;
				T result = caseAuthorizationConfiguration(authorizationConfiguration);
				if (result == null) result = caseServiceConfigurationItem(authorizationConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthPackage.AUTHORIZATION_CONFIGURATION_ITEM: {
				AuthorizationConfigurationItem authorizationConfigurationItem = (AuthorizationConfigurationItem)theEObject;
				T result = caseAuthorizationConfigurationItem(authorizationConfigurationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthPackage.AUTHORIZATION_REQUIRE_VALID_USER: {
				AuthorizationRequireValidUser authorizationRequireValidUser = (AuthorizationRequireValidUser)theEObject;
				T result = caseAuthorizationRequireValidUser(authorizationRequireValidUser);
				if (result == null) result = caseAuthorizationConfigurationItem(authorizationRequireValidUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthPackage.AUTHORIZATION_REQUIRE_GROUP: {
				AuthorizationRequireGroup authorizationRequireGroup = (AuthorizationRequireGroup)theEObject;
				T result = caseAuthorizationRequireGroup(authorizationRequireGroup);
				if (result == null) result = caseAuthorizationConfigurationItem(authorizationRequireGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticationMethod(AuthenticationMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication Method Htpasswd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication Method Htpasswd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticationMethodHtpasswd(AuthenticationMethodHtpasswd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationMethod(AuthorizationMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Method Groupfile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Method Groupfile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationMethodGroupfile(AuthorizationMethodGroupfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationConfiguration(AuthorizationConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Configuration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Configuration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationConfigurationItem(AuthorizationConfigurationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Require Valid User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Require Valid User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationRequireValidUser(AuthorizationRequireValidUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Require Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Require Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationRequireGroup(AuthorizationRequireGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Configuration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Configuration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceConfigurationItem(ServiceConfigurationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AuthSwitch
