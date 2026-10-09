package Ejercicio_6;
public class Acuatico extends Animal {
    private int nroAletas;
    private boolean esAguaSalada;
    public Acuatico(int edad, double peso, String especie, int nroAletas, boolean esAguaSalada) {
        super(edad, peso, especie);
        this.nroAletas = nroAletas;
        this.esAguaSalada = esAguaSalada;
    }
    public String nadar() { 
        return "Nadando ágilmente a través de las corrientes."; 
    }
    public String sumergirse() { 
        return "Sumiéndose profundamente en el fondo marino."; 
    }
    @Override
    public String respirar() {
        return super.respirar() + "Filtra el oxígeno disuelto en el agua a través de sus branquias.";
    }
    @Override
    public String mover() {
        return "Se desplaza nadando y usando sus " + nroAletas + " aletas para estabilizarse.";
    }
    @Override
    public String toString() {
        return "Acuático -> " + getDatosBase() + ", Aletas: " + nroAletas + ", Hábitat: " + (esAguaSalada ? "Agua Salada" : "Agua Dulce");
    }
}

