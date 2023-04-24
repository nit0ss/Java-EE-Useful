<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="es.cursojava.service.ServiceCursos"%>
<%@ page import="es.cursojava.model.Curso"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Cursos</title>
</head>
<body>
	<%
	ServiceCursos sc = new ServiceCursos();

	List<Curso> listaCursos = sc.buscarTodos();

	for (Curso c : listaCursos) {
	%><p> Nombre del curso: <%=c.getNombre() %> - Nivel: <%=c.getNivel()%> <br>
	<% } %>
	
</body>
</html>