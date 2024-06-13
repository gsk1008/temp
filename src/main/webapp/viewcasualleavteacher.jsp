<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page import="com.db.*"%>
<%@ page import="com.entity.*"%>
<%@ page import="com.dao.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


      <%@include file="component/allcss.jsp" %>

</head>
<body>


<%@include file="component/navebar.jsp" %>

 <div class="page-nav no-margin row d-flex justify-content-center align-item-center mt-5 " >
  <c:if test="${not empty succMsg }">
  <h4><p class="text-center text-success fs-10">${succMsg}</p></h4>
  
  <c:remove var="sucMsg" scope="session" />
  </c:if>
  
  <c:if test="${not empty errorMsg }">
  <h4><p class="text-center text-danger fs-10">${errorMsg}</p></h4>
  <c:remove var="errorMsg" scope="session" />
  </c:if>

<table cellpadding="10px" class="text-dark "   border="2"  >
<thead >
                 <tr>
                   
                     
                     <td><h5>Name</h5></td>
                  
                     <td><h5>CASUAL from</h5></td>
                     <td><h5>CASUAL To</h5></td>
                     <td><h5>TATOL days</h5></td>
                     <td><h5>Reason</h5></td>
                     <td><h5>Altername</h5></td>
                     <td><h5>From_submit date</h5></td>
                     <td><h5>Hod Appeovel</h5></td>
                     <td><h5>faculty incharge approvel</h5></td>
                     <td><h5>tupe mam approvel</h5></td>
                  
                                          
                 </tr>
                 
                                     <tbody>    
                         <% 
                         teacher user1=(teacher)session.getAttribute("teacherobj");
                         int id=Integer.parseInt(user1.getTid());
                         ccasual_leave_techer dao= new ccasual_leave_techer(dbconnection.getConn());
                         List<cl_casual_teaching> list=dao.getccasualteacherid(id);
                         for(cl_casual_teaching ap1:list){	  	 
                       	  
	  %>
	
	 
         
    <tr>
	  <td><%=ap1.getName()%></td>
    <td><%=ap1.getPdl_from()%></td>
    <td><%=ap1.getPdl_to()%></td>
    <td><%=ap1.getPdl_day()%></td>
    <td><%=ap1.getRession()%></td>
    <td><%=ap1.getAltername() %></td>
    <td><%=ap1.getForm_sub_date() %></td>
   <td><%=ap1.getHid_approvel() %></td>
    <td><%=ap1.getFid_approvel()%></td>
    <td><%=ap1.getTupe_approvel() %></td>
      
    
   
	  </tr>
    <%} %>
      
          </tbody>
                 
          </thead>
          
          
             
          
</table>
</div>
</body>
</html>