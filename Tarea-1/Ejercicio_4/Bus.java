package Ejercicio_4;
public class Bus {
    private String placa;
    private int capacidadAsientos;
    private int pasajerosActuales;
    private double dineroRecaudado;

    public Bus(String placa, int capacidadAsientos) {
        this.placa = placa;
        this.capacidadAsientos = capacidadAsientos;
        this.pasajerosActuales = 0; 
        this.dineroRecaudado = 0.0; 
    }

    public void subirPasajeros(int cantidad) {
        if (cantidad <= asientosDisponibles()) {
            this.pasajerosActuales += cantidad;
            System.out.println("Subieron " + cantidad + " pasajeros correctamente.");
            cobrarPasaje(cantidad); 
        } else {
            System.out.println("ERROR: No se puede subir a " + cantidad + " pasajeros. Solo quedan " + asientosDisponibles() + " asientos disponibles.");
        }
    }

    public void cobrarPasaje(int cantidad) {
        double costoPasaje = 1.50;
        double cobroTotal = cantidad * costoPasaje;
        this.dineroRecaudado += cobroTotal;
        System.out.println("Pasaje cobrado. Total recaudado por este grupo: Bs. " + cobroTotal);
    }

    public int asientosDisponibles() {
        return this.capacidadAsientos - this.pasajerosActuales;
    }

    public void mostrarEstadoBus() {
        System.out.println("Bus Placa: " + placa + " | Pasajeros a bordo: " + pasajerosActuales + 
                           " | Asientos Libres: " + asientosDisponibles() + " | Dinero en Caja: Bs. " + dineroRecaudado);
    }
}
