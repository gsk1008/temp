package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.*;

public class viceprinciple {
   
	private Connection conn;

	public viceprinciple(Connection conn) {
		super();
		this.conn = conn;
	}

	public VICEPRINCIPLE login(String username,String psw){
		VICEPRINCIPLE u=null;
		 try {
			 String sql4="select * from JIJAMATA_VICE_PRINCIPLE WHERE username=? and password=?";
			 PreparedStatement ps1=conn.prepareStatement(sql4);
			 ps1.setString(1,username);
			 ps1.setString(2,psw);
			 ResultSet rs=ps1.executeQuery();
			 
			 while(rs.next()) {
				 u=new VICEPRINCIPLE();
				 u.setID(rs.getString(1));
				 u.setUsername(rs.getString(2));
				 u.setFullname(rs.getString(3));
				 u.setPassword(rs.getString(4));
				 u.setDEPARTMENT(rs.getString(5));
				  
			 }
			 
			 
		 }catch(Exception e) {
			 System.out.print(e);
		 }
		 return u;
	 }

}
