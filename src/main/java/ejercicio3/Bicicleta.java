package ejercicio3;


public class Bicicleta extends Transporte {
    @Override
    public void mover() {
        System.out.println("La bicicleta avanza pedaleando a " + velocidad + " km/h.");
    }
}

