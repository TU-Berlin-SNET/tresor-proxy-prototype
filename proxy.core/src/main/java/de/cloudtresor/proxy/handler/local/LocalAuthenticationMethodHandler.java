package de.cloudtresor.proxy.handler.local;

import de.cloudtresor.model.proxy.auth.AuthenticationMethod;
import de.cloudtresor.model.proxy.auth.AuthenticationMethodHtpasswd;
import de.cloudtresor.proxy.handler.local.impl.AuthenticationMethodHtpasswdHandler;

public abstract class LocalAuthenticationMethodHandler<T extends AuthenticationMethod> {
	T handler;
	
	public static LocalAuthenticationMethodHandler createAuthenticationMethodHandler(AuthenticationMethod method) {
		if(method instanceof AuthenticationMethodHtpasswd) {
			return new AuthenticationMethodHtpasswdHandler((AuthenticationMethodHtpasswd) method);
		}
		
		return null;
	}
	
	protected LocalAuthenticationMethodHandler(T handler) {
		this.handler = handler;
	}
	
	public abstract boolean isValid(String basicAuthString);
}