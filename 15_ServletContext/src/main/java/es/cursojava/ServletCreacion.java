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
 * Servlet implementation class ServletCreacion
 */
@WebServlet("/ServletCreacion")
public class ServletCreacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext contexto = getServletContext();
		
		contexto.setAttribute("nombre", "pepito"); //variable de ambito de aplicacion
		
		PrintWriter out = response.getWriter();
		out.println("variable almacenada");
		
	}

	

}
