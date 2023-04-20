package entregable3;

public class Main {
	public static void main(String[] args) {

		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];

		// AutoGenerado
		series[0] = new Serie("Friends", "David Crane y Marta Kauffman", "Sitcom", 10);
		series[1] = new Serie("Breaking Bad", "Vince Gilligan", "Drama", 5);
		series[2] = new Serie("Game of Thrones", "David Benioff y D. B. Weiss", "Fantasía épica", 8);
		series[3] = new Serie("The Big Bang Theory", "Chuck Lorre y Bill Prady", "Sitcom", 12);
		series[4] = new Serie("Stranger Things", "The Duffer Brothers", "Ciencia ficción y terror", 4);

		videojuegos[0] = new Videojuego("Grand Theft Auto V", "Rockstar North", "Acción-aventura", 100);
		videojuegos[1] = new Videojuego("The Witcher 3: Wild Hunt", "CD Projekt Red", "RPG de acción", 60);
		videojuegos[2] = new Videojuego("Super Mario Odyssey", "Nintendo EPD", "Plataformas", 15);
		videojuegos[3] = new Videojuego("The Last of Us Part II", "Naughty Dog", "Acción-aventura", 25);
		videojuegos[4] = new Videojuego("Minecraft", "Mojang Studios", "Sandbox", 40);

		videojuegos[1].entregar();
		series[3].entregar();
		videojuegos[3].entregar();

		
		
		int cantSeriesEntregadas = contarEntregados(series);
		int cantVideojuegosEntregados = contarEntregados(videojuegos);

		System.out.println("Hay " + cantSeriesEntregadas + " series entregadas.");
		System.out.println("Hay " + cantVideojuegosEntregados + " videojuegos entregados.");

		Videojuego videojuegoConMasHoras = videojuegos[0];
		for (int i = 1; i < videojuegos.length; i++) {
			if (videojuegos[i].getHorasEstimadas() > videojuegoConMasHoras.getHorasEstimadas()) {
				videojuegoConMasHoras = videojuegos[i];
			}
		}

		Serie serieConMasTemporadas = series[0];
		for (int i = 1; i < series.length; i++) {
			if (series[i].compareTo(serieConMasTemporadas) > 0) {
				serieConMasTemporadas = series[i];
			}
		}

		System.out.println("El videojuego con más horas estimadas es:");
		System.out.println(videojuegoConMasHoras.toString());

		System.out.println("La serie con más temporadas es:");
		System.out.println(serieConMasTemporadas.toString());
	}
	
	

	public static int contarEntregados(Object[] array) {
	    int contador = 0;
	    for (Object obj : array) {
	        if (obj instanceof Entregable) {
	            Entregable entregable = (Entregable) obj;
	            if (entregable.isEntregado()) {
	                contador++;
	            }
	        }
	    }
	    return contador;
	}

}
