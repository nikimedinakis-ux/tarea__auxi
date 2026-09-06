package Ejercicio_1;
public class Main {
    public static void main(String[] args) {

        Vehiculo auto1 = new Vehiculo("Toyota", "Corolla", 2022, 15000, "Blanco");
        Vehiculo auto2 = new Vehiculo("Nissan", "Sentra", 2020, 42300, "Gris");

        System.out.println("--- DATOS INICIALES ---");
        auto1.mostrarDatos();
        auto2.mostrarDatos();

        auto1.cambiarColor("Rojo");
        auto2.cambiarColor("Negro");

        System.out.println("\n--- DATOS MODIFICADOS Y KILOMETRAJE ---");

        auto1.mostrarDatos();
        auto1.mostrarKilometraje();
        
        System.out.println("---------------------------------");
        auto2.mostrarDatos();
        auto2.mostrarKilometraje();
    }
}
