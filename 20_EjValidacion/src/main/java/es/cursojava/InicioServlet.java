package es.cursojava;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InicioServlet
 */
@WebServlet("/InicioServlet")
public class InicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Date fechaActual = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String fechaformateado = formato.format(fechaActual);
		
		PrintWriter out = response.getWriter();
		
		response.setContentType("text/html");
		out.println("<!DOCTYPE html>");
		out.println("<html><head></head><body>");
		out.println("<h1>Login exitoso " + request.getAttribute("userName") + "</h1>");
		out.println("<h2>Registrado el " + fechaformateado + "</h2>");
		out.println("<a href='login.html'>Volver</a>");
		out.println("</body></html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
