package es.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import es.model.Libro;

public class CRUDJPAOperations {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioPersistence");
	static EntityManager em = emf.createEntityManager();
	static Libro l1 = null;

	public static void updateLibro(String isbn, String newName, String newAutor, int newPrecio) {

		try {

			l1 = em.find(Libro.class, isbn);
			l1.setAutor(newAutor);
			l1.setPrecio(newPrecio);
			l1.setTitulo(newAutor);

			em.getTransaction().begin();
			em.merge(l1);
			em.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (em != null) {
				em.close();
			}
		}

	}

	public static void deleteLibro(String isbn) {

		try {
			l1 = em.find(Libro.class, isbn);
			em.getTransaction().begin();
			em.remove(l1);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public static void findLibro(String isbn) {

		try {
			l1 = em.find(Libro.class, "1A");

			System.out.println(l1.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void insertLibro(String isbn, String newName, String newAutor, int newPrecio) {

		try {

			l1 = new Libro(isbn, newAutor, newName, newPrecio);

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

	public static void queryLibroConAutorYPrecio(String autor, int precio) {

		// ej "select l from Libro l"
		// select l from Libro l where l.autor=:autor
		// equivalente a anidado where l.autor in ('federico')
		try {
			TypedQuery<Libro> consulta = em.createQuery("select l from Libro l where l.autor=:autor and l.precio > :precio", Libro.class);
			consulta.setParameter("autor", autor);
			consulta.setParameter("precio", precio);

			System.out.println("Buscando libros de " + autor + " con precio mayor a " + precio);

			List<Libro> lista = consulta.getResultList();
			
			
			for (Libro l : lista) {
				System.out.println(l.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void queryStringConAutor(String autor) {

		TypedQuery<String> consulta = em.createQuery("select l.titulo from Libro l where l.autor =:autor", String.class);
		consulta.setParameter("autor", autor);

		List<String> lista = consulta.getResultList();
		for (String s : lista) {
			System.out.println(s);
		}

	}

	public static void listaPrecios() {
		TypedQuery<Object[]> consulta = em.createQuery("select count(l.precio), l.precio from Libro l group by l.precio", Object[].class);
	

		List<Object[]> lista = consulta.getResultList();
		for (Object[] sublista:lista) {
			System.out.println("De " + sublista[1] + "€ hay " + sublista[0] + " libros. Ref:" + lista.toString());
		}
		
		
	}
	
}
