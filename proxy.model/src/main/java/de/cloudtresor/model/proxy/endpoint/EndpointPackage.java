/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint;

import de.cloudtresor.model.proxy.ProxyPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de.cloudtresor.model.proxy.endpoint.EndpointFactory
 * @model kind="package"
 * @generated
 */
public interface EndpointPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "endpoint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cloud-tresor.de/model/proxy/endpoint";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "proxyEndpoint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EndpointPackage eINSTANCE = de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.EndpointConfiguration <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.EndpointConfiguration
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getEndpointConfiguration()
	 * @generated
	 */
	int ENDPOINT_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_CONFIGURATION__URL = ProxyPackage.CONFIGURATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_CONFIGURATION__SERVICE = ProxyPackage.CONFIGURATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_CONFIGURATION_FEATURE_COUNT = ProxyPackage.CONFIGURATION_ITEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.LocalEndpointConfiguration <em>Local Endpoint Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.LocalEndpointConfiguration
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getLocalEndpointConfiguration()
	 * @generated
	 */
	int LOCAL_ENDPOINT_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENDPOINT_CONFIGURATION__URL = ENDPOINT_CONFIGURATION__URL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENDPOINT_CONFIGURATION__SERVICE = ENDPOINT_CONFIGURATION__SERVICE;

	/**
	 * The number of structural features of the '<em>Local Endpoint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_ENDPOINT_CONFIGURATION_FEATURE_COUNT = ENDPOINT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.impl.LocalHTTPEndpointConfigurationImpl <em>Local HTTP Endpoint Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.impl.LocalHTTPEndpointConfigurationImpl
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getLocalHTTPEndpointConfiguration()
	 * @generated
	 */
	int LOCAL_HTTP_ENDPOINT_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HTTP_ENDPOINT_CONFIGURATION__URL = LOCAL_ENDPOINT_CONFIGURATION__URL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HTTP_ENDPOINT_CONFIGURATION__SERVICE = LOCAL_ENDPOINT_CONFIGURATION__SERVICE;

	/**
	 * The feature id for the '<em><b>Bound Interfaces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HTTP_ENDPOINT_CONFIGURATION__BOUND_INTERFACES = LOCAL_ENDPOINT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local HTTP Endpoint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HTTP_ENDPOINT_CONFIGURATION_FEATURE_COUNT = LOCAL_ENDPOINT_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.impl.LocalSSLEndpointConfigurationImpl <em>Local SSL Endpoint Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.impl.LocalSSLEndpointConfigurationImpl
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getLocalSSLEndpointConfiguration()
	 * @generated
	 */
	int LOCAL_SSL_ENDPOINT_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SSL_ENDPOINT_CONFIGURATION__URL = LOCAL_HTTP_ENDPOINT_CONFIGURATION__URL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SSL_ENDPOINT_CONFIGURATION__SERVICE = LOCAL_HTTP_ENDPOINT_CONFIGURATION__SERVICE;

	/**
	 * The feature id for the '<em><b>Bound Interfaces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SSL_ENDPOINT_CONFIGURATION__BOUND_INTERFACES = LOCAL_HTTP_ENDPOINT_CONFIGURATION__BOUND_INTERFACES;

	/**
	 * The feature id for the '<em><b>Ssl Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION = LOCAL_HTTP_ENDPOINT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local SSL Endpoint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SSL_ENDPOINT_CONFIGURATION_FEATURE_COUNT = LOCAL_HTTP_ENDPOINT_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.impl.LocalTSTPEndpointConfigurationImpl <em>Local TSTP Endpoint Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.impl.LocalTSTPEndpointConfigurationImpl
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getLocalTSTPEndpointConfiguration()
	 * @generated
	 */
	int LOCAL_TSTP_ENDPOINT_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TSTP_ENDPOINT_CONFIGURATION__URL = LOCAL_SSL_ENDPOINT_CONFIGURATION__URL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TSTP_ENDPOINT_CONFIGURATION__SERVICE = LOCAL_SSL_ENDPOINT_CONFIGURATION__SERVICE;

	/**
	 * The feature id for the '<em><b>Bound Interfaces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TSTP_ENDPOINT_CONFIGURATION__BOUND_INTERFACES = LOCAL_SSL_ENDPOINT_CONFIGURATION__BOUND_INTERFACES;

	/**
	 * The feature id for the '<em><b>Ssl Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TSTP_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION = LOCAL_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Tstp Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TSTP_ENDPOINT_CONFIGURATION__TSTP_CONFIGURATION = LOCAL_SSL_ENDPOINT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local TSTP Endpoint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TSTP_ENDPOINT_CONFIGURATION_FEATURE_COUNT = LOCAL_SSL_ENDPOINT_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.RemoteEndpointConfiguration <em>Remote Endpoint Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.RemoteEndpointConfiguration
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getRemoteEndpointConfiguration()
	 * @generated
	 */
	int REMOTE_ENDPOINT_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_ENDPOINT_CONFIGURATION__URL = ENDPOINT_CONFIGURATION__URL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_ENDPOINT_CONFIGURATION__SERVICE = ENDPOINT_CONFIGURATION__SERVICE;

	/**
	 * The number of structural features of the '<em>Remote Endpoint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_ENDPOINT_CONFIGURATION_FEATURE_COUNT = ENDPOINT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.impl.RemoteHTTPEndpointConfigurationImpl <em>Remote HTTP Endpoint Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.impl.RemoteHTTPEndpointConfigurationImpl
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getRemoteHTTPEndpointConfiguration()
	 * @generated
	 */
	int REMOTE_HTTP_ENDPOINT_CONFIGURATION = 6;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_HTTP_ENDPOINT_CONFIGURATION__URL = REMOTE_ENDPOINT_CONFIGURATION__URL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_HTTP_ENDPOINT_CONFIGURATION__SERVICE = REMOTE_ENDPOINT_CONFIGURATION__SERVICE;

	/**
	 * The number of structural features of the '<em>Remote HTTP Endpoint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_HTTP_ENDPOINT_CONFIGURATION_FEATURE_COUNT = REMOTE_ENDPOINT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.impl.RemoteSSLEndpointConfigurationImpl <em>Remote SSL Endpoint Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.impl.RemoteSSLEndpointConfigurationImpl
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getRemoteSSLEndpointConfiguration()
	 * @generated
	 */
	int REMOTE_SSL_ENDPOINT_CONFIGURATION = 7;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SSL_ENDPOINT_CONFIGURATION__URL = REMOTE_HTTP_ENDPOINT_CONFIGURATION__URL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SSL_ENDPOINT_CONFIGURATION__SERVICE = REMOTE_HTTP_ENDPOINT_CONFIGURATION__SERVICE;

	/**
	 * The feature id for the '<em><b>Ssl Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION = REMOTE_HTTP_ENDPOINT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remote SSL Endpoint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SSL_ENDPOINT_CONFIGURATION_FEATURE_COUNT = REMOTE_HTTP_ENDPOINT_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.impl.RemoteTSTPEndpointConfigurationImpl <em>Remote TSTP Endpoint Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.impl.RemoteTSTPEndpointConfigurationImpl
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getRemoteTSTPEndpointConfiguration()
	 * @generated
	 */
	int REMOTE_TSTP_ENDPOINT_CONFIGURATION = 8;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TSTP_ENDPOINT_CONFIGURATION__URL = LOCAL_SSL_ENDPOINT_CONFIGURATION__URL;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TSTP_ENDPOINT_CONFIGURATION__SERVICE = LOCAL_SSL_ENDPOINT_CONFIGURATION__SERVICE;

	/**
	 * The feature id for the '<em><b>Bound Interfaces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TSTP_ENDPOINT_CONFIGURATION__BOUND_INTERFACES = LOCAL_SSL_ENDPOINT_CONFIGURATION__BOUND_INTERFACES;

	/**
	 * The feature id for the '<em><b>Ssl Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TSTP_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION = LOCAL_SSL_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Tstp Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TSTP_ENDPOINT_CONFIGURATION__TSTP_CONFIGURATION = LOCAL_SSL_ENDPOINT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remote TSTP Endpoint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TSTP_ENDPOINT_CONFIGURATION_FEATURE_COUNT = LOCAL_SSL_ENDPOINT_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.SecureEndpointConfiguration <em>Secure Endpoint Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.SecureEndpointConfiguration
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getSecureEndpointConfiguration()
	 * @generated
	 */
	int SECURE_ENDPOINT_CONFIGURATION = 9;

	/**
	 * The feature id for the '<em><b>Ssl Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION = 0;

	/**
	 * The number of structural features of the '<em>Secure Endpoint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_ENDPOINT_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.TSTPEndpointConfiguration <em>TSTP Endpoint Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.TSTPEndpointConfiguration
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getTSTPEndpointConfiguration()
	 * @generated
	 */
	int TSTP_ENDPOINT_CONFIGURATION = 10;

	/**
	 * The feature id for the '<em><b>Tstp Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTP_ENDPOINT_CONFIGURATION__TSTP_CONFIGURATION = 0;

	/**
	 * The number of structural features of the '<em>TSTP Endpoint Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTP_ENDPOINT_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.SSLConfiguration <em>SSL Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.SSLConfiguration
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getSSLConfiguration()
	 * @generated
	 */
	int SSL_CONFIGURATION = 11;

	/**
	 * The number of structural features of the '<em>SSL Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSL_CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.impl.ClientSSLConfigurationImpl <em>Client SSL Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.impl.ClientSSLConfigurationImpl
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getClientSSLConfiguration()
	 * @generated
	 */
	int CLIENT_SSL_CONFIGURATION = 12;

	/**
	 * The feature id for the '<em><b>Accepted Server Certificates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SSL_CONFIGURATION__ACCEPTED_SERVER_CERTIFICATES = SSL_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Client Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SSL_CONFIGURATION__CLIENT_CERTIFICATE = SSL_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Client SSL Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SSL_CONFIGURATION_FEATURE_COUNT = SSL_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.impl.ServerSSLConfigurationImpl <em>Server SSL Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.impl.ServerSSLConfigurationImpl
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getServerSSLConfiguration()
	 * @generated
	 */
	int SERVER_SSL_CONFIGURATION = 13;

	/**
	 * The feature id for the '<em><b>Server Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SSL_CONFIGURATION__SERVER_CERTIFICATE = SSL_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accepted Client Certificates</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SSL_CONFIGURATION__ACCEPTED_CLIENT_CERTIFICATES = SSL_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Server SSL Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SSL_CONFIGURATION_FEATURE_COUNT = SSL_CONFIGURATION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.EndpointConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.EndpointConfiguration
	 * @generated
	 */
	EClass getEndpointConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link de.cloudtresor.model.proxy.endpoint.EndpointConfiguration#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.EndpointConfiguration#getUrl()
	 * @see #getEndpointConfiguration()
	 * @generated
	 */
	EAttribute getEndpointConfiguration_Url();

	/**
	 * Returns the meta object for the reference '{@link de.cloudtresor.model.proxy.endpoint.EndpointConfiguration#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.EndpointConfiguration#getService()
	 * @see #getEndpointConfiguration()
	 * @generated
	 */
	EReference getEndpointConfiguration_Service();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.LocalEndpointConfiguration <em>Local Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Endpoint Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.LocalEndpointConfiguration
	 * @generated
	 */
	EClass getLocalEndpointConfiguration();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpointConfiguration <em>Local HTTP Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local HTTP Endpoint Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpointConfiguration
	 * @generated
	 */
	EClass getLocalHTTPEndpointConfiguration();

	/**
	 * Returns the meta object for the attribute list '{@link de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpointConfiguration#getBoundInterfaces <em>Bound Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bound Interfaces</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpointConfiguration#getBoundInterfaces()
	 * @see #getLocalHTTPEndpointConfiguration()
	 * @generated
	 */
	EAttribute getLocalHTTPEndpointConfiguration_BoundInterfaces();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.LocalSSLEndpointConfiguration <em>Local SSL Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local SSL Endpoint Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.LocalSSLEndpointConfiguration
	 * @generated
	 */
	EClass getLocalSSLEndpointConfiguration();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.LocalTSTPEndpointConfiguration <em>Local TSTP Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local TSTP Endpoint Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.LocalTSTPEndpointConfiguration
	 * @generated
	 */
	EClass getLocalTSTPEndpointConfiguration();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.RemoteEndpointConfiguration <em>Remote Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Endpoint Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.RemoteEndpointConfiguration
	 * @generated
	 */
	EClass getRemoteEndpointConfiguration();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.RemoteHTTPEndpointConfiguration <em>Remote HTTP Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote HTTP Endpoint Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.RemoteHTTPEndpointConfiguration
	 * @generated
	 */
	EClass getRemoteHTTPEndpointConfiguration();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.RemoteSSLEndpointConfiguration <em>Remote SSL Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote SSL Endpoint Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.RemoteSSLEndpointConfiguration
	 * @generated
	 */
	EClass getRemoteSSLEndpointConfiguration();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.RemoteTSTPEndpointConfiguration <em>Remote TSTP Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote TSTP Endpoint Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.RemoteTSTPEndpointConfiguration
	 * @generated
	 */
	EClass getRemoteTSTPEndpointConfiguration();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.SecureEndpointConfiguration <em>Secure Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secure Endpoint Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.SecureEndpointConfiguration
	 * @generated
	 */
	EClass getSecureEndpointConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link de.cloudtresor.model.proxy.endpoint.SecureEndpointConfiguration#getSslConfiguration <em>Ssl Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ssl Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.SecureEndpointConfiguration#getSslConfiguration()
	 * @see #getSecureEndpointConfiguration()
	 * @generated
	 */
	EReference getSecureEndpointConfiguration_SslConfiguration();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.TSTPEndpointConfiguration <em>TSTP Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSTP Endpoint Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.TSTPEndpointConfiguration
	 * @generated
	 */
	EClass getTSTPEndpointConfiguration();

	/**
	 * Returns the meta object for the reference '{@link de.cloudtresor.model.proxy.endpoint.TSTPEndpointConfiguration#getTstpConfiguration <em>Tstp Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tstp Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.TSTPEndpointConfiguration#getTstpConfiguration()
	 * @see #getTSTPEndpointConfiguration()
	 * @generated
	 */
	EReference getTSTPEndpointConfiguration_TstpConfiguration();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.SSLConfiguration <em>SSL Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SSL Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.SSLConfiguration
	 * @generated
	 */
	EClass getSSLConfiguration();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.ClientSSLConfiguration <em>Client SSL Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client SSL Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.ClientSSLConfiguration
	 * @generated
	 */
	EClass getClientSSLConfiguration();

	/**
	 * Returns the meta object for the attribute list '{@link de.cloudtresor.model.proxy.endpoint.ClientSSLConfiguration#getAcceptedServerCertificates <em>Accepted Server Certificates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepted Server Certificates</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.ClientSSLConfiguration#getAcceptedServerCertificates()
	 * @see #getClientSSLConfiguration()
	 * @generated
	 */
	EAttribute getClientSSLConfiguration_AcceptedServerCertificates();

	/**
	 * Returns the meta object for the attribute '{@link de.cloudtresor.model.proxy.endpoint.ClientSSLConfiguration#getClientCertificate <em>Client Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Certificate</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.ClientSSLConfiguration#getClientCertificate()
	 * @see #getClientSSLConfiguration()
	 * @generated
	 */
	EAttribute getClientSSLConfiguration_ClientCertificate();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration <em>Server SSL Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server SSL Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration
	 * @generated
	 */
	EClass getServerSSLConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration#getServerCertificate <em>Server Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Certificate</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration#getServerCertificate()
	 * @see #getServerSSLConfiguration()
	 * @generated
	 */
	EAttribute getServerSSLConfiguration_ServerCertificate();

	/**
	 * Returns the meta object for the attribute list '{@link de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration#getAcceptedClientCertificates <em>Accepted Client Certificates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepted Client Certificates</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration#getAcceptedClientCertificates()
	 * @see #getServerSSLConfiguration()
	 * @generated
	 */
	EAttribute getServerSSLConfiguration_AcceptedClientCertificates();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EndpointFactory getEndpointFactory();

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
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.EndpointConfiguration <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.EndpointConfiguration
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getEndpointConfiguration()
		 * @generated
		 */
		EClass ENDPOINT_CONFIGURATION = eINSTANCE.getEndpointConfiguration();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENDPOINT_CONFIGURATION__URL = eINSTANCE.getEndpointConfiguration_Url();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDPOINT_CONFIGURATION__SERVICE = eINSTANCE.getEndpointConfiguration_Service();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.LocalEndpointConfiguration <em>Local Endpoint Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.LocalEndpointConfiguration
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getLocalEndpointConfiguration()
		 * @generated
		 */
		EClass LOCAL_ENDPOINT_CONFIGURATION = eINSTANCE.getLocalEndpointConfiguration();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.impl.LocalHTTPEndpointConfigurationImpl <em>Local HTTP Endpoint Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.impl.LocalHTTPEndpointConfigurationImpl
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getLocalHTTPEndpointConfiguration()
		 * @generated
		 */
		EClass LOCAL_HTTP_ENDPOINT_CONFIGURATION = eINSTANCE.getLocalHTTPEndpointConfiguration();

		/**
		 * The meta object literal for the '<em><b>Bound Interfaces</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_HTTP_ENDPOINT_CONFIGURATION__BOUND_INTERFACES = eINSTANCE.getLocalHTTPEndpointConfiguration_BoundInterfaces();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.impl.LocalSSLEndpointConfigurationImpl <em>Local SSL Endpoint Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.impl.LocalSSLEndpointConfigurationImpl
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getLocalSSLEndpointConfiguration()
		 * @generated
		 */
		EClass LOCAL_SSL_ENDPOINT_CONFIGURATION = eINSTANCE.getLocalSSLEndpointConfiguration();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.impl.LocalTSTPEndpointConfigurationImpl <em>Local TSTP Endpoint Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.impl.LocalTSTPEndpointConfigurationImpl
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getLocalTSTPEndpointConfiguration()
		 * @generated
		 */
		EClass LOCAL_TSTP_ENDPOINT_CONFIGURATION = eINSTANCE.getLocalTSTPEndpointConfiguration();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.RemoteEndpointConfiguration <em>Remote Endpoint Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.RemoteEndpointConfiguration
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getRemoteEndpointConfiguration()
		 * @generated
		 */
		EClass REMOTE_ENDPOINT_CONFIGURATION = eINSTANCE.getRemoteEndpointConfiguration();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.impl.RemoteHTTPEndpointConfigurationImpl <em>Remote HTTP Endpoint Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.impl.RemoteHTTPEndpointConfigurationImpl
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getRemoteHTTPEndpointConfiguration()
		 * @generated
		 */
		EClass REMOTE_HTTP_ENDPOINT_CONFIGURATION = eINSTANCE.getRemoteHTTPEndpointConfiguration();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.impl.RemoteSSLEndpointConfigurationImpl <em>Remote SSL Endpoint Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.impl.RemoteSSLEndpointConfigurationImpl
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getRemoteSSLEndpointConfiguration()
		 * @generated
		 */
		EClass REMOTE_SSL_ENDPOINT_CONFIGURATION = eINSTANCE.getRemoteSSLEndpointConfiguration();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.impl.RemoteTSTPEndpointConfigurationImpl <em>Remote TSTP Endpoint Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.impl.RemoteTSTPEndpointConfigurationImpl
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getRemoteTSTPEndpointConfiguration()
		 * @generated
		 */
		EClass REMOTE_TSTP_ENDPOINT_CONFIGURATION = eINSTANCE.getRemoteTSTPEndpointConfiguration();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.SecureEndpointConfiguration <em>Secure Endpoint Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.SecureEndpointConfiguration
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getSecureEndpointConfiguration()
		 * @generated
		 */
		EClass SECURE_ENDPOINT_CONFIGURATION = eINSTANCE.getSecureEndpointConfiguration();

		/**
		 * The meta object literal for the '<em><b>Ssl Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURE_ENDPOINT_CONFIGURATION__SSL_CONFIGURATION = eINSTANCE.getSecureEndpointConfiguration_SslConfiguration();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.TSTPEndpointConfiguration <em>TSTP Endpoint Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.TSTPEndpointConfiguration
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getTSTPEndpointConfiguration()
		 * @generated
		 */
		EClass TSTP_ENDPOINT_CONFIGURATION = eINSTANCE.getTSTPEndpointConfiguration();

		/**
		 * The meta object literal for the '<em><b>Tstp Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSTP_ENDPOINT_CONFIGURATION__TSTP_CONFIGURATION = eINSTANCE.getTSTPEndpointConfiguration_TstpConfiguration();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.SSLConfiguration <em>SSL Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.SSLConfiguration
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getSSLConfiguration()
		 * @generated
		 */
		EClass SSL_CONFIGURATION = eINSTANCE.getSSLConfiguration();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.impl.ClientSSLConfigurationImpl <em>Client SSL Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.impl.ClientSSLConfigurationImpl
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getClientSSLConfiguration()
		 * @generated
		 */
		EClass CLIENT_SSL_CONFIGURATION = eINSTANCE.getClientSSLConfiguration();

		/**
		 * The meta object literal for the '<em><b>Accepted Server Certificates</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_SSL_CONFIGURATION__ACCEPTED_SERVER_CERTIFICATES = eINSTANCE.getClientSSLConfiguration_AcceptedServerCertificates();

		/**
		 * The meta object literal for the '<em><b>Client Certificate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT_SSL_CONFIGURATION__CLIENT_CERTIFICATE = eINSTANCE.getClientSSLConfiguration_ClientCertificate();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.impl.ServerSSLConfigurationImpl <em>Server SSL Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.impl.ServerSSLConfigurationImpl
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getServerSSLConfiguration()
		 * @generated
		 */
		EClass SERVER_SSL_CONFIGURATION = eINSTANCE.getServerSSLConfiguration();

		/**
		 * The meta object literal for the '<em><b>Server Certificate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_SSL_CONFIGURATION__SERVER_CERTIFICATE = eINSTANCE.getServerSSLConfiguration_ServerCertificate();

		/**
		 * The meta object literal for the '<em><b>Accepted Client Certificates</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_SSL_CONFIGURATION__ACCEPTED_CLIENT_CERTIFICATES = eINSTANCE.getServerSSLConfiguration_AcceptedClientCertificates();

	}

} //EndpointPackage
