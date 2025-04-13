package TerceraEvaluacion.Tema7Parte2.streams.canciones;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<Cancion> canciones = List.of(
                new Cancion("Blinding Lights", new Artista("The Weeknd", "Canadá"), 2024, 200, 90.5, Genero.POP),
                new Cancion("Levitating", new Artista("Dua Lipa", "Reino Unido"), 2024, 203, 88.7, Genero.POP),
                new Cancion("Lost Souls", new Artista("Foo Fighters", "EE. UU."), 2024, 210, 91.0, Genero.ROCK),
                new Cancion("Rise Again", new Artista("Sam Smith", "Reino Unido"), 2025, 220, 92.5, Genero.POP),
                new Cancion("Phoenix Rising", new Artista("Paramore", "EE. UU."), 2025, 180, 89.7, Genero.ROCK),
                new Cancion("The Final Frontier", new Artista("Ghost", "Suecia"), 2025, 215, 92.1, Genero.METAL),
                new Cancion("Shining Star", new Artista("Doja Cat", "EE. UU."), 2025, 185, 88.7, Genero.HIPHOP),
                new Cancion("Crimson Skies", new Artista("Foo Fighters", "EE. UU."), 2025, 225, 93.3, Genero.ROCK),
                new Cancion("Kiss Me More", new Artista("Doja Cat", "EE. UU."), 2024, 205, 87.1, Genero.POP)
        );

        //Streams -------------------------------------------

        //EJ1 - Canciones 2025
        canciones.stream()
                .filter(c -> c.getAnio().equals(2025) )
                .forEach(System.out::println);

        System.out.println("---------------------------");

        //EJ2 - Canciones de DojaCat
        canciones.stream()
                .filter(c -> c.getArtista().getNombre().equals("Doja Cat"))
                .forEach(System.out::println);

        System.out.println("---------------------------");

        //EJ3 - Canciones ordenadas mayor menor popularidad
        canciones.stream()
                .sorted(Comparator.comparing(Cancion::getPopularidad).reversed())
                //.sorted( (c1,c2) -> c2.getPopularidad().compareTo(c1.getPopularidad()))
                .forEach(System.out::println);

        System.out.println("---------------------------");

        //EJ4 - Duración en minutos
        Integer duracionSegs = canciones.stream()
                .collect(Collectors.summingInt(Cancion::getDuracionSegs));
        System.out.println(duracionSegs / 60);

        duracionSegs = canciones.stream()
                .mapToInt(Cancion::getDuracionSegs)
                .sum();
        System.out.println(duracionSegs / 60);

        System.out.println("---------------------------");

        //EJ5 - Agrupar por país
        Map<String, Long> agrupPais = canciones.stream()
                .collect(Collectors.groupingBy(c -> c.getArtista().getPais() ,
                        Collectors.counting()));
        agrupPais.forEach((k,v) -> System.out.println(k + " " + v));

        System.out.println("---------------------------");

        //EJ6 - Agrupar por genero
        Map<Genero, Long> agrupGenero = canciones.stream()
                .collect(Collectors.groupingBy(Cancion::getGenero,
                        Collectors.counting()));
        agrupGenero.forEach((k,v) -> System.out.println(k + " " + v));

        System.out.println("---------------------------");

        //EJ7 Canción 95% popularidad
        try {
            Cancion popular = canciones.stream()
                    .filter(c -> c.getPopularidad() >= 90.0)
                    .findAny()
                    .orElseThrow();
            System.out.println(popular);
        } catch (Exception e) {
            System.out.println("No hay canción con esa popularidad");
        }

        System.out.println("---------------------------");

        //EJ8 Las tres de más duracion
        canciones.stream()
                .sorted(Comparator.comparing(Cancion::getDuracionSegs).reversed())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("---------------------------");

        //EJ9 Genera lista titulo - artista
        List<String> resumen = canciones.stream()
                .map( c -> c.getTitulo() + " - " + c.getArtista().getNombre())
                .sorted()
                .toList();
        resumen.forEach(System.out::println);

        //EJ10 Duración media
        Double mediaDuracion = canciones.stream()
                .mapToInt(Cancion::getDuracionSegs)
                .average()
                .orElseThrow();
        System.out.println(mediaDuracion);

        //EJ11 Media popularidad
        Double mediaPopularidad = canciones.stream()
                .collect(Collectors.summarizingDouble(Cancion::getPopularidad))
                .getAverage();
        System.out.println(mediaPopularidad);

    }

}
