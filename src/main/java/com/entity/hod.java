package com.entity;

public class hod {
	private String hid;
	private String username;
	private String fullname;
	private String department;
	private String contact;
	private String email;
	private String address1;
	private String password;
			
	public hod() {
		super();
		// TODO Auto-generated constructor stub
	}

	public hod(String username, String fullname, String department, String contact, String email, String address1,
			 String password) {
		super();
		this.username = username;
		this.fullname = fullname;
		this.department = department;
		this.contact = contact;
		this.email = email;
		this.address1 = address1;

		this.password = password;
	}

	public String getHid() {
		return hid;
	}

	public void setHid(String hid) {
		this.hid = hid;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	
	
	
	
	

}
