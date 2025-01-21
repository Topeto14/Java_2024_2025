package SegundaEvaluacion.Tema4.EjerciciosPracticar.Coche;

public class Coche {
    private int  velocidad;

    public Coche(int velocidad) {
        this.velocidad = velocidad;
    }

    public Coche() {
        velocidad = 0;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void acelerar(int mas ) {
        this.velocidad += mas;
    }
    public void  frena(int menos ) {
        this.velocidad -= menos;
        if (velocidad < 0) {
            velocidad = 0;
        }
    }
}
