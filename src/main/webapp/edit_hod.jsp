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
<div class="page-nav no-margin row">

<div class="wrapper">
  <div class="inner-warpper text-center">
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
    <form action="addhod"  method="post">
   
      <div class="form-control ">
       <div class="col-md-12 " >
        <label>User Name</label>
        <input class="form-control" name="username" id="userName" type="text" >
      
           <label >full Name</label>
        <input class="form-control" name="fullName"  id="fullName" type="text"  >
       
      </div>
      <div class="col-offset-2" >
        <div class="mb-3 mt-3">
                                    <label class=" mb-1">Department</label>
                                <select required class="form-control" name="Department">
                                 <option value="">---select---</option>
                                    <option value="gsk">Bsc</option>
                                    <option value="Msc Chemistry">Msc Chemistry</option>
                                    <option value="Msc Botany">Msc Botany</option>
                                    <option value="Msc Computer Science">Msc Computer Science</option>
                                    <option value="Bsc Computer Science">Bsc Computer Science</option>
                                    <option value="BCom">BCom</option>
                                    <option value="MA">MA</option>
                                    <option value="BA">BA</option>
                                  </select>
                                </div>
        <span class="lighting"></span>
       
      </div>
      
      <div class="col-offset-2" >
        <label >Contact</label>
        <input class="form-control" name="Contact"  id="Address" type="text"  >
        <p id="emailp"></p>
        <span class="lighting"></span>
      </div>
      
      <div class="col-offset-2" >
        <label >Address</label>
        <input class="form-control" name="Address"  id="Contact" type="text"  >
        <p id="emailp"></p>
        <span class="lighting"></span>
      </div>
      <div class="col-offset-2" >
        <label >Email</label>
        <input class="form-control" name="Email"  id="email" type="text"  >
        <p id="emailp"></p>
        <span class="lighting"></span>
      </div>
      <div class="col-offset-2" >
        <label >password</label>
        <input class="form-control" name="Password"  id="email" type="password"  >
        <p id="emailp"></p>
        <span class="lighting"></span>
      </div>
      <div class="col-offset-2" >
        
        
        
        <input type="submit" value="submit" class="btn btn-success">

      
      <div class="clearfix supporter">
        <div class="pull-left remember-me">
          
        </div>
        <a class="forgot pull-right" href="#"></a>
      </div>
      </div>
      </div>
    </form>
   
    
    <div class="col-sm-9 d-none d-lg-block appoint text-center "> 
        <button class="btn btn-info"><a href="userlogin.jsp">Back_to login</a></button> 
      </div>
    </div>
  </div>
     
      
 </div>
<!-- ************************************* -->

</div>

</body>
</html>