package es.cursojava.sessionobjetos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletSessionPersona
 */
@WebServlet("/ServletSessionPersona")
public class ServletSessionPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession = request.getSession(true);
		String nombre = request.getParameter("nombre");
		Persona p = new Persona(nombre);
		misession.setAttribute("persona", p);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Persona registrada: "+p.getNombre());
		out.println("<h2>Ir al formulario de registro en cursos</h2>");
		out.println("<a href='formularioCurso.html'>Formulario Curso</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}

}
