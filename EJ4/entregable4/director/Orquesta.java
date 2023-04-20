package entregable4.director;
import java.util.ArrayList;

import entregable4.instrumentos.*;
public class Orquesta {

	public static void main(String[] args) {
		
		ArrayList<Instrumento> ins = new ArrayList<Instrumento>();

		Instrumento a = new Flauta("Flauta Ligera","Pan","Modelo 12");
		Instrumento b = new Guitarra("Guitarra","Acustica", 6);
		Instrumento c = new GuitarraElectrica("GElectrica","Stratocaster",6,4);
		Instrumento d = new Tambor("Druman","Snare");
		
		
       /*
		o.addInstrumento(a);
		o.addInstrumento(b);
		o.addInstrumento(c);
		o.addInstrumento(d);
		*/
		
		

		ins.add(a);
		ins.add(b);
		ins.add(c);
		ins.add(d);
		
		Orquesta o = new Orquesta(ins);
		o.tocarOrquesta();

	}

	private ArrayList<Instrumento> instrumentos;
	
	/*
	public Orquesta() {
		instrumentos = new ArrayList<Instrumento>();
	}
	*/

	public void addInstrumento(Instrumento I){
		instrumentos.add(I);
	}
	

	public Orquesta(ArrayList<Instrumento> I){
		this.instrumentos = I;
	}

    public void tocarOrquesta() {
        for (Instrumento instrumento : instrumentos) {
            if (instrumento instanceof Tambor) {
            	
                ((Tambor) instrumento).aporrear();
            } else {
                instrumento.tocar();
            }
        }
    }
	
}
