<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel ="stylesheet" href="/StudentRegistration/resources/bootstrap/css/bootstrap.min.css" ></link>
<link rel ="stylesheet" href="/StudentRegistration/resources/bootstrap/css/bootstrap-theme.min.css" ></link>
<script type="text/javascript" src="/StudentRegistration/resources/js/jquery-1.12.1.min.js"></script>
<script src="/StudentRegistration/resources/bootstrap/js/bootstrap.min.js"></script>
</head>
<style>
body{
    background-color:  #d9d9d9;
}

</style>
<body >
 <div class="col-md-4 col-md-offset-4"> 
  <div class="form-container off-canvas">
  

    <form role="form" class="form-signin">
      <h2>Please sign in...</h2>
      <div class="form-group">
        <label for="EmailAddress"><span>*</span> Email Address</label>
        <input type="email" class="form-control" name="EmailAddress" id="Email_Address" aria-required="true" style="width:400px" aria-invalid="true" required>
      </div>
	
      <div class="form-group">
        <label for="EmailAddress"><span>*</span> Password</label>
        
        <input type="password" class="form-control" name="password" id="password" aria-required="true"  style="width:400px" aria-invalid="true" required>
      </div>

      <div class="checkbox">
        <label>
          <input type="checkbox" value="remember-me"> Remember me
        </label>
      </div>

      <button class="btn btn-lg btn-primary btn-block"  style="width:400px" id="submit_id">Sign in</button>
      <a href="/StudentRegistration/studentReg"> Create New Account</a>
    </form>
  </div> <!-- /container -->
</div>
</body>
</html>