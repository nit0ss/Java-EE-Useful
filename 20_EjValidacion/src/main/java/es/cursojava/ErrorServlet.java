package es.cursojava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorServlet
 */
@WebServlet("/ErrorServlet")
public class ErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		
		out.println("<!DOCTYPE html>");
		out.println("<html><body>");
		out.println("<h1>Error de inicio de sesión</h1>");
		out.println("<h2>Para la combinacion " + request.getAttribute("userName") + " "
				+ request.getAttribute("userPwd") + "</h2>");
		out.println("<a href='login.html'>Volver</a>");
		out.println("</body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
