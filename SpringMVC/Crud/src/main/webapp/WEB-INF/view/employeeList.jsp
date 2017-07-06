<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ALL EMPLOYEE</title>
</head>
<body>
	<h2>LIST EMPLOYEE</h2>

	<spring:url value="/add" var="emp_add" />
	<a href="${emp_add}"> ADD MORE EMPLOYEE</a>
	<c:if test="${!empty employee}">
		<table align="left" border="1">
			<tr>
				<th>Employee ID</th>
			<tr>
				<th>Employee Name</th>
			<tr>
				<th>Employee Age</th>
			<tr>
				<th>Employee Salary</th>
			<tr>
				<th>Employee Address</th>
			</tr>
			<c:forEach items="${employee}" var="employee">
				<tr>
					<td><c:out value="${employee.id}" /></td>
					<td><c:out value="${employee.name}" /></td>
					<td><c:out value="${employee.age}" /></td>
					<td><c:out value="${employee.salary}" /></td>
					<td><c:out value="${employee.address}" /></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>


</body>
</html>