package es.main.onMainMethods;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.model.Libro;

public class Principal03Borrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioPersistence");

		EntityManager em = emf.createEntityManager();
		
		Libro l1 =  em.find(Libro.class, "5B");
		em.getTransaction().begin();
		em.remove(l1);
		em.getTransaction().commit();
	}

}
