package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.*;

public class hoddao {
	
	private Connection conn;

	public hoddao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public hod login(String username,String psw,String depp){
		hod u=null;
		 try {
			 String sql4="select * from JIJAMATA_HOD WHERE USER_NAME=? AND PASSWORD=? AND DEPARTMENT=?";
			 PreparedStatement ps1=conn.prepareStatement(sql4);
			 ps1.setString(1,username);
			 ps1.setString(2,psw);
			 ps1.setString(3, depp);
			 ResultSet rs=ps1.executeQuery();
			 
			 while(rs.next()) {
				 u=new hod();
				 u.setHid(rs.getString(1));
				 u.setUsername(rs.getString(2));
				 u.setFullname(rs.getString(3));
				 u.setDepartment(rs.getString(4));
				 u.setContact(rs.getString(5));
				 u.setEmail(rs.getString(6));
				 u.setAddress1(rs.getString(7));
				 u.setPassword(rs.getString(8));		 
				
				  
			 }
			 
			 
		 }catch(Exception e) {
			 System.out.print(e);
		 }
		 return u;
	 }


	public List<hod> gethoddeteles(){
		List<hod> list=new ArrayList<hod>();
		hod ap=null;
		try {
			String sql="select * from JIJAMATA_HOD";
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				ap=new hod();
				 ap.setHid(rs.getString(1));
				 ap.setUsername(rs.getString(2));
				 ap.setFullname(rs.getString(3));
				 ap.setDepartment(rs.getString(4));
				 ap.setContact(rs.getString(5));
				 ap.setEmail(rs.getString(6));
				 ap.setAddress1(rs.getString(7));
				 ap.setPassword(rs.getString(8));
				list.add(ap);
			}
					        			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
	
	public boolean register(hod u) {
		   boolean f=false;
		   
		         try {
		        	 String sql="INSERT INTO  JIJAMATA_HOD (USER_NAME,FULLNAME,DEPARTMENT,CONTACT,EMAIL,ADDRESS1,PASSWORD) VALUES (?,?,?,?,?,?,?)";
		        	 PreparedStatement ps=conn.prepareStatement(sql);
		        	 ps.setString(1,u.getUsername());
		        	 ps.setString(2,u.getFullname());
		        	 ps.setString(3,u.getDepartment());
		        	 ps.setString(4,u.getContact());
		        	 ps.setString(5,u.getEmail());
		        	 ps.setString(6,u.getAddress1());
		          	 ps.setString(7,u.getPassword());
		        	 int i=ps.executeUpdate();
		        	 if(i == 1){		        		 
		        		 f=true;
		        	 }
		         }catch(Exception e){
		        		 System.out.print(e);
		        		 
		        	 }
		         return f;
	   }


}
