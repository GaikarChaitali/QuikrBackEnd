package com.quickr.login.model;


public class UserRegistrationAccount {
	
	/*{
		"userName":"Priya",
		"emailId":"cvs@gmail.com",
		"phoneNumber":"123456",
		"password":"cvs"
	}*/

	 String name;
	 String email;
	 long phonenumber;
	 String password;
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
