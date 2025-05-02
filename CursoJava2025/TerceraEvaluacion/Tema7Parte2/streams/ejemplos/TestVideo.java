package TerceraEvaluacion.Tema7Parte2.streams.ejemplos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestVideo {
    public static void main(String[] args) {
        List<String> videos = new ArrayList<>(List.of("Video 10","video 2","Video 3"));

        videos.sort(String::compareToIgnoreCase);
        videos.forEach(System.out::println);
        System.out.println("...........");

        videos.sort(Comparator.naturalOrder());
        videos.forEach(System.out::println);
        System.out.println("...........");

        videos.sort(Comparator.comparing(String::length));
        videos.forEach(System.out::println);
        System.out.println("...........");

        videos.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);
        System.out.println("...........");

        videos.forEach(v -> System.out.print(v + ", "));
        System.out.println();

        String videosStr = videos.stream()
                .collect(Collectors.joining(", "));
        System.out.println(videosStr);


        //  Map<UUID,Set<Transaccion>> transaccionesCuenta = cuentas.stream()
        //    .collect(Collectors.toMap(Cuenta::getId, c ->
        //         c.getTransacciones().stream()
        //            .filter(t -> t.getDescripcion().contains(palabra)
        //            .collect(Collectors.toSet())
        //         ));


        // Map<Month, List<Transacciones>> transaccionesAlMes = cuentas.stream()
        //    .flatMap(c -> c.getTransacciones().stream())    //Stream<Transacciones>
        //    .collect(Collectors.groupingBy(t -> t.getFecha().getMonth());

        // transaccionesAlMes.forEach((k,v) -> {
        //      System.out.print(k + " - ");
        //      Double ingresos = v.stream()
        //                          .filter(t -> t.getCategoria().equals(INGRESOS)
        //                          .mapToDouble(Transacciones::getImporte)
        //                          .sum();
        //      Double gastos = v.stream()
        //                          .filter(t -> t.getCategoria().equals(GASTOS)
        //                          .mapToDouble(Transacciones::getImporte)
        //                          .sum();
        //      System.out.println(" Ingresos: " + ingresos + " - Gastos: " + gastos);

        // });

    }
}
