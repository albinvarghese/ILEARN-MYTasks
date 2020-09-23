package com.uviqo.com.ILearSignUp.Model;

import org.apache.commons.codec.digest.DigestUtils;

public class SignIn {
	

    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
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
	public  void setPassword(String password) {
		this.password = password;
		
	
	}
	public SignIn(String firstName, String lastName, String email, String username, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	public SignIn() {
		super();
	}
	
	
	
	

}

