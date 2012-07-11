/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint.impl;

import de.cloudtresor.model.proxy.ProxyPackage;
import de.cloudtresor.model.proxy.Service;

import de.cloudtresor.model.proxy.endpoint.EndpointPackage;
import de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpointConfiguration;

import java.net.URL;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local HTTP Endpoint Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.impl.LocalHTTPEndpointConfigurationImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.impl.LocalHTTPEndpointConfigurationImpl#getService <em>Service</em>}</li>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.impl.LocalHTTPEndpointConfigurationImpl#getBoundInterfaces <em>Bound Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalHTTPEndpointConfigurationImpl extends EObjectImpl implements LocalHTTPEndpointConfiguration {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final URL URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected URL url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Service service;

	/**
	 * The cached value of the '{@link #getBoundInterfaces() <em>Bound Interfaces</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<String> boundInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalHTTPEndpointConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EndpointPackage.Literals.LOCAL_HTTP_ENDPOINT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URL getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(URL newUrl) {
		URL oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(Service newService, NotificationChain msgs) {
		Service oldService = service;
		service = newService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION__SERVICE, oldService, newService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Service newService) {
		if (newService != service) {
			NotificationChain msgs = null;
			if (service != null)
				msgs = ((InternalEObject)service).eInverseRemove(this, ProxyPackage.SERVICE__ENDPOINTS, Service.class, msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, ProxyPackage.SERVICE__ENDPOINTS, Service.class, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBoundInterfaces() {
		if (boundInterfaces == null) {
			boundInterfaces = new EDataTypeUniqueEList<String>(String.class, this, EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION__BOUND_INTERFACES);
		}
		return boundInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION__SERVICE:
				if (service != null)
					msgs = ((InternalEObject)service).eInverseRemove(this, ProxyPackage.SERVICE__ENDPOINTS, Service.class, msgs);
				return basicSetService((Service)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION__SERVICE:
				return basicSetService(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION__URL:
				return getUrl();
			case EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION__SERVICE:
				return getService();
			case EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION__BOUND_INTERFACES:
				return getBoundInterfaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION__URL:
				setUrl((URL)newValue);
				return;
			case EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION__SERVICE:
				setService((Service)newValue);
				return;
			case EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION__BOUND_INTERFACES:
				getBoundInterfaces().clear();
				getBoundInterfaces().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION__URL:
				setUrl(URL_EDEFAULT);
				return;
			case EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION__SERVICE:
				setService((Service)null);
				return;
			case EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION__BOUND_INTERFACES:
				getBoundInterfaces().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION__SERVICE:
				return service != null;
			case EndpointPackage.LOCAL_HTTP_ENDPOINT_CONFIGURATION__BOUND_INTERFACES:
				return boundInterfaces != null && !boundInterfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (url: ");
		result.append(url);
		result.append(", boundInterfaces: ");
		result.append(boundInterfaces);
		result.append(')');
		return result.toString();
	}

} //LocalHTTPEndpointConfigurationImpl
