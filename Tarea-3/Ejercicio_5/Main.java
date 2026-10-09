package Ejercicio_5;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 5 ===");
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Cuadrado("Rojo", 4));
        figuras.add(new Cuadrado("Azul", 5));
        figuras.add(new Triangulo("Verde", 3, 4, 5));
        figuras.add(new Triangulo("Amarillo", 5, 5, 5));
        figuras.add(new Redondo("Negro", 3));
        figuras.add(new Redondo("Blanco", 2));
        for (Figura f : figuras) {
            System.out.println(f);
        }
        System.out.println("\n--- Inciso D: Comparación ---");
        Cuadrado miCuadrado = new Cuadrado("Cian", 4);
        Triangulo miTriangulo = new Triangulo("Magenta", 3, 4, 5);

        if (miCuadrado.obtenerArea() > miTriangulo.obtenerArea()) {
            System.out.println("El Cuadrado tiene mayor área. Color: " + miCuadrado.getColor());
        } else {
            System.out.println("El Triángulo tiene mayor área. Color: " + miTriangulo.getColor());
        }
    }
}
