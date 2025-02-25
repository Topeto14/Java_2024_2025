package SegundaEvaluacion.Tema5;

public class TestRectangulo {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(5.5, 4.1); //r1.alto = 5.5
        Rectangulo r2 = new Rectangulo(10.45, 20.33); //r2.alto = 10.45

        r2.setAlto(22.55); //r2.alto = 22.55

        r1.incrementarAlto()
                .incrementarAlto()
                .incrementarAlto()
                .decrementAlto()
                .incrementarAlto()
                .incrementarAlto();

        System.out.println(r1);
        System.out.println(r2);

    }
}
