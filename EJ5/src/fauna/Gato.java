package fauna;

import principal.Mascota;

public class Gato extends Animal implements Mascota {

	private String name;
	@SuppressWarnings("unused")
	private int patas;
	@SuppressWarnings("unused")
	private boolean juega = false;
	
	public Gato(String name, int patas) {
		super(name, patas);
		// TODO Auto-generated constructor stub	
		}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		System.out.println("El gato " + name + " juega con pelotas");
		
		
	}

	
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	@Override
	public void comer() {
		System.out.println("Los gatos les gusta los peces y las arañas");
		
		
	}
}