<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome - Sign In - to access</title>
</head>
<body bgcolor=" #ffb3ff">


	<form action="signInCtrl" method="post">
		Enter User Name:<input type="text" name="username" required>
		Enter Password:<input type="password" name="password" required>
		<input type="submit" value="Log In">
	</form>
</body>
</html>