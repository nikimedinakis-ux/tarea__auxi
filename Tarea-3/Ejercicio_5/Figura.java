package Ejercicio_5;
public abstract class Figura {
    protected String color;
    public Figura(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    protected abstract double obtenerArea();
}

