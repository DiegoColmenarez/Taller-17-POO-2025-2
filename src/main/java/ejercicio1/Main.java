package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Figuras f1 = new Circulo(5);
        Figuras f2 = new Rectangulo(4, 3);
        System.out.printf("Área del círculo: %.2f %n Área del rectangulo: %.2f ", f1.calcularArea(), f2.calcularArea());
    }
}