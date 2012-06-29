package de.cloudtresor.proxy.internal;

import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.cloudtresor.model.proxy.ProxyConfiguration;
import de.cloudtresor.model.proxy.ProxyPackage;
import de.cloudtresor.proxy.Proxy;

public class ProxyImpl implements Proxy {
	private Logger log = Logger.getLogger(this.getClass().getName()); 
	
	private de.cloudtresor.model.proxy.ProxyConfiguration proxy;

	public ProxyImpl() {
		// Initialize the model
		ProxyPackage.eINSTANCE.eClass();
		
		// Register the XMI resource factory
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// Obtain a new Resource Set
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Get the Resource
		Resource resource = resourceSet.getResource(URI.createURI("file://c:/daten/git.repos/tresorproxy/TRESOR Proxy/proxy.core/src/main/resources/config/proxy_configuration.xmi"), true);
		
		// Get the Proxy Configuration
		proxy = (ProxyConfiguration) resource.getContents().get(0);
	}
	
	public ProxyConfiguration getProxyConfiguration() {
		return proxy;
	}
}
