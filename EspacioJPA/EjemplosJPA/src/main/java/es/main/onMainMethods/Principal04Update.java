package es.main.onMainMethods;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.model.Libro;

public class Principal04Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioPersistence");

		EntityManager em = emf.createEntityManager();
		
		
		
		Libro l1 =  em.find(Libro.class, "1A");
		
		try {
			l1.setAutor("Adrian");
			em.getTransaction().begin();
			em.merge(l1);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(em!=null) {
				em.close();
			}
		}
	}

}
