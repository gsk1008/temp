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
import com.entity.*;


@WebServlet("/tupemamlogin")
public class tupemamlogin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
	try {
		String username=req.getParameter("Username");
		String password=req.getParameter("password");
		
		HttpSession session=req.getSession();
		
		tupamam dao= new tupamam(dbconnection.getConn());
		tupe_mam mam=dao.login(username,password);
		
		
		if(mam!=null) {
			session.setAttribute("mamobj",mam);
			resp.sendRedirect("index.jsp");
			
		}else {
			session.setAttribute("errorMsg","username & password");
			resp.sendRedirect("tupe_mam_login.jsp");
			
		}
		
		
	}catch (Exception e){
		e.printStackTrace();
		
	}
	
	}

}
