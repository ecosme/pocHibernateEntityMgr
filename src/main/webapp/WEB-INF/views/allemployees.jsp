<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hw Enrollments</title>
	<style>tr:first-child{font-weight:bold;background-color:#C6C9C4;}</style>
</head>
<body>
	<h2>Employees</h2>
	<table>
		<tr>
			<td>Name</td><td>SSN</td><td></td>
		</tr>
		<c:forEach items="${ employees }" var="employee">
			<tr>
				<td>${employee.fname },  ${employee.lname }</td>
				<td><a href="<c:url value='edit-${employee.ssn }-employee'/>">${employee.ssn }</a></td>
				<td><a href="<c:url value='delete-${employee.ssn }-employee'/>">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/new' />">Add new Employee</a>
</body>
</html>