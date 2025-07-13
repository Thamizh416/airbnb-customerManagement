<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="green">
	<h2>Listing All Customers</h2>
	<hr color="red">
	
	<table border="2">
	<tr>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Email</th>
	<th>Mobile</th>
	<th>Delete</th>
	<th>Update</th>
	<tr>
	<c:forEach var="alldata" items="${alldata}">
	</tr>
	  <td>${alldata.fname}</td>
	  <td>${alldata.lname}</td>
	  <td>${alldata.email}</td>
	  <td>${alldata.mobile}</td>
	  <td><a href="delete?id=${alldata.id}">Delete</a></td>
	  <td><a href="update?id=${alldata.id}">Update</a></td>
	</tr>
	</c:forEach>
	
	</table>
</body>
</html>