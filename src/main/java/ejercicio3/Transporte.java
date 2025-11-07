package ejercicio3;

public abstract class Transporte {
    protected int velocidad;
    public Transporte() {
        this.velocidad = 0;
    }
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidad += incremento;
        }
    }
    public void frenar(int decremento) {
        if (decremento > 0 && velocidad - decremento >= 0) {
            velocidad -= decremento;
        }
    }
    public int obtenerVelocidad() {
        return velocidad;
    }
    public abstract void mover();
}