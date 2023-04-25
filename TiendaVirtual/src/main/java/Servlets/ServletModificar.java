package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelos.Listado;

@WebServlet("/ServletModificar")
public class ServletModificar extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = getServletContext();

		// Obtener la lista de productos del ámbito de aplicación
		Listado listado = (Listado)context.getAttribute("listado");
		
		String nombre = request.getParameter("nombreMod");
		String seccion = request.getParameter("sectionMod");
		int stock = Integer.parseInt(request.getParameter("stockMod"));
		
		listado.buscarProducto(nombre).modificar(nombre, seccion,stock);
		
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html> <head>");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("<title>MODIFICAR PRODUCTO</title>");
		out.println("</head> <body>");
		out.println("<p>Producto modificado!</p>");
		out.println("<a href=index.html>Volver</a>");
		out.println("</body></html>");
	
		context.setAttribute("listado",listado);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
