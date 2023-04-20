package pack;

import java.sql.Date;
import java.sql.SQLException;

public class Principal extends CrudOperations{

	public static void main(String[] args) throws SQLException {
		 
		getConnection();
		
		insertar(500, "Juan", "Pérez", "García", Date.valueOf("1995-01-01"), 3000); // inserta un registro con id=500 y salario=3000 //formato Date funciona con AAAA/MM/DD
		insertar(501, "Ju", "Pez", "Gía", Date.valueOf("1999-09-01"), 2599); //otro
		
		/*
		eliminar(500);
		eliminar(501);
		eliminar(50221);
		*/
		//eliminar("500");
		
		
		System.out.println("======================================================================");
		recuperarId(500);																	
		
		System.out.println("======================================================================");
		
		recuperar();
		System.out.println("======================================================================");
		
		update(500,31000);
		System.out.println("======================================================================");
		
		recuperarId(500);
		
		System.out.println("======================================================================");
		
		recuperar();
		
		System.out.println("======================================================================");
		
		eliminar(500);
		
		System.out.println("======================================================================");
		
		recuperar();
		

	}

}

