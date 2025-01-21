package SegundaEvaluacion.Tema4.EjerciciosPracticar.Coche;

public class TestCoche {
    public static void main(String[] args) {
      Coche coche1 = new Coche();
        System.out.println("La velocidad del coche es "+coche1.getVelocidad());
        coche1.acelerar(80);
        System.out.println("La velocidad del coche es "+coche1.getVelocidad());
        coche1.frena(81);
        System.out.println("La velocidad del coche es "+coche1.getVelocidad());
    }
}
