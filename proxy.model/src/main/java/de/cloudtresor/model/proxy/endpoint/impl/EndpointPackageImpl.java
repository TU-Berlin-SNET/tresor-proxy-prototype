/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint.impl;

import de.cloudtresor.model.proxy.ProxyPackage;

import de.cloudtresor.model.proxy.endpoint.ClientSSLConfiguration;
import de.cloudtresor.model.proxy.endpoint.EndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.EndpointFactory;
import de.cloudtresor.model.proxy.endpoint.EndpointPackage;
import de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpoint;
import de.cloudtresor.model.proxy.endpoint.LocalSSLEndpoint;
import de.cloudtresor.model.proxy.endpoint.LocalTSTPEndpoint;
import de.cloudtresor.model.proxy.endpoint.RemoteHTTPEndpoint;
import de.cloudtresor.model.proxy.endpoint.RemoteSSLEndpoint;
import de.cloudtresor.model.proxy.endpoint.RemoteTSTPEndpoint;
import de.cloudtresor.model.proxy.endpoint.SSLConfiguration;
import de.cloudtresor.model.proxy.endpoint.SecureEndpoint;
import de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration;
import de.cloudtresor.model.proxy.endpoint.TSTPEndpoint;

import de.cloudtresor.model.proxy.impl.ProxyPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EndpointPackageImpl extends EPackageImpl implements EndpointPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localHTTPEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localSSLEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localTSTPEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteHTTPEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteSSLEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteTSTPEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secureEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tstpEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sslConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientSSLConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverSSLConfigurationEClass = null;

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
	 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EndpointPackageImpl() {
		super(eNS_URI, EndpointFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EndpointPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EndpointPackage init() {
		if (isInited) return (EndpointPackage)EPackage.Registry.INSTANCE.getEPackage(EndpointPackage.eNS_URI);

		// Obtain or create and register package
		EndpointPackageImpl theEndpointPackage = (EndpointPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EndpointPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EndpointPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ProxyPackageImpl theProxyPackage = (ProxyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProxyPackage.eNS_URI) instanceof ProxyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProxyPackage.eNS_URI) : ProxyPackage.eINSTANCE);

		// Create package meta-data objects
		theEndpointPackage.createPackageContents();
		theProxyPackage.createPackageContents();

		// Initialize created meta-data
		theEndpointPackage.initializePackageContents();
		theProxyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEndpointPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EndpointPackage.eNS_URI, theEndpointPackage);
		return theEndpointPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalHTTPEndpoint() {
		return localHTTPEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalSSLEndpoint() {
		return localSSLEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalTSTPEndpoint() {
		return localTSTPEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteHTTPEndpoint() {
		return remoteHTTPEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteSSLEndpoint() {
		return remoteSSLEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteTSTPEndpoint() {
		return remoteTSTPEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpointConfiguration() {
		return endpointConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointConfiguration_Url() {
		return (EAttribute)endpointConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecureEndpoint() {
		return secureEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecureEndpoint_SslConfiguration() {
		return (EReference)secureEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSTPEndpoint() {
		return tstpEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTSTPEndpoint_TstpConfiguration() {
		return (EReference)tstpEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSSLConfiguration() {
		return sslConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClientSSLConfiguration() {
		return clientSSLConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientSSLConfiguration_AcceptedServerCertificates() {
		return (EAttribute)clientSSLConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClientSSLConfiguration_ClientCertificate() {
		return (EAttribute)clientSSLConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerSSLConfiguration() {
		return serverSSLConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSSLConfiguration_ServerCertificate() {
		return (EAttribute)serverSSLConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServerSSLConfiguration_AcceptedClientCertificates() {
		return (EAttribute)serverSSLConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointFactory getEndpointFactory() {
		return (EndpointFactory)getEFactoryInstance();
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
		localHTTPEndpointEClass = createEClass(LOCAL_HTTP_ENDPOINT);

		localSSLEndpointEClass = createEClass(LOCAL_SSL_ENDPOINT);

		localTSTPEndpointEClass = createEClass(LOCAL_TSTP_ENDPOINT);

		remoteHTTPEndpointEClass = createEClass(REMOTE_HTTP_ENDPOINT);

		remoteSSLEndpointEClass = createEClass(REMOTE_SSL_ENDPOINT);

		remoteTSTPEndpointEClass = createEClass(REMOTE_TSTP_ENDPOINT);

		endpointConfigurationEClass = createEClass(ENDPOINT_CONFIGURATION);
		createEAttribute(endpointConfigurationEClass, ENDPOINT_CONFIGURATION__URL);

		secureEndpointEClass = createEClass(SECURE_ENDPOINT);
		createEReference(secureEndpointEClass, SECURE_ENDPOINT__SSL_CONFIGURATION);

		tstpEndpointEClass = createEClass(TSTP_ENDPOINT);
		createEReference(tstpEndpointEClass, TSTP_ENDPOINT__TSTP_CONFIGURATION);

		sslConfigurationEClass = createEClass(SSL_CONFIGURATION);

		clientSSLConfigurationEClass = createEClass(CLIENT_SSL_CONFIGURATION);
		createEAttribute(clientSSLConfigurationEClass, CLIENT_SSL_CONFIGURATION__ACCEPTED_SERVER_CERTIFICATES);
		createEAttribute(clientSSLConfigurationEClass, CLIENT_SSL_CONFIGURATION__CLIENT_CERTIFICATE);

		serverSSLConfigurationEClass = createEClass(SERVER_SSL_CONFIGURATION);
		createEAttribute(serverSSLConfigurationEClass, SERVER_SSL_CONFIGURATION__SERVER_CERTIFICATE);
		createEAttribute(serverSSLConfigurationEClass, SERVER_SSL_CONFIGURATION__ACCEPTED_CLIENT_CERTIFICATES);
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
		ETypeParameter secureEndpointEClass_C = addETypeParameter(secureEndpointEClass, "C");
		ETypeParameter tstpEndpointEClass_C = addETypeParameter(tstpEndpointEClass, "C");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getSSLConfiguration());
		secureEndpointEClass_C.getEBounds().add(g1);
		g1 = createEGenericType(this.getSSLConfiguration());
		tstpEndpointEClass_C.getEBounds().add(g1);

		// Add supertypes to classes
		localHTTPEndpointEClass.getESuperTypes().add(theProxyPackage.getConfigurationItem());
		localHTTPEndpointEClass.getESuperTypes().add(this.getEndpointConfiguration());
		g1 = createEGenericType(this.getLocalHTTPEndpoint());
		localSSLEndpointEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSecureEndpoint());
		EGenericType g2 = createEGenericType(this.getClientSSLConfiguration());
		g1.getETypeArguments().add(g2);
		localSSLEndpointEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getLocalSSLEndpoint());
		localTSTPEndpointEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTSTPEndpoint());
		g2 = createEGenericType(this.getClientSSLConfiguration());
		g1.getETypeArguments().add(g2);
		localTSTPEndpointEClass.getEGenericSuperTypes().add(g1);
		remoteHTTPEndpointEClass.getESuperTypes().add(theProxyPackage.getConfigurationItem());
		remoteHTTPEndpointEClass.getESuperTypes().add(this.getEndpointConfiguration());
		g1 = createEGenericType(this.getRemoteHTTPEndpoint());
		remoteSSLEndpointEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSecureEndpoint());
		g2 = createEGenericType(this.getServerSSLConfiguration());
		g1.getETypeArguments().add(g2);
		remoteSSLEndpointEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getLocalSSLEndpoint());
		remoteTSTPEndpointEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTSTPEndpoint());
		g2 = createEGenericType(this.getServerSSLConfiguration());
		g1.getETypeArguments().add(g2);
		remoteTSTPEndpointEClass.getEGenericSuperTypes().add(g1);
		clientSSLConfigurationEClass.getESuperTypes().add(this.getSSLConfiguration());
		serverSSLConfigurationEClass.getESuperTypes().add(this.getSSLConfiguration());

		// Initialize classes and features; add operations and parameters
		initEClass(localHTTPEndpointEClass, LocalHTTPEndpoint.class, "LocalHTTPEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(localSSLEndpointEClass, LocalSSLEndpoint.class, "LocalSSLEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(localTSTPEndpointEClass, LocalTSTPEndpoint.class, "LocalTSTPEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remoteHTTPEndpointEClass, RemoteHTTPEndpoint.class, "RemoteHTTPEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remoteSSLEndpointEClass, RemoteSSLEndpoint.class, "RemoteSSLEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remoteTSTPEndpointEClass, RemoteTSTPEndpoint.class, "RemoteTSTPEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endpointConfigurationEClass, EndpointConfiguration.class, "EndpointConfiguration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndpointConfiguration_Url(), theProxyPackage.getURL(), "url", null, 1, 1, EndpointConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secureEndpointEClass, SecureEndpoint.class, "SecureEndpoint", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(secureEndpointEClass_C);
		initEReference(getSecureEndpoint_SslConfiguration(), g1, null, "sslConfiguration", null, 1, 1, SecureEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tstpEndpointEClass, TSTPEndpoint.class, "TSTPEndpoint", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(tstpEndpointEClass_C);
		initEReference(getTSTPEndpoint_TstpConfiguration(), g1, null, "tstpConfiguration", null, 1, 1, TSTPEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sslConfigurationEClass, SSLConfiguration.class, "SSLConfiguration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clientSSLConfigurationEClass, ClientSSLConfiguration.class, "ClientSSLConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClientSSLConfiguration_AcceptedServerCertificates(), theProxyPackage.getCertificate(), "acceptedServerCertificates", null, 0, -1, ClientSSLConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClientSSLConfiguration_ClientCertificate(), theProxyPackage.getCertificate(), "clientCertificate", null, 0, 1, ClientSSLConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverSSLConfigurationEClass, ServerSSLConfiguration.class, "ServerSSLConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerSSLConfiguration_ServerCertificate(), theProxyPackage.getCertificate(), "serverCertificate", null, 1, 1, ServerSSLConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSSLConfiguration_AcceptedClientCertificates(), theProxyPackage.getCertificate(), "acceptedClientCertificates", null, 0, -1, ServerSSLConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //EndpointPackageImpl
