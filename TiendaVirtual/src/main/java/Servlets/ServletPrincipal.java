package Servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelos.Listado;
import Modelos.Producto;

/**
 * Servlet implementation class ServletPrincipal
 */
@WebServlet("/ServletPrincipal")
public class ServletPrincipal extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	public void init(ServletConfig config) throws ServletException {
        super.init(config);
        
        ServletContext context = config.getServletContext();

		Producto producto1 = new Producto("Arroz", "Comida", 50);
		Producto producto2 = new Producto("Pasta", "Comida", 30);
		Producto producto3 = new Producto("Leche", "Comida", 40);
		Producto producto4 = new Producto("Pan", "Comida", 20);
		Producto producto5 = new Producto("Jabón", "Higiene", 80);
		Producto producto6 = new Producto("Papel higiénico", "Higiene", 70);
		Producto producto7 = new Producto("Cepillo de dientes", "Higiene", 60);
		Producto producto8 = new Producto("Champú", "Higiene", 90);
		Producto producto9 = new Producto("Desodorante", "Higiene", 85);
		Producto producto10 = new Producto("Galletas", "Comida", 10);
		
		Listado listado = new Listado();

		listado.addProducto(producto1);
		listado.addProducto(producto2);
		listado.addProducto(producto3);
		listado.addProducto(producto4);
		listado.addProducto(producto5);
		listado.addProducto(producto6);
		listado.addProducto(producto7);
		listado.addProducto(producto8);
		listado.addProducto(producto9);
		listado.addProducto(producto10);
		
		context.setAttribute("listado", listado);
        
        }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
