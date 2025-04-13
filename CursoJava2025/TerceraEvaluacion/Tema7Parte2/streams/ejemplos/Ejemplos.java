package TerceraEvaluacion.Tema7Parte2.streams.ejemplos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Ejemplos {
    public static void main(String[] args) {

        Stream<Integer> nums = Stream.iterate(0, x -> x + 2).limit(100);
        //nums.forEach(System.out::println);

        List.of(1,2,3,4,5,6,7,8,9).parallelStream()
                .filter( n -> n % 2 == 0)
                .forEach(System.out::println);

        ArrayList<String> letras = new ArrayList<>(List.of("a","b","c","d","e"));
        letras.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        Stream<Double> numsD = Stream.generate(new Random()::nextDouble);

        List.of(1,2,3,4,5,6,8,9).stream()
                .skip(5)
                .limit(2)
                .forEach(System.out::println);

        List.of("Javi","Juan","Marcos","Juli","María").stream()
                //.map(String::length)
                .map(String::toUpperCase)
                .forEach(System.out::println);





    }
}
