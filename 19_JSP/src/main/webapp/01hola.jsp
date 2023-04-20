<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Mi primer ejemplo con JSP (Java Server Pages)</h1>
<%

String saludo = "Hola desde el mundo JSP";
out.println(saludo);

%>
<br>Este texto esta despues del scriptlet
</body>
</html>