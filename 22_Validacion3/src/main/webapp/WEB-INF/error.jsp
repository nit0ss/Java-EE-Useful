<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error JSP</title>
</head>
<body>

	<%
	String usuario = request.getParameter("usuario");
	String pwd = request.getParameter("password");
	%>

<h1>La combinacion <%=usuario%> y <%=pwd %>!</h1>

</body>
</html>