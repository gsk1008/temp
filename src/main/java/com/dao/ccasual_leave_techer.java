package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.*;

public class ccasual_leave_techer {
	private Connection conn;

	public ccasual_leave_techer(Connection conn) {
		super();
		this.conn = conn;
	}

	
	public boolean register(cl_casual_teaching u) {
		   boolean f=false;
		   
		         try {
		        	 String sql="INSERT INTO  JIJAMATA_CASUAL_TEACH(NAME,DESIGNATION,PDLFORM,PDL2,PDLDAY,RESSION,ALTERNAME,FROM_SUBDATE,HID_APPROVE,FID_APPROVE,TUPE_APPROVE,DEPARTMENT,T_ID) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		        	 PreparedStatement ps=conn.prepareStatement(sql);
		        	 ps.setString(1,u.getName());
		        	 ps.setString(2,u.getDesigation());
		        	 ps.setString(3,u.getPdl_from());
		        	 ps.setString(4,u.getPdl_to());
		        	 ps.setString(5,u.getPdl_day());
		        	 ps.setString(6,u.getRession());
		          	 ps.setString(7,u.getAltername());
		          	 ps.setString(8,u.getForm_sub_date());
		          	 ps.setString(9,u.getHid_approvel());
		          	 ps.setString(10,u.getFid_approvel());
		          	 ps.setString(11,u.getTupe_approvel());
		          	 ps.setString(12,u.getDepartment());
		             ps.setString(13,u.getT_id());
		            
		        	 int i=ps.executeUpdate();
		        	 if(i == 1){		        		 
		        		 f=true;
		        	 }
		         }catch(Exception e){
		        		 System.out.print(e);
		        		 
		        	 }
		         return f;
	   }
	
	public List<cl_casual_teaching> getccasual(String dep){
		List<cl_casual_teaching> list=new ArrayList<cl_casual_teaching>();
		cl_casual_teaching ap=null;
		try {
			String sql="select * from JIJAMATA_CASUAL_TEACH WHERE DEPARTMENT=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,dep);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				ap=new cl_casual_teaching();
				ap.setId(rs.getInt(1));
				 ap.setName(rs.getString(2));;
				 ap.setDesigation(rs.getString(3));
				 ap.setPdl_from(rs.getString(4));
				 ap.setPdl_to(rs.getString(5));
				 ap.setPdl_day(rs.getString(6));
				 ap.setRession(rs.getString(7));
				 ap.setAltername(rs.getString(8));
				 ap.setForm_sub_date(rs.getString(9));
				 ap.setHid_approvel(rs.getString(10));
				 ap.setFid_approvel(rs.getString(11));
				 ap.setTupe_approvel(rs.getString(12));
				 ap.setDepartment(rs.getString(13));
				 ap.setT_id(rs.getString(14));
			
				list.add(ap);
			}
					        			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
	
	public List<cl_casual_teaching> getccasualhodapprovel(String dep){
		List<cl_casual_teaching> list=new ArrayList<cl_casual_teaching>();
		cl_casual_teaching ap=null;
		try {
			String sql="select * from JIJAMATA_CASUAL_TEACH WHERE HID_APPROVE='approval' and DEPARTMENT=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,dep);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				ap=new cl_casual_teaching();
				ap.setId(rs.getInt(1));
				 ap.setName(rs.getString(2));;
				 ap.setDesigation(rs.getString(3));
				 ap.setPdl_from(rs.getString(4));
				 ap.setPdl_to(rs.getString(5));
				 ap.setPdl_day(rs.getString(6));
				 ap.setRession(rs.getString(7));
				 ap.setAltername(rs.getString(8));
				 ap.setForm_sub_date(rs.getString(9));
				 ap.setHid_approvel(rs.getString(10));
				 ap.setFid_approvel(rs.getString(11));
				 ap.setTupe_approvel(rs.getString(12));
				 ap.setDepartment(rs.getString(13));
				 ap.setT_id(rs.getString(14));
			
				list.add(ap);
			}
					        			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
	
	public List<cl_casual_teaching> getccasualtupamam(String dep){
		List<cl_casual_teaching> list=new ArrayList<cl_casual_teaching>();
		cl_casual_teaching ap=null;
		try {
			String sql="select * from JIJAMATA_CASUAL_TEACH WHERE HID_APPROVE='approval' and FID_APPROVE='approval' and DEPARTMENT=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,dep);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				ap=new cl_casual_teaching();
				ap.setId(rs.getInt(1));
				 ap.setName(rs.getString(2));;
				 ap.setDesigation(rs.getString(3));
				 ap.setPdl_from(rs.getString(4));
				 ap.setPdl_to(rs.getString(5));
				 ap.setPdl_day(rs.getString(6));
				 ap.setRession(rs.getString(7));
				 ap.setAltername(rs.getString(8));
				 ap.setForm_sub_date(rs.getString(9));
				 ap.setHid_approvel(rs.getString(10));
				 ap.setFid_approvel(rs.getString(11));
				 ap.setTupe_approvel(rs.getString(12));
				 ap.setDepartment(rs.getString(13));
				 ap.setT_id(rs.getString(14));
				
				list.add(ap);
			}
					        			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
	
	public List<cl_casual_teaching> getccasualall(String dep){
		List<cl_casual_teaching> list=new ArrayList<cl_casual_teaching>();
		cl_casual_teaching ap=null;
		try {
			String sql="select * from JIJAMATA_CASUAL_TEACH WHERE HID_APPROVE='approval' and FID_APPROVE='approval' and TUPE_APPROVE='approval' and DEPARTMENT=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,dep);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				ap=new cl_casual_teaching();
				ap.setId(rs.getInt(1));
				 ap.setName(rs.getString(2));;
				 ap.setDesigation(rs.getString(3));
				 ap.setPdl_from(rs.getString(4));
				 ap.setPdl_to(rs.getString(5));
				 ap.setPdl_day(rs.getString(6));
				 ap.setRession(rs.getString(7));
				 ap.setAltername(rs.getString(8));
				 ap.setForm_sub_date(rs.getString(9));
				 ap.setHid_approvel(rs.getString(10));
				 ap.setFid_approvel(rs.getString(11));
				 ap.setTupe_approvel(rs.getString(12));
				 ap.setDepartment(rs.getString(13));
				 ap.setT_id(rs.getString(14));
			
				list.add(ap);
			}
					        			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
	
	
	
	
	
	public int getccasualuser(int tid){
		int td=0;
		try {
			String sql="SELECT SUM(PDLDAY) FROM JIJAMATA_CASUAL_TEACH WHERE  HID_APPROVE='approval' AND FID_APPROVE='approval' AND TUPE_APPROVE='approval' and T_ID=?";
					
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1,tid);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				
				td=Integer.parseInt(rs.getString(1));
				
			}
					        			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return td;
	}
	
	
	
	
	public cl_casual_teaching getccasualid(int id){
		cl_casual_teaching ap=null;
		try {
			String sql="select * from JIJAMATA_CASUAL_TEACH WHERE ID=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				ap=new cl_casual_teaching();
				ap.setId(rs.getInt(1));
				 ap.setName(rs.getString(2));;
				 ap.setDesigation(rs.getString(3));
				 ap.setPdl_from(rs.getString(4));
				 ap.setPdl_to(rs.getString(5));
				 ap.setPdl_day(rs.getString(6));
				 ap.setRession(rs.getString(7));
				 ap.setAltername(rs.getString(8));
				 ap.setForm_sub_date(rs.getString(9));
				 ap.setHid_approvel(rs.getString(10));
				 ap.setFid_approvel(rs.getString(11));
				 ap.setTupe_approvel(rs.getString(12));
				 ap.setDepartment(rs.getString(13));
				 ap.setT_id(rs.getString(14));
				
				
			}
					        			
		}catch(Exception e) {
			System.out.println(e);
		}
		return ap;
		
	}
	
	public List<cl_casual_teaching> getccasualteacherid(int dep){
		List<cl_casual_teaching> list=new ArrayList<cl_casual_teaching>();
		cl_casual_teaching ap=null;
		try {
			String sql="SELECT * FROM JIJAMATA_CASUAL_TEACH WHERE t_id=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1,dep);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				ap=new cl_casual_teaching();
				ap.setId(rs.getInt(1));
				 ap.setName(rs.getString(2));;
				 ap.setDesigation(rs.getString(3));
				 ap.setPdl_from(rs.getString(4));
				 ap.setPdl_to(rs.getString(5));
				 ap.setPdl_day(rs.getString(6));
				 ap.setRession(rs.getString(7));
				 ap.setAltername(rs.getString(8));
				 ap.setForm_sub_date(rs.getString(9));
				 ap.setHid_approvel(rs.getString(10));
				 ap.setFid_approvel(rs.getString(11));
				 ap.setTupe_approvel(rs.getString(12));
				 ap.setDepartment(rs.getString(13));
				 ap.setT_id(rs.getString(14));
		
				list.add(ap);
			}
					        			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
	
	
	
	
	
	
	
	
	public boolean updateCcasulebyhod(String str,int id) {
		boolean f= false;
		
		try {
			
			String sql="UPDATE JIJAMATA_CASUAL_TEACH SET HID_APPROVE=? where ID=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,str);
			ps.setInt(2,id);
			
			
			int i=ps.executeUpdate();
			
			if(i == 1) {
				f=true;
			}
							
		}catch(Exception e) {
			System.out.print(e);
		}	
		
		return f;
	} 
	
	public boolean updateCcasulebyfac(String str,int id) {
		boolean f= false;
		
		try {
			
			String sql="UPDATE JIJAMATA_CASUAL_TEACH SET FID_APPROVE=? where ID=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,str);
			ps.setInt(2,id);
			
			
			int i=ps.executeUpdate();
			
			if(i == 1) {
				f=true;
			}
							
		}catch(Exception e) {
			System.out.print(e);
		}	
		
		return f;
	} 
	
	public boolean updateCcasulemam(String str,int id) {
		boolean f= false;
		
		try {
			
			String sql="UPDATE JIJAMATA_CASUAL_TEACH SET TUPE_APPROVE=? where ID=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,str);
			ps.setInt(2,id);
			
			
			int i=ps.executeUpdate();
			
			if(i == 1) {
				f=true;
			}
							
		}catch(Exception e) {
			System.out.print(e);
		}	
		
		return f;
	}
	public boolean updateCcasuleday(int str,String id) {
		boolean f= false;
		
		try {
			
			String sql="UPDATE JIJAMATA_CASUAL_TEACH SET REMANINGDAYS=? where T_ID=?";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1,str);
			ps.setString(2,id);
			
			
			int i=ps.executeUpdate();
			
			if(i == 1) {
				f=true;
			}
							
		}catch(Exception e) {
			System.out.print(e);
		}	
		
		return f;
	}
	
}
