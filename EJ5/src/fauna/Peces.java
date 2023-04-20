package fauna;

public class Peces extends Animal{
	
	private final static int patas = 0;
	
	public Peces(String name) {
		super(name, patas);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void comer() {
		System.out.println("Los peces comen plancton");
	}
	@Override
	public void andar() {
		System.out.println("En realidad no ando");
	}
	
	public void jugar() {
		System.out.println("El pez nada");
	}
	
	
}
