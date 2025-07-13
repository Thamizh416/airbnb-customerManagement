<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Customer</title>
</head>
<body bgcolor="green" >
<h2>Update Customer</h2>
	<hr color="green">
	<form action="updatecust" method="post">
	<pre>
					  <input type="hidden" name="id" value= "${updateOneCust.id}"/>	
						
		First Name    :<input type="text" name="fname" value= "${updateOneCust.fname}"/>
		
		Last Name     :<input type="text" name="lname" value= "${updateOneCust.lname}"/>
		
		Email         :<input type="text" name="email" value= "${updateOneCust.email}"/>
		
		Mobile Number :<input type="text" name="mobile" value= "${updateOneCust.mobile}"/>
		
					  <input type="submit" value="Update Customer!"> 
					  
					        
	</pre>
	</form>
	
</body>
</html>