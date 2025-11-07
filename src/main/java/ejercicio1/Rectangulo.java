package ejercicio1;

public class Rectangulo extends Figuras{
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    private void validacion(){
        if (!(ancho < 0) && !(alto < 0)) {
            throw new IllegalArgumentException("No se pueden agregar numero negativos.");
        }
    }
    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        if (alto < 0) this.alto = alto;
        else throw new IllegalArgumentException("No se pueden agregar numero negativos.");
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        if (ancho < 0) this.ancho = ancho;
        else throw new IllegalArgumentException("No se pueden agregar numero negativos.");
    }
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}