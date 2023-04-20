package es.cursojava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLectura
 */
@WebServlet("/ServletLectura")
public class ServletLectura extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	ServletContext contexto = getServletContext()	;
	String nombre = (String) contexto.getAttribute("nombre");
	
	PrintWriter out = response.getWriter();
	out.println("El nombre es " + nombre );
	}

	

}
