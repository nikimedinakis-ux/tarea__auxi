package Ejercicio_5;
public class Cuadrado extends Figura {
    private int lado;
    public Cuadrado(String color, int lado) {
        super(color);
        this.lado = lado;
    }
    @Override
    protected double obtenerArea() {
        return this.lado * this.lado;
    }
    @Override
    public String toString() {
        return "Cuadrado [Color: " + color + ", Lado: " + lado + ", Área: " + String.format("%.2f", obtenerArea()) + "]";
    }
}
