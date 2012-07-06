package de.cloudtresor.proxy.handler.impl;

import de.cloudtresor.model.proxy.auth.AuthenticationMethod;
import de.cloudtresor.model.proxy.auth.AuthenticationMethodHtpasswd;

public abstract class AuthenticationMethodHandler<T extends AuthenticationMethod> {
	T handler;
	
	public static AuthenticationMethodHandler createAuthenticationMethodHandler(AuthenticationMethod method) {
		if(method instanceof AuthenticationMethodHtpasswd) {
			return new AuthenticationMethodHtpasswdHandler((AuthenticationMethodHtpasswd) method);
		}
		
		return null;
	}
	
	AuthenticationMethodHandler(T handler) {
		this.handler = handler;
	}
	
	public abstract boolean isValid(String basicAuthString);
}