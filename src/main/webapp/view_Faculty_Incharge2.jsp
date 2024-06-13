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


<table cellpadding="20px" class="text-dark "  width="800px" border="2"  >
<thead >
                 <tr>
                   
                     
                     <td><h5>FullName</h5></td>
                     <td><h5>Department</h5></td>
                     <td><h5>Contact</h5></td>
                     <td><h5>Email</h5></td>
                     <td><h5>Address</h5></td>  
                      <td><h5>Action </h5></td>                    
                 </tr>
                 
                                     <tbody>    
                         <% 
      
                         facultyincharge dao= new facultyincharge(dbconnection.getConn());
         List<faculty_incharge> list=dao.getfaculty_incharge_deteles();
       for(faculty_incharge ap:list){	  	 
	  
	  %>
	 
         
    <tr>
	  <td><%=ap.getFullname() %></td>
    <td><%=ap.getDepartment() %></td>
    <td><%=ap.getContact() %></td>
    <td><%=ap.getEmail() %></td>
    <td><%=ap.getAddress() %></td>
    
    <td><a href="edit_Faculty_Incharge.jsp?id=<%=ap.getId()%>" class="btn btn-sm btn-primary">Edit</a>
      <a href="../deletedocter?id=<%=ap.getId()%>" class="btn btn-sm btn-danger">Delete</a>
      </td>
	  </tr>
    
      <%} %>
          </tbody>
                 
          </thead>
          
          
             
          
</table>
</div>
</body>
</html>