package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.*;

public class tupamam {
	
	private Connection conn;

	public tupamam(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public tupe_mam login(String username,String psw){
		tupe_mam u=null;
		 try {
			 String sql4="select * from JIJAMATA_TUPE_MAM WHERE USERNAME=? AND PASSWORD=?";
			 PreparedStatement ps1=conn.prepareStatement(sql4);
			 ps1.setString(1,username);
			 ps1.setString(2,psw);
			 ResultSet rs=ps1.executeQuery();
			 
			 while(rs.next()) {
				 u=new tupe_mam();
				 u.setId(rs.getString(1));
				 u.setUsername(rs.getString(2));
				 u.setFullname(rs.getString(3));
				 u.setContact(rs.getString(4));
				 u.setEmail(rs.getString(5));
				 u.setAddress(rs.getString(6));
				 u.setPassword(rs.getString(7));		 
				
				  
			 }
			 
			 
		 }catch(Exception e) {
			 System.out.print(e);
		 }
		 return u;
	 }


}
