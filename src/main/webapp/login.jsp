<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page de Login</title>
</head>
<body>
	<h1>Formulaire de connexion</h1>
	
	<form action="LoginServlet" method="POST">
		<label>Login:</label>
		<input type='text' name='login' /> <br>
		<label>Password:</label>
		<input type='password' name='password' /> <br>
		<input type="submit" value="Se connecter" />
	</form>
</body>
</html>