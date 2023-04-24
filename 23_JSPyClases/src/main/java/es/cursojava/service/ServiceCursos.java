package es.cursojava.service;
import java.util.ArrayList;
import java.util.List;

import es.cursojava.model.Curso;
public class ServiceCursos {
	
	public List<Curso> buscarTodos(){
		List<Curso> lista = new ArrayList<Curso>();
		
		Curso curso1 = new Curso("Chino",2);
		Curso curso2 = new Curso("Mena",3);
		Curso curso3 = new Curso("Ingles",1);
		Curso curso4 = new Curso("Ruso",4);
		
		lista.add(curso1);
		lista.add(curso2);	
		lista.add(curso3);	
		lista.add(curso4);
		
		return lista;
	}
	
	
}
