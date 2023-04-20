package entregable2;

import java.util.ArrayList;

public class Agenda {

	private int espacio;
	private ArrayList<Contacto> agenda;

	// private Contacto[] coleccion = new Contacto[espacio];

	public Agenda() {
		this.agenda = new ArrayList<Contacto>();
		this.espacio = 10;
	}

	public Agenda(int tamanio) {
		this.agenda = new ArrayList<Contacto>();
		this.espacio = tamanio;
	}

	public void anadirContacto(Contacto c) {
		if (!agendaLlena() && !existeContacto(c)) {
			agenda.add(c);
			System.out.println("Contacto añadido con éxito");
		} else {
			System.out.println("No se pudo añadir el contacto");
		}
	}

	public boolean existeContacto(Contacto c) {
		if (agenda.contains(c)) {
			return true;
		}
		return false;
	}

	public void listarContactos() {

		for (int i = 0; i < agenda.size(); i++) {
			Contacto prov = this.agenda.get(i);
			System.out.println(prov.getNombre() + " , " + prov.getTlf() + "\n");
		}

	}

	public int buscaContacto(String nombre) {

		int num = 0;

		for (int i = 0; i < agenda.size(); i++) {
			Contacto prov = this.agenda.get(i);
			if (prov.getNombre() == nombre) {
				num = prov.getTlf();
			} else {
				System.out.println("Contacto no existe");
			}
		}

		return num;
	}

	public void eliminarContacto(Contacto c) {
		if (existeContacto(c)) {
			agenda.remove(agenda.indexOf(c));
			System.out.println("Contacto borrado");
		}
	}

	public Contacto eliminarContactoConNombre(String nombre) {

		Contacto foundc = null;

		for (int i = 0; i < agenda.size(); i++) {
			Contacto prov = this.agenda.get(i);
			if (prov.getNombre() == nombre) {
				foundc = prov;
			} else {
				System.out.println("Contacto no existe");
			}
		}

		return foundc;
	}

	public boolean agendaLlena() {
		if (agenda.size() > espacio) {
			System.out.println("La agenda está llena");
			return true;
		}
		return false;
	}

	public int huecosLibres() {
		return espacio - agenda.size();
	}

}
