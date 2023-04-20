package entregable2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Scanner sc = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("Elija una opción:");
			System.out.println("1. Añadir contacto");
			System.out.println("2. Comprobar si existe contacto");
			System.out.println("3. Listar contactos");
			System.out.println("4. Buscar contacto");
			System.out.println("5. Eliminar contacto");
			System.out.println("6. Comprobar si la agenda está llena");
			System.out.println("7. Comprobar el número de huecos libres");
			System.out.println("8. Salir");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.print("Introduzca el nombre del contacto: ");
				String nombre = sc.next();
				System.out.print("Introduzca el teléfono del contacto: ");
				int telefono = sc.nextInt();
				Contacto nuevoContacto = new Contacto(nombre, telefono);
				agenda.anadirContacto(nuevoContacto);
				break;

			case 2:
				System.out.print("Introduzca el nombre del contacto: ");
				String nombreBusqueda = sc.next();
				agenda.buscaContacto(nombreBusqueda);
				break;

			case 3:
				agenda.listarContactos();
				break;

			case 4:
				System.out.print("Introduzca el nombre del contacto a buscar: ");
				String nombreBusqueda2 = sc.next();
				System.out.println(agenda.buscaContacto(nombreBusqueda2));

				break;

			case 5:
				// AQUI HE CREADO OTRO MÉTODO MÁS CONVENIENTE ya que los tipos del enunciado
				// eran incompatibles para la reutilización
				System.out.print("Introduzca el nombre del contacto a eliminar: ");
				String nombreEliminacion = sc.next();
				agenda.eliminarContactoConNombre(nombreEliminacion);
				break;

			case 6:
				agenda.agendaLlena();
				break;
			case 7:
				System.out.println("Número de huecos libres en la agenda: " + agenda.huecosLibres());
				break;
			case 8:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida");
				break;

			}
		} while (opcion != 8);
	}

}
