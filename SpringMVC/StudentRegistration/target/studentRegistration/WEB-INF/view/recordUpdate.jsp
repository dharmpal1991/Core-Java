<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel ="stylesheet" href="/StudentRegistration/resources/bootstrap/css/bootstrap.min.css" ></link>

<link rel ="stylesheet" href="/StudentRegistration/resources/bootstrap/css/bootstrap-theme.min.css" ></link>

<script type="text/javascript" src="/StudentRegistration/resources/js/jquery-1.12.1.min.js"></script>
<script src="/StudentRegistration/resources/bootstrap/js/bootstrap.min.js"></script>

<script src = "/StudentRegistration/resources/js/customjs/studentUpdation.js"></script>

<title>Updation</title>

 <style type="text/css">
h4{
color:#39ff33;}
</style>
</head>
<body>
 <c:forEach items="${studentRegistration}" var="student">
<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
    
      <!-- Modal content-->
      <div class="modal-content" style="margin:120px;">
        <div class="modal-header">
       
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <center><h4 class="modal-title">Edit Student Record</h4></center>
        </div>
        
        
         <div class="modal-body"> 
				<form>
				<div class="form-group">
						<label for="recipient-name" class="form-control-label" >id:</label>
						<input type="text" class="form-control" id="id" value="<c:out value="${student.id}" />"  style = width:100%; name="firstname">
					</div>
					<div class="form-group">
						<label for="recipient-name" class="form-control-label" >firstName:</label>
						<input type="text" class="form-control" id="first_name" value="<c:out value="${student.firstName}" />" style = width:100%; name="firstname">
					</div>
					<div class="form-group">
						<label for="message-text" class="form-control-label">lastName:</label>
						<input type="text" class="form-control" id="last_name" value="<c:out value="${student.lastName}" />" style = width:100%;
							name="lastname" />
					</div>
					<div class="form-group">
						<label for="message-text" class="form-control-label">fullName:</label>
						<input type="text" class="form-control" id="full_name" value="<c:out value="${student.fullName}" />" style = width:100%;
							name="fullname" />
					</div>
					<div class="form-group">
						<label for="message-text" class="form-control-label">email:</label>
						<input type="text" class="form-control" id="email" value="<c:out value="${student.studentAddress.email}" />" style = width:100%; name="email" />
					</div>
						<div class="form-group">
						<label for="message-text" class="form-control-label">gender:</label>
						<select class="form-control" id="gender" value="<c:out value="${student.studentAddress.gender}" />" style = width:100%;>
							<option value="">Select</option>
							<option value="Male">Male</option>
							<option value="Female">Female</option>
						</select>
					</div>
					<div class="form-group">
						<label for="message-text" class="form-control-label">country:</label>
						<select class="form-control" id="country" value="<c:out value="${student.studentAddress.country}" />" style = width:100%;>
							<option value="">Select</option>
							<option value="India">India</option>
							<option value="UK">UK</option>
							<option value="USA">USA</option>
							<option value="CHINA">CHINA</option>
						</select>
					</div>
					<div class="form-group">
						<label for="message-text" class="form-control-label">state:</label>
						<select class="form-control" id="state"  value="<c:out value="${student.studentAddress.state}" />" style = width:100%;>
							<option value="">Select</option>
							<option value="Punjab">Punjab</option>
							<option value="Goa">Goa</option>
							<option value="Delhi">Delhi</option>
							<option value="Maharastra">Maharastra</option>
						</select>
					</div>
						<div class="form-group">
						<label for="message-text" class="form-control-label">city:</label>
						<select class="form-control" id="city" value="<c:out value="${student.studentAddress.city}" />" style = width:100%;>
							<option value="">Select</option>
							<option value="Fazilka">Fazilka</option>
							<option value="Muktsar">Muktsar</option>
							<option value="Hisar">Hisar</option>
							<option value="Puna">Puna</option>
						</select>
					</div>
					<div class="form-group">
						<label for="message-text" class="form-control-label">address:</label>
						<input type="text" class="form-control" value="<c:out value="${student.studentAddress.address}" />" id="address" style = width:100%;
							name="address" />
					</div>
					<div class="form-group">
						<label for="message-text" class="form-control-label">zipcode:</label>
						<input type="text" class="form-control" id="zip_code" value="<c:out value="${student.studentAddress.zipcode}" />" style = width:100%;
							name="zipcode" />
					</div>
					<div class="form-group">
						<label for="message-text" class="form-control-label">contactno:</label>
						<input type="text" class="form-control" id="contact_no" value="<c:out value="${student.studentAddress.contactno}" />" style = width:100%;
							name="contactno" />
					</div>
					
				</form>
			
				<div class="modal-footer ">
					<button type="button" class="btn btn-success" id ="submit" onclick="STUDENTUPDATION.updateFunction();">Update</button>
					<button type="button" class="btn btn-danger" data-dismiss="modal">Cancel</button>
				</div>  
			</div>
			
			
			<!-- /.modal-content -->
		</div>
	
		<!-- /.modal-dialog -->
	</div>
	
</div>
</c:forEach>
</body>
</html>