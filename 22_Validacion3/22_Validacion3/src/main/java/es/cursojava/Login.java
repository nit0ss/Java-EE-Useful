package es.cursojava;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String pwd = request.getParameter("pwd");
		
		if (usuario.equals("admin") && pwd.equals("admin")) {
			//datos de usuario son correctos
			 //obtenemos fecha y hora de java.util
			Date date = new Date();
			request.setAttribute("fecha", date);
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("entrada.jsp");
			dispatcher.forward(request,response);
			
		}else {
			PrintWriter out = response.getWriter();
			out.println("<h2>Los datos no son correctos</h2>");
			//datos de usuario son incorrectos
			RequestDispatcher dispatcher=request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request,response);
		}
	}

}
