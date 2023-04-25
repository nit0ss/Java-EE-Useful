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


@WebServlet("/ServletAnadir")
public class ServletAnadir extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletAnadir() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = getServletContext();

		
		Listado listado = (Listado)context.getAttribute("listado");
		
		String nombre = request.getParameter("nombreMod");
		String seccion = request.getParameter("sectionMod");
		int stock = Integer.parseInt(request.getParameter("stockMod"));
		
		listado.addProducto(new Producto(nombre, seccion,stock));
		
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html> <head>");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("<title>ANYADIR PRODUCTO</title>");
		out.println("</head> <body>");
		out.println("<p>Producto anyadido!</p>");
		out.println("<a href=index.html>Volver</a>");
		out.println("</body></html>");
	
		context.setAttribute("listado",listado);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
