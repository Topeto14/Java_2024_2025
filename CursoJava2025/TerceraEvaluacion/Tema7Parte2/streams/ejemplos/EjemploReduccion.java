package TerceraEvaluacion.Tema7Parte2.streams.ejemplos;

import java.util.ArrayList;
import java.util.List;

public class EjemploReduccion {
    public static void main(String[] args) {

        ArrayList<Double> nums = new ArrayList<>(List.of(1.0,34.0,544.0,2.0,10.0,23.0,2.0));
        Double suma = nums.stream()
                .reduce(0.0, Double::sum);

        Double suma2 = nums.stream()
                .reduce(0.0, (e1,e2) -> e1 + e2);

        System.out.println(suma);
        System.out.println(suma2);

        Double multi = nums.stream()
                .reduce(1.0, (e1,e2) -> e1 * e2);
        System.out.println(multi);

    }
}
