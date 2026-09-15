package Ejercicio_1_Herencia;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== PRUEBA DE JERARQUÍA DE HERENCIA =====");
        Gato miGato = new Gato("Felis catus", 15, "Carnívoro", true, "Naranja");
        System.out.println("--- Datos de mi Gato (Heredados y Propios) ---");
        System.out.println("Nombre Científico (SerVivo): " + miGato.nombreCientifico);
        System.out.println("Alimentación (Animal): " + miGato.tipoAlimentacion);
        System.out.println("¿Visión nocturna? (Felino): " + miGato.tieneVisionNocturna);
        System.out.println("Color Pelaje (Gato): " + miGato.colorPelaje);
        System.out.println("\n-------------------------------------------");
        Niño miNiño = new Niño("Homo sapiens", 80, "Omnívoro", "Carlitos", "1234567 LP", "Pelota");
        System.out.println("--- Datos de mi Niño (Heredados y Propios) ---");
        System.out.println("Nombre (Humano): " + miNiño.nombre);
        System.out.println("Cédula de Identidad (Humano): " + miNiño.ci);
        System.out.println("Edad Máxima de Especie (SerVivo): " + miNiño.edadMaxima + " años");
        System.out.println("Juguete Favorito (Niño): " + miNiño.jugueteFavorito);
    }
}
