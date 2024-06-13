package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.*;

public class principlelogindao {
	
	private Connection conn;

	

	public principlelogindao(Connection conn) {
		super();
		this.conn = conn;
	}



	public principle login(String username,String psw){
		principle u=null;
		 try {
			 String sql4="select * from JIJAMATA_PRINCPLE WHERE username=? and password=?";
			 PreparedStatement ps1=conn.prepareStatement(sql4);
			 ps1.setString(1,username);
			 ps1.setString(2,psw);
			 ResultSet rs=ps1.executeQuery();
			 
			 while(rs.next()) {
				 u=new principle();
				 u.setId(rs.getString(1));
				 u.setUsername(rs.getString(2));
				 u.setFullname(rs.getString(3));
				 u.setPassword(rs.getString(4));
				 u.setContact(rs.getString(5));
				 u.setEmail(rs.getString(6));
				 u.setAddress(rs.getString(7));
				
				  
			 }
			 
			 
		 }catch(Exception e) {
			 System.out.print(e);
		 }
		 return u;
	 }

}
