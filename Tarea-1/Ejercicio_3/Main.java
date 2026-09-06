package Ejercicio_3;
public class Main {
    public static void main(String[] args) {
        System.out.println("===== PRUEBA EJERCICIO 3: CUENTA BANCARIA =====");
        
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", "555-1234", 100.0);
        cuenta.mostrarDatos();

        System.out.println("\n[Probando Operaciones]");
        
        cuenta.depositar(50);   
        
        cuenta.depositar(-20);  
        
        cuenta.retirar(300);    
        
        cuenta.retirar(40);     

        System.out.println();
        cuenta.mostrarDatos();  
    }
}
