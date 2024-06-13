package com.entity;

public class faculty_incharge {
	private String id;
	private String username;
	private String fullname;
	private String department;
	private String contact;
	private String email;
	private String address;
	private String password;

	
	
	
	
	
	public faculty_incharge() {
		super();
		// TODO Auto-generated constructor stub
	}





	public faculty_incharge(String username, String fullname,  String password,String department,String address,
			String contact, String email
			) {
		super();
		this.username = username;
		this.fullname = fullname;
		this.password = password;
		this.department = department;
		this.address = address;
		this.contact = contact;
		this.email = email;
		
		
		
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
