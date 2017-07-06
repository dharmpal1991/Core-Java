<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel ="stylesheet" href="/WEB/resources/bootstrap/css/bootstrap.min.css" ></link>

<link rel ="stylesheet" href="/WEB/resources/bootstrap/css/bootstrap-theme.min.css" ></link>

<script type="text/javascript" src="/WEB/resources/js/jquery-1.12.1.min.js"></script>
<script src="/WEB/resources/bootstrap/js/bootstrap.min.js"></script>

<script src = "/WEB/resources/js/customjs/userRegistration.js"></script>

<title>Student Form</title>
</head>
<script>
$(document).ready(function(){

   $("#form_login").submit(function(e){
	   var studentId = $("#stu_id").val();
		var studentName = $('#name_id').val();
		var studentFee = $('#stu_fee').val();
		var studentAge = $('#stu_age').val();
		var studentEmail = $('#stu_email').val();
		var flag = true;
		
		if(studentId == ''){
			$("#stu_id").css({
								"outline-width":"thin",
		    					"outline-style": "solid",
		    					"outline-color": "red"
							});
			flag = false;
		}else{
			$("#stu_id").css({'outline':'none'});
		}
		if(studentName == ''){
		$("#name_id").css({
								"outline-width":"thin",
		    					"outline-style": "solid",
		    					"outline-color": "red"
							});
			flag = false;
		}else{
			$("#name_id").css({'outline': 'none'});
		}
		if(studentFee == ''){
		$("#stu_fee").css({
								"outline-width":"thin",
		    					"outline-style": "solid",
		    					"outline-color": "red"
							});
			flag = false;
		}else{
			$("#stu_fee").css('outline', 'none');
		}
		if(studentAge == ''){
			$("#stu_age").css({
									"outline-width":"thin",
			    					"outline-style": "solid",
			    					"outline-color": "red"
								});
				flag = false;
			}else{
				$("#stu_age").css({'outline': 'none'});
			}
		if(studentEmail == ''){
			console.log("BLANK");
			 $("#stu_email").css({
									"outline-width":"thin",
			    					"outline-style": "solid",
			    					"outline-color": "red"
								});
				flag = false;
			}else{
				$("#stu_email").css({'outline': 'none'});
			}
		if(studentEmail != ''){
			console.log("NOT NULL");
			$('#stu_email').filter(function(){
	         	var emil=$('#stu_email').val();
	         	var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
	         	if( !emailReg.test( emil ) ) {
	         		$("#stu_email").css({
						"outline-width":"thin",
    					"outline-style": "solid",
    					"outline-color": "red"
					});
					flag = false;
	         	}
			});	
		 }else{
				$("#stu_email").css({'outline': 'none'});
		 }
		 if(flag){
		 }
		 return flag;
	}); 
	
    $("#name_id").keypress(function (e){
        var code =e.keyCode || e.which;
        if((code<65 || code>90)&&(code<97 || code>122)&&code!=32&&code!=46){
          return false;
        }
    });

    $("#stu_fee,#stu_age,#stu_id").keypress(function (e){
        var code =e.keyCode || e.which;
        if(e.which != 8 && e.which !=0 &&(e.which<48 || e.which>57 ) ){
        //  alert("Only Digits are allowed");
          return false;
        }
    });
   
});
    

</script>
<body>
	<spring:url value="/studentForm" var="stu_detail" />
	<form:form action="${stu_detail}" method="POST" id ="form_login" modelAttribute="Student">
		<div class="form-group">
  		  	<label for="id">Student Id</label>
    		<form:input path="id" id="stu_id" class="form-control" style="width: 24%;" />
    		<div class="alert danger" style="display:none"></div>
  		</div>
  <div class="form-group">
    <label for="name">Student Name</label>
    	<form:input path="name" id="name_id" class="form-control" style="width: 24%;" />
  </div>
	
  <div class="form-group">
    <label for="fee">Student Fee</label>
    	<form:input path="fee" id = "stu_fee" class="form-control" style="width: 24%;" />
  </div>
  <div class="form-group">
    <label for="age">Student Age</label>
    	<form:input path="age" id = "stu_age" class="form-control" style="width: 24%;" />
  </div>
  <div class="form-group">
    <label for="email">Student Email</label>
    	<form:input path="email" id = "stu_email" class="form-control" style="width: 24%;" />
  </div>
  
	<form:button type="submit" id = "btn" class="btn btn-primary"> SUBMIT</form:button> 
	</form:form>
	
 <a href="/WEB/getdata" class="btn btn-primary" role="button">Getting Data</a> 
 
	
 <div class="container"> 
  <!-- Trigger the modal with a button -->
  
  <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">GET FORM</button>

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">User Registration</h4>
        </div>
         <div class="modal-body">
	        <form>
	          <div class="form-group">
	            <label for="recipient-name" class="form-control-label">UserName :</label>
	            <input type="text" class="form-control" id="user_name" name="username" >
	          </div>
	          <div class="form-group">
	            <label for="message-text" class="form-control-label">Password:</label>
	            <input type="password" class="form-control" id="password" name="password"/>
	          </div>
	          <div class="form-group">
	            <label for="message-text" class="form-control-label">FirstName:</label>
	            <input type="text" class="form-control" id="first_name" name="firstname"/>
	          </div>
	          <div class="form-group">
	            <label for="message-text" class="form-control-label">LastName:</label>
	            <input type="text" class="form-control" id="last_name" name="lastname"/>
	          </div>
	          <div class="form-group">
	            <label for="message-text" class="form-control-label">Email:</label>
	            <input type="text" class="form-control" id="email_id" name="email"/>
	          </div>
	          <div class="form-group">
	            <label for="message-text" class="form-control-label">Country:</label>
	            <select class="form-control" id="country_id">
	              <option value="">Select</option>
				  <option value="India">India</option>
				  <option value="UK">UK</option>
				  <option value="USA">USA</option>
				  <option value="CHINA">CHINA</option>
				</select>
	          </div>
	          <div class="form-group">
	            <label for="message-text" class="form-control-label">Address:</label>
	            <textarea class="form-control" id="id_address" name="address"></textarea>
	          </div>
	        </form>
      	</div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
          <button type="button" class="btn btn-default"  id="submit_id" onclick="USER.submitFunction();">Submit Data</button>
        </div>
      </div>
      
    </div>
  </div>
  
</div>
		
</body>
</html>
