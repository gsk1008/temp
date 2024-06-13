package com.entity;

public class cl_casual_teaching {
	
	private int id;
	private String name;
	private String desigation;
	private String pdl_from;
	private String pdl_to;
	private String pdl_day;
	private String ression;
	private String form_sub_date;
	private String hid_approvel;
	private String fid_approvel;
	private String tupe_approvel;
	private String altername;
	private String department;
	private String t_id;
	
	
	
	

	public cl_casual_teaching() {
		super();
		
	}


	public cl_casual_teaching(String name, String desigation, String pdl_from, String pdl_to, String pdl_day,
			String ression,String altername,String  form_sub_date,  String hid_approvel, String fid_approvel, String tupe_approvel,
			 String department, String t_id) {
		super();
		this.name = name;
		this.desigation = desigation;
		this.pdl_from = pdl_from;
		this.pdl_to = pdl_to;
		this.pdl_day = pdl_day;
		this.ression = ression;
		this.altername = altername;
		this.form_sub_date = form_sub_date;
		this.hid_approvel = hid_approvel;
		this.fid_approvel = fid_approvel;
		this.tupe_approvel = tupe_approvel;
		this.department = department;
		this.t_id = t_id;
	
	}
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesigation() {
		return desigation;
	}


	public void setDesigation(String desigation) {
		this.desigation = desigation;
	}


	public String getPdl_from() {
		return pdl_from;
	}


	public void setPdl_from(String pdl_from) {
		this.pdl_from = pdl_from;
	}


	public String getPdl_to() {
		return pdl_to;
	}


	public void setPdl_to(String pdl_to) {
		this.pdl_to = pdl_to;
	}


	public String getPdl_day() {
		return pdl_day;
	}


	public void setPdl_day(String pdl_day) {
		this.pdl_day = pdl_day;
	}


	public String getRession() {
		return ression;
	}


	public void setRession(String ression) {
		this.ression = ression;
	}


	public String getForm_sub_date() {
		return form_sub_date;
	}


	public void setForm_sub_date(String form_sub_date) {
		this.form_sub_date = form_sub_date;
	}


	public String getHid_approvel() {
		return hid_approvel;
	}


	public void setHid_approvel(String hid_approvel) {
		this.hid_approvel = hid_approvel;
	}


	public String getFid_approvel() {
		return fid_approvel;
	}


	public void setFid_approvel(String fid_approvel) {
		this.fid_approvel = fid_approvel;
	}


	public String getTupe_approvel() {
		return tupe_approvel;
	}


	public void setTupe_approvel(String tupe_approvel) {
		this.tupe_approvel = tupe_approvel;
	}


	public String getAltername() {
		return altername;
	}


	public void setAltername(String altername) {
		this.altername = altername;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getT_id() {
		return t_id;
	}


	public void setT_id(String t_id) {
		this.t_id = t_id;
	}


	
	

}
