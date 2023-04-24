<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Entrada JSP</title>
</head>
<body>

	<%
	String usuario = request.getParameter("usuario");
	Date fechaActual = (Date) request.getAttribute("fecha");
	%>

<h1>Bienvenido <%=usuario%>!</h1>

</body>
</html>