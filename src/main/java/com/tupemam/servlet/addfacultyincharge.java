package com.tupemam.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.*;
import com.db.dbconnection;
import com.entity.faculty_incharge;

@WebServlet("/addfacultyincharge")
public class addfacultyincharge extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String username1=req.getParameter("username");
			String fullName=req.getParameter("fullName");
			String Password=req.getParameter("Password");
			String Department=req.getParameter("Department");
			String Address=req.getParameter("Address");
			String Contact=req.getParameter("Contact");
			String Email=req.getParameter("Email");
			faculty_incharge u=new faculty_incharge(username1,fullName,Password,Department,Address,Contact,Email);
			facultyincharge dao= new facultyincharge(dbconnection.getConn());
			HttpSession session=req.getSession();
			boolean f=dao.register(u);
			if(f) {
				session.setAttribute("sucMsg","Register Sucessfully");
				resp.sendRedirect("add_hod.jsp");
				
			}
			else {
				session.setAttribute("errorMsg","Something wrong");
				resp.sendRedirect("add_hod.jsp");
			}
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
	

}
