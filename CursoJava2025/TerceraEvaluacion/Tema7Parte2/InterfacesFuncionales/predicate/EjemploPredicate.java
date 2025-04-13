package TerceraEvaluacion.Tema7Parte2.InterfacesFuncionales.predicate;

import TerceraEvaluacion.Tema7Parte2.InterfacesFuncionales.Persona;

import java.util.List;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        List<Persona> personas = List.of(new Persona("Javi","javi@gmail.com"),
                new Persona("Andrea","and@gmail.com"),
                new Persona("Isabel", "isa@gmail.com"));

        Predicate<Persona> pre1 = p -> p.getNombre().contains("e");
        Predicate<Persona> pre2 = p -> p.getEmail().contains("gmail");

        personas.stream()
                .filter( pre1.or(pre2))
                .forEach(System.out::println);

        personas.stream()
                .filter( p -> p.getNombre().contains("e") || p.getEmail().contains("gmail"))
                .forEach(System.out::println);

        System.out.println("---------------------");
        //Devuelve todas las personas cuyo nombre tenga más de 4 caracteres
        personas.stream()
                .filter( p -> p.getNombre().length() > 4)
                .forEach(System.out::println);





    }
}
