// Clase Instrumento
public class Instrumento {
    protected String nombre;
    protected String tipo;
    
    public Instrumento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public void tocar() {
        System.out.println("Tocando instrumento " + nombre);
    }
    
    public void afinar(String nota) {
        System.out.println("Afinando instrumento " + nombre + " en " + nota);
    }
}

// Clase Flauta
public class Flauta extends Instrumento {
    private String modelo;
    
    public Flauta(String nombre, String tipo, String modelo) {
        super(nombre, tipo);
        this.modelo = modelo;
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando instrumento " + nombre + " soplando");
    }
}

// Clase Guitarra
public class Guitarra extends Instrumento {
    private int numCuerdas;
    
    public Guitarra(String nombre, String tipo, int numCuerdas) {
        super(nombre, tipo);
        this.numCuerdas = numCuerdas;
    }
    
    public int getNumCuerdas() {
        return numCuerdas;
    }
}

// Clase GuitarraEléctrica
public class GuitarraElectrica extends Guitarra {
    private int potencia;
    
    public GuitarraElectrica(String nombre, String tipo, int numCuerdas, int potencia) {
        super(nombre, tipo, numCuerdas);
        this.potencia = potencia;
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando guitarra eléctrica");
    }
}

// Clase Tambor
public class Tambor extends Instrumento {
    private String tamaño;
    
    public Tambor(String nombre, String tipo, String tamaño) {
        super(nombre, tipo);
        this.tamaño = tamaño;
    }
    
    public void aporrear() {
        System.out.println("Aporreando tambor " + nombre);
    }
}

// Clase Orquesta
public class Orquesta {
    private Instrumento[] instrumentos;
    
    public Orquesta(Instrumento[] instrumentos) {
        this.instrumentos = instrumentos;
    }
    
    public void tocarOrquesta() {
        for (Instrumento instrumento : instrumentos) {
            if (instrumento instanceof Tambor) {
                ((Tambor) instrumento).aporrear();
            } else {
                instrumento.tocar();
            }
        }
    }
}



