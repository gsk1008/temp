package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.hod;
import com.entity.teacher;
import com.entity.tupe_mam;


public class teacher1 {
	 
	private Connection conn;

	public teacher1(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean register1(teacher u) {
		   boolean f=false;
		   
		         try {
		        	 String sql="INSERT INTO  JIJAMATA_TEACHER (USER_NAME,FULL_NAME,DEPARTMENT,DESIGNATION,ADDRESS1,MOBILE_NUMBER,EMAIL,PASSWORD) VALUES (?,?,?,?,?,?,?,?)";
		        	 PreparedStatement ps=conn.prepareStatement(sql);
		        	 ps.setString(1,u.getUsername());
		        	 ps.setString(2,u.getFullname());
		        	 ps.setString(3,u.getDepartment());
		        	 ps.setString(4,u.getDesignation());
		        	 ps.setString(5, u.getAddress1());
		        	 ps.setString(6, u.getMobile_number());
		        	 ps.setString(7, u.getEmail());
		        	 ps.setString(8, u.getPassword());
		        	 int i=ps.executeUpdate();
		        	 if(i == 1){		        		 
		        		 f=true;
		        	 }
		         }catch(Exception e){
		        		 System.out.print(e);
		        		 
		        	 }
		         return f;
	   }
	
	public teacher login(String username,String psw){
		teacher u=null;
		 try {
			 String sql4="select * from JIJAMATA_TEACHER WHERE USER_NAME=? AND PASSWORD=?";
			 PreparedStatement ps1=conn.prepareStatement(sql4);
			 ps1.setString(1,username);
			 ps1.setString(2,psw);
			 ResultSet rs=ps1.executeQuery();
			 
			 while(rs.next()) {
				 u=new teacher();
				 u.setTid(rs.getString(1));
				 u.setUsername(rs.getString(2));
				 u.setFullname(rs.getString(3));
				 u.setDepartment(rs.getString(4));
				 u.setDesignation(rs.getString(5));
				 u.setAddress1(rs.getString(6));
				 u.setMobile_number(rs.getString(7));
				 u.setEmail(rs.getString(8));
				 
				 u.setPassword(rs.getString(9));
			
				
				  
			 }
			 
			 
		 }catch(Exception e) {
			 System.out.print(e);
		 }
		 return u;
	 }
	
	public List<teacher> getteacherdeteles(String dep){
		List<teacher> list=new ArrayList<teacher>();
		teacher ap=null;
		try {
			String sql="select * from JIJAMATA_TEACHER WHERE DEPARTMENT=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,dep);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				ap=new teacher();
				ap.setTid(rs.getString(1));
				 ap.setUsername(rs.getString(2));
				 ap.setFullname(rs.getString(3));
				 ap.setDepartment(rs.getString(4));
				 ap.setDesignation(rs.getString(5));
				 ap.setAddress1(rs.getString(6));
				 ap.setMobile_number(rs.getString(7));
				 ap.setEmail(rs.getString(8));
				 ap.setPassword(rs.getString(9));
			
				list.add(ap);
			}
					        			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
	
	public List<teacher> getteacherdetelesid(int id){
		List<teacher> list=new ArrayList<teacher>();
		teacher ap=null;
		try {
			String sql="select * from JIJAMATA_TEACHER WHERE tid=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				ap=new teacher();
				ap.setTid(rs.getString(1));
				 ap.setUsername(rs.getString(2));
				 ap.setFullname(rs.getString(3));
				 ap.setDepartment(rs.getString(4));
				 ap.setDesignation(rs.getString(5));
				 ap.setAddress1(rs.getString(6));
				 ap.setMobile_number(rs.getString(7));
				 ap.setEmail(rs.getString(8));
				 ap.setPassword(rs.getString(9));
			
				list.add(ap);
			}
					        			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return list;
	}


}
