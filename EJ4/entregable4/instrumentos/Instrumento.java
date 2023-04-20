package entregable4.instrumentos;

public abstract class Instrumento {
	
	protected String nombre;
	protected String tipo;
	
	public Instrumento(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	public void tocar(){
		System.out.println("Tocar instrumento " + nombre);
	}
	
	public void afinar() {
		System.out.println("Afinando instrumento " + nombre);
	}
	
	public String getNombre() {return this.nombre;}
	
}
