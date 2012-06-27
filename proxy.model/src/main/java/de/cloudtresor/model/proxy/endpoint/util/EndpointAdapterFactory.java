/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint.util;

import de.cloudtresor.model.proxy.ConfigurationItem;

import de.cloudtresor.model.proxy.endpoint.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage
 * @generated
 */
public class EndpointAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EndpointPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EndpointPackage.eINSTANCE;
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
	protected EndpointSwitch<Adapter> modelSwitch =
		new EndpointSwitch<Adapter>() {
			@Override
			public Adapter caseLocalHTTPEndpoint(LocalHTTPEndpoint object) {
				return createLocalHTTPEndpointAdapter();
			}
			@Override
			public Adapter caseLocalSSLEndpoint(LocalSSLEndpoint object) {
				return createLocalSSLEndpointAdapter();
			}
			@Override
			public Adapter caseLocalTSTPEndpoint(LocalTSTPEndpoint object) {
				return createLocalTSTPEndpointAdapter();
			}
			@Override
			public Adapter caseRemoteHTTPEndpoint(RemoteHTTPEndpoint object) {
				return createRemoteHTTPEndpointAdapter();
			}
			@Override
			public Adapter caseRemoteSSLEndpoint(RemoteSSLEndpoint object) {
				return createRemoteSSLEndpointAdapter();
			}
			@Override
			public Adapter caseRemoteTSTPEndpoint(RemoteTSTPEndpoint object) {
				return createRemoteTSTPEndpointAdapter();
			}
			@Override
			public Adapter caseEndpointConfiguration(EndpointConfiguration object) {
				return createEndpointConfigurationAdapter();
			}
			@Override
			public <C extends SSLConfiguration> Adapter caseSecureEndpoint(SecureEndpoint<C> object) {
				return createSecureEndpointAdapter();
			}
			@Override
			public <C extends SSLConfiguration> Adapter caseTSTPEndpoint(TSTPEndpoint<C> object) {
				return createTSTPEndpointAdapter();
			}
			@Override
			public Adapter caseSSLConfiguration(SSLConfiguration object) {
				return createSSLConfigurationAdapter();
			}
			@Override
			public Adapter caseClientSSLConfiguration(ClientSSLConfiguration object) {
				return createClientSSLConfigurationAdapter();
			}
			@Override
			public Adapter caseServerSSLConfiguration(ServerSSLConfiguration object) {
				return createServerSSLConfigurationAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpoint <em>Local HTTP Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpoint
	 * @generated
	 */
	public Adapter createLocalHTTPEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.LocalSSLEndpoint <em>Local SSL Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.LocalSSLEndpoint
	 * @generated
	 */
	public Adapter createLocalSSLEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.LocalTSTPEndpoint <em>Local TSTP Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.LocalTSTPEndpoint
	 * @generated
	 */
	public Adapter createLocalTSTPEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.RemoteHTTPEndpoint <em>Remote HTTP Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.RemoteHTTPEndpoint
	 * @generated
	 */
	public Adapter createRemoteHTTPEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.RemoteSSLEndpoint <em>Remote SSL Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.RemoteSSLEndpoint
	 * @generated
	 */
	public Adapter createRemoteSSLEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.RemoteTSTPEndpoint <em>Remote TSTP Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.RemoteTSTPEndpoint
	 * @generated
	 */
	public Adapter createRemoteTSTPEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.EndpointConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.EndpointConfiguration
	 * @generated
	 */
	public Adapter createEndpointConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.SecureEndpoint <em>Secure Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.SecureEndpoint
	 * @generated
	 */
	public Adapter createSecureEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.TSTPEndpoint <em>TSTP Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.TSTPEndpoint
	 * @generated
	 */
	public Adapter createTSTPEndpointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.SSLConfiguration <em>SSL Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.SSLConfiguration
	 * @generated
	 */
	public Adapter createSSLConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.ClientSSLConfiguration <em>Client SSL Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.ClientSSLConfiguration
	 * @generated
	 */
	public Adapter createClientSSLConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration <em>Server SSL Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration
	 * @generated
	 */
	public Adapter createServerSSLConfigurationAdapter() {
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

} //EndpointAdapterFactory
