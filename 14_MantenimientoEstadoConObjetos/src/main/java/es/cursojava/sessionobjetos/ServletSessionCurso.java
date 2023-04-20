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
 * Servlet implementation class ServletSessionCurso
 */
@WebServlet("/ServletSessionCurso")
public class ServletSessionCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 HttpSession misession = request.getSession();
	 Persona persona= (Persona) misession.getAttribute("persona");
	 
	 if(request.getParameter("nombrecurso")!=null) {
		 persona.addCurso(request.getParameter("nombrecurso"));
	 }
	 
	 PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
	 if (persona !=null) {
		 out.println("persona registrada"+persona.getNombre());
		 for ( String curso: persona.getCursos()) {
			 out.println("<p>"+curso+"</p>");
		 }
		 
	 }else {
		 out.println("Session vacia");
	 }
	
		out.println("<a href='formularioCurso.html'>Volver al Formulario Curso</a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
