package com.entity;

public class teacher {

	private String tid;
	private String username;
	private String fullname;
	private String department;
	private String designation;
	private String address1;
	private String mobile_number;
	private String email;
	private String password;

	
	
	public teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public teacher(String username, String fullname, String department, String designation, String address1,
			String mobile_number, String email, String password) {
		super();
		this.username = username;
		this.fullname = fullname;
		this.department = department;
		this.designation = designation;
		this.address1 = address1;
		this.mobile_number = mobile_number;
		this.email = email;
		this.password = password;
	
	}





	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	
	 
}
