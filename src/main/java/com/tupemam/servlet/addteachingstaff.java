package com.tupemam.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.teacher1;
import com.db.dbconnection;
import com.entity.teacher;

@WebServlet("/addteachingstaff")
public class addteachingstaff extends HttpServlet {
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		try {
			String username1=req.getParameter("username");
			String fullName=req.getParameter("fullName");
			String Department=req.getParameter("Department");
			String Designation=req.getParameter("Designation");
			String Address=req.getParameter("Address");
			String Contact=req.getParameter("Contact");
			String Email=req.getParameter("Email");
			String Password=req.getParameter("Password");
			
			teacher u=new teacher(username1,fullName,Department,Designation,Address,Contact,Email,Password);
			teacher1 dao= new teacher1(dbconnection.getConn());
			HttpSession session=req.getSession();
			boolean f=dao.register1(u);
			if(f) {
				session.setAttribute("sucMsg","Register Sucessfully");
				resp.sendRedirect("add_teaching_staff.jsp");
				
			}
			else {
				session.setAttribute("errorMsg","Something wrong");
				resp.sendRedirect("add_teaching_staff.jsp");
			}
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	

}
