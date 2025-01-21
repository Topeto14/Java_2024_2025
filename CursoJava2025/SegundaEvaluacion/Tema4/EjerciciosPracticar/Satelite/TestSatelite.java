package SegundaEvaluacion.Tema4.EjerciciosPracticar.Satelite;

public class TestSatelite {
    public static void main(String[] args) {
        Satelite satelite1 = new Satelite();
        System.out.println("El saltelite se encuentra en orbita ? " + satelite1.enOrbita());
        satelite1.variaAltura(1000.0);
        satelite1.variarPosicion(50.0,60.0);
        satelite1.enOrbita();

        satelite1.printPosicion();
        System.out.println(satelite1);
        System.out.println("El saltelite se encuentra en orbita ? " + satelite1.enOrbita());

    }
}
