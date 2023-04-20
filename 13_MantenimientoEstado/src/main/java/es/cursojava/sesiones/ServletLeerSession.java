package es.cursojava.sesiones;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletLeerSession")
public class ServletLeerSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletLeerSession() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession misession = request.getSession();
		String curso =  (String) misession.getAttribute("curso");
		
		PrintWriter out = response.getWriter();
		out.println(curso);
		
	}

}
