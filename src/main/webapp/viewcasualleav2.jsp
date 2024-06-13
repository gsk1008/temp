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
                     <td><h5>faculty incharge approvel</h5></td>
                     <td><h5>Action</h5></td>
                     <td><h5>Department</h5></td>
                                          
                 </tr>
                 
                                     <tbody>    
                         <% 
                         String td=request.getParameter("id");
                         ccasual_leave_techer dao1= new ccasual_leave_techer(dbconnection.getConn());
                         List<cl_casual_teaching> list1=dao1.getccasualhodapprovel(td);
                         for(cl_casual_teaching ap1:list1){	  	 
                       	  
	  %>
	
	 
         
    <tr>
	  <td><%=ap1.getName()%></td>
    <td><%=ap1.getPdl_from()%></td>
    <td><%=ap1.getPdl_to()%></td>
    <td><%=ap1.getPdl_day()%></td>
    <td><%=ap1.getRession()%></td>
    <td><%=ap1.getAltername() %></td>
    <td><%=ap1.getForm_sub_date() %></td>
    <td><%=ap1.getFid_approvel()%></td>
   <td>
     <% 
	  if("pending".equals(ap1.getFid_approvel())){%>
		  <a href="facincomment.jsp?id1=<%=ap1.getId()%>" class="btn btn-success btn-sm">commint</a>
	  <%}else{%>
	  
	  <a href="#" class="btn btn-success btn-sm-disabled">commint</a>
	  
	 <% }
	  %>
   
   
   </td>
    <td><%=ap1.getDepartment() %></td>
      
    
   
	  </tr>
    <%} %>
      
          </tbody>
                 
          </thead>
          
          
             
          
</table>
</div>
</body>
</html>