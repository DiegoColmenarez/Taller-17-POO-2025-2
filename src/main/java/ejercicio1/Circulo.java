package ejercicio1;

public class Circulo extends Figuras {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    private void validacion() {
        if (!(radio < 0)) {
            throw new IllegalArgumentException("No se pueden agregar numero negativos.");
        }
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio < 0) this.radio = radio;
        else throw new IllegalArgumentException("No se pueden agregar numero negativos.");
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}