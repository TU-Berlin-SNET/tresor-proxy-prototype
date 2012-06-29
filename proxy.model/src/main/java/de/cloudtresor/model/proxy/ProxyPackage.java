/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see de.cloudtresor.model.proxy.ProxyFactory
 * @model kind="package"
 * @generated
 */
public interface ProxyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "proxy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.cloud-tresor.de/model/proxy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cloudtresorproxy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProxyPackage eINSTANCE = de.cloudtresor.model.proxy.impl.ProxyPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.IdentifiableElement <em>Identifiable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.IdentifiableElement
	 * @see de.cloudtresor.model.proxy.impl.ProxyPackageImpl#getIdentifiableElement()
	 * @generated
	 */
	int IDENTIFIABLE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.impl.ProxyConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.impl.ProxyConfigurationImpl
	 * @see de.cloudtresor.model.proxy.impl.ProxyPackageImpl#getProxyConfiguration()
	 * @generated
	 */
	int PROXY_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_CONFIGURATION__SERVICES = 0;

	/**
	 * The feature id for the '<em><b>Configuration Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_CONFIGURATION__CONFIGURATION_ITEMS = 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.impl.ServiceImpl
	 * @see de.cloudtresor.model.proxy.impl.ProxyPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = IDENTIFIABLE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cloudtresor.model.proxy.ConfigurationItem <em>Configuration Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cloudtresor.model.proxy.ConfigurationItem
	 * @see de.cloudtresor.model.proxy.impl.ProxyPackageImpl#getConfigurationItem()
	 * @generated
	 */
	int CONFIGURATION_ITEM = 3;

	/**
	 * The number of structural features of the '<em>Configuration Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '<em>URL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URL
	 * @see de.cloudtresor.model.proxy.impl.ProxyPackageImpl#getURL()
	 * @generated
	 */
	int URL = 4;

	/**
	 * The meta object id for the '<em>Certificate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.security.cert.Certificate
	 * @see de.cloudtresor.model.proxy.impl.ProxyPackageImpl#getCertificate()
	 * @generated
	 */
	int CERTIFICATE = 5;


	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable Element</em>'.
	 * @see de.cloudtresor.model.proxy.IdentifiableElement
	 * @generated
	 */
	EClass getIdentifiableElement();

	/**
	 * Returns the meta object for the attribute '{@link de.cloudtresor.model.proxy.IdentifiableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.cloudtresor.model.proxy.IdentifiableElement#getName()
	 * @see #getIdentifiableElement()
	 * @generated
	 */
	EAttribute getIdentifiableElement_Name();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.ProxyConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see de.cloudtresor.model.proxy.ProxyConfiguration
	 * @generated
	 */
	EClass getProxyConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cloudtresor.model.proxy.ProxyConfiguration#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see de.cloudtresor.model.proxy.ProxyConfiguration#getServices()
	 * @see #getProxyConfiguration()
	 * @generated
	 */
	EReference getProxyConfiguration_Services();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cloudtresor.model.proxy.ProxyConfiguration#getConfigurationItems <em>Configuration Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration Items</em>'.
	 * @see de.cloudtresor.model.proxy.ProxyConfiguration#getConfigurationItems()
	 * @see #getProxyConfiguration()
	 * @generated
	 */
	EReference getProxyConfiguration_ConfigurationItems();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see de.cloudtresor.model.proxy.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for class '{@link de.cloudtresor.model.proxy.ConfigurationItem <em>Configuration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Item</em>'.
	 * @see de.cloudtresor.model.proxy.ConfigurationItem
	 * @generated
	 */
	EClass getConfigurationItem();

	/**
	 * Returns the meta object for data type '{@link java.net.URL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URL</em>'.
	 * @see java.net.URL
	 * @model instanceClass="java.net.URL"
	 * @generated
	 */
	EDataType getURL();

	/**
	 * Returns the meta object for data type '{@link java.security.cert.Certificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Certificate</em>'.
	 * @see java.security.cert.Certificate
	 * @model instanceClass="java.security.cert.Certificate"
	 * @generated
	 */
	EDataType getCertificate();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProxyFactory getProxyFactory();

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
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.IdentifiableElement <em>Identifiable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.IdentifiableElement
		 * @see de.cloudtresor.model.proxy.impl.ProxyPackageImpl#getIdentifiableElement()
		 * @generated
		 */
		EClass IDENTIFIABLE_ELEMENT = eINSTANCE.getIdentifiableElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_ELEMENT__NAME = eINSTANCE.getIdentifiableElement_Name();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.impl.ProxyConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.impl.ProxyConfigurationImpl
		 * @see de.cloudtresor.model.proxy.impl.ProxyPackageImpl#getProxyConfiguration()
		 * @generated
		 */
		EClass PROXY_CONFIGURATION = eINSTANCE.getProxyConfiguration();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_CONFIGURATION__SERVICES = eINSTANCE.getProxyConfiguration_Services();

		/**
		 * The meta object literal for the '<em><b>Configuration Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY_CONFIGURATION__CONFIGURATION_ITEMS = eINSTANCE.getProxyConfiguration_ConfigurationItems();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.impl.ServiceImpl
		 * @see de.cloudtresor.model.proxy.impl.ProxyPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '{@link de.cloudtresor.model.proxy.ConfigurationItem <em>Configuration Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cloudtresor.model.proxy.ConfigurationItem
		 * @see de.cloudtresor.model.proxy.impl.ProxyPackageImpl#getConfigurationItem()
		 * @generated
		 */
		EClass CONFIGURATION_ITEM = eINSTANCE.getConfigurationItem();

		/**
		 * The meta object literal for the '<em>URL</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URL
		 * @see de.cloudtresor.model.proxy.impl.ProxyPackageImpl#getURL()
		 * @generated
		 */
		EDataType URL = eINSTANCE.getURL();

		/**
		 * The meta object literal for the '<em>Certificate</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.security.cert.Certificate
		 * @see de.cloudtresor.model.proxy.impl.ProxyPackageImpl#getCertificate()
		 * @generated
		 */
		EDataType CERTIFICATE = eINSTANCE.getCertificate();

	}

} //ProxyPackage
