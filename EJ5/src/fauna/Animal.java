package fauna;

public abstract class  Animal {
		
	 	private  int patas;
	 	private  String name;
	 	
	 	public Animal(String name, int patas) {
	 		this.name = name;
	 		this.patas = patas;
	 	}	

	 	public void andar() {
	 		System.out.println(name+ " anda con "+ patas + " patas");
	 	}
	 	public void comer() {}
	 	
}
