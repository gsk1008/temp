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
</head>
<body>
 <nav class="navbar navbar-expand-lg navbar-secondary bg-secondary">
        <div class="container-fluid">
            <div class="row">
                <img src="assets/img/jijamata.jpeg" style="width:100px; height: 70px; border-radius:50% ;">
            </div>
        </div>
       
       
       <c:if test="${empty PRINCIPLE }"> <c:if test="${empty hodobj }">
       <c:if test="${empty mamobj }"> <c:if test="${empty VICEPRINCIPLE }">
       <c:if test="${empty teacherobj }"> <c:if test="${empty  facultyincharge}">
       
       
       
        <div class="container col-10">
            <a class="navbar-brand text-white" href="Principlelogin.jsp">Principle </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

 
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="Vice_Principle_login.jsp" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">Vice Principle
                        </a>
                      
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="hodlogin.jsp" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">HOD
                        </a>
                     
                        
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link " href="faculity.jsp" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">Faculty Incharge
                        </a>
                   
                    </li>
                    
                    <li class="nav-item">
                        <a class="nav-link" href="tupe_mam_login.jsp">Tupe Mam</a>
                    </li>

                </ul>
            </div>
            
            <li class="nav-item dropdown active navbar-nav">
                <a class="nav-link " href="user_login.jsp" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">User</a>
      
            </li>

        </div>
</c:if>
</c:if>
</c:if>
</c:if>
</c:if>
</c:if>
<c:if test="${not empty PRINCIPLE }">
        <div class="container col-10">
            <a class="navbar-brand text-white" href="#">Principle </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="">
                        <a class="nav-link " href="view_hod.jsp" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">HOD
                        </a>                    
                    </li>
                    <li class="">
                        <a class="nav-link " href="view_Faculty_Incharge.jsp" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">Faculty Incharge
                        </a>
                    
                    </li>

                      <li class="dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">teaching staff
                        </a>
                          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="view_teacher.jsp?id=<%="Bsc" %>">Bsc</a></li>
                            <li><a class="dropdown-item" href="view_teacher.jsp?id=<%="Msc Chemistry"%>">Msc Chemistry</a></li>
                            <li><a class="dropdown-item" href="view_teacher.jsp?id=<%="Msc Botany"%>">Msc Botany</a></li>
                            <li><a class="dropdown-item" href="view_teacher.jsp?id=<%="Msc Computer Science"%>">Msc Computer Science</a></li>
                            <li><a class="dropdown-item" href="view_teacher.jsp?id=<%="Bsc Computer Science"%>">Bsc Computer Science</a></li>
                            <li><a class="dropdown-item" href="view_teacher.jsp?id=<%="BCom"%>">BCom</a></li>
                            <li><a class="dropdown-item" href="view_teacher.jsp?id=<%="MA"%>">MA</a></li>
                            <li><a class="dropdown-item" href="view_teacher.jsp?id=<%="BA"%>">BA</a></li>     
                        </ul>
                        
                        
                                 
                    </li>
                    <li class="">
                        <a class="nav-link" href="#" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">Non-teaching staff
                        </a>                        
                  
                    </li>
                          <li class="dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">casual leave
                        </a>
                          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="viewcasualleav4.jsp?id=<%="Bsc" %>">Bsc</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav4.jsp?id<%="Msc Chemistry"%>">Msc Chemistry</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav4.jsp?id=<%="Msc Botany"%>">Msc Botany</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav4.jsp?id=<%="Msc Computer Science"%>">Msc Computer Science</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav4.jsp?id=<%="Bsc Computer Science"%>">Bsc Computer Science</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav4.jsp?id=<%="BCom"%>">BCom</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav4.jsp?id=<%="MA"%>">MA</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav4.jsp?id=<%="BA"%>">BA</a></li>     
                        </ul>
                        
                        
                                 
                    </li>
                </ul>
            </div>
            
            <li class="nav-item dropdown active navbar-nav">
                <a class="nav-link" href="Principlelogout" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">logout</a>
          
                   
                </ul>
            </li>
        </div>
</c:if>

<c:if test="${not empty hodobj }">
<div class="container col-10">
            <a class="navbar-brand text-white" href="Principlelogin.jsp">Hod </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                <%  hod d=(hod)session.getAttribute("hodobj"); 
                
                %>
                     <li class="">
                        <a class="nav-link" href="view_teacher.jsp?id=<%=d.getDepartment() %>" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">teaching staff
                        </a>
                         <li class="dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">fROM
                        </a>
                          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="viewcasualleav.jsp?id=<%=d.getDepartment() %>">CL</a></li>
                            <li><a class="dropdown-item" href="#">DL</a></li>
                            <li><a class="dropdown-item" href="#">CL NON-teaching</a></li>
                        </ul>
                    </li>
								     
                </ul>
            </div>
            
            <li class="nav-item dropdown active navbar-nav">
                <a class="nav-link" href="hodlogout" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">logout</a>
          
                   
                </ul>
            </li>

        </div>

</c:if>

<c:if test="${not empty teacherobj }">
<div class="container col-10">
            <a class="navbar-brand text-white" href="#">${teacherobj.fullname}</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                     
                            <li><a class="dropdown-item" href="form_casual_leave_ts.jsp?id="${teacherobj.tid}">casual leave</a></li>
                            <li><a class="dropdown-item" href="#">dl</a></li>
                               
                </ul>
                
                <ul class="navbar-nav">
                     
                            <li><a class="dropdown-item" href="viewcasualleavteacher.jsp?id="${teacherobj.tid}">view casual leave</a></li>
                            <li><a class="dropdown-item" href="#">dl</a></li>
                               
                </ul>
            </div>
            
            <li class="nav-item dropdown active navbar-nav">
                <a class="nav-link " href="teacherlogout" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">logout</a>
          
                   
                </ul>
            </li>

        </div>

</c:if>


<c:if test="${not empty mamobj }">
 <div class="container col-10">
            <a class="navbar-brand text-white" href="Principlelogin.jsp">Tupe Mam </a>
          
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="">
                        <a class="nav-link " href="view_hod2.jsp" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">HOD
                        </a>                    
                    </li>
                    <li class="">
                        <a class="nav-link " href="view_Faculty_Incharge2.jsp" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">Faculty Incharge
                        </a>
                    
                    </li>

                      <li class="dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">teaching staff
                        </a>
                          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="view_teacher2.jsp?id=<%="Bsc" %>">Bsc</a></li>
                            <li><a class="dropdown-item" href="view_teacher2.jsp?id=<%="Msc Chemistry"%>">Msc Chemistry</a></li>
                            <li><a class="dropdown-item" href="view_teacher2.jsp?id=<%="Msc Botany"%>">Msc Botany</a></li>
                            <li><a class="dropdown-item" href="view_teacher2.jsp?id=<%="Msc Computer Science"%>">Msc Computer Science</a></li>
                            <li><a class="dropdown-item" href="view_teacher2.jsp?id=<%="Bsc Computer Science"%>">Bsc Computer Science</a></li>
                            <li><a class="dropdown-item" href="view_teacher2.jsp?id=<%="BCom"%>">BCom</a></li>
                            <li><a class="dropdown-item" href="view_teacher2.jsp?id=<%="MA"%>">MA</a></li>
                            <li><a class="dropdown-item" href="view_teacher2.jsp?id=<%="BA"%>">BA</a></li>     
                        </ul>
                        
                        
                                 
                    </li>
                    <li class="">
                        <a class="nav-link" href="#" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">Non-teaching staff
                        </a>                        
                    </li>
                    
                      <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">new reg
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="add_teaching_staff.jsp">add_teaching staff</a></li>
                            <li><a class="dropdown-item" href="">add_non-teaching staff</a></li>
                            <li><a class="dropdown-item" href="add_hod.jsp">add_hod</a></li>
                            <li><a class="dropdown-item" href="add_Faculty_Incharge.jsp">add_Faculty Incharge</a></li>   
                        </ul>
                    </li>
                    
                           <li class="dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">casual leave
                        </a>
                          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="viewcasualleav3.jsp?id=<%="Bsc" %>">Bsc</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav3.jsp?id<%="Msc Chemistry"%>">Msc Chemistry</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav3.jsp?id=<%="Msc Botany"%>">Msc Botany</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav3.jsp?id=<%="Msc Computer Science"%>">Msc Computer Science</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav3.jsp?id=<%="Bsc Computer Science"%>">Bsc Computer Science</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav3.jsp?id=<%="BCom"%>">BCom</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav3.jsp?id=<%="MA"%>">MA</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav3.jsp?id=<%="BA"%>">BA</a></li>     
                        </ul>
                        
                        
                                 
                    </li>
                    
                    
                    
                    
                    
                    
                    
                    
                </ul>
            </div>
            
            <li class="nav-item dropdown active navbar-nav">
                <a class="nav-link" href="tupemamlogout" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">logout</a>
          
                   
                </ul>
            </li>
        </div>
</c:if>

<c:if test="${not empty VICEPRINCIPLE }">
 <div class="container col-10">
            <a class="navbar-brand text-white" href="Principlelogin.jsp">${ VICEPRINCIPLE.username}</a>
          
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="">
                        <a class="nav-link " href="view_hod.jsp" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">HOD
                        </a>                    
                    </li>
                    <li class="">
                        <a class="nav-link " href="view_Faculty_Incharge.jsp" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">Faculty Incharge
                        </a>
                    
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">teaching staff
                        </a>
                          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="view_teacher.jsp?id=<%="Bsc" %>">Bsc</a></li>
                            <li><a class="dropdown-item" href="view_teacher.jsp?id=<%="Msc  Chemistry"%>">Msc Chemistry</a></li>
                            <li><a class="dropdown-item" href="view_teacher.jsp?id=<%="Msc Botany"%>">Msc Botany</a></li>
                            <li><a class="dropdown-item" href="view_teacher.jsp?id=<%="Msc Computer Science"%>">Msc Computer Science</a></li>
                            <li><a class="dropdown-item" href="view_teacher.jsp?id=<%="Bsc Computer Science"%>">Bsc Computer Science</a></li>
                            <li><a class="dropdown-item" href="view_teacher.jsp?id=<%="BCom"%>">BCom</a></li>
                            <li><a class="dropdown-item" href="view_teacher.jsp?id=<%="MA"%>">MA</a></li>
                            <li><a class="dropdown-item" href="view_teacher.jsp?id=<%="BA"%>">BA</a></li>     
                        </ul>
                        
                        
                                 
                    </li>
                    <li class="">
                        <a class="nav-link" href="#" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">Non-teaching staff
                        </a>                        
                    </li>
                          <li class="dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">casual leave
                        </a>
                          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="viewcasualleav4.jsp?id=<%="Bsc" %>">Bsc</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav4.jsp?id<%="Msc Chemistry"%>">Msc Chemistry</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav4.jsp?id=<%="Msc Botany"%>">Msc Botany</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav4.jsp?id=<%="Msc Computer Science"%>">Msc Computer Science</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav4.jsp?id=<%="Bsc Computer Science"%>">Bsc Computer Science</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav4.jsp?id=<%="BCom"%>">BCom</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav4.jsp?id=<%="MA"%>">MA</a></li>
                            <li><a class="dropdown-item" href="viewcasualleav4.jsp?id=<%="BA"%>">BA</a></li>     
                        </ul>
                                                        
                    </li>
                </ul>
            </div>
            
            <li class="nav-item dropdown active navbar-nav">
                <a class="nav-link " href="viceprinciplelogout" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">logout</a>
          
                   
                </ul>
            </li>
        </div>
</c:if>

<c:if test="${not empty facultyincharge }">
 <div class="container col-10">
            <a class="navbar-brand text-white" href="">${ facultyincharge.username}</a>
          
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="">
                        <a class="nav-link " href="view_hod.jsp" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">HOD
                        </a>                    
                    </li>
        <% 
        faculty_incharge d=(faculty_incharge)session.getAttribute("facultyincharge"); 
                
           %>

                    <li class="nav-item dropdown">
                        <a class="nav-link " href="view_teacher.jsp?id=<%=d.getDepartment() %>" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">teaching staff
                        </a>
                        
                        
                                 
                    </li>
                    <li class="">
                        <a class="nav-link" href="#" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">Non-teaching staff
                        </a>                        
                    </li>
                         <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">cl/dl form
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="viewcasualleav2.jsp?id=<%=d.getDepartment() %>">casual leav</a></li>
                            <li><a class="dropdown-item" href="#">cl/dl</a></li>
                            <li><a class="dropdown-item" href="#">cl/dl</a></li>   
                        </ul>
                    </li>
                </ul>
            </div>
            
            <li class="nav-item dropdown active navbar-nav">
                <a class="nav-link " href="faculitylogout" id="navbarDropdown" role="button" data-bs-toggle="" aria-expanded="false">logout</a>
          
                   
                </ul>
            </li>
        </div>
</c:if>














        <div class="container-fluid">
            <div class="row">
                <img src="assets/img/MG.jpeg" class="float-right" style="margin-left: 10px; width:100px; height: 70px;; border-radius:50%">
            </div>
        </div>

    </nav>
</body>
</html>