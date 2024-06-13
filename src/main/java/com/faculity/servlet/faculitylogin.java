package com.faculity.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.*;
import com.db.dbconnection;
import com.entity.*;

@WebServlet("/faculitylogin")
public class faculitylogin extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		

		try {
			String username=req.getParameter("username");
			String password=req.getParameter("Password");
			String department=req.getParameter("dee");
		
			HttpSession session=req.getSession();
		 	
			facultyincharge dao= new facultyincharge(dbconnection.getConn());
			faculty_incharge user1=dao.login(username,password,department);
			
			
			if(user1!=null) {
				session.setAttribute("facultyincharge",user1);
				resp.sendRedirect("index.jsp");
				
			}else {
				session.setAttribute("errorMsg","username & password");
				resp.sendRedirect("faculity.jsp");
				
			}
			
			
		}catch (Exception e){
			e.printStackTrace();
			
		
	}
	
	

	}
	
}
