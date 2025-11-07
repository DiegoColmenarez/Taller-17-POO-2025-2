package ejercicio2;

public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteres;
    public CuentaAhorro(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }
    public void aplicarInteres() {
        saldo += saldo * tasaInteres;
    }
}