<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <style>
        body{
            overflow-x: hidden;
        }
    </style>
      <%@include file="component/allcss.jsp" %>
</head>
<body>
<%@include file="component/navebar.jsp" %>

<div class="page-nav no-margin row d-flex justify-content-center align-item-center mt-5">
<div class="wrapper ">
  <div class="inner-warpper">
  <!-- ************************************ errror masg -->
  <c:if test="${not empty sucMsg }">
  <h4><p class="text-center text-success fs-10">${sucMsg}</p></h4>
  
  <c:remove var="sucMsg" scope="session" />
  </c:if>
  
  <c:if test="${not empty errorMsg }">
  <h4><p class="text-center text-danger fs-10">${errorMsg}</p></h4>
  <c:remove var="errorMsg" scope="session" />
  </c:if> 
  
  <!-- ************************************************* -->
    <h2 class="title text-center">New Register</h2>
    
      <div class="col-md-12" style="">
    <form action="addfacultyincharge"  method="post">
   
     
        <label>User Name</label>
        <input class="form-control" name="username" id="userName" type="text" >
      
           <label >full Name</label>
        <input class="form-control" name="fullName"  id="fullName" type="text"  >
       
    
      
       
                                    <label class=" mb-1">Faculity</label>
                                <select required class="form-control" name="Department">
                                 <option value="">---select---</option>
                                    <option value="Bsc">Bsc</option>
                                    <option value="Msc Chemistry">Msc Chemistry</option>
                                    <option value="Msc Botany">Msc Botany</option>
                                    <option value="Msc Computer Science">Msc Computer Science</option>
                                    <option value="Bsc Computer Science">Bsc Computer Science</option>
                                    <option value="BCom">BCom</option>
                                    <option value="MA">MA</option>
                                    <option value="BA">BA</option>
                                  </select>
                              
        <span class="lighting"></span>
        <label >Designation</label>
        <input class="form-control" name="Designation"  id="Designation" type="text"  >
        <p id="emailp"></p>
        <span class="lighting"></span>
      </div>
      <div class="col-md-12">
        <label class="lighting">Address</label>
        <input class="form-control" name="Address"  id="Address" type="text"  >
        <p id="emailp"></p>
        <span class="lighting"></span>
        <label >Contact</label>
        <input class="form-control" name="Contact"  id="Contact" type="text"  >
        <p id="emailp"></p>
        <span class="lighting"></span>      
        <label >Email</label>
        <input class="form-control" name="Email"  id="email" type="text"  >
        <p id="emailp"></p>
        <span class="lighting"></span>
   
        <label >password</label>
        <input class="form-control" name="Password"  id="email" type="password"  >
        <p id="emailp"></p>
        <span class="lighting"></span>
   </div>
     
   <input type="submit" value="submit" class="btn btn-success">

     
        <a class="forgot pull-right" href="#"></a>
      
    </form>
 
    </div>
  </div>
  
  </div>    
 

      


</body>
</html>