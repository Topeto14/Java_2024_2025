package TerceraEvaluacion.Tema7Parte2.streams.ejemplos;

import java.util.ArrayList;
import java.util.List;

public class EjemplosBusqueda {
    public static void main(String[] args) {

        ArrayList<String> paises = new ArrayList<>(
                List.of("España","Francia","EEUU","Mexico","Vietnam","India","China"));

        //Uno que contenga la letra a
        String pais = paises.stream()
                .filter(p -> p.contains("a"))
                .findAny()
                .orElse("No encontrado");
        System.out.println(pais);

        //Hay algún país con V
        boolean paisConV = paises.stream()
                .anyMatch(p -> p.contains("V"));

        System.out.println(paisConV);

        boolean mayor5 = paises.stream()
                .allMatch( p -> p.length() >= 4);
        System.out.println("Mayor que 5 " + mayor5);

        String conO = paises.stream()
                .filter(p -> p.contains("o"))
                .findFirst()
                .orElse("No encontrado");
        System.out.println("País con o: " + conO);

    }
}
