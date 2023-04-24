package es.cursojava;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usr = request.getParameter("textoUser");
		String pwd = request.getParameter("textoPass");
		request.setAttribute("userName", usr);
		request.setAttribute("userPwd", pwd);

		if (usr.equals("admin") && pwd.equals("admin")) {
			// Si las credenciales son válidas, establecemos un atributo en la sesión y
			// redirigimos al servlet de inicio

			

			RequestDispatcher dispatcher = request.getRequestDispatcher("/InicioServlet");

			dispatcher.forward(request, response);
		} else {
			// Si las credenciales no son válidas, redirigimos al servlet de error
			RequestDispatcher dispatcher2 = request.getRequestDispatcher("/ErrorServlet");
			dispatcher2.forward(request, response);
		}
	}

}
