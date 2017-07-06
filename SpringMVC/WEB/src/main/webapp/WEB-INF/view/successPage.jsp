<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel ="stylesheet" href="/WEB/resources/bootstrap/css/bootstrap.min.css" ></link>
<link rel ="stylesheet" href="/WEB/resources/bootstrap/css/bootstrap-theme.min.css" ></link>

<script type="text/javascript" src="/WEB/resources/js/jquery1.12.js"></script>
<script src="/WEB/resources/bootstrap/js/bootstrap.min.js"></script>

<title>Success</title>
</head>
<body>
 <div class="form-horizontal">
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">STUDENT ID</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" readonly="readonly" style="width: 35%; " value="<c:out value="${Page_1_data.id}"/>">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Student Name</label>
    <div class="col-sm-10">
      <input type="text" class ="form-control" value="${fn:escapeXml(Page_1_data.name) }"  readonly="readonly" style="width: 35%; ">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Student Fee</label>
    <div class="col-sm-10">
      <input type="text" class ="form-control" value="${Page_1_data.fee }"  readonly="readonly" style="width: 35%; ">
    </div>
  </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Student Age</label>
    <div class="col-sm-10">
      <input type="text" class ="form-control" value="${fn:escapeXml(Page_1_data.age) }"  readonly="readonly" style="width: 35%; ">
    </div>
    </div>
    <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Student Email</label>
    <div class="col-sm-10">
      <input type="text" class ="form-control" value="${fn:escapeXml(Page_1_data.email) }"  readonly="readonly" style="width: 35%; ">
    </div>
    </div>
    
    <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Student Branch</label>
    <div class="col-sm-10">
      <input type="text" class ="form-control" value="${fn:escapeXml(Student.branch) }"  readonly="readonly" style="width: 35%; ">
    </div>
    </div>
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Student Sex</label>
    <div class="col-sm-10">
      <input type="text" class ="form-control" value="${fn:escapeXml(Student.sex) }"  readonly="readonly" style="width: 35%; ">
    </div>
    </div>
    <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Student Percent</label>
    <div class="col-sm-10">
      <input type="text" class ="form-control" value="${fn:escapeXml(Student.percent) }"  readonly="readonly" style="width: 35%; ">
    </div>
    </div>
    
    <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">Student Grade</label>
    <div class="col-sm-10">
      <input type="text" class ="form-control" value="${fn:escapeXml(Student.grade) }"  readonly="readonly" style="width: 35%; ">
    </div>
  
  </div>
</div>
    

</body>
</html>