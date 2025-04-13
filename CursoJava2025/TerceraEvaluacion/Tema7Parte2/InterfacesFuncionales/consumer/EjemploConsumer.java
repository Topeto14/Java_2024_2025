package TerceraEvaluacion.Tema7Parte2.InterfacesFuncionales.consumer;

import TerceraEvaluacion.Tema7Parte2.InterfacesFuncionales.Persona;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
public class EjemploConsumer {
    public static void main(String[] args) {

        List<Persona> personas = List.of(new Persona("Javi","javi@gmail.com"),
                new Persona("Andrea","and@gmail.com"),
                new Persona("Isabel", "isa@gmail.com"));


        //Ejemplos de Consumer con forEach para pintar los elementos de una colección
        personas.stream()
                .filter(p -> p.getNombre().contains("a"))
                .forEach(System.out::println);


        //Ejemplo BiConsumer para pintar un Map
        Map<Integer,String> productos = new HashMap<>();
        productos.put(1,"Nintendo Switch 2");
        productos.put(2,"Xiaomi 15");
        productos.put(3,"Asus RTX 5080");

        productos.forEach( (c,v) -> System.out.println(c + " - " + v));


    }
}
