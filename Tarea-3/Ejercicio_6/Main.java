package Ejercicio_6;
public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 6: JERARQUÍA ANIMAL ===");
        Terrestre leon = new Terrestre(5, 185.2, "León Africano", 4, "Corto y denso");
        Aereo aguila = new Aereo(3, 4.8, "Águila Real", 2.2, "Ganchudo y fuerte");
        Acuatico delfin = new Acuatico(7, 130.5, "Delfín Nariz de Botella", 3, true);
        Animal[] animales = {leon, aguila, delfin};

        for (Animal a : animales) {
            System.out.println(a); 
            System.out.println(" -> Método Respirar: " + a.respirar());
            System.out.println(" -> Método Mover:    " + a.mover());
            System.out.println();
        }
    }
}


