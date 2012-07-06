package de.cloudtresor.proxy.handler.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

import org.glassfish.grizzly.http.util.Base64Utils;

import de.cloudtresor.model.proxy.auth.AuthenticationMethodHtpasswd;

public class AuthenticationMethodHtpasswdHandler extends AuthenticationMethodHandler<AuthenticationMethodHtpasswd> {
	private static MessageDigest md;
	
	static {
		 try {
			 md = MessageDigest.getInstance("SHA-1");
		 } catch(Exception e) {
			 throw new RuntimeException(e);
		 }
	}
	
	private Map<String, PasswordStruct> userHashMap = new HashMap<String, AuthenticationMethodHtpasswdHandler.PasswordStruct>();
	
	public AuthenticationMethodHtpasswdHandler(AuthenticationMethodHtpasswd handler) {
		super(handler);
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(handler.getPath()))));
			
			String line;
			String[] lineComponents;
			
			while((line = br.readLine()) != null) {
				lineComponents = line.split(":");
				
				userHashMap.put(lineComponents[0], new PasswordStruct(lineComponents[1], lineComponents[2]));
			}
			br.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public boolean isValid(String basicAuthString) {
		String base64String = basicAuthString.substring(6);
		
		String[] decodedStringArray = Charset.forName("UTF-8").decode(ByteBuffer.wrap(Base64Utils.decodeFast(base64String.getBytes()))).toString().split(":");
		
		String user = decodedStringArray[0];
		String password = decodedStringArray[1];
		
		PasswordStruct struct = userHashMap.get(user);
		
		if(struct == null) {
			return false;
		} else {
			try {
				String saltedPasswordHash = struct.salt + password;
				
				byte[] saltedPasswordHashBytes = saltedPasswordHash.getBytes("UTF-8");
				
				md.update(saltedPasswordHashBytes);
			} catch (UnsupportedEncodingException e) {
				throw new RuntimeException(e);
			}
			
			byte[] byteHash = md.digest();
			StringBuffer stringHash = new StringBuffer();
			
			for(int i = 0; i < byteHash.length; i++) {
				stringHash.append(Integer.toString((byteHash[i] & 0xFF) + 0x100, 16).substring(1));
			}
			
			if(stringHash.toString().equals(struct.hash)) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	private class PasswordStruct {
		String salt;
		String hash;
		
		public PasswordStruct(String salt, String hash) {
			this.salt = salt;
			this.hash = hash;
		}
	}
}
