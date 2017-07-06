<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SPRING CRUD</title>
</head>
<body>
<h2>SPRING CRUD OPERATION DEMO WITH ANNOTATION</h2>
<spring:url value="/employee" var="emp_list" />
<a href="${emp_list}"> LIST OF EMPLOYEE</a>

<spring:url value="/add" var ="emp_add" />
<a href="${emp_add}"> ADD EMPLOYEE</a>

</body>
</html>