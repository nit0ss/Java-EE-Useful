package es.cursojava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletFinal
 */
@WebServlet("/ServletFinal")
public class ServletFinal extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		
		out.println("<!DOCTYPE html>");
		out.println("<html> <head>");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("Served at: "+ request.getContextPath() + "<br>" +  request.getParameter("userName")  + "<br>");
		out.println("Valor cambiado: " + request.getAttribute("userName"));
		out.println("</head> <body>");
		
		out.println("</body></html>");
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
