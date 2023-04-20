package entregable4.instrumentos;

public class GuitarraElectrica extends Guitarra{
	
	public GuitarraElectrica(String nombre, String tipo, int numCuerdas, int potencia) {
		super(nombre, tipo, numCuerdas);
		// TODO Auto-generated constructor stub
		this.potencia = potencia;
	}

	private int potencia;
	
	@Override
	public void tocar() {
		System.out.println("Tocando guitarra eléctirca @ Potencia: " + potencia);		
	}
	
	
	
}
