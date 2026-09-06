package Ejercicio_2;
public class Main {
    public static void main(String[] args) {
        
        System.out.println("===== PRUEBA EJERCICIO 2: COMPUTADORAS =====");
        
        Computadora compu1 = new Computadora("ASUS", "Intel i7", 16, 512); 
        Computadora compu2 = new Computadora("HP", "AMD Ryzen 5");          

        System.out.println("Computadoras creadas en el sistema:");
        compu1.mostrarDatos();
        compu2.mostrarDatos();

        int x = 16;
        System.out.println("\n¿La Computadora 1 tiene " + x + "GB de RAM?: " + compu1.tieneRamIgualA(x));
        System.out.println("¿La Computadora 2 tiene " + x + "GB de RAM?: " + compu2.tieneRamIgualA(x));

        System.out.println();
        Computadora.mostrarMayorAlmacenamiento(compu1, compu2);
    }
}
