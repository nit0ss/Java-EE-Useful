package es.cursojava.sesiones;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletCrearSession")
public class ServletCrearSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession misession = request.getSession();
		misession.setAttribute("curso", "Curso de Pilates");
		
		PrintWriter out = response.getWriter();
		out.println("Almacenado el valor de la sesion");
		out.close();
	
	}

}
