package es.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "libros")
public class Libro {

	@Id	
	private String isbn;

	private int precio;
	private String autor;
	private String titulo;
	

	public Libro() {
		super();
	}

	public Libro(String isbn, String autor, String titulo,int precio) {
		super();
		this.precio = precio;
		this.isbn = isbn;
		this.autor = autor;
		this.titulo = titulo;
	}

	public Libro(String isbn) {
		super();
		this.isbn = isbn;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Libro [precio=" + precio + ", isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + "]";
	}

}
