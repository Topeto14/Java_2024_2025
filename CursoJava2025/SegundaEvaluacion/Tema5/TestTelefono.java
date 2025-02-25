package SegundaEvaluacion.Tema5;

public class TestTelefono {
    public static void main(String[] args) {

        TelefonoMovil t1 = new TelefonoMovil("546555889", "iPhone 16 Pro",
                TelefonoMovil.CodigoPais.ES, 202.0);

        TelefonoMovil t2 = new TelefonoMovil(t1); //Esta sería la forma de copiar objetos
        TelefonoMovil t3 = t1; //No adecuada

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println(t1 == t2); //false
        System.out.println(t1 == t3); //true - misma referencia memoria
        System.out.println(t1.equals(t2)); // true - Usamos este que nos dice true, tienen los mismos
        // valores, pero son objetos diferentes
        System.out.println(t1.equals(t3)); // true - son misma referencia, tienen los mismos valores




    }
}
