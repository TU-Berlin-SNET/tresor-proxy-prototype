/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.auth.impl;

import de.cloudtresor.model.proxy.auth.AuthPackage;
import de.cloudtresor.model.proxy.auth.AuthorizationConfiguration;
import de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem;
import de.cloudtresor.model.proxy.auth.AuthorizationState;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.auth.impl.AuthorizationConfigurationImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link de.cloudtresor.model.proxy.auth.impl.AuthorizationConfigurationImpl#getAuthorizationConfigurationItems <em>Authorization Configuration Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthorizationConfigurationImpl extends EObjectImpl implements AuthorizationConfiguration {
	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final AuthorizationState DEFAULT_EDEFAULT = AuthorizationState.ALLOW;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected AuthorizationState default_ = DEFAULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthorizationConfigurationItems() <em>Authorization Configuration Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationConfigurationItems()
	 * @generated
	 * @ordered
	 */
	protected EList<AuthorizationConfigurationItem> authorizationConfigurationItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthPackage.Literals.AUTHORIZATION_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationState getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(AuthorizationState newDefault) {
		AuthorizationState oldDefault = default_;
		default_ = newDefault == null ? DEFAULT_EDEFAULT : newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthPackage.AUTHORIZATION_CONFIGURATION__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuthorizationConfigurationItem> getAuthorizationConfigurationItems() {
		if (authorizationConfigurationItems == null) {
			authorizationConfigurationItems = new EObjectContainmentEList<AuthorizationConfigurationItem>(AuthorizationConfigurationItem.class, this, AuthPackage.AUTHORIZATION_CONFIGURATION__AUTHORIZATION_CONFIGURATION_ITEMS);
		}
		return authorizationConfigurationItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AuthPackage.AUTHORIZATION_CONFIGURATION__AUTHORIZATION_CONFIGURATION_ITEMS:
				return ((InternalEList<?>)getAuthorizationConfigurationItems()).basicRemove(otherEnd, msgs);
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
			case AuthPackage.AUTHORIZATION_CONFIGURATION__DEFAULT:
				return getDefault();
			case AuthPackage.AUTHORIZATION_CONFIGURATION__AUTHORIZATION_CONFIGURATION_ITEMS:
				return getAuthorizationConfigurationItems();
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
			case AuthPackage.AUTHORIZATION_CONFIGURATION__DEFAULT:
				setDefault((AuthorizationState)newValue);
				return;
			case AuthPackage.AUTHORIZATION_CONFIGURATION__AUTHORIZATION_CONFIGURATION_ITEMS:
				getAuthorizationConfigurationItems().clear();
				getAuthorizationConfigurationItems().addAll((Collection<? extends AuthorizationConfigurationItem>)newValue);
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
			case AuthPackage.AUTHORIZATION_CONFIGURATION__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case AuthPackage.AUTHORIZATION_CONFIGURATION__AUTHORIZATION_CONFIGURATION_ITEMS:
				getAuthorizationConfigurationItems().clear();
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
			case AuthPackage.AUTHORIZATION_CONFIGURATION__DEFAULT:
				return default_ != DEFAULT_EDEFAULT;
			case AuthPackage.AUTHORIZATION_CONFIGURATION__AUTHORIZATION_CONFIGURATION_ITEMS:
				return authorizationConfigurationItems != null && !authorizationConfigurationItems.isEmpty();
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
		result.append(" (default: ");
		result.append(default_);
		result.append(')');
		return result.toString();
	}

} //AuthorizationConfigurationImpl
