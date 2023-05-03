<%@page import="modeles.Utilisateur"
import="java.io.PrintWriter" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenue</title>
</head>
<body>
	<h1>Bienvenue, vous etes connecte</h1>
	
	<% Utilisateur u = (Utilisateur)session.getAttribute("utilisateur"); %>
	 <% PrintWriter pw = response.getWriter();
	 pw.print("<h2 style='text-align: right;' >"+u.getPrenom()+"</h2>");
	 pw.print("<a href=''>Deconnexion</a>");%>
	 
</body>
</html>