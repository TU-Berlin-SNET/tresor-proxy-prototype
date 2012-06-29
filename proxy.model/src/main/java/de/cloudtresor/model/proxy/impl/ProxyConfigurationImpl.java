/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.impl;

import de.cloudtresor.model.proxy.ConfigurationItem;
import de.cloudtresor.model.proxy.ProxyConfiguration;
import de.cloudtresor.model.proxy.ProxyPackage;
import de.cloudtresor.model.proxy.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.impl.ProxyConfigurationImpl#getServices <em>Services</em>}</li>
 *   <li>{@link de.cloudtresor.model.proxy.impl.ProxyConfigurationImpl#getConfigurationItems <em>Configuration Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProxyConfigurationImpl extends EObjectImpl implements ProxyConfiguration {
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getConfigurationItems() <em>Configuration Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationItem> configurationItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxyConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProxyPackage.Literals.PROXY_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, ProxyPackage.PROXY_CONFIGURATION__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationItem> getConfigurationItems() {
		if (configurationItems == null) {
			configurationItems = new EObjectContainmentEList<ConfigurationItem>(ConfigurationItem.class, this, ProxyPackage.PROXY_CONFIGURATION__CONFIGURATION_ITEMS);
		}
		return configurationItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProxyPackage.PROXY_CONFIGURATION__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case ProxyPackage.PROXY_CONFIGURATION__CONFIGURATION_ITEMS:
				return ((InternalEList<?>)getConfigurationItems()).basicRemove(otherEnd, msgs);
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
			case ProxyPackage.PROXY_CONFIGURATION__SERVICES:
				return getServices();
			case ProxyPackage.PROXY_CONFIGURATION__CONFIGURATION_ITEMS:
				return getConfigurationItems();
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
			case ProxyPackage.PROXY_CONFIGURATION__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ProxyPackage.PROXY_CONFIGURATION__CONFIGURATION_ITEMS:
				getConfigurationItems().clear();
				getConfigurationItems().addAll((Collection<? extends ConfigurationItem>)newValue);
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
			case ProxyPackage.PROXY_CONFIGURATION__SERVICES:
				getServices().clear();
				return;
			case ProxyPackage.PROXY_CONFIGURATION__CONFIGURATION_ITEMS:
				getConfigurationItems().clear();
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
			case ProxyPackage.PROXY_CONFIGURATION__SERVICES:
				return services != null && !services.isEmpty();
			case ProxyPackage.PROXY_CONFIGURATION__CONFIGURATION_ITEMS:
				return configurationItems != null && !configurationItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProxyConfigurationImpl
