package TerceraEvaluacion.Tema7Parte2.InterfacesFuncionales;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo {
    public static void main(String[] args) {

        List<String> palabras = new ArrayList<>(List.of("casa","papel","fruta","empleado","bicicleta"));

        palabras.sort( (e1,e2) -> e2.compareTo(e1) );
        //palabras.sort(Comparator.naturalOrder());

        palabras.removeIf(p -> p.startsWith("f"));
        palabras.add("pepe");
        palabras.forEach(System.out::println);

        //Los streams no modifican la colección (palabras)
        palabras.stream()
                .filter( (pa) -> {
                    System.out.println("-");
                    return pa.length() > 5;
                })
                .filter( pe -> pe.startsWith("e"))
                .map(p -> p.length())
                .forEach(System.out::println);

    }

    public boolean condicion(String pa) {
        return (pa.length() > 5);
    }
}
