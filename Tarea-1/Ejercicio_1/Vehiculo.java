package Ejercicio_1;
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private int kilometraje;
    private String color; 

    public Vehiculo(String marca, String modelo, int anio, int kilometraje, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.color = color;
    }

    public void mostrarKilometraje() {
        System.out.println("Kilometraje: " + this.kilometraje + " km y 0 metros.");
    }

    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
    }

    public void mostrarDatos() {
        System.out.println("Vehículo: " + marca + " " + modelo + " (" + anio + ") | Color: " + color);
    }
}
