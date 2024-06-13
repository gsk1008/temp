<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Application form</title>
	<%@include file="component/allcss.jsp" %>

</head>
<body>

<c:if test="${ empty teacherobj}">
 <c:redirect url="user_login.jsp"></c:redirect>
  </c:if>

<%@include file="component/navebar.jsp" %>

 <div class="page-nav no-margin row d-flex justify-content-center align-item-center mt-5 " >
      <c:if test="${not empty sucMsg }">
  <h4><p class="text-center text-success fs-10">${sucMsg}</p></h4>
  
  <c:remove var="sucMsg" scope="session" />
  </c:if>
  
  <c:if test="${not empty errorMsg }">
  <h4><p class="text-center text-danger fs-10">${errorMsg}</p></h4>
  <c:remove var="errorMsg" scope="session" />
  </c:if>

	<div class="container m-4">
		<div class="row m-4">
			<div class="col-md-12 m-4">
<h2 class="py-3 text-center">FORM OF APPLICATION FOR CASUAL LEAVE </h2>

 <% 
 teacher user1=(teacher)session.getAttribute("teacherobj");
 int id=Integer.parseInt(user1.getTid());
 teacher1 dao= new teacher1(dbconnection.getConn());
 ccasual_leave_techer dao1= new ccasual_leave_techer(dbconnection.getConn());
 int td=dao1.getccasualuser(id);
 List<teacher> list=dao.getteacherdetelesid(id);
 for(teacher ap:list){
	   
  %>

<form class="form-group" action="applyforleave" method="post">
	<fieldset>
	<label><h4>1.Name:</h4></label>
	<input type="text" name="name" class="form-control"  value="<%=ap.getFullname()%>"><br>

	<label><h4>2.Designation:</h4></label>
	<input type="text" name="designation" class="form-control" value="<%=ap.getDesignation() %>" ><br>
    <label><h4>3.Department:</h4></label>  
   <select required class="form-control col-md-3" name="department">
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
    <br>
    
    
   
	<label><h4>4.Period of C.L Applied from:</h4></label><input type="date" name="clfrom" class="col-md-3"> <label><h4>days.</h4></label>

     <label><h4> to:</h4></label><input type="date" name="clto" class="col-md-3"> <label><h4>days.</h4></label><br>
<br><label><h4>5.total days: </h4></label>
   <% 
	  if(td<15){%>
		  <input type="number" name="totaldays" class="col-md-2"> 
	  <%}else{%>
	  
	  <a href="" class="btn btn-success btn-sm-disabled">non leave available</a>
	  
	 <% }
	  %>
<label><h4>total leaves :</h4></label><input type="number" name="remaingdays" class="col-md-2" value=<%=td%>><br>
<br>
    <label><h4>6.Reason:</h4></label><input type="text" name="Reason" class="form-control"><br>
<label><h4>7.Altername:</h4></label><input type="text" name="ALTERNAME" class="form-control"><br>
<label><h4>Submit date</h4></label><input type="date" name="submitdate" class="col-md-3"> <label></label>
<br>
<input type="hidden" name="tid" value="<%=ap.getTid()%>">
<div class="d-flex justify-content-center align-item-center mt-5">
    <input type="submit" name="" class="btn btn-success py-3 text-center">
    </div>
 <%} %>   
</form>
</fieldset>
</div>
</div>
</div>

</body>
</html>