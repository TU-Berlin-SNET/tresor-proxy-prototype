/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.auth.impl;

import de.cloudtresor.model.proxy.ProxyPackage;

import de.cloudtresor.model.proxy.auth.AuthFactory;
import de.cloudtresor.model.proxy.auth.AuthPackage;
import de.cloudtresor.model.proxy.auth.AuthenticationMethod;
import de.cloudtresor.model.proxy.auth.AuthenticationMethodHtpasswd;
import de.cloudtresor.model.proxy.auth.AuthorizationConfiguration;
import de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem;
import de.cloudtresor.model.proxy.auth.AuthorizationMethod;
import de.cloudtresor.model.proxy.auth.AuthorizationMethodGroupfile;
import de.cloudtresor.model.proxy.auth.AuthorizationRequireGroup;
import de.cloudtresor.model.proxy.auth.AuthorizationRequireValidUser;
import de.cloudtresor.model.proxy.auth.AuthorizationState;

import de.cloudtresor.model.proxy.endpoint.EndpointPackage;

import de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl;

import de.cloudtresor.model.proxy.impl.ProxyPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuthPackageImpl extends EPackageImpl implements AuthPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationMethodHtpasswdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationMethodGroupfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationConfigurationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationRequireValidUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationRequireGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authorizationStateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.cloudtresor.model.proxy.auth.AuthPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AuthPackageImpl() {
		super(eNS_URI, AuthFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AuthPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AuthPackage init() {
		if (isInited) return (AuthPackage)EPackage.Registry.INSTANCE.getEPackage(AuthPackage.eNS_URI);

		// Obtain or create and register package
		AuthPackageImpl theAuthPackage = (AuthPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AuthPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AuthPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ProxyPackageImpl theProxyPackage = (ProxyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProxyPackage.eNS_URI) instanceof ProxyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProxyPackage.eNS_URI) : ProxyPackage.eINSTANCE);
		EndpointPackageImpl theEndpointPackage = (EndpointPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EndpointPackage.eNS_URI) instanceof EndpointPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EndpointPackage.eNS_URI) : EndpointPackage.eINSTANCE);

		// Create package meta-data objects
		theAuthPackage.createPackageContents();
		theProxyPackage.createPackageContents();
		theEndpointPackage.createPackageContents();

		// Initialize created meta-data
		theAuthPackage.initializePackageContents();
		theProxyPackage.initializePackageContents();
		theEndpointPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAuthPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AuthPackage.eNS_URI, theAuthPackage);
		return theAuthPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticationMethod() {
		return authenticationMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticationMethodHtpasswd() {
		return authenticationMethodHtpasswdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationMethodHtpasswd_Path() {
		return (EAttribute)authenticationMethodHtpasswdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationMethod() {
		return authorizationMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationMethodGroupfile() {
		return authorizationMethodGroupfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizationMethodGroupfile_Path() {
		return (EAttribute)authorizationMethodGroupfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationConfiguration() {
		return authorizationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizationConfiguration_Default() {
		return (EAttribute)authorizationConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizationConfiguration_AuthorizationConfigurationItems() {
		return (EReference)authorizationConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationConfigurationItem() {
		return authorizationConfigurationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizationConfigurationItem_Pattern() {
		return (EAttribute)authorizationConfigurationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationRequireValidUser() {
		return authorizationRequireValidUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationRequireGroup() {
		return authorizationRequireGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizationRequireGroup_GroupIdentifier() {
		return (EAttribute)authorizationRequireGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuthorizationState() {
		return authorizationStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthFactory getAuthFactory() {
		return (AuthFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		authenticationMethodEClass = createEClass(AUTHENTICATION_METHOD);

		authenticationMethodHtpasswdEClass = createEClass(AUTHENTICATION_METHOD_HTPASSWD);
		createEAttribute(authenticationMethodHtpasswdEClass, AUTHENTICATION_METHOD_HTPASSWD__PATH);

		authorizationMethodEClass = createEClass(AUTHORIZATION_METHOD);

		authorizationMethodGroupfileEClass = createEClass(AUTHORIZATION_METHOD_GROUPFILE);
		createEAttribute(authorizationMethodGroupfileEClass, AUTHORIZATION_METHOD_GROUPFILE__PATH);

		authorizationConfigurationEClass = createEClass(AUTHORIZATION_CONFIGURATION);
		createEAttribute(authorizationConfigurationEClass, AUTHORIZATION_CONFIGURATION__DEFAULT);
		createEReference(authorizationConfigurationEClass, AUTHORIZATION_CONFIGURATION__AUTHORIZATION_CONFIGURATION_ITEMS);

		authorizationConfigurationItemEClass = createEClass(AUTHORIZATION_CONFIGURATION_ITEM);
		createEAttribute(authorizationConfigurationItemEClass, AUTHORIZATION_CONFIGURATION_ITEM__PATTERN);

		authorizationRequireValidUserEClass = createEClass(AUTHORIZATION_REQUIRE_VALID_USER);

		authorizationRequireGroupEClass = createEClass(AUTHORIZATION_REQUIRE_GROUP);
		createEAttribute(authorizationRequireGroupEClass, AUTHORIZATION_REQUIRE_GROUP__GROUP_IDENTIFIER);

		// Create enums
		authorizationStateEEnum = createEEnum(AUTHORIZATION_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ProxyPackage theProxyPackage = (ProxyPackage)EPackage.Registry.INSTANCE.getEPackage(ProxyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		authenticationMethodEClass.getESuperTypes().add(theProxyPackage.getServiceConfigurationItem());
		authenticationMethodHtpasswdEClass.getESuperTypes().add(this.getAuthenticationMethod());
		authorizationMethodEClass.getESuperTypes().add(theProxyPackage.getServiceConfigurationItem());
		authorizationMethodGroupfileEClass.getESuperTypes().add(this.getAuthorizationMethod());
		authorizationConfigurationEClass.getESuperTypes().add(theProxyPackage.getServiceConfigurationItem());
		authorizationRequireValidUserEClass.getESuperTypes().add(this.getAuthorizationConfigurationItem());
		authorizationRequireGroupEClass.getESuperTypes().add(this.getAuthorizationConfigurationItem());

		// Initialize classes and features; add operations and parameters
		initEClass(authenticationMethodEClass, AuthenticationMethod.class, "AuthenticationMethod", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authenticationMethodHtpasswdEClass, AuthenticationMethodHtpasswd.class, "AuthenticationMethodHtpasswd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthenticationMethodHtpasswd_Path(), ecorePackage.getEString(), "path", null, 1, 1, AuthenticationMethodHtpasswd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizationMethodEClass, AuthorizationMethod.class, "AuthorizationMethod", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authorizationMethodGroupfileEClass, AuthorizationMethodGroupfile.class, "AuthorizationMethodGroupfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorizationMethodGroupfile_Path(), ecorePackage.getEString(), "path", null, 1, 1, AuthorizationMethodGroupfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizationConfigurationEClass, AuthorizationConfiguration.class, "AuthorizationConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorizationConfiguration_Default(), this.getAuthorizationState(), "default", null, 1, 1, AuthorizationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorizationConfiguration_AuthorizationConfigurationItems(), this.getAuthorizationConfigurationItem(), null, "authorizationConfigurationItems", null, 0, -1, AuthorizationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizationConfigurationItemEClass, AuthorizationConfigurationItem.class, "AuthorizationConfigurationItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorizationConfigurationItem_Pattern(), ecorePackage.getEString(), "pattern", null, 1, 1, AuthorizationConfigurationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizationRequireValidUserEClass, AuthorizationRequireValidUser.class, "AuthorizationRequireValidUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authorizationRequireGroupEClass, AuthorizationRequireGroup.class, "AuthorizationRequireGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorizationRequireGroup_GroupIdentifier(), ecorePackage.getEString(), "groupIdentifier", null, 1, 1, AuthorizationRequireGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(authorizationStateEEnum, AuthorizationState.class, "AuthorizationState");
		addEEnumLiteral(authorizationStateEEnum, AuthorizationState.ALLOW);
		addEEnumLiteral(authorizationStateEEnum, AuthorizationState.DENY);
	}

} //AuthPackageImpl
