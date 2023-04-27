package operations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Pelicula;

public class CRUDJPAOperations {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("cinePersistence");
	static EntityManager em = emf.createEntityManager();
	static Pelicula l1 = null;

	public static void updatePeli(int codigo, String newTitulo, String newDirector, int newPrecio) {

		try {

			l1 = em.find(Pelicula.class, codigo);
			l1.setPrecio(newPrecio);
			l1.setDirector(newDirector);
			l1.setTitulo(newTitulo);

			em.getTransaction().begin();
			em.merge(l1);
			em.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (em != null) {
				em.close();
			}
		}
		System.out.println("\n\n---OPERACION ACEPTADA---\n");
	}

	public static void deletePelicula(int codigo) {
		
		try {
			l1 = em.find(Pelicula.class, codigo);
			em.getTransaction().begin();
			em.remove(l1);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("\n\n---OPERACION ACEPTADA---\n");
	}

	public static void findLibro(int codigo) {

		try {
			l1 = em.find(Pelicula.class, codigo);
			System.out.println("\n\n---PETICION ACEPTADA---\n");
			System.out.println(l1.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void insertLibro(int isbn, String newTitulo, String newDirector, int newPrecio) {

		try {

			l1 = new Pelicula(isbn, newTitulo, newDirector, newPrecio);

			em.getTransaction().begin();
			em.persist(l1);
			em.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (em != null) {
				em.close();
			}
		}

	}

	public static void getPeliculas() {

		try {
			TypedQuery<Pelicula> consulta = em.createQuery("select l from Pelicula l", Pelicula.class); // where
																										// l.autor=:autor
																										// and l.precio
																										// > :precio\"
			// consulta.setParameter("autor", autor);
			// consulta.setParameter("precio", precio);

			// System.out.println("Buscando libros de " + autor + " con precio mayor a " +
			// precio);

			List<Pelicula> lista = consulta.getResultList();

			System.out.println("\n\n---PETICION ACEPTADA---\n");
			for (Pelicula l : lista) {

				System.out.println(l.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void customQueryPelis(String query) {

		try {
			TypedQuery<Pelicula> consulta = em.createQuery(query, Pelicula.class); // where
			List<Pelicula> lista = consulta.getResultList();
			System.out.println("\n\n---PETICION ACEPTADA---\n");
			for (Pelicula l : lista) {

				System.out.println(l.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * public static void queryStringConAutor(String autor) {
	 * 
	 * TypedQuery<String> consulta =
	 * em.createQuery("select l.titulo from Libro l where l.autor =:autor",
	 * String.class); consulta.setParameter("autor", autor);
	 * 
	 * List<String> lista = consulta.getResultList(); for (String s : lista) {
	 * System.out.println(s); }
	 * 
	 * }
	 */
	public static void getDirectores() {
		TypedQuery<Object[]> consulta = em
				.createQuery("select count(l.director), l.director from Pelicula l group by l.director", Object[].class);

		List<Object[]> lista = consulta.getResultList();
		
		System.out.println("\n\n---PETICION ACEPTADA---\n");
		for (Object[] sublista : lista) {
			System.out.println("De director: " + sublista[1] + " hay " + sublista[0] + " peliculas. Ref:" + lista.toString());
		}

	}

}