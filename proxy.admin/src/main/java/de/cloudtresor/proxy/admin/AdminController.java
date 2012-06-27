package de.cloudtresor.proxy.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import de.cloudtresor.proxy.Proxy;

@Controller
public class AdminController {
	@Autowired
	private Proxy proxy;
	
	@RequestMapping("/shutdown")
    public void home() {
		proxy.shutDown();
    }
}
