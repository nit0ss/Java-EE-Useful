package main;

import operations.CRUDJPAOperations;

public class Main {

	public static void main(String[] args) {
		
		CRUDJPAOperations.getPeliculas();
		CRUDJPAOperations.customQueryPelis("select p from Pelicula p where p.director like 'm%'");
		CRUDJPAOperations.customQueryPelis("select p from Pelicula p where p.director = 'Eva'");
		CRUDJPAOperations.customQueryPelis("select p from Pelicula p where p.precio between 10 and 45");
		CRUDJPAOperations.customQueryPelis("select p from Pelicula p where p.director = 'Ana' or p.director='Miguel'");
		CRUDJPAOperations.getDirectores();
		
	}

}
