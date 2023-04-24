package es.cursojava;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/ServletAlternativo")
public class ServletAlternativo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String usr = request.getParameter("textoUser");
			String pwd = request.getParameter("textoPass");

			if ("admin".equals(usr) && "admin".equals(pwd)) {

				Date fechaActual = new Date();
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				String fechaformateado = formato.format(fechaActual);

				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("<!DOCTYPE html>");
				out.println("<html> <head>");
				out.println("<meta charset=\"ISO-8859-1\">");
				out.println("</head> <body>");
				out.println("<h1>Login exitoso!</h1>");
				out.println("<h2>Registrado el " + fechaformateado + "</h2>");
				out.println("</body></html>");

			} else {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("<!DOCTYPE html>");
				out.println("<html> <head>");
				out.println("<meta charset=\"ISO-8859-1\">");
				out.println("<title>Login Erróneo</title>");
				out.println("</head> <body>");
				out.println("<h1>Login Erróneo</h1>");
				out.println("<p>Usuario o contraseña incorrecta.</p>");
				out.println("<a href=login.html>Volver</a>");
				out.println("</body></html>");
			}

		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
