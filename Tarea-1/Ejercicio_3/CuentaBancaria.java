package Ejercicio_3;
public class CuentaBancaria {

    private String titular;
    private String nroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String nroCuenta, double saldoInicial) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("ERROR: No se puede depositar un número negativo o 0.");
        } else {
            this.saldo += monto;
            System.out.println("Depósito exitoso de Bs. " + monto);
        }
    }

    public void retirar(double monto) {
        if (monto > this.saldo) {
            System.out.println("ERROR: Fondos insuficientes. No puedes retirar más dinero del disponible.");
        } else if (monto <= 0) {
            System.out.println("ERROR: El monto a retirar debe ser mayor a 0.");
        } else {
            this.saldo -= monto;
            System.out.println("Retiro exitoso de Bs. " + monto);
        }
    }

    public void mostrarDatos() {
        System.out.println("--- DATOS DE LA CUENTA ---");
        System.out.println("Titular: " + titular);
        System.out.println("Nro. Cuenta: " + nroCuenta);
        System.out.println("Saldo Disponible: Bs. " + saldo);
    }
}
