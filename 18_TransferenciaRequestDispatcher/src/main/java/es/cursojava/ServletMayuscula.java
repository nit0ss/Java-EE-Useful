package es.cursojava;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletMayuscula
 */
@WebServlet("/ServletMayuscula")
public class ServletMayuscula extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//En este servlet vamos a convertir el valor de userName a mayúsculas
		//y no vamos a generar contenido para visualizar en una página web
		
		String nombre = request.getParameter("userName");
		request.setAttribute("userName", nombre.toUpperCase() );
			
		RequestDispatcher dispatcher =  request.getRequestDispatcher("/ServletFinal");
		
		dispatcher.forward(request, response);
		
		
		
	}

}
