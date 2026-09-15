package Ejercicio_1_Herencia;

public class SerVivo {
    public String nombreCientifico;
    public int edadMaxima;
    public SerVivo(String nombreCientifico, int edadMaxima) {
        this.nombreCientifico = nombreCientifico;
        this.edadMaxima = edadMaxima;
    }
}
class Planta extends SerVivo {
    public String tipoDeSuelo;
    public Planta(String nombreCientifico, int edadMaxima, String tipoDeSuelo) {
        super(nombreCientifico, edadMaxima);
        this.tipoDeSuelo = tipoDeSuelo;
    }
}
class Animal extends SerVivo {
    public String tipoAlimentacion; 

    public Animal(String nombreCientifico, int edadMaxima, String tipoAlimentacion) {
        super(nombreCientifico, edadMaxima);
        this.tipoAlimentacion = tipoAlimentacion;
    }
}
class Flor extends Planta {
    public String colorPetalos;
    public Flor(String nombreCientifico, int edadMaxima, String tipoDeSuelo, String colorPetalos) {
        super(nombreCientifico, edadMaxima, tipoDeSuelo);
        this.colorPetalos = colorPetalos;
    }
}
class Vivora extends Animal { 
    public boolean esVenenosa;
    public Vivora(String nombreCientifico, int edadMaxima, String tipoAlimentacion, boolean esVenenosa) {
        super(nombreCientifico, edadMaxima, tipoAlimentacion);
        this.esVenenosa = esVenenosa;
    }
}
class Rana extends Animal {
    public double longitudSalto;
    public Rana(String nombreCientifico, int edadMaxima, String tipoAlimentacion, double longitudSalto) {
        super(nombreCientifico, edadMaxima, tipoAlimentacion);
        this.longitudSalto = longitudSalto;
    }
}
class Reptil extends Animal {
    public String tipoEscamas;
    public Reptil(String nombreCientifico, int edadMaxima, String tipoAlimentacion, String tipoEscamas) {
        super(nombreCientifico, edadMaxima, tipoAlimentacion);
        this.tipoEscamas = tipoEscamas;
    }
}
class Felino extends Animal {
    public boolean tieneVisionNocturna;
    public Felino(String nombreCientifico, int edadMaxima, String tipoAlimentacion, boolean tieneVisionNocturna) {
        super(nombreCientifico, edadMaxima, tipoAlimentacion);
        this.tieneVisionNocturna = tieneVisionNocturna;
    }
}
class Roedor extends Animal {
    public double longitudDientes;
    public Roedor(String nombreCientifico, int edadMaxima, String tipoAlimentacion, double longitudDientes) {
        super(nombreCientifico, edadMaxima, tipoAlimentacion);
        this.longitudDientes = longitudDientes;
    }
}
class Humano extends Animal {
    public String nombre;
    public String ci; 
    public Humano(String nombreCientifico, int edadMaxima, String tipoAlimentacion, String nombre, String ci) {
        super(nombreCientifico, edadMaxima, tipoAlimentacion);
        this.nombre = nombre;
        this.ci = ci;
    }
}
class Leon extends Felino {
    public double tamanoMelena;
    public Leon(String nombreCientifico, int edadMaxima, String tipoAlimentacion, boolean tieneVisionNocturna, double tamanoMelena) {
        super(nombreCientifico, edadMaxima, tipoAlimentacion, tieneVisionNocturna);
        this.tamanoMelena = tamanoMelena;
    }
}
class Gato extends Felino {
    public String colorPelaje;
    public Gato(String nombreCientifico, int edadMaxima, String tipoAlimentacion, boolean tieneVisionNocturna, String colorPelaje) {
        super(nombreCientifico, edadMaxima, tipoAlimentacion, tieneVisionNocturna);
        this.colorPelaje = colorPelaje;
    }
}
class Raton extends Roedor {
    public boolean esPlaga;
    public Raton(String nombreCientifico, int edadMaxima, String tipoAlimentacion, double longitudDientes, boolean esPlaga) {
        super(nombreCientifico, edadMaxima, tipoAlimentacion, longitudDientes);
        this.esPlaga = esPlaga;
    }
}
class Conejo extends Animal { 
    public double longitudOrejas;
    public Conejo(String nombreCientifico, int edadMaxima, String tipoAlimentacion, double longitudOrejas) {
        super(nombreCientifico, edadMaxima, tipoAlimentacion);
        this.longitudOrejas = longitudOrejas;
    }
}
class Niño extends Humano {
    public String jugueteFavorito;
    public Niño(String nombreCientifico, int edadMaxima, String tipoAlimentacion, String nombre, String ci, String jugueteFavorito) {
        super(nombreCientifico, edadMaxima, tipoAlimentacion, nombre, ci);
        this.jugueteFavorito = jugueteFavorito;
    }
}
class Adulto extends Humano {
    public String profesion;
    public Adulto(String nombreCientifico, int edadMaxima, String tipoAlimentacion, String nombre, String ci, String profesion) {
        super(nombreCientifico, edadMaxima, tipoAlimentacion, nombre, ci);
        this.profesion = profesion;
    }
}
class Anciano extends Humano {
    public double montoJubilacion;
    public Anciano(String nombreCientifico, int edadMaxima, String tipoAlimentacion, String nombre, String ci, double montoJubilacion) {
        super(nombreCientifico, edadMaxima, tipoAlimentacion, nombre, ci);
        this.montoJubilacion = montoJubilacion;
    }
}
