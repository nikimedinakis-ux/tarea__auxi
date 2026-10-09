package Ejercicio_6;
public class Aereo extends Animal {
    private double envergaduraAlas;
    private String tipoPico;
    public Aereo(int edad, double peso, String especie, double envergaduraAlas, String tipoPico) {
        super(edad, peso, especie);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoPico = tipoPico;
    }
    public String volar() { 
        return "Surcando las corrientes de aire a gran altura."; 
    }
    public String hacerNido() { 
        return "Construyendo un nido seguro en la copa de un árbol."; 
    }
    @Override
    public String respirar() {
        return super.respirar() + "Respira de forma eficiente mediante un sistema de sacos aéreos.";
    }
    @Override
    public String mover() {
        return "Se desplaza batiendo sus alas y planeando por el cielo.";
    }
    @Override
    public String toString() {
        return "Aéreo -> " + getDatosBase() + ", Envergadura: " + envergaduraAlas + "m, Pico: " + tipoPico;
    }
}
