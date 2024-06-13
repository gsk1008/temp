package com.hod.servlet;

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

@WebServlet("/hodlogin")
public class hodlogin extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String dp=req.getParameter("dep");
			String username=req.getParameter("username");
			String password=req.getParameter("password");
			
			HttpSession session=req.getSession();
			
			hoddao dao= new hoddao(dbconnection.getConn());
			hod hodo=dao.login(username,password,dp);
			
			
			if(hodo!=null) {
				session.setAttribute("hodobj",hodo);
				resp.sendRedirect("index.jsp");
				
			}else {
				session.setAttribute("errorMsg","username & password");
				resp.sendRedirect("hodlogin.jsp");
				
			}
				
		}catch (Exception e){
			e.printStackTrace();
			
		}
		
		
	}
	
	

}
