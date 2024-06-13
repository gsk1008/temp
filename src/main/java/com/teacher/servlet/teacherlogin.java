package com.teacher.servlet;

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


@WebServlet("/teacherlogin")
public class teacherlogin extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String username=req.getParameter("User_name");
			String password=req.getParameter("password");
			
		
			HttpSession session=req.getSession();
		 	
			teacher1 dao= new teacher1(dbconnection.getConn());
			teacher user1=dao.login(username,password);
			
			
			if(user1!=null) {
				session.setAttribute("teacherobj",user1);
				resp.sendRedirect("index.jsp");
				
			}else {
				session.setAttribute("errorMsg"," invalide username & password");
				resp.sendRedirect("user_login.jsp");
				
			}
			
			
		}catch (Exception e){
			e.printStackTrace();
			
		
		
	}
		
	}

	
	
	
	
}
