package ejercicio2;

public class CuentaBancaria {
    protected double saldo;
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        }
    }
    public double obtenerSaldo() {
        return saldo;
    }

}