package TerceraEvaluacion.Tema7Parte2.InterfacesFuncionales.supplier;

import TerceraEvaluacion.Tema7Parte2.InterfacesFuncionales.Persona;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploSupplier {
    public static void main(String[] args) {

        List<Persona> personas = List.of(new Persona("Javi","javi@gmail.com"),
                new Persona("Andrea","and@gmail.com"),
                new Persona("Isabel", "isa@gmail.com"),
                new Persona("Juan", "juan@gmx.com"));


        //Para crear streams de prueba con datos
        //También para generar nuevos Sets o Lists
        Set<Double> numbers = Stream.generate(Math::random)
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toSet());

        Stream.generate( () -> new Persona(UUID.randomUUID().toString(), "xx@gmail.com"))
                .limit(5)
                .forEach(System.out::println);

        numbers.forEach(System.out::println);
    }
}
