/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.impl;

import de.cloudtresor.model.proxy.ConfigurationItem;
import de.cloudtresor.model.proxy.IdentifiableElement;
import de.cloudtresor.model.proxy.ProxyConfiguration;
import de.cloudtresor.model.proxy.ProxyFactory;
import de.cloudtresor.model.proxy.ProxyPackage;
import de.cloudtresor.model.proxy.Service;

import de.cloudtresor.model.proxy.endpoint.EndpointPackage;

import de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl;

import java.security.cert.Certificate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProxyPackageImpl extends EPackageImpl implements ProxyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxyConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType urlEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType certificateEDataType = null;

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
	 * @see de.cloudtresor.model.proxy.ProxyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProxyPackageImpl() {
		super(eNS_URI, ProxyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProxyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProxyPackage init() {
		if (isInited) return (ProxyPackage)EPackage.Registry.INSTANCE.getEPackage(ProxyPackage.eNS_URI);

		// Obtain or create and register package
		ProxyPackageImpl theProxyPackage = (ProxyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProxyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProxyPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EndpointPackageImpl theEndpointPackage = (EndpointPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EndpointPackage.eNS_URI) instanceof EndpointPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EndpointPackage.eNS_URI) : EndpointPackage.eINSTANCE);

		// Create package meta-data objects
		theProxyPackage.createPackageContents();
		theEndpointPackage.createPackageContents();

		// Initialize created meta-data
		theProxyPackage.initializePackageContents();
		theEndpointPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProxyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProxyPackage.eNS_URI, theProxyPackage);
		return theProxyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiableElement() {
		return identifiableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiableElement_Name() {
		return (EAttribute)identifiableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProxyConfiguration() {
		return proxyConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProxyConfiguration_Services() {
		return (EReference)proxyConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProxyConfiguration_ConfigurationItems() {
		return (EReference)proxyConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationItem() {
		return configurationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURL() {
		return urlEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCertificate() {
		return certificateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyFactory getProxyFactory() {
		return (ProxyFactory)getEFactoryInstance();
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
		identifiableElementEClass = createEClass(IDENTIFIABLE_ELEMENT);
		createEAttribute(identifiableElementEClass, IDENTIFIABLE_ELEMENT__NAME);

		proxyConfigurationEClass = createEClass(PROXY_CONFIGURATION);
		createEReference(proxyConfigurationEClass, PROXY_CONFIGURATION__SERVICES);
		createEReference(proxyConfigurationEClass, PROXY_CONFIGURATION__CONFIGURATION_ITEMS);

		serviceEClass = createEClass(SERVICE);

		configurationItemEClass = createEClass(CONFIGURATION_ITEM);

		// Create data types
		urlEDataType = createEDataType(URL);
		certificateEDataType = createEDataType(CERTIFICATE);
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
		EndpointPackage theEndpointPackage = (EndpointPackage)EPackage.Registry.INSTANCE.getEPackage(EndpointPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theEndpointPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceEClass.getESuperTypes().add(this.getIdentifiableElement());

		// Initialize classes and features; add operations and parameters
		initEClass(identifiableElementEClass, IdentifiableElement.class, "IdentifiableElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiableElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, IdentifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proxyConfigurationEClass, ProxyConfiguration.class, "ProxyConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProxyConfiguration_Services(), this.getService(), null, "services", null, 0, -1, ProxyConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProxyConfiguration_ConfigurationItems(), this.getConfigurationItem(), null, "configurationItems", null, 0, -1, ProxyConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configurationItemEClass, ConfigurationItem.class, "ConfigurationItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(urlEDataType, java.net.URL.class, "URL", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(certificateEDataType, Certificate.class, "Certificate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ProxyPackageImpl
