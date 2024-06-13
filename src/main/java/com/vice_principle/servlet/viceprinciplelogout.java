package com.vice_principle.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/viceprinciplelogout")
public class viceprinciplelogout extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session=req.getSession();
		session.removeAttribute("VICEPRINCIPLE");
		session.setAttribute("sucMsg","Logout Sucessfully");
		resp.sendRedirect("Vice_Principle_login.jsp");	
		
		
	}
	
	

}
