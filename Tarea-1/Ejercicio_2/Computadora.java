package Ejercicio_2;
public class Computadora {

    private String marca;
    private String procesador;
    private int ram;
    private int almacenamiento;

    public Computadora(String marca, String procesador, int ram, int almacenamiento) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public Computadora(String marca, String procesador) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = 8;               
        this.almacenamiento = 256;  
    }

    public boolean tieneRamIgualA(int x) {
        return this.ram == x;
    }

    public static void mostrarMayorAlmacenamiento(Computadora c1, Computadora c2) {
        System.out.println("--- COMPUTADORA CON MAYOR ALMACENAMIENTO ---");
        if (c1.almacenamiento > c2.almacenamiento) {
            c1.mostrarDatos();
        } else if (c2.almacenamiento > c1.almacenamiento) {
            c2.mostrarDatos();
        } else {
            System.out.println("Ambas computadoras tienen el mismo espacio de almacenamiento (" + c1.almacenamiento + " GB).");
        }
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca + " | Procesador: " + procesador + " | RAM: " + ram + "GB | Almacenamiento: " + almacenamiento + "GB");
    }
}
