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
    
     <h5>comment</h5><br>
        <div class="col-md-4 offset-md-4">
        
        <%
        String id=request.getParameter("id1");
        int idd=Integer.parseInt(id);
        ccasual_leave_techer dao=new ccasual_leave_techer(dbconnection.getConn());
        cl_casual_teaching ap=dao.getccasualid(idd);
        
        %>
      <table>

      <form action="mamupdate"  method="post">
      <tr>
             <td>
             <label>Full Name</label>        
        <input class="form-control" name="fullname" id="userName" type="text" readonly value="<%=ap.getName()%>" >
        <span class="lighting"></span>
             </td>
             <td>
        
             
             </td>
      </tr>
              
      <tr>
        
      </tr>
      <tr>
      <td colspan="2">   <label >comment </label>
        <input class="form-control" name="comment"  id="comment" type="text">
        <span class="lighting"></span></td>
          
         </td> 
      </tr>
      <tr>
      <td><input class="form-control" name="id"  id="email" type="hidden"   value="<%=ap.getId() %>" >
      </tr>
                <tr>
      <td colspan="2">   
        <input class="form-control" name="submit"  id="comment" type="submit">
        <span class="lighting"></span></td></td>
      </tr>  
      
      </form>
      </table>
  
  </div>
  </div>
</body>
</html>