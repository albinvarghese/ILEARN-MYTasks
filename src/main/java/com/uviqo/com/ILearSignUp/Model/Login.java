package com.uviqo.com.ILearSignUp.Model;

import org.apache.commons.codec.digest.DigestUtils;

public class Login {
	
    private String username;
    private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		//return password;
		return (DigestUtils.md5Hex(password));
		
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}


