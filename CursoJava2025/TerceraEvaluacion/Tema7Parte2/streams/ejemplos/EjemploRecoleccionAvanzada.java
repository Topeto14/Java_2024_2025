package TerceraEvaluacion.Tema7Parte2.streams.ejemplos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EjemploRecoleccionAvanzada {
    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>(
                List.of(new Pedido(100.0, LocalDate.now()),
                        new Pedido(120.0, LocalDate.now().minusDays(2)),
                        new Pedido(190.0, LocalDate.now().minusDays(2)),
                        new Pedido(275.0, LocalDate.now()),
                        new Pedido(1000.0, LocalDate.now().minusDays(3)))
        );

        //Agrupa por el primer campo y genera un Map
        //Cuya clave es el campo de agrupamiento
        //Y el valor es una lista de los objetos del stream
        Map<LocalDate, List<Pedido>> pedidosporFecha = pedidos.stream()
                .collect(Collectors.groupingBy(Pedido::getFecha));

        pedidosporFecha.forEach((k,v) -> {
            System.out.println(k);
            System.out.println(v);
        });

        Map<LocalDate, Long> pedidosPorFechaNumero = pedidos.stream()
                .collect(Collectors.groupingBy(Pedido::getFecha, Collectors.counting()));
        pedidosPorFechaNumero.forEach((k,v) -> {
            System.out.println(k);
            System.out.println(v);
        });

    }
}
