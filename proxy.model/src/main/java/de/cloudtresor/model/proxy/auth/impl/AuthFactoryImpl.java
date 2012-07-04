/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.auth.impl;

import de.cloudtresor.model.proxy.auth.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuthFactoryImpl extends EFactoryImpl implements AuthFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AuthFactory init() {
		try {
			AuthFactory theAuthFactory = (AuthFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cloud-tresor.de/model/proxy/auth"); 
			if (theAuthFactory != null) {
				return theAuthFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AuthFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AuthPackage.AUTHENTICATION_METHOD_HTPASSWD: return createAuthenticationMethodHtpasswd();
			case AuthPackage.AUTHORIZATION_METHOD_GROUPFILE: return createAuthorizationMethodGroupfile();
			case AuthPackage.AUTHORIZATION_CONFIGURATION: return createAuthorizationConfiguration();
			case AuthPackage.AUTHORIZATION_REQUIRE_VALID_USER: return createAuthorizationRequireValidUser();
			case AuthPackage.AUTHORIZATION_REQUIRE_GROUP: return createAuthorizationRequireGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AuthPackage.AUTHORIZATION_STATE:
				return createAuthorizationStateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AuthPackage.AUTHORIZATION_STATE:
				return convertAuthorizationStateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationMethodHtpasswd createAuthenticationMethodHtpasswd() {
		AuthenticationMethodHtpasswdImpl authenticationMethodHtpasswd = new AuthenticationMethodHtpasswdImpl();
		return authenticationMethodHtpasswd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationMethodGroupfile createAuthorizationMethodGroupfile() {
		AuthorizationMethodGroupfileImpl authorizationMethodGroupfile = new AuthorizationMethodGroupfileImpl();
		return authorizationMethodGroupfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationConfiguration createAuthorizationConfiguration() {
		AuthorizationConfigurationImpl authorizationConfiguration = new AuthorizationConfigurationImpl();
		return authorizationConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationRequireValidUser createAuthorizationRequireValidUser() {
		AuthorizationRequireValidUserImpl authorizationRequireValidUser = new AuthorizationRequireValidUserImpl();
		return authorizationRequireValidUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationRequireGroup createAuthorizationRequireGroup() {
		AuthorizationRequireGroupImpl authorizationRequireGroup = new AuthorizationRequireGroupImpl();
		return authorizationRequireGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationState createAuthorizationStateFromString(EDataType eDataType, String initialValue) {
		AuthorizationState result = AuthorizationState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthorizationStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthPackage getAuthPackage() {
		return (AuthPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AuthPackage getPackage() {
		return AuthPackage.eINSTANCE;
	}

} //AuthFactoryImpl
