package Ejercicio_6;
public class Animal {
    protected int edad;
    protected double peso;
    protected String especie;
    public Animal(int edad, double peso, String especie) {
        this.edad = edad;
        this.peso = peso;
        this.especie = especie;
    }
    public String getDatosBase() {
        return "Especie: " + especie + ", Edad: " + edad + " años, Peso: " + peso + "kg";
    }
    public String respirar() {
        return "Tomando oxígeno del entorno... ";
    }
    public String mover() {
        return "El animal se desplaza.";
    }
}
