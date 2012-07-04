package de.cloudtresor.util.impl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.cloudtresor.model.proxy.ProxyConfiguration;
import de.cloudtresor.model.proxy.ProxyPackage;
import de.cloudtresor.util.ModelUtil;

public class ModelUtilImpl implements ModelUtil {
	public ProxyConfiguration readProxyConfiguration(URI uri) {
		ProxyPackage.eINSTANCE.eClass();
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Get the Resource
		Resource resource = resourceSet.getResource(uri, true);
		
		// Get the Proxy Configuration
		return (ProxyConfiguration) resource.getContents().get(0);
	}
}