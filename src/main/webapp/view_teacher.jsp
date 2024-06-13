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
<c:if test="${ empty hodobj} || ${ empty facultyincharge}">
 <c:redirect url="hodlogin.jsp"></c:redirect>
  </c:if>



<%@include file="component/navebar.jsp" %>

 <div class="page-nav no-margin row d-flex justify-content-center align-item-center mt-5 " >


<table cellpadding="20px" class="text-dark "  width="800px" border="2"  >
<thead >
                 <tr>
                   
                     
                     <td><h5>FullName</h5></td>
                     <td><h5>Department</h5></td>
                     <td><h5>Address</h5></td>
                     <td><h5>contact</h5></td>
                     <td><h5>Email</h5></td>                     
                 </tr>
                 
                                     <tbody>    
                         <% 
                         String td=request.getParameter("id");
                         teacher1 dao= new teacher1(dbconnection.getConn());
         List<teacher> list=dao.getteacherdeteles(td);
       for(teacher ap:list){	  	 
	  %>
	
	 
         
    <tr>
	  <td><%=ap.getFullname() %></td>
    <td><%=ap.getDepartment() %></td>
    <td><%=ap.getAddress1() %></td>
    <td><%=ap.getMobile_number() %></td>
    <td><%=ap.getEmail() %></td>
    
   
	  </tr>
    
      <%} %>
          </tbody>
                 
          </thead>
          
          
             
          
</table>
</div>
</body>
</html>