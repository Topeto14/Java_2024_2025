package TerceraEvaluacion.Tema7Parte2.streams.ejemplos;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class EjemploResumen {
    public static void main(String[] args) {

        long total = Stream.of(234,22,1,234,546,55,67676,77,58,2,900)
                .count();

        System.out.println(total);

        //Mínimo
        long min = Stream.of(234,22,1,234,546,55,67676,77,58,2,900)
                .min(Comparator.naturalOrder())
                .orElseThrow(); //Lanza excepción si no lo encuentra

        System.out.println(min);

        long max = Stream.of(67676,234,22,1,234,546,55,67676,77,58,2,900)
                .max(Comparator.naturalOrder())
                .orElseThrow(); //Lanza excepción si no lo encuentra

        System.out.println(max);

        String menor = List.of("uno","dos","tres","cuatro","cinco").stream()
                .min(Comparator.comparing(String::length))
                .orElseThrow();
        System.out.println(menor);





    }
}
