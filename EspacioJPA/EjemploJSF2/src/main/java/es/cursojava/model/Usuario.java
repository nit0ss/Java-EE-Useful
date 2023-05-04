package es.cursojava.model;

import javax.faces.bean.ManagedBean;

@ManagedBean

public class Usuario {

	private String name="Pepito";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
