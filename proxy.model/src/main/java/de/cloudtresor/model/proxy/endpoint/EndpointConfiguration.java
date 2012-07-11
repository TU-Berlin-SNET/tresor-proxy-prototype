/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint;

import de.cloudtresor.model.proxy.ConfigurationItem;
import de.cloudtresor.model.proxy.Service;

import java.net.URL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.EndpointConfiguration#getUrl <em>Url</em>}</li>
 *   <li>{@link de.cloudtresor.model.proxy.endpoint.EndpointConfiguration#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage#getEndpointConfiguration()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EndpointConfiguration extends ConfigurationItem {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(URL)
	 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage#getEndpointConfiguration_Url()
	 * @model dataType="de.cloudtresor.model.proxy.URL" required="true"
	 * @generated
	 */
	URL getUrl();

	/**
	 * Sets the value of the '{@link de.cloudtresor.model.proxy.endpoint.EndpointConfiguration#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(URL value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.cloudtresor.model.proxy.Service#getEndpoints <em>Endpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Service)
	 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage#getEndpointConfiguration_Service()
	 * @see de.cloudtresor.model.proxy.Service#getEndpoints
	 * @model opposite="endpoints" resolveProxies="false" required="true"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link de.cloudtresor.model.proxy.endpoint.EndpointConfiguration#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

} // EndpointConfiguration
