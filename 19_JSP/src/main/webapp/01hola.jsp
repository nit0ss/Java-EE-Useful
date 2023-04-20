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
	String texto = "Ejemplo uso variable";
	%>



	<br>Este texto esta despues del scriptlet
	<br>
	<%=texto%>

	<%
	for (int i = 0; i < 11; i++) {
		out.println(i + "<br>");
	}
	%>

	<h2>Ahora más fácil</h2>
	<%
	String colores[] = new String[] { "red", "blue", "green", "yellow", "black", "purple", "pink", "red", "blue", "green" };

	for (int i = 1; i <= 10; i++) {
	%>
	<h<%=i%>>
	<p style="color: <%=colores[i - 1]%>;"><%=i + " Bienvenido a mi sitio web"%></p>
	</h>
	<%}%>


</body>
</html>