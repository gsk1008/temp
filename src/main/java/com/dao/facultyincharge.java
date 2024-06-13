package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.*;

public class facultyincharge {
	private Connection conn;

	public facultyincharge(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public faculty_incharge login(String username,String psw,String dep){
		faculty_incharge u=null;
		 try {
			 String sql4="select * from JIJAMATA_FACULTY_INCHARGE WHERE USERNAME=? AND PASSWORD=? AND DEPARTMENT=?";
			 PreparedStatement ps1=conn.prepareStatement(sql4);
			 ps1.setString(1,username);
			 ps1.setString(2,psw);
			 ps1.setString(3,dep);
			 ResultSet rs=ps1.executeQuery();
			 
			 while(rs.next()) {
				 u=new faculty_incharge();
				 u.setId(rs.getString(1));
				 u.setUsername(rs.getString(2));
				 u.setFullname(rs.getString(3));
				 u.setPassword(rs.getString(4));
				 u.setDepartment(rs.getString(5));
				 u.setAddress(rs.getString(6));
				 u.setContact(rs.getString(7));
				 u.setEmail(rs.getString(8));
					  
			 } 
			 
		 }catch(Exception e) {
			 System.out.print(e);
		 }
		 return u;
	 }

	public List<faculty_incharge> getfaculty_incharge_deteles(){
		List<faculty_incharge> list=new ArrayList<faculty_incharge>();
		faculty_incharge ap=null;
		try {
			String sql="select * from JIJAMATA_FACULTY_INCHARGE";
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				ap=new faculty_incharge();
				 ap.setId(rs.getString(1));
				 ap.setUsername(rs.getString(2));
				 ap.setFullname(rs.getString(3));
				 ap.setPassword(rs.getString(4));
				 ap.setDepartment(rs.getString(5));
				 ap.setAddress(rs.getString(6));
				 ap.setContact(rs.getString(7));
				 ap.setEmail(rs.getString(8));
				 
				list.add(ap);
			}
					        			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
	
	public boolean register(faculty_incharge u) {
		   boolean f=false;
		   
		         try {
		        	 String sql="INSERT INTO  JIJAMATA_FACULTY_INCHARGE (USERNAME,FULLNAME,PASSWORD,DEPARTMENT,ADDRESS,CONTACT,EMAIL) VALUES (?,?,?,?,?,?,?)";
		        	 PreparedStatement ps=conn.prepareStatement(sql);
		        	 ps.setString(1,u.getUsername());
		        	 ps.setString(2,u.getFullname());
		          	 ps.setString(3,u.getPassword());
		        	 ps.setString(4,u.getDepartment());
		        	 ps.setString(5,u.getAddress());
		        	 ps.setString(6,u.getContact());
		        	 ps.setString(7,u.getEmail());
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
