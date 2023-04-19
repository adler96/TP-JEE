<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulaire Utilisateur</title>
</head>
<body>
	<h1>Formulaire d'Utilisateur</h1>
	<form action="UserServlet" method="POST">
		<label>Prenom:</label>
		<input type="text" name="prenom" placeholder="Saisir votre prenom"/> <br>
		<label>Nom:</label>
		<input type="text" name="nom" placeholder="Saisir votre nom"/> <br>
		<label>Login:</label>
		<input type="text" name="login" placeholder="Saisir votre login"/> <br>
		<label>Password:</label>
		<input type="password" name="password" placeholder="taper le mot de passe"/> <br>
		<input type="submit" value="Enregistrer"/>
	</form>
</body>
</html>