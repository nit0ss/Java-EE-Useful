package entregable3;

public class Serie implements Entregable {

	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		this.titulo = "";
		this.temporadas = 0;
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.entregado = false;
        this.genero = "";
        this.creador = "";
		
	}
	
	public Serie(String titulo, String creador, String genero,int temporadas){
		this.titulo = titulo;
		this.creador = creador;
		this.genero = genero;
		this.temporadas = temporadas;
	}
	
	public String getTitulo() {return titulo;}
	public String getCreador() {return creador;}
	public String getGenero() {return genero;}
	public int getTemporadas() {return temporadas;}
	
	
	public void setTitulo(String titulo) {this.titulo = titulo;}
	public void setGenero(String genero) {this.genero = genero;}
	public void setCreador(String creador) {this.creador = creador;}
	public void setTemporadas(int temporadas) {this.temporadas = temporadas;}
	
	@Override
	public String toString() {
	    return "Serie :" + titulo + ", numeroTemporadas=" + temporadas + ", entregado=" + entregado
	            + ", genero=" + genero + ", creador=" + creador;
	}



	
	@Override
	public void entregar(){this.entregado=true;}
	@Override
	public void devolver() {this.entregado=false;}
	
	public boolean isEntregado() {return entregado;}
	@Override
	public int compareTo(Object a) {
	    return this.temporadas - ((Serie) a).getTemporadas();
	}

	
	
}
