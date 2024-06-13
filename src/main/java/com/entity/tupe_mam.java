package com.entity;

public class tupe_mam {
	
	private String id;
	private String username;
	private String fullname;
	private String contact;
	private String email;
	private String address;
	private String password;
	
	
	
	
	public tupe_mam() {
		super();
		// TODO Auto-generated constructor stub
	}




	public tupe_mam(String username, String fullname, String contact, String email, String address, String password) {
		super();
		this.username = username;
		this.fullname = fullname;
		this.contact = contact;
		this.email = email;
		this.address = address;
		this.password = password;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
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




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
