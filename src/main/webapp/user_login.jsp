<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   
    <title>Jijamata College WebSite</title>
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
  <div class="card mt-5" >
                <div class="card-header" >
    <c:if test="${not empty succMsg }">
  <h4><p class="text-center text-success fs-10">${succMsg}</p></h4>
  
  <c:remove var="sucMsg" scope="session" />
  </c:if>
  
  <c:if test="${not empty errorMsg }">
  <h4><p class="text-center text-danger fs-10">${errorMsg}</p></h4>
  <c:remove var="errorMsg" scope="session" />
  </c:if>
  
    
            
                    
                       
                            <h3 class="text-center">user Login</h3>
                            <form Action="teacherlogin" method="post">
                                <div class="mb-3 mt-3">
                                    <label class=" mb-1">User Name</label>
                                    <input type="text" class="form-control" name="User_name" id="">
                                </div>
                            
                                <div class="mb-3 mt-4">
                                  <label class="mb-1">Password</label>
                                  <input type="password" class="form-control" name="password" id="">
                                </div> 
                                <div class="text-center mr-3">
                        <button type="submit" class="btn btn-outline-info">Login</button>
                    </div>     
                            </form>
                        </div>
                    </div>
                    
                </div>
</body>
</html>