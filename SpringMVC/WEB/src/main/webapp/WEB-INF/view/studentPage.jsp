<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel ="stylesheet" href="/WEB/resources/bootstrap/css/bootstrap.min.css" ></link>
<link rel ="stylesheet" href="/WEB/resources/bootstrap/css/bootstrap-theme.min.css" ></link>
<script type="text/javascript" src="/WEB/resources/js/jquery1.12.js"></script>
<script src="/WEB/resources/bootstrap/js/bootstrap.min.js"></script>



<title>Student Form</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student course</title>
<script>
$(document).ready(function(){

   $("#form_submit").submit(function(e){
	   var studentBranch = $("#stu_branch").val();
		var studentSex = $('#stu_sex').val();
		var studentPercent = $('#stu_percent').val();
		var studentGrade = $('#stu_grade').val();
		var flag = true;
		
		if(studentBranch == ''){
			$("#stu_branch").css({
								"outline-width":"thin",
		    					"outline-style": "solid",
		    					"outline-color": "red"
							});
			flag = false;
		}else{
			$("#stu_branch").css({'outline':'none'});
		}
		if(studentSex == ''){
		$("#stu_sex").css({
								"outline-width":"thin",
		    					"outline-style": "solid",
		    					"outline-color": "red"
							});
			flag = false;
		}else{
			$("#stu_sex").css({'outline': 'none'});
		}
		if(studentPercent == ''){
		$("#stu_percent").css({
								"outline-width":"thin",
		    					"outline-style": "solid",
		    					"outline-color": "red"
							});
			flag = false;
		}else{
			$("#stu_percent").css('outline', 'none');
		}
		if(studentGrade == ''){
			$("#stu_grade").css({
									"outline-width":"thin",
			    					"outline-style": "solid",
			    					"outline-color": "red"
								});
				flag = false;
			}else{
				$("#stu_grade").css({'outline': 'none'});
			}
		 if(flag){
		 }
		 return flag;
	}); 
	
    $("#stu_branch,#stu_sex,#stu_grade").keypress(function (e){
        var code =e.keyCode || e.which;
        if((code<65 || code>90)&&(code<97 || code>122)&&code!=32&&code!=46){
          return false;
        }
    });

    $("#stu_percent").keypress(function (e){
        var code =e.keyCode || e.which;
        if(e.which != 8 && e.which !=0 &&(e.which<48 || e.which>57 ) ){
          return false;
        }
    });	 
});

</script>

</head>
<body>
<c:url value="/studentPage" var="stu_course" />
	<form:form action="${stu_course}" method="POST" id ="form_submit" modelAttribute="Student">
		<div class="form-group">
  		  	<label for="branch">Student Branch</label>
    		<form:input path="branch" id="stu_branch" class="form-control" style="width: 24%;" />
    		<div class="alert danger" style="display:none"></div>
  		</div>
  <div class="form-group">
    <label for="sex">Student Sex</label>
    	<form:input path="sex" id="stu_sex" class="form-control" style="width: 24%;" />
  </div>
	
  <div class="form-group">
    <label for="percent">Student Percent</label>
    	<form:input path="percent" id = "stu_percent" class="form-control" style="width: 24%;" />
  </div>
  <div class="form-group">
    <label for="grade">Student Grade</label>
    	<form:input path="grade" id = "stu_grade" class="form-control" style="width: 24%;" />
  </div>
		<form:button type="submit" id = "btn" class="btn btn-primary"> SUBMIT</form:button>
    
	

	</form:form>
</body>
</html>
