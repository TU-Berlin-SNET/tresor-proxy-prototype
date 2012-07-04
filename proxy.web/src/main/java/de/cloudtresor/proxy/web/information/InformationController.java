package de.cloudtresor.proxy.web.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import de.cloudtresor.model.proxy.ProxyConfiguration;
import de.cloudtresor.proxy.Proxy;

@Controller
public class InformationController {
	@Autowired
	private Proxy proxy;
	
	@RequestMapping("/configuration")
	public ProxyConfiguration getProxyConfiguration() {
		return proxy.getProxyConfiguration();
	}
}
