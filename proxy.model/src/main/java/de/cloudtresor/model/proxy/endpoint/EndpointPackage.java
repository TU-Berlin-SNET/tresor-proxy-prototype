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
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.impl.LocalHTTPEndpointImpl <em>Local HTTP Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.impl.LocalHTTPEndpointImpl
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getLocalHTTPEndpoint()
	 * @generated
	 */
	int LOCAL_HTTP_ENDPOINT = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HTTP_ENDPOINT__URL = ProxyPackage.CONFIGURATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local HTTP Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_HTTP_ENDPOINT_FEATURE_COUNT = ProxyPackage.CONFIGURATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.impl.LocalSSLEndpointImpl <em>Local SSL Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.impl.LocalSSLEndpointImpl
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getLocalSSLEndpoint()
	 * @generated
	 */
	int LOCAL_SSL_ENDPOINT = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SSL_ENDPOINT__URL = LOCAL_HTTP_ENDPOINT__URL;

	/**
	 * The feature id for the '<em><b>Ssl Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SSL_ENDPOINT__SSL_CONFIGURATION = LOCAL_HTTP_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local SSL Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_SSL_ENDPOINT_FEATURE_COUNT = LOCAL_HTTP_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.impl.LocalTSTPEndpointImpl <em>Local TSTP Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.impl.LocalTSTPEndpointImpl
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getLocalTSTPEndpoint()
	 * @generated
	 */
	int LOCAL_TSTP_ENDPOINT = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TSTP_ENDPOINT__URL = LOCAL_SSL_ENDPOINT__URL;

	/**
	 * The feature id for the '<em><b>Ssl Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TSTP_ENDPOINT__SSL_CONFIGURATION = LOCAL_SSL_ENDPOINT__SSL_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Tstp Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TSTP_ENDPOINT__TSTP_CONFIGURATION = LOCAL_SSL_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local TSTP Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_TSTP_ENDPOINT_FEATURE_COUNT = LOCAL_SSL_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.impl.RemoteHTTPEndpointImpl <em>Remote HTTP Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.impl.RemoteHTTPEndpointImpl
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getRemoteHTTPEndpoint()
	 * @generated
	 */
	int REMOTE_HTTP_ENDPOINT = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_HTTP_ENDPOINT__URL = ProxyPackage.CONFIGURATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remote HTTP Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_HTTP_ENDPOINT_FEATURE_COUNT = ProxyPackage.CONFIGURATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.impl.RemoteSSLEndpointImpl <em>Remote SSL Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.impl.RemoteSSLEndpointImpl
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getRemoteSSLEndpoint()
	 * @generated
	 */
	int REMOTE_SSL_ENDPOINT = 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SSL_ENDPOINT__URL = REMOTE_HTTP_ENDPOINT__URL;

	/**
	 * The feature id for the '<em><b>Ssl Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SSL_ENDPOINT__SSL_CONFIGURATION = REMOTE_HTTP_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remote SSL Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_SSL_ENDPOINT_FEATURE_COUNT = REMOTE_HTTP_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.impl.RemoteTSTPEndpointImpl <em>Remote TSTP Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.impl.RemoteTSTPEndpointImpl
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getRemoteTSTPEndpoint()
	 * @generated
	 */
	int REMOTE_TSTP_ENDPOINT = 5;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TSTP_ENDPOINT__URL = LOCAL_SSL_ENDPOINT__URL;

	/**
	 * The feature id for the '<em><b>Ssl Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TSTP_ENDPOINT__SSL_CONFIGURATION = LOCAL_SSL_ENDPOINT__SSL_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Tstp Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TSTP_ENDPOINT__TSTP_CONFIGURATION = LOCAL_SSL_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remote TSTP Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_TSTP_ENDPOINT_FEATURE_COUNT = LOCAL_SSL_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.EndpointConfiguration <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.EndpointConfiguration
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getEndpointConfiguration()
	 * @generated
	 */
	int ENDPOINT_CONFIGURATION = 6;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_CONFIGURATION__URL = 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDPOINT_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.SecureEndpoint <em>Secure Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.SecureEndpoint
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getSecureEndpoint()
	 * @generated
	 */
	int SECURE_ENDPOINT = 7;

	/**
	 * The feature id for the '<em><b>Ssl Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_ENDPOINT__SSL_CONFIGURATION = 0;

	/**
	 * The number of structural features of the '<em>Secure Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_ENDPOINT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.TSTPEndpoint <em>TSTP Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.TSTPEndpoint
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getTSTPEndpoint()
	 * @generated
	 */
	int TSTP_ENDPOINT = 8;

	/**
	 * The feature id for the '<em><b>Tstp Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTP_ENDPOINT__TSTP_CONFIGURATION = 0;

	/**
	 * The number of structural features of the '<em>TSTP Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTP_ENDPOINT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.endpoint.SSLConfiguration <em>SSL Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.endpoint.SSLConfiguration
	 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getSSLConfiguration()
	 * @generated
	 */
	int SSL_CONFIGURATION = 9;

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
	int CLIENT_SSL_CONFIGURATION = 10;

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
	int SERVER_SSL_CONFIGURATION = 11;

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
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpoint <em>Local HTTP Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local HTTP Endpoint</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpoint
	 * @generated
	 */
	EClass getLocalHTTPEndpoint();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.LocalSSLEndpoint <em>Local SSL Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local SSL Endpoint</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.LocalSSLEndpoint
	 * @generated
	 */
	EClass getLocalSSLEndpoint();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.LocalTSTPEndpoint <em>Local TSTP Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local TSTP Endpoint</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.LocalTSTPEndpoint
	 * @generated
	 */
	EClass getLocalTSTPEndpoint();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.RemoteHTTPEndpoint <em>Remote HTTP Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote HTTP Endpoint</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.RemoteHTTPEndpoint
	 * @generated
	 */
	EClass getRemoteHTTPEndpoint();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.RemoteSSLEndpoint <em>Remote SSL Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote SSL Endpoint</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.RemoteSSLEndpoint
	 * @generated
	 */
	EClass getRemoteSSLEndpoint();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.RemoteTSTPEndpoint <em>Remote TSTP Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote TSTP Endpoint</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.RemoteTSTPEndpoint
	 * @generated
	 */
	EClass getRemoteTSTPEndpoint();

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
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.SecureEndpoint <em>Secure Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secure Endpoint</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.SecureEndpoint
	 * @generated
	 */
	EClass getSecureEndpoint();

	/**
	 * Returns the meta object for the reference '{@link de.cloudtresor.model.proxy.endpoint.SecureEndpoint#getSslConfiguration <em>Ssl Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ssl Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.SecureEndpoint#getSslConfiguration()
	 * @see #getSecureEndpoint()
	 * @generated
	 */
	EReference getSecureEndpoint_SslConfiguration();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.endpoint.TSTPEndpoint <em>TSTP Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSTP Endpoint</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.TSTPEndpoint
	 * @generated
	 */
	EClass getTSTPEndpoint();

	/**
	 * Returns the meta object for the reference '{@link de.cloudtresor.model.proxy.endpoint.TSTPEndpoint#getTstpConfiguration <em>Tstp Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tstp Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.endpoint.TSTPEndpoint#getTstpConfiguration()
	 * @see #getTSTPEndpoint()
	 * @generated
	 */
	EReference getTSTPEndpoint_TstpConfiguration();

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
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.impl.LocalHTTPEndpointImpl <em>Local HTTP Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.impl.LocalHTTPEndpointImpl
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getLocalHTTPEndpoint()
		 * @generated
		 */
		EClass LOCAL_HTTP_ENDPOINT = eINSTANCE.getLocalHTTPEndpoint();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.impl.LocalSSLEndpointImpl <em>Local SSL Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.impl.LocalSSLEndpointImpl
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getLocalSSLEndpoint()
		 * @generated
		 */
		EClass LOCAL_SSL_ENDPOINT = eINSTANCE.getLocalSSLEndpoint();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.impl.LocalTSTPEndpointImpl <em>Local TSTP Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.impl.LocalTSTPEndpointImpl
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getLocalTSTPEndpoint()
		 * @generated
		 */
		EClass LOCAL_TSTP_ENDPOINT = eINSTANCE.getLocalTSTPEndpoint();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.impl.RemoteHTTPEndpointImpl <em>Remote HTTP Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.impl.RemoteHTTPEndpointImpl
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getRemoteHTTPEndpoint()
		 * @generated
		 */
		EClass REMOTE_HTTP_ENDPOINT = eINSTANCE.getRemoteHTTPEndpoint();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.impl.RemoteSSLEndpointImpl <em>Remote SSL Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.impl.RemoteSSLEndpointImpl
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getRemoteSSLEndpoint()
		 * @generated
		 */
		EClass REMOTE_SSL_ENDPOINT = eINSTANCE.getRemoteSSLEndpoint();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.impl.RemoteTSTPEndpointImpl <em>Remote TSTP Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.impl.RemoteTSTPEndpointImpl
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getRemoteTSTPEndpoint()
		 * @generated
		 */
		EClass REMOTE_TSTP_ENDPOINT = eINSTANCE.getRemoteTSTPEndpoint();

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
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.SecureEndpoint <em>Secure Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.SecureEndpoint
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getSecureEndpoint()
		 * @generated
		 */
		EClass SECURE_ENDPOINT = eINSTANCE.getSecureEndpoint();

		/**
		 * The meta object literal for the '<em><b>Ssl Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURE_ENDPOINT__SSL_CONFIGURATION = eINSTANCE.getSecureEndpoint_SslConfiguration();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.endpoint.TSTPEndpoint <em>TSTP Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.endpoint.TSTPEndpoint
		 * @see de.cloudtresor.model.proxy.endpoint.impl.EndpointPackageImpl#getTSTPEndpoint()
		 * @generated
		 */
		EClass TSTP_ENDPOINT = eINSTANCE.getTSTPEndpoint();

		/**
		 * The meta object literal for the '<em><b>Tstp Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSTP_ENDPOINT__TSTP_CONFIGURATION = eINSTANCE.getTSTPEndpoint_TstpConfiguration();

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
