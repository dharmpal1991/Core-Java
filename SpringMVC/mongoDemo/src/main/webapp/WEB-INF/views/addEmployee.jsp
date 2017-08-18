<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC Form Handling</title>
</head>
<body>
	<h2>Add Employee Data</h2>
	<form:form method="POST" action="save">
		<table>
			 <tr>
				<td>Employee id :</td>
				<td><form:input path="id" /></td>
			</tr> 
			<tr>
				<td>Employee Name :</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Employee Age :</td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td>Employee Salary :</td>
				<td><form:input path="salary" /></td>
			</tr>
			<tr>
				<td>Employee Address :</td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>

	<c:if test="${not empty employees}">
		<h2>List Employees</h2>
		<table align="left" border="1">
			<tr>
				<th>Employee ID</th>
				<th>Employee Name</th>
				<th>Employee Age</th>
				<th>Employee Salary</th>
				<th>Employee Address</th>
				<th>Actions on Row</th>
			</tr>

			<c:forEach items="${employees}" var="employee">
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