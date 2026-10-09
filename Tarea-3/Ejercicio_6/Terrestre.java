package Ejercicio_6;
public class Terrestre extends Animal {
    private int nroPatas;
    private String tipoPelaje;
    public Terrestre(int edad, double peso, String especie, int nroPatas, String tipoPelaje) {
        super(edad, peso, especie);
        this.nroPatas = nroPatas;
        this.tipoPelaje = tipoPelaje;
    }
    public String correr() { 
        return "Corriendo velozmente por el suelo firme."; 
    }
    public String cazar() { 
        return "Acechando sigilosamente a su presa."; 
    }
    @Override
    public String respirar() {
        return super.respirar() + "Respira aire de la atmósfera mediante sus pulmones.";
    }
    @Override
    public String mover() {
        return "Se desplaza caminando o corriendo sobre sus " + nroPatas + " patas.";
    }
    @Override
    public String toString() {
        return "Terrestre -> " + getDatosBase() + ", Patas: " + nroPatas + ", Pelaje: " + tipoPelaje;
    }
}

