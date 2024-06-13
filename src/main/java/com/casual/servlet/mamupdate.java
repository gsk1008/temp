package com.casual.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ccasual_leave_techer;
import com.db.dbconnection;

@WebServlet("/mamupdate")
public class mamupdate extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
			
			String comment=req.getParameter("comment");
			int id=Integer.parseInt(req.getParameter("id"));
		
			
			
			ccasual_leave_techer dao=new ccasual_leave_techer(dbconnection.getConn());
			HttpSession session=req.getSession();
		
			if(dao.updateCcasulemam(comment,id)) {
				session.setAttribute("succMsg","update success");
				resp.sendRedirect("viewcasualleav3.jsp");
				
			}else {
				session.setAttribute("errorMsg","not update");
				resp.sendRedirect("viewcasualleav3.jsp");
				
			}			
									
			
		}catch(Exception e) {
			System.out.print(e);
		}
		
	}


}
