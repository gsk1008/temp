package com.Principle.servlet;

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



@WebServlet("/principlelogin")
public class principlelogin extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String username=req.getParameter("username");
			String password=req.getParameter("password");
			
			HttpSession session=req.getSession();
			
			principlelogindao dao= new principlelogindao(dbconnection.getConn());
			principle pri=dao.login(username,password);
			
			
			if(pri!=null) {
				session.setAttribute("PRINCIPLE",pri);
				resp.sendRedirect("index.jsp");
				
			}else {
				session.setAttribute("errorMsg","username & password");
				resp.sendRedirect("Principlelogin.jsp");
				
			}
			
			
			
		}catch (Exception e){
			e.printStackTrace();
			
		}
		
	}
	
}
