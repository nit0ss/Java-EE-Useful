package es.main.onMainMethods;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.model.Libro;

public class Principal02Insertar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioPersistence");

		EntityManager em = emf.createEntityManager();

		Libro l1 = new Libro ("5B","Valencia","Pepe",20); 
		em.getTransaction().begin();
		em.persist(l1);
		em.getTransaction().commit();
	}

}
