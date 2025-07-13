<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Customer</title>
</head>
<body bgcolor="green">
<h2>New Customer</h2>
	<hr color="black">
	<form action="savecust" method="post">
	<pre>
		First Name    :<input type="text" name="fname"/>
		
		Last Name     :<input type="text" name="lname"/>
		
		Email         :<input type="text" name="email"/>
		
		Mobile Number :<input type="text" name="mobile"/>
		
					  <input type="submit" value="Save Customer!"> 
					  
					   
	</pre>
	</form>
	<form action="/listallcust" method="get">
        <button type="submit">View All Customers</button>
    </form>
</body>
</html>