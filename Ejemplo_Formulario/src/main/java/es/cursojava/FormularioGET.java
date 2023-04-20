package es.cursojava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormularioGET
 */
@WebServlet("/FormularioGET")
public class FormularioGET extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html> <head>");
		out.println("<meta charset=\"ISO-8859-1\">");
		
		if(request.getParameter("pilates")!= null) {
			out.println("Has marcado " + request.getParameter("pilates") + "<br>");
		}
		if(request.getParameter("yoga")!= null) {
			out.println("Has marcado " + request.getParameter("yoga")+ "<br>");
		}
		if(request.getParameter("ritmica")!= null) {
			out.println("Has marcado " + request.getParameter("ritmica") + "<br>");
		}
		
		out.println("</head> <body>");
		out.println("</body></html>");
	}

}
