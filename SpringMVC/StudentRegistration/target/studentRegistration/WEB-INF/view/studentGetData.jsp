<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="/StudentRegistration/resources/bootstrap/css/bootstrap.min.css"></link>
<link rel="stylesheet" href="/StudentRegistration/resources/bootstrap/css/bootstrap-theme.min.css"></link>

<script type="text/javascript" src="/StudentRegistration/resources/js/jquery-1.12.1.min.js"></script>
<script src="/StudentRegistration/resources/bootstrap/js/bootstrap.min.js"></script>

<jsp:include page="/WEB-INF/view/recordUpdate.jsp"/>
 <!-- <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
 <script src="http://getbootstrap.com/dist/js/bootstrap.min.js"></script> -->
 

 
</head>
<body class=".container-fluid">

<div class="panel panel-success">
        <div class="panel-heading">
            <h3 class="panel-title">
                <div align="left"><b>Student List</b> </div>
                <div align="right"><a href="/StudentRegistration/studentReg">Add New Employee</a></div>
            </h3>
        </div>
        <div class="panel-body">
            <c:if test="${empty studentRegistration}">
                There are no Student
            </c:if>
            <c:if test="${not empty studentRegistration}">   
            
            	<!-- <form action="searchStudent">
            		<div class="row">
					  <div class="col-md-4">Search Employees: <input type='text' name='searchName' id='searchName'/> </div>
					  <div class="col-md-4"><input class="btn btn-success" type='submit' value='Search'/></div>
					</div>
            	</form>  -->        	
            	            	
                <table class="table table-hover table-bordered">
                    <thead style="background-color: #bce8f1;">
                    <tr>
                        <th>id</th>
						<th>FirstName</th>
						<th>LastName</th>
						<th>Country</th>
						<th>City</th>
						<th>State</th>
						<th>Address</th>
						<th>ZipCode</th>
						<th>ContactNo</th>
						<th>Email</th>
						<th>Gender</th>
                        <th>Edit</th>
                        <th>Delete</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${studentRegistration}" var="student">
                        <tr>
                        	<th><c:out value="${student.id}"/></th>  
							<td>${student.firstName}</td>
							<td>${student.lastName}</td>
							<td>${student.studentAddress.address}</td>
							<td>${student.studentAddress.city}</td>
							<td>${student.studentAddress.state}</td>
							<td>${student.studentAddress.country}</td>
							<td>${student.studentAddress.zipcode}</td>
							<td>${student.studentAddress.contactno}</td>
							<td>${student.studentAddress.email}</td>
							<td>${student.studentAddress.gender}</td>                    
                         	<th><a href="" data-toggle="modal" data-target="#myModal">Edit</a></th>
                        	<th><a href="studentDelete/<c:out value='${student.id}'/>">Delete</a></th>                         	
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
 </div>

</body>
</html>