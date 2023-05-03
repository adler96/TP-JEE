<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tous les Utilisateurs</title>
</head>
<body>
	<nav>
		<ul>
			<li>Accueil</li>
		</ul>
	</nav>
	<h1>Liste des utilisateurs</h1>
	<table>
		<thead>
			<tr>
				<td>id</td>
				<td>prenom</td>
				<td>nom</td>
				<td>login</td>
				<td>actions</td>
			</tr>	
		</thead>
		<tbody>
			<% for(int i=0; i<3; i++) { %>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>