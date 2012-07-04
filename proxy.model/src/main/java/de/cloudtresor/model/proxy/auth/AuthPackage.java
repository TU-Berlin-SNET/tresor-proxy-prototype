/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.auth;

import de.cloudtresor.model.proxy.ProxyPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cloudtresor.model.proxy.auth.AuthFactory
 * @model kind="package"
 * @generated
 */
public interface AuthPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "auth";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cloud-tresor.de/model/proxy/auth";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "proxyAuth";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AuthPackage eINSTANCE = de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.auth.AuthenticationMethod <em>Authentication Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.auth.AuthenticationMethod
	 * @see de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl#getAuthenticationMethod()
	 * @generated
	 */
	int AUTHENTICATION_METHOD = 0;

	/**
	 * The number of structural features of the '<em>Authentication Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_METHOD_FEATURE_COUNT = ProxyPackage.SERVICE_CONFIGURATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.auth.impl.AuthenticationMethodHtpasswdImpl <em>Authentication Method Htpasswd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.auth.impl.AuthenticationMethodHtpasswdImpl
	 * @see de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl#getAuthenticationMethodHtpasswd()
	 * @generated
	 */
	int AUTHENTICATION_METHOD_HTPASSWD = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_METHOD_HTPASSWD__PATH = AUTHENTICATION_METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Authentication Method Htpasswd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_METHOD_HTPASSWD_FEATURE_COUNT = AUTHENTICATION_METHOD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.auth.AuthorizationMethod <em>Authorization Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationMethod
	 * @see de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl#getAuthorizationMethod()
	 * @generated
	 */
	int AUTHORIZATION_METHOD = 2;

	/**
	 * The number of structural features of the '<em>Authorization Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_METHOD_FEATURE_COUNT = ProxyPackage.SERVICE_CONFIGURATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.auth.impl.AuthorizationMethodGroupfileImpl <em>Authorization Method Groupfile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.auth.impl.AuthorizationMethodGroupfileImpl
	 * @see de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl#getAuthorizationMethodGroupfile()
	 * @generated
	 */
	int AUTHORIZATION_METHOD_GROUPFILE = 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_METHOD_GROUPFILE__PATH = AUTHORIZATION_METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Authorization Method Groupfile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_METHOD_GROUPFILE_FEATURE_COUNT = AUTHORIZATION_METHOD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.auth.impl.AuthorizationConfigurationImpl <em>Authorization Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.auth.impl.AuthorizationConfigurationImpl
	 * @see de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl#getAuthorizationConfiguration()
	 * @generated
	 */
	int AUTHORIZATION_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_CONFIGURATION__DEFAULT = ProxyPackage.SERVICE_CONFIGURATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Authorization Configuration Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_CONFIGURATION__AUTHORIZATION_CONFIGURATION_ITEMS = ProxyPackage.SERVICE_CONFIGURATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Authorization Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_CONFIGURATION_FEATURE_COUNT = ProxyPackage.SERVICE_CONFIGURATION_ITEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem <em>Authorization Configuration Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem
	 * @see de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl#getAuthorizationConfigurationItem()
	 * @generated
	 */
	int AUTHORIZATION_CONFIGURATION_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_CONFIGURATION_ITEM__PATTERN = 0;

	/**
	 * The number of structural features of the '<em>Authorization Configuration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_CONFIGURATION_ITEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.auth.impl.AuthorizationRequireValidUserImpl <em>Authorization Require Valid User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.auth.impl.AuthorizationRequireValidUserImpl
	 * @see de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl#getAuthorizationRequireValidUser()
	 * @generated
	 */
	int AUTHORIZATION_REQUIRE_VALID_USER = 6;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_REQUIRE_VALID_USER__PATTERN = AUTHORIZATION_CONFIGURATION_ITEM__PATTERN;

	/**
	 * The number of structural features of the '<em>Authorization Require Valid User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_REQUIRE_VALID_USER_FEATURE_COUNT = AUTHORIZATION_CONFIGURATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.auth.impl.AuthorizationRequireGroupImpl <em>Authorization Require Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.auth.impl.AuthorizationRequireGroupImpl
	 * @see de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl#getAuthorizationRequireGroup()
	 * @generated
	 */
	int AUTHORIZATION_REQUIRE_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_REQUIRE_GROUP__PATTERN = AUTHORIZATION_CONFIGURATION_ITEM__PATTERN;

	/**
	 * The feature id for the '<em><b>Group Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_REQUIRE_GROUP__GROUP_IDENTIFIER = AUTHORIZATION_CONFIGURATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Authorization Require Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_REQUIRE_GROUP_FEATURE_COUNT = AUTHORIZATION_CONFIGURATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.auth.AuthorizationState <em>Authorization State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationState
	 * @see de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl#getAuthorizationState()
	 * @generated
	 */
	int AUTHORIZATION_STATE = 8;


	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.auth.AuthenticationMethod <em>Authentication Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Method</em>'.
	 * @see de.cloudtresor.model.proxy.auth.AuthenticationMethod
	 * @generated
	 */
	EClass getAuthenticationMethod();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.auth.AuthenticationMethodHtpasswd <em>Authentication Method Htpasswd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Method Htpasswd</em>'.
	 * @see de.cloudtresor.model.proxy.auth.AuthenticationMethodHtpasswd
	 * @generated
	 */
	EClass getAuthenticationMethodHtpasswd();

	/**
	 * Returns the meta object for the attribute '{@link de.cloudtresor.model.proxy.auth.AuthenticationMethodHtpasswd#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.cloudtresor.model.proxy.auth.AuthenticationMethodHtpasswd#getPath()
	 * @see #getAuthenticationMethodHtpasswd()
	 * @generated
	 */
	EAttribute getAuthenticationMethodHtpasswd_Path();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.auth.AuthorizationMethod <em>Authorization Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Method</em>'.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationMethod
	 * @generated
	 */
	EClass getAuthorizationMethod();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.auth.AuthorizationMethodGroupfile <em>Authorization Method Groupfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Method Groupfile</em>'.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationMethodGroupfile
	 * @generated
	 */
	EClass getAuthorizationMethodGroupfile();

	/**
	 * Returns the meta object for the attribute '{@link de.cloudtresor.model.proxy.auth.AuthorizationMethodGroupfile#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationMethodGroupfile#getPath()
	 * @see #getAuthorizationMethodGroupfile()
	 * @generated
	 */
	EAttribute getAuthorizationMethodGroupfile_Path();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.auth.AuthorizationConfiguration <em>Authorization Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationConfiguration
	 * @generated
	 */
	EClass getAuthorizationConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link de.cloudtresor.model.proxy.auth.AuthorizationConfiguration#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationConfiguration#getDefault()
	 * @see #getAuthorizationConfiguration()
	 * @generated
	 */
	EAttribute getAuthorizationConfiguration_Default();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cloudtresor.model.proxy.auth.AuthorizationConfiguration#getAuthorizationConfigurationItems <em>Authorization Configuration Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authorization Configuration Items</em>'.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationConfiguration#getAuthorizationConfigurationItems()
	 * @see #getAuthorizationConfiguration()
	 * @generated
	 */
	EReference getAuthorizationConfiguration_AuthorizationConfigurationItems();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem <em>Authorization Configuration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Configuration Item</em>'.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem
	 * @generated
	 */
	EClass getAuthorizationConfigurationItem();

	/**
	 * Returns the meta object for the attribute '{@link de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem#getPattern()
	 * @see #getAuthorizationConfigurationItem()
	 * @generated
	 */
	EAttribute getAuthorizationConfigurationItem_Pattern();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.auth.AuthorizationRequireValidUser <em>Authorization Require Valid User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Require Valid User</em>'.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationRequireValidUser
	 * @generated
	 */
	EClass getAuthorizationRequireValidUser();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.auth.AuthorizationRequireGroup <em>Authorization Require Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Require Group</em>'.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationRequireGroup
	 * @generated
	 */
	EClass getAuthorizationRequireGroup();

	/**
	 * Returns the meta object for the attribute '{@link de.cloudtresor.model.proxy.auth.AuthorizationRequireGroup#getGroupIdentifier <em>Group Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Identifier</em>'.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationRequireGroup#getGroupIdentifier()
	 * @see #getAuthorizationRequireGroup()
	 * @generated
	 */
	EAttribute getAuthorizationRequireGroup_GroupIdentifier();

	/**
	 * Returns the meta object for enum '{@link de.cloudtresor.model.proxy.auth.AuthorizationState <em>Authorization State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Authorization State</em>'.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationState
	 * @generated
	 */
	EEnum getAuthorizationState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AuthFactory getAuthFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.auth.AuthenticationMethod <em>Authentication Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.auth.AuthenticationMethod
		 * @see de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl#getAuthenticationMethod()
		 * @generated
		 */
		EClass AUTHENTICATION_METHOD = eINSTANCE.getAuthenticationMethod();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.auth.impl.AuthenticationMethodHtpasswdImpl <em>Authentication Method Htpasswd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.auth.impl.AuthenticationMethodHtpasswdImpl
		 * @see de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl#getAuthenticationMethodHtpasswd()
		 * @generated
		 */
		EClass AUTHENTICATION_METHOD_HTPASSWD = eINSTANCE.getAuthenticationMethodHtpasswd();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_METHOD_HTPASSWD__PATH = eINSTANCE.getAuthenticationMethodHtpasswd_Path();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.auth.AuthorizationMethod <em>Authorization Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.auth.AuthorizationMethod
		 * @see de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl#getAuthorizationMethod()
		 * @generated
		 */
		EClass AUTHORIZATION_METHOD = eINSTANCE.getAuthorizationMethod();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.auth.impl.AuthorizationMethodGroupfileImpl <em>Authorization Method Groupfile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.auth.impl.AuthorizationMethodGroupfileImpl
		 * @see de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl#getAuthorizationMethodGroupfile()
		 * @generated
		 */
		EClass AUTHORIZATION_METHOD_GROUPFILE = eINSTANCE.getAuthorizationMethodGroupfile();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZATION_METHOD_GROUPFILE__PATH = eINSTANCE.getAuthorizationMethodGroupfile_Path();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.auth.impl.AuthorizationConfigurationImpl <em>Authorization Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.auth.impl.AuthorizationConfigurationImpl
		 * @see de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl#getAuthorizationConfiguration()
		 * @generated
		 */
		EClass AUTHORIZATION_CONFIGURATION = eINSTANCE.getAuthorizationConfiguration();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZATION_CONFIGURATION__DEFAULT = eINSTANCE.getAuthorizationConfiguration_Default();

		/**
		 * The meta object literal for the '<em><b>Authorization Configuration Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZATION_CONFIGURATION__AUTHORIZATION_CONFIGURATION_ITEMS = eINSTANCE.getAuthorizationConfiguration_AuthorizationConfigurationItems();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem <em>Authorization Configuration Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem
		 * @see de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl#getAuthorizationConfigurationItem()
		 * @generated
		 */
		EClass AUTHORIZATION_CONFIGURATION_ITEM = eINSTANCE.getAuthorizationConfigurationItem();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZATION_CONFIGURATION_ITEM__PATTERN = eINSTANCE.getAuthorizationConfigurationItem_Pattern();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.auth.impl.AuthorizationRequireValidUserImpl <em>Authorization Require Valid User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.auth.impl.AuthorizationRequireValidUserImpl
		 * @see de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl#getAuthorizationRequireValidUser()
		 * @generated
		 */
		EClass AUTHORIZATION_REQUIRE_VALID_USER = eINSTANCE.getAuthorizationRequireValidUser();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.auth.impl.AuthorizationRequireGroupImpl <em>Authorization Require Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.auth.impl.AuthorizationRequireGroupImpl
		 * @see de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl#getAuthorizationRequireGroup()
		 * @generated
		 */
		EClass AUTHORIZATION_REQUIRE_GROUP = eINSTANCE.getAuthorizationRequireGroup();

		/**
		 * The meta object literal for the '<em><b>Group Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZATION_REQUIRE_GROUP__GROUP_IDENTIFIER = eINSTANCE.getAuthorizationRequireGroup_GroupIdentifier();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.auth.AuthorizationState <em>Authorization State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.auth.AuthorizationState
		 * @see de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl#getAuthorizationState()
		 * @generated
		 */
		EEnum AUTHORIZATION_STATE = eINSTANCE.getAuthorizationState();

	}

} //AuthPackage
