package ejercicio2;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaAhorro(1000, 0.05);
        cuenta.depositar(500);
        cuenta.retirar(200);
        System.out.println("Saldo actual: " + cuenta.obtenerSaldo());
    }
}