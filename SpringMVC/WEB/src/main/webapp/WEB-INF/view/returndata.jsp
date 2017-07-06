<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="/WEB/resources/bootstrap/css/bootstrap.min.css"></link>
<link rel="stylesheet" href="/WEB/resources/bootstrap/css/bootstrap-theme.min.css"></link>
<script type="text/javascript" src="/WEB/resources/js/jquery1.12.js"></script>
<script src="/WEB/resources/bootstrap/js/bootstrap.min.js"></script>
<script src = "/WEB/resources/js/customjs/userDeletion.js"></script>

<body>
	<h2>STUDENT REGISTRATION DATA</h2>
	<table class="table table-bordered">
		<tr>
			<th>User id</th>
			<th>User Name</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>User Address</th>
			<th>User Email</th>
			<th>User Country</th>
		</tr>

		<c:forEach items="${UserRegistration}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.username}</td>
				<td>${user.firstname}</td>
				<td>${user.lastname}</td>
				<td>${user.address}</td>
				<td>${user.email}</td>
				<td>${user.country}</td>
			</tr>
		</c:forEach>
	</table>
	<!-- <a href="/WEB/getdata" class="btn btn-primary" role="button">UpDate</a> 
	<a href="/WEB/getdata" class="btn btn-primary" role="button">Delete</a>  -->
	
	<div class="container"> 
  <!-- Trigger the modal with a button -->
  
  <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myDelete">Delete</button>
	
	 <!-- Modal -->
  <div class="modal fade" id="myDelete" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">User Deletion</h4>
        </div>
         <div class="modal-body">
	        <form>
	          <div class="form-group">
	            <label for="recipient-name" class="form-control-label">UserId :</label>
	            <input type="text" class="form-control" id="user_id" name="userdelete" >
	          </div>
	        </form>
      	</div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
          <button type="button" class="btn btn-default"  id="submit_name" onclick="USERDELETE.deleteFunction();">Submit</button>
        </div>
      </div>
      
    </div>
  </div>

</body>
</head>
</html>
