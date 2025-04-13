package TerceraEvaluacion.Tema7Parte2.streams.ejemplos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EjemploFilterMap {
    public static void main(String[] args) {

        ArrayList<Pedido> pedidos = new ArrayList<>(
                List.of(new Pedido(100.0, LocalDate.now()),
                        new Pedido(120.0, LocalDate.now().minusDays(1)),
                        new Pedido(190.0, LocalDate.now().minusDays(2)),
                        new Pedido(275.0, LocalDate.now()),
                        new Pedido(1000.0, LocalDate.now().minusDays(3)))
        );

        pedidos.stream()
                .filter( pe -> pe.getTotal() > 200)
                .map(Pedido::getId)
                .forEach(System.out::println);

        Double total = pedidos.stream()
                .filter( pe -> pe.getTotal() > 200)
                .map(p -> {
                    p.setTotal(p.getTotal()+p.getTotal()*1.15);
                    return p;
                })
                .map(Pedido::getTotal)
                .reduce(0.0, Double::sum);
        System.out.println(total);


    }
}
