/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.util;

import de.cloudtresor.model.proxy.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cloudtresor.model.proxy.ProxyPackage
 * @generated
 */
public class ProxyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProxyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProxyPackage.eINSTANCE;
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
	protected ProxySwitch<Adapter> modelSwitch =
		new ProxySwitch<Adapter>() {
			@Override
			public Adapter caseIdentifiableElement(IdentifiableElement object) {
				return createIdentifiableElementAdapter();
			}
			@Override
			public Adapter caseProxyConfiguration(ProxyConfiguration object) {
				return createProxyConfigurationAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseServiceConfigurationItem(ServiceConfigurationItem object) {
				return createServiceConfigurationItemAdapter();
			}
			@Override
			public Adapter caseConfigurationItem(ConfigurationItem object) {
				return createConfigurationItemAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.IdentifiableElement
	 * @generated
	 */
	public Adapter createIdentifiableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.ProxyConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.ProxyConfiguration
	 * @generated
	 */
	public Adapter createProxyConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.ConfigurationItem <em>Configuration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.ConfigurationItem
	 * @generated
	 */
	public Adapter createConfigurationItemAdapter() {
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

} //ProxyAdapterFactory
