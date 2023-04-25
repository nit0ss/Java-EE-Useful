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
import Modelos.Producto;


@WebServlet("/ServletBuscar")
public class ServletBuscar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		Listado listado = (Listado)context.getAttribute("listado");
		String aBuscar = request.getParameter("productoABuscar");
		Producto E = listado.buscarProducto(aBuscar);
		
		
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html> <head>");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("<title>BUSCAR PRODUCTO</title>");
		out.println("</head> <body>");
		out.println("<h1>Caracteristicas de producto</h1>");
		
		
		out.println("<p>Nombre: <b>"+ E.getNombre() +"</b></p>");
		out.println("<p>Seccion: <b>"+ E.getSeccion() +"</b></p>");
		out.println("<p>Stock:  <b>"+ E.getStock() +"</b></p>");
		
		
		out.println("<a href=index.html>Volver</a>");
		out.println("</body></html>");
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
