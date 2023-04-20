package entregable4.instrumentos;

public class Flauta extends Instrumento{

	private String modelo;
	
	public Flauta(String nombre, String tipo, String modelo) {
		super(nombre, tipo);
		this.modelo = modelo;
	}
	
	@Override
	public void tocar() {
		System.out.println("Soplando insturmento "+ super.getNombre());
	}
	
}
