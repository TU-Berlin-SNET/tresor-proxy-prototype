/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint.impl;

import de.cloudtresor.model.proxy.Service;

import de.cloudtresor.model.proxy.endpoint.EndpointConfiguration;
import de.cloudtresor.model.proxy.endpoint.EndpointPackage;
import de.cloudtresor.model.proxy.endpoint.RemoteHTTPEndpoint;

import java.net.URL;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remote HTTP Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.impl.RemoteHTTPEndpointImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.impl.RemoteHTTPEndpointImpl#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoteHTTPEndpointImpl extends EObjectImpl implements RemoteHTTPEndpoint {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoteHTTPEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EndpointPackage.Literals.REMOTE_HTTP_ENDPOINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EndpointPackage.REMOTE_HTTP_ENDPOINT__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject)service;
			service = (Service)eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EndpointPackage.REMOTE_HTTP_ENDPOINT__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Service newService) {
		Service oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EndpointPackage.REMOTE_HTTP_ENDPOINT__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EndpointPackage.REMOTE_HTTP_ENDPOINT__URL:
				return getUrl();
			case EndpointPackage.REMOTE_HTTP_ENDPOINT__SERVICE:
				if (resolve) return getService();
				return basicGetService();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EndpointPackage.REMOTE_HTTP_ENDPOINT__URL:
				setUrl((URL)newValue);
				return;
			case EndpointPackage.REMOTE_HTTP_ENDPOINT__SERVICE:
				setService((Service)newValue);
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
			case EndpointPackage.REMOTE_HTTP_ENDPOINT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case EndpointPackage.REMOTE_HTTP_ENDPOINT__SERVICE:
				setService((Service)null);
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
			case EndpointPackage.REMOTE_HTTP_ENDPOINT__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case EndpointPackage.REMOTE_HTTP_ENDPOINT__SERVICE:
				return service != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EndpointConfiguration.class) {
			switch (derivedFeatureID) {
				case EndpointPackage.REMOTE_HTTP_ENDPOINT__URL: return EndpointPackage.ENDPOINT_CONFIGURATION__URL;
				case EndpointPackage.REMOTE_HTTP_ENDPOINT__SERVICE: return EndpointPackage.ENDPOINT_CONFIGURATION__SERVICE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EndpointConfiguration.class) {
			switch (baseFeatureID) {
				case EndpointPackage.ENDPOINT_CONFIGURATION__URL: return EndpointPackage.REMOTE_HTTP_ENDPOINT__URL;
				case EndpointPackage.ENDPOINT_CONFIGURATION__SERVICE: return EndpointPackage.REMOTE_HTTP_ENDPOINT__SERVICE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(')');
		return result.toString();
	}

} //RemoteHTTPEndpointImpl
