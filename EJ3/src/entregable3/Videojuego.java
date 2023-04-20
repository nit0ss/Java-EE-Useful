package entregable3;

public class Videojuego implements Entregable {
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compania;

	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = 10;
		this.entregado = false;
		this.genero = "";
		this.compania = "";
	}

	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}

	public Videojuego(String titulo, String compania, String genero, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}

	public String getTitulo() {return titulo;}

	public void setTitulo(String titulo) {this.titulo = titulo;}

	public int getHorasEstimadas() {return horasEstimadas;}

	public void setHorasEstimadas(int horasEstimadas) {this.horasEstimadas = horasEstimadas;}

	public boolean isEntregado() {return entregado;}

	public void setEntregado(boolean entregado) {this.entregado = entregado;}

	public String getGenero() {return genero;}

	public void setGenero(String genero) {this.genero = genero;}

	public String getCompania() {return compania;}

	public void setCompania(String compania) {this.compania = compania;}

	@Override
	public void entregar() {
		this.entregado = false;
	}

	@Override
	public void devolver() {
		this.entregado = true;

	}
	
	@Override
	public int compareTo(Object a) {
	    return this.horasEstimadas - ((Videojuego) a).horasEstimadas;
	}
	
	@Override
	public String toString() {
	    return "Videojuego :" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
	            + ", genero=" + genero + ", compania=" + compania ;
	}


	
}
