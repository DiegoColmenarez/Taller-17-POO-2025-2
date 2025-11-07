package ejercicio3;

public class Coche extends Transporte {
    private String combustible;

    public Coche(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public void mover() {
        System.out.println("El coche avanza usando " + combustible + " a " + velocidad + " km/h.");
    }
}