package com.example.demo.model.user;

public class Admin {
	
	private static Admin mAdminInstance = null;

	private String email;
	private String password;
	private String Roles;
	private boolean active;
	
	
	private Admin() {
		super();
		this.email = "admin";
		this.password = "adminPassword";
		Roles = "ROLE_ADMIN";
		this.active=true;
	}
	
	public static Admin getInstance() {
		
		if(mAdminInstance == null) {
			mAdminInstance = new Admin();
		}
		
		return mAdminInstance;
	}


	public String getEmail() {
		return email;
	}


//	public void setEmail(String email) {
//		this.email = email;
//	}

//
	public String getPassword() {
		return password;
	}


//	public void setPassword(String password) {
//		this.password = password;
//	}


	public String getRoles() {
		return Roles;
	}


//	public void setRoles(String roles) {
//		Roles = roles;
//	}
	
}