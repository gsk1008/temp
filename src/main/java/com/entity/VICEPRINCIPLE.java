package com.entity;

public class VICEPRINCIPLE {
	
	private String ID;
	private String username;
	private String fullname;
	private String password;
	private String DEPARTMENT;
	private String contact;
	private String email;
	
	
	public VICEPRINCIPLE() {
		super();
		// TODO Auto-generated constructor stub
	}





	public VICEPRINCIPLE(String username, String fullname, String password, String dEPARTMENT, String contact,
			String email) {
		super();
		this.username = username;
		this.fullname = fullname;
		this.password = password;
		DEPARTMENT = dEPARTMENT;
		this.contact = contact;
		this.email = email;
	}





	public String getContact() {
		return contact;
	}





	public void setContact(String contact) {
		this.contact = contact;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getDEPARTMENT() {
		return DEPARTMENT;
	}


	public void setDEPARTMENT(String dEPARTMENT) {
		DEPARTMENT = dEPARTMENT;
	}
	
	
	

}
