package com.casual.servlet;

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

@WebServlet("/applyforleave")
public class applyforleave extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			String name=req.getParameter("name");
			String designation=req.getParameter("designation");
			String PDLFORM=req.getParameter("clfrom");
			String PDL2=req.getParameter("clto");
			String PDLDAY=req.getParameter("totaldays");
			int remaingdays=Integer.parseInt(req.getParameter("remaingdays"));
			String RESSION=req.getParameter("Reason");
			String ALTERNAME=req.getParameter("ALTERNAME");
			String FROM_SUBDATE=req.getParameter("submitdate");
			String HID_APPROVE="pending";
			String FID_APPROVE="pending";
			String TUPE_APPROVE="pending";
			String DEPARTMENT=req.getParameter("department");
			String T_ID=req.getParameter("tid");
			
					
			cl_casual_teaching u=new cl_casual_teaching(name,designation,PDLFORM,PDL2,PDLDAY,RESSION,ALTERNAME,FROM_SUBDATE,HID_APPROVE,FID_APPROVE,TUPE_APPROVE,DEPARTMENT,T_ID);
			ccasual_leave_techer dao= new ccasual_leave_techer(dbconnection.getConn());
			HttpSession session=req.getSession();
			boolean f=dao.register(u);	
			if(f) {
					
					session.setAttribute("sucMsg","apply Sucessfully");
					resp.sendRedirect("form_casual_leave_ts.jsp");
				
			}
			else {
				session.setAttribute("errorMsg","Something wrong");
				resp.sendRedirect("form_casual_leave_ts.jsp");
			}
			
			
			
		}catch(Exception e) {
		System.out.println(e);
		}
		
	}
	
	

}
