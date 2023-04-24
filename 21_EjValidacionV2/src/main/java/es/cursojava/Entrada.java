package es.cursojava;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Entrada
 */
@WebServlet("/Entrada")
public class Entrada extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		Date fecha = (Date) request.getAttribute("fecha");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html> <head>");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("<title>Entrada</title>");
		out.println("</head> <body>");
		out.println("<h2>Bienvenid@ " + usuario + " a mi página</h2>");
		out.println("<h2>Has entrado el " + fecha + "</h2>");	
		
		out.println("</body></html>");
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}
