<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SPRING FORM HANDLING</title>
</head>
<body>
	<h2>ADD EMPLOYEE DATA</h2>

	<spring:url value="/save" var="emp_save" />
	<form:form action="${emp_save}" method="POST">
		<table>
			<tr>
				<td><form:label path="id">Employee Id</form:label></td>
				<td><form:input path="id" value="${employee.id}"
						readonly="true" /></td>
			</tr>
			<tr>
				<td><form:label path="name">Employee Name</form:label></td>
				<td><form:input path="name" value="${employee.name}" /></td>
			</tr>
			<tr>
				<td><form:label path="age">Employee Age</form:label></td>
				<td><form:input path="age" value="${employee.age}" /></td>
			</tr>
			<tr>
				<td><form:label path="salary">Employee Salary</form:label></td>
				<td><form:input path="salary" value="${employee.salary}" /></td>
			</tr>
			<tr>
				<td><form:label path="address">Employee Address</form:label></td>
				<td><form:input path="address" value="${employee.address}" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="SUBMIT" /></td>
			</tr>
		</table>
	</form:form>
	<c:if test="${!empty employee}">
		<h2>LIST EMPLOYEE</h2>
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
				<th>ACTION ON ROW</th>
			</tr>
			<c:forEach items="${employee}" var="employee">
				<tr>
					<td><c:out value="${employee.id}" /></td>
					<td><c:out value="${employee.name}" /></td>
					<td><c:out value="${employee.age}" /></td>
					<td><c:out value="${employee.salary}" /></td>
					<td><c:out value="${employee.address}" /></td>
					<td align="center"><a href="edit.html?id=${employee.id}">Edit</a>
						| <a href="delete.html?id=${employee.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>