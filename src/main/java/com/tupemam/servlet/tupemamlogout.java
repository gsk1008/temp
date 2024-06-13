package com.tupemam.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/tupemamlogout")
public class tupemamlogout extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session=req.getSession();
		session.removeAttribute("mamobj");
		session.setAttribute("sucMsg","Logout Sucessfully");
		resp.sendRedirect("tupe_mam_login.jsp");	
		
	}
		
		
		
		
		
		
	}
	
	
	


