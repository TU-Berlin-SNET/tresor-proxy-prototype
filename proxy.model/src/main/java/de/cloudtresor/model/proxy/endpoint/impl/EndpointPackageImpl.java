/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint.impl;

import de.cloudtresor.model.proxy.ProxyPackage;

import de.cloudtresor.model.proxy.auth.AuthPackage;

import de.cloudtresor.model.proxy.auth.impl.AuthPackageImpl;

import de.cloudtresor.model.proxy.endpoint.ClientSSLConfiguration;
import de.cloudtresor.model.proxy.endpoint.EndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.EndpointFactory;
import de.cloudtresor.model.proxy.endpoint.EndpointPackage;
import de.cloudtresor.model.proxy.endpoint.LocalEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.LocalSSLEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.LocalTSTPEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.RemoteEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.RemoteHTTPEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.RemoteSSLEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.RemoteTSTPEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.SSLConfiguration;
import de.cloudtresor.model.proxy.endpoint.SecureEndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration;
import de.cloudtresor.model.proxy.endpoint.TSTPEndpointConfiguration;

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
	private EClass endpointConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localEndpointConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localHTTPEndpointConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localSSLEndpointConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localTSTPEndpointConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteEndpointConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteHTTPEndpointConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteSSLEndpointConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteTSTPEndpointConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secureEndpointConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tstpEndpointConfigurationEClass = null;

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
		AuthPackageImpl theAuthPackage = (AuthPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuthPackage.eNS_URI) instanceof AuthPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuthPackage.eNS_URI) : AuthPackage.eINSTANCE);

		// Create package meta-data objects
		theEndpointPackage.createPackageContents();
		theProxyPackage.createPackageContents();
		theAuthPackage.createPackageContents();

		// Initialize created meta-data
		theEndpointPackage.initializePackageContents();
		theProxyPackage.initializePackageContents();
		theAuthPackage.initializePackageContents();

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
	public EReference getEndpointConfiguration_Service() {
		return (EReference)endpointConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalEndpointConfiguration() {
		return localEndpointConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalHTTPEndpointConfiguration() {
		return localHTTPEndpointConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalHTTPEndpointConfiguration_BoundInterfaces() {
		return (EAttribute)localHTTPEndpointConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalSSLEndpointConfiguration() {
		return localSSLEndpointConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalTSTPEndpointConfiguration() {
		return localTSTPEndpointConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteEndpointConfiguration() {
		return remoteEndpointConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteHTTPEndpointConfiguration() {
		return remoteHTTPEndpointConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteSSLEndpointConfiguration() {
		return remoteSSLEndpointConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteTSTPEndpointConfiguration() {
		return remoteTSTPEndpointConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecureEndpointConfiguration() {
		return secureEndpointConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecureEndpointConfiguration_SslConfiguration() {
		return (EReference)secureEndpointConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTSTPEndpointConfiguration() {
		return tstpEndpointConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTSTPEndpointConfiguration_TstpConfiguration() {
		return (EReference)tstpEndpointConfigurationEClass.getEStructuralFeatures().get(0);
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
		endpointConfigurationEClass = createEClass(ENDPOINT_CONFIGURATION);
		createEAttribute(endpointConfigurationEClass, ENDPOINT_CONFIGURATION__URL);
		createEReference(endpointConfigurationEClass, ENDPOINT_CONFIGURATION__SERVICE);

		localEndpointConfigurationEClass = createEClass(LOCAL_ENDPOINT_CONFIGURATION);

		localHTTPEndpointConfigurationEClass = createEClass(LOCAL_HTTP_ENDPOINT_CONFIGURATION);
		createEAttribute(localHTTPEndpointConfigurationEClass, LOCAL_HTTP_ENDPOINT_CONFIGURATION__BOUND_INTERFACES);

		localSSLEndpointConfigurationEClass = createEClass(LOCAL_SSL_ENDPOINT_CONFIGURATION);

		localTSTPEndpointConfigurationEClass = createEClass(LOCAL_TSTP_ENDPOINT_CONFIGURATION);

		remoteEndpointConfigurationEClass = createEClass(REMOTE_ENDPOINT_CONFIGURATION);

		remoteHTTPEndpointConfigurationEClass = createEClass(REMOTE_HTTP_ENDPOINT_CONFIGURATION);

		remoteSSLEndpointConfigurationEClass = createEClass(REMOTE_SSL_ENDPOINT_CONFIGURATION);

		remoteTSTPEndpointConfigurationEClass = createEClass(REMOTE_TSTP_ENDPOINT_CONFIGURATION);

		secureEndpointConfigurationEClass = createEClass(SECURE_ENDPOINT_CONFIGURATION);
		createEReference(secureEndpointConfigurationEClass, SECURE_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION);

		tstpEndpointConfigurationEClass = createEClass(TSTP_ENDPOINT_CONFIGURATION);
		createEReference(tstpEndpointConfigurationEClass, TSTP_ENDPOINT_CONFIGURATION__TSTP_CONFIGURATION);

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
		ETypeParameter secureEndpointConfigurationEClass_C = addETypeParameter(secureEndpointConfigurationEClass, "C");
		ETypeParameter tstpEndpointConfigurationEClass_C = addETypeParameter(tstpEndpointConfigurationEClass, "C");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getSSLConfiguration());
		secureEndpointConfigurationEClass_C.getEBounds().add(g1);
		g1 = createEGenericType(this.getSSLConfiguration());
		tstpEndpointConfigurationEClass_C.getEBounds().add(g1);

		// Add supertypes to classes
		endpointConfigurationEClass.getESuperTypes().add(theProxyPackage.getConfigurationItem());
		localEndpointConfigurationEClass.getESuperTypes().add(this.getEndpointConfiguration());
		localHTTPEndpointConfigurationEClass.getESuperTypes().add(this.getLocalEndpointConfiguration());
		g1 = createEGenericType(this.getLocalHTTPEndpointConfiguration());
		localSSLEndpointConfigurationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSecureEndpointConfiguration());
		EGenericType g2 = createEGenericType(this.getClientSSLConfiguration());
		g1.getETypeArguments().add(g2);
		localSSLEndpointConfigurationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getLocalSSLEndpointConfiguration());
		localTSTPEndpointConfigurationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTSTPEndpointConfiguration());
		g2 = createEGenericType(this.getClientSSLConfiguration());
		g1.getETypeArguments().add(g2);
		localTSTPEndpointConfigurationEClass.getEGenericSuperTypes().add(g1);
		remoteEndpointConfigurationEClass.getESuperTypes().add(this.getEndpointConfiguration());
		remoteHTTPEndpointConfigurationEClass.getESuperTypes().add(this.getRemoteEndpointConfiguration());
		g1 = createEGenericType(this.getRemoteHTTPEndpointConfiguration());
		remoteSSLEndpointConfigurationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSecureEndpointConfiguration());
		g2 = createEGenericType(this.getServerSSLConfiguration());
		g1.getETypeArguments().add(g2);
		remoteSSLEndpointConfigurationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getLocalSSLEndpointConfiguration());
		remoteTSTPEndpointConfigurationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTSTPEndpointConfiguration());
		g2 = createEGenericType(this.getServerSSLConfiguration());
		g1.getETypeArguments().add(g2);
		remoteTSTPEndpointConfigurationEClass.getEGenericSuperTypes().add(g1);
		clientSSLConfigurationEClass.getESuperTypes().add(this.getSSLConfiguration());
		serverSSLConfigurationEClass.getESuperTypes().add(this.getSSLConfiguration());

		// Initialize classes and features; add operations and parameters
		initEClass(endpointConfigurationEClass, EndpointConfiguration.class, "EndpointConfiguration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndpointConfiguration_Url(), theProxyPackage.getURL(), "url", null, 1, 1, EndpointConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEndpointConfiguration_Service(), theProxyPackage.getService(), theProxyPackage.getService_Endpoints(), "service", null, 1, 1, EndpointConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localEndpointConfigurationEClass, LocalEndpointConfiguration.class, "LocalEndpointConfiguration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(localHTTPEndpointConfigurationEClass, LocalHTTPEndpointConfiguration.class, "LocalHTTPEndpointConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalHTTPEndpointConfiguration_BoundInterfaces(), ecorePackage.getEString(), "boundInterfaces", null, 0, -1, LocalHTTPEndpointConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localSSLEndpointConfigurationEClass, LocalSSLEndpointConfiguration.class, "LocalSSLEndpointConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(localTSTPEndpointConfigurationEClass, LocalTSTPEndpointConfiguration.class, "LocalTSTPEndpointConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remoteEndpointConfigurationEClass, RemoteEndpointConfiguration.class, "RemoteEndpointConfiguration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remoteHTTPEndpointConfigurationEClass, RemoteHTTPEndpointConfiguration.class, "RemoteHTTPEndpointConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remoteSSLEndpointConfigurationEClass, RemoteSSLEndpointConfiguration.class, "RemoteSSLEndpointConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(remoteTSTPEndpointConfigurationEClass, RemoteTSTPEndpointConfiguration.class, "RemoteTSTPEndpointConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(secureEndpointConfigurationEClass, SecureEndpointConfiguration.class, "SecureEndpointConfiguration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(secureEndpointConfigurationEClass_C);
		initEReference(getSecureEndpointConfiguration_SslConfiguration(), g1, null, "sslConfiguration", null, 1, 1, SecureEndpointConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tstpEndpointConfigurationEClass, TSTPEndpointConfiguration.class, "TSTPEndpointConfiguration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(tstpEndpointConfigurationEClass_C);
		initEReference(getTSTPEndpointConfiguration_TstpConfiguration(), g1, null, "tstpConfiguration", null, 1, 1, TSTPEndpointConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sslConfigurationEClass, SSLConfiguration.class, "SSLConfiguration", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clientSSLConfigurationEClass, ClientSSLConfiguration.class, "ClientSSLConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClientSSLConfiguration_AcceptedServerCertificates(), theProxyPackage.getCertificate(), "acceptedServerCertificates", null, 0, -1, ClientSSLConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClientSSLConfiguration_ClientCertificate(), theProxyPackage.getCertificate(), "clientCertificate", null, 0, 1, ClientSSLConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverSSLConfigurationEClass, ServerSSLConfiguration.class, "ServerSSLConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerSSLConfiguration_ServerCertificate(), theProxyPackage.getCertificate(), "serverCertificate", null, 1, 1, ServerSSLConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSSLConfiguration_AcceptedClientCertificates(), theProxyPackage.getCertificate(), "acceptedClientCertificates", null, 0, -1, ServerSSLConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //EndpointPackageImpl
