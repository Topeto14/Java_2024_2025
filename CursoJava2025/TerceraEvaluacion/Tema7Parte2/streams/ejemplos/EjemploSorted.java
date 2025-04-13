package TerceraEvaluacion.Tema7Parte2.streams.ejemplos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class EjemploSorted {
    public static void main(String[] args) {

        Stream.generate(new Random()::nextInt)
                .limit(20)
                .forEach(n -> System.out.print(n + " "));

        Stream.generate(new Random()::nextInt)
                .limit(20)
                .sorted()
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        ArrayList<Integer> nums = new ArrayList<>(List.of(1,34,544,2,-10,23,2));
        nums.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


    }
}
