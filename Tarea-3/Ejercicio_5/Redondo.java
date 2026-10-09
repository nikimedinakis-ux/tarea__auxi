package Ejercicio_5;
public class Redondo extends Figura {
    private int radio;
    public Redondo(String color, int radio) {
        super(color);
        this.radio = radio;
    }
    @Override
    protected double obtenerArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    @Override
    public String toString() {
        return "Redondo [Color: " + color + ", Radio: " + radio + ", Área: " + String.format("%.2f", obtenerArea()) + "]";
    }
}
