package com.vice_principle.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.*;
import com.db.dbconnection;
import com.entity.VICEPRINCIPLE;



@WebServlet("/viceprinciplelogin")
public class viceprinciplelogin extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		
		try {
			String username=req.getParameter("username");
			String password=req.getParameter("password");
			String department=req.getParameter("depee");
		
			HttpSession session=req.getSession();
		 	
			viceprinciple dao= new viceprinciple(dbconnection.getConn());
			VICEPRINCIPLE user1=dao.login(username,password);
			
			
			if(user1!=null) {
				session.setAttribute("VICEPRINCIPLE",user1);
				resp.sendRedirect("index.jsp");
				
			}else {
				session.setAttribute("errorMsg","invalid email & password");
				resp.sendRedirect("Vice_Principle_login.jsp");
				
			}
			
			
		}catch (Exception e){
			e.printStackTrace();
			
		
		
	}
	
	}
}
