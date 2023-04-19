<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulaire de produit</title>
</head>
<body>
	<h1>Formulaire de Produit</h1>
	<form method="POST" action="ProduitServlet">
		<label>Libelle:</label>
		<input type="text" name="libelle" placeholder="Saisir le libelle"/> <br>
		<label>Prix Unitaire:</label>
		<input type="number" name="prixU" placeholder="Saisir votre prix unitaire"/> <br>
		<label>Description:</label>
		<textarea rows="5" cols="25" name="description" placeholder="Decrire le produit"></textarea> <br>
		<label>Date de Fabrication:</label>
		<input type="date" name="dateFab" /> <br>
		<label>Date d'expiration:</label>
		<input type="date" name="dateExp" /> <br>
		<input type="submit" value="Enregistrer"/>
	</form>
</body>
</html>