package TerceraEvaluacion.Tema7Parte2.streams.ejemplos;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class EjemploRecoleccionBasica {
    public static void main(String[] args) {

        ArrayList<Double> nums = new ArrayList<>(List.of(1.0,34.0,544.0,2.0,10.0,23.0,2.0));
        Integer suma = nums.stream()
                .collect(Collectors.summingInt(p -> p.intValue()));
        System.out.println(suma);

        IntSummaryStatistics iss = nums.stream()
                .collect(Collectors.summarizingInt(Double::intValue));
        System.out.println(iss.getMax());
        System.out.println(iss.getMin());
        System.out.println(iss.getAverage());

        ArrayList<Pedido> pedidos = new ArrayList<>(
                List.of(new Pedido(100.0, LocalDate.now()),
                        new Pedido(120.0, LocalDate.now().minusDays(1)),
                        new Pedido(190.0, LocalDate.now().minusDays(2)),
                        new Pedido(275.0, LocalDate.now()),
                        new Pedido(1000.0, LocalDate.now().minusDays(3)))
        );

        DoubleSummaryStatistics dss = pedidos.stream()
                .filter(p -> p.getFecha().isAfter(LocalDate.now().minusDays(1)))
                .collect(Collectors.summarizingDouble(Pedido::getTotal));
        System.out.println("Num Pedidos " + dss.getCount());
        System.out.println("Pedido más bajo " + dss.getMin());
        System.out.println("Pedido más alto " + dss.getMax());
        System.out.println("Media de los pedidos " + dss.getAverage());
        System.out.println("Ingresos totales " + dss.getSum());


        Set<Pedido> activos = pedidos.stream()
                .filter(p -> p.getFecha().isAfter(LocalDate.now().minusDays(1)))
                .collect(Collectors.toSet()); //Collectors.toList
        activos.forEach(System.out::println);


    }
}
