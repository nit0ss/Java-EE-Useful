package es.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import es.model.Libro;

public class CRUDJPAOperations {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioPersistence");

	EntityManager em = emf.createEntityManager();

	Libro l1 = null;

	public void updateLibro(String isbn, String newName, String newAutor, int newPrecio) {

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

	public void deleteLibro(String isbn) {

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

	public void findLibro(String isbn) {

		try {
			l1 = em.find(Libro.class, "1A");

			System.out.println(l1.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insertLibro(String isbn, String newName, String newAutor, int newPrecio) {

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

	public void queryAutorPrecio(String autor, String precio) {
		// ej "select l from Libro l"
		// select l from Libro l where l.autor=:autor
		try {
			TypedQuery<Libro> consulta = em
					.createQuery("select l from Libro l where l.autor:=autor and l.precio>:precio", Libro.class);
			consulta.setParameter("autor", autor);
			consulta.setParameter("precio", precio);

			List<Libro> lista = consulta.getResultList();
			for (Libro l : lista) {
				l.toString();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}