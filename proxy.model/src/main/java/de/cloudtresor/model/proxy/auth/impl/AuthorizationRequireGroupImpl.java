/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.auth.impl;

import de.cloudtresor.model.proxy.auth.AuthPackage;
import de.cloudtresor.model.proxy.auth.AuthorizationRequireGroup;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Require Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cloudtresor.model.proxy.auth.impl.AuthorizationRequireGroupImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link de.cloudtresor.model.proxy.auth.impl.AuthorizationRequireGroupImpl#getGroupIdentifier <em>Group Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthorizationRequireGroupImpl extends EObjectImpl implements AuthorizationRequireGroup {
	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupIdentifier() <em>Group Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupIdentifier() <em>Group Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String groupIdentifier = GROUP_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationRequireGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthPackage.Literals.AUTHORIZATION_REQUIRE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthPackage.AUTHORIZATION_REQUIRE_GROUP__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupIdentifier() {
		return groupIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupIdentifier(String newGroupIdentifier) {
		String oldGroupIdentifier = groupIdentifier;
		groupIdentifier = newGroupIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthPackage.AUTHORIZATION_REQUIRE_GROUP__GROUP_IDENTIFIER, oldGroupIdentifier, groupIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthPackage.AUTHORIZATION_REQUIRE_GROUP__PATTERN:
				return getPattern();
			case AuthPackage.AUTHORIZATION_REQUIRE_GROUP__GROUP_IDENTIFIER:
				return getGroupIdentifier();
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
			case AuthPackage.AUTHORIZATION_REQUIRE_GROUP__PATTERN:
				setPattern((String)newValue);
				return;
			case AuthPackage.AUTHORIZATION_REQUIRE_GROUP__GROUP_IDENTIFIER:
				setGroupIdentifier((String)newValue);
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
			case AuthPackage.AUTHORIZATION_REQUIRE_GROUP__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case AuthPackage.AUTHORIZATION_REQUIRE_GROUP__GROUP_IDENTIFIER:
				setGroupIdentifier(GROUP_IDENTIFIER_EDEFAULT);
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
			case AuthPackage.AUTHORIZATION_REQUIRE_GROUP__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case AuthPackage.AUTHORIZATION_REQUIRE_GROUP__GROUP_IDENTIFIER:
				return GROUP_IDENTIFIER_EDEFAULT == null ? groupIdentifier != null : !GROUP_IDENTIFIER_EDEFAULT.equals(groupIdentifier);
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
		result.append(" (pattern: ");
		result.append(pattern);
		result.append(", groupIdentifier: ");
		result.append(groupIdentifier);
		result.append(')');
		return result.toString();
	}

} //AuthorizationRequireGroupImpl
