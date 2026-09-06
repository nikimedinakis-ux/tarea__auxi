package Ejercicio_4;
public class Main {
    public static void main(String[] args) {
        System.out.println("===== PRUEBA EJERCICIO 4: ABSTRACCIÓN BUS =====");
        
        Bus miBus = new Bus("2345-XYZ", 30);
        
        System.out.println("--- Estado Inicial del Bus ---");
        System.out.println("Asientos disponibles al empezar: " + miBus.asientosDisponibles());
        
        System.out.println("\n--- Caso 1: Intentando subir un grupo de 10 pasajeros ---");
        miBus.subirPasajeros(10); 
        
        System.out.println("\n--- Caso 2: Consultando asientos tras la primera parada ---");
        System.out.println("Asientos que quedan libres ahora: " + miBus.asientosDisponibles()); 
        
        System.out.println("\n--- Caso 3: Intentando subir un grupo de 25 pasajeros (Exceso) ---");
        miBus.subirPasajeros(25); 

        System.out.println("\n--- Resumen Final del Turno ---");
        miBus.mostrarEstadoBus();
    }
}
