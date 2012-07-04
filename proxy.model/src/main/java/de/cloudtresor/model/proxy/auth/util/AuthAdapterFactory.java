/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.auth.util;

import de.cloudtresor.model.proxy.ServiceConfigurationItem;

import de.cloudtresor.model.proxy.auth.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cloudtresor.model.proxy.auth.AuthPackage
 * @generated
 */
public class AuthAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AuthPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AuthPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthSwitch<Adapter> modelSwitch =
		new AuthSwitch<Adapter>() {
			@Override
			public Adapter caseAuthenticationMethod(AuthenticationMethod object) {
				return createAuthenticationMethodAdapter();
			}
			@Override
			public Adapter caseAuthenticationMethodHtpasswd(AuthenticationMethodHtpasswd object) {
				return createAuthenticationMethodHtpasswdAdapter();
			}
			@Override
			public Adapter caseAuthorizationMethod(AuthorizationMethod object) {
				return createAuthorizationMethodAdapter();
			}
			@Override
			public Adapter caseAuthorizationMethodGroupfile(AuthorizationMethodGroupfile object) {
				return createAuthorizationMethodGroupfileAdapter();
			}
			@Override
			public Adapter caseAuthorizationConfiguration(AuthorizationConfiguration object) {
				return createAuthorizationConfigurationAdapter();
			}
			@Override
			public Adapter caseAuthorizationConfigurationItem(AuthorizationConfigurationItem object) {
				return createAuthorizationConfigurationItemAdapter();
			}
			@Override
			public Adapter caseAuthorizationRequireValidUser(AuthorizationRequireValidUser object) {
				return createAuthorizationRequireValidUserAdapter();
			}
			@Override
			public Adapter caseAuthorizationRequireGroup(AuthorizationRequireGroup object) {
				return createAuthorizationRequireGroupAdapter();
			}
			@Override
			public Adapter caseServiceConfigurationItem(ServiceConfigurationItem object) {
				return createServiceConfigurationItemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.auth.AuthenticationMethod <em>Authentication Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.auth.AuthenticationMethod
	 * @generated
	 */
	public Adapter createAuthenticationMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.auth.AuthenticationMethodHtpasswd <em>Authentication Method Htpasswd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.auth.AuthenticationMethodHtpasswd
	 * @generated
	 */
	public Adapter createAuthenticationMethodHtpasswdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.auth.AuthorizationMethod <em>Authorization Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationMethod
	 * @generated
	 */
	public Adapter createAuthorizationMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.auth.AuthorizationMethodGroupfile <em>Authorization Method Groupfile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationMethodGroupfile
	 * @generated
	 */
	public Adapter createAuthorizationMethodGroupfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.auth.AuthorizationConfiguration <em>Authorization Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationConfiguration
	 * @generated
	 */
	public Adapter createAuthorizationConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem <em>Authorization Configuration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationConfigurationItem
	 * @generated
	 */
	public Adapter createAuthorizationConfigurationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.auth.AuthorizationRequireValidUser <em>Authorization Require Valid User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationRequireValidUser
	 * @generated
	 */
	public Adapter createAuthorizationRequireValidUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.auth.AuthorizationRequireGroup <em>Authorization Require Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.auth.AuthorizationRequireGroup
	 * @generated
	 */
	public Adapter createAuthorizationRequireGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.ServiceConfigurationItem <em>Service Configuration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.ServiceConfigurationItem
	 * @generated
	 */
	public Adapter createServiceConfigurationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AuthAdapterFactory
