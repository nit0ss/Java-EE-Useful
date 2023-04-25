package Modelos;

public class Producto {

	private String seccion;
	private int stock;
	private String nombre;
	
	
	public Producto(String nombre,String seccion, int stock) {
		this.seccion = seccion;
		this.nombre = nombre;
		this.stock = stock;
		
	}


	public String getSeccion() {
		return seccion;
	}


	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void modificar(String nombre, String seccion, int stock) {
		this.seccion = seccion;
		this.nombre = nombre;
		this.stock = stock;
	}
	
	
	
	
	
	
}
