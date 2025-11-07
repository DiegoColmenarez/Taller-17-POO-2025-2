package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Transporte bicicleta = new Bicicleta();
        Transporte toyota = new Coche("Gas");
        bicicleta.mover();
        int b = bicicleta.obtenerVelocidad();
        System.out.println("velocidad = " + b);
        bicicleta.acelerar(20);
        bicicleta.mover();
        b = bicicleta.obtenerVelocidad();
        System.out.println("Velocidad actual = " + b);
        toyota.mover();
        int t = toyota.obtenerVelocidad();
        toyota.acelerar(201);
        toyota.mover();



    }
}