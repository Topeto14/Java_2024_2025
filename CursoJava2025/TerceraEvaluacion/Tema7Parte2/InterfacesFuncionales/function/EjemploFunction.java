package TerceraEvaluacion.Tema7Parte2.InterfacesFuncionales.function;

import TerceraEvaluacion.Tema7Parte2.InterfacesFuncionales.Persona;

import java.util.List;

public class EjemploFunction {
    public static void main(String[] args) {
        List<Persona> personas = List.of(new Persona("Javi","javi@gmail.com"),
                new Persona("Andrea","and@gmail.com"),
                new Persona("Isabel", "isa@gmail.com"),
                new Persona("Juan", "juan@gmx.com"));

        //Vemos que partimos de un flujo de Persona
        //Luego se pasa a un flujo de String
        //Por último, se transforma en flujo de Integer
        personas.stream()
                .filter(p -> p.getEmail().contains("gmail"))
                .map(p -> p.getNombre())// Javi, Andrea, Isabel
                .filter(p -> p.length() > 4)
                .map(String::length)
                .forEach(System.out::println);

        //Un ejemplo de map, donde de Persona pasa a Persona. Mejor hacerlo con peek
        personas.stream()
                .map(p -> {
                    p.setNombre(p.getNombre().toUpperCase());
                    return p;
                })
                .forEach(System.out::println);

        personas.stream()
                .map(Persona::pasarAMayuscula)
                .forEach(System.out::println);

        personas.forEach(System.out::println);




    }
}
