package com.quickr.login.model;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userAccount")
public class UserRegistrationAccount {
	
	
	private String name;
	
	@Id
	private String email;
	private long phonenumber;
	private String password;
	//private List<Link> links=new ArrayList<>();
	
	
	public UserRegistrationAccount() {
		
	}
	public UserRegistrationAccount(String name, String email, long phonenumber, String password) {
		super();
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserRegistrationAccount [name=" + name + ", email=" + email + ", phonenumber=" + phonenumber
				+ ", password=" + password + "]";
	}
	
	
	/*public UserRegistrationAccount(String emailId,String password) {
		
		this.emailId = emailId;
		this.password = password;
	}*/

	


	
	
	
	
	
	
	
	
	
	
	
}
