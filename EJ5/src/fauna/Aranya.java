package fauna;

public class Aranya extends Animal {
	
	private final static int patas = 8;
	
	public Aranya(String name) {
		super(name,patas);
	}
	
	

	@Override
	public void comer() {
		System.out.println("Las aranyas comen mosquitos");
		
	}

	
}
