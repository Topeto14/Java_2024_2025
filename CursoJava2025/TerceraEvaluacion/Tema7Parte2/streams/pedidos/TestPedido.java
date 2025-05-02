package TerceraEvaluacion.Tema7Parte2.streams.pedidos;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestPedido {

    public static void main(String[] args) {

        Cliente c1 = new Cliente(1L, "Manuel García", 2);
        Cliente c2 = new Cliente(2L, "Esther Expósito", 1);
        Cliente c3 = new Cliente(3L, "Goyo Jiménez", 2);

        Producto prod1 = new Producto(1L, "Libro1", CategoriaProducto.LIBROS, 19.95);
        Producto prod2 = new Producto(2L, "Libro2", CategoriaProducto.LIBROS, 27.95);
        Producto prod3 = new Producto(3L, "Libro3", CategoriaProducto.LIBROS, 22.95);
        Producto prod4 = new Producto(4L, "Libro4", CategoriaProducto.LIBROS, 15.95);
        Producto prod5 = new Producto(5L, "Libro5", CategoriaProducto.LIBROS, 19.95);
        Producto prod6 = new Producto(6L, "Juego1", CategoriaProducto.JUEGOS, 59.95);
        Producto prod7 = new Producto(7L, "Juego2", CategoriaProducto.JUEGOS, 67.95);
        Producto prod8 = new Producto(8L, "Juego3", CategoriaProducto.JUEGOS, 52.95);
        Producto prod9 = new Producto(9L, "Juego4", CategoriaProducto.JUEGOS, 55.95);
        Producto prod10 = new Producto(10L, "Juego5", CategoriaProducto.JUEGOS, 69.95);
        Producto prod11 = new Producto(11L, "Periferico1", CategoriaProducto.PERIFERICOS, 19.95);
        Producto prod12 = new Producto(12L, "Periferico2", CategoriaProducto.PERIFERICOS, 27.95);
        Producto prod13 = new Producto(13L, "Periferico3", CategoriaProducto.PERIFERICOS, 132.95);
        Producto prod14 = new Producto(14L, "Periferico4", CategoriaProducto.PERIFERICOS, 45.95);
        Producto prod15 = new Producto(15L, "Periferico5", CategoriaProducto.PERIFERICOS, 59.95);

        Pedido ped1 = new Pedido(1L, c1, EstadoPedido.RECIBIDO, LocalDate.now().minusDays(5),null);
        Pedido ped2 = new Pedido(2L, c2, EstadoPedido.RECIBIDO, LocalDate.now(), null);
        Pedido ped3 = new Pedido(3L, c3, EstadoPedido.RECIBIDO, LocalDate.now().minusDays(7), null);
        Pedido ped4 = new Pedido(4L, c1, EstadoPedido.RECIBIDO, LocalDate.now(), null);

        ped1.setProductos(new HashSet<>( List.of(prod1, prod3, prod5, prod10)));
        ped2.setProductos(new HashSet<>( List.of(prod2, prod4, prod8, prod12)));
        ped3.setProductos(new HashSet<>( Set.of(prod11, prod13, prod14, prod15)));
        ped4.setProductos(new HashSet<>( List.of(prod6, prod7, prod9, prod1, prod2, prod10)));

        ArrayList<Pedido> pedidos = new ArrayList<>(List.of(ped1,ped2,ped3,ped4));

        //STREAMS ----------------------------------------------------------------------

        //1. Muestra los libros cuyo precio sea mayor de 20€
        Stream.of(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10,
                        prod11,prod12,prod13,prod14,prod15)
                .filter( pr -> pr.getCategoria().equals(CategoriaProducto.LIBROS))
                .filter(pr -> pr.getPrecio() > 20)
                .forEach(System.out::println);

        //2. Muestra los pedidos que tengan algún producto de "Juegos"
        pedidos.stream()
                .filter(ped -> ped.getProductos().stream()
                        .anyMatch(pr -> pr.getCategoria().equals(CategoriaProducto.JUEGOS))
                )
                .forEach(p -> {
                    System.out.println(p.getId());
                });

        //3. Genera una lista con todos los Productos, pero cambia su precio para que lleven un 10%
        //de descuento
        List<Producto> productosDescuento = Stream.of(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10,
                        prod11,prod12,prod13,prod14,prod15)
                .peek( pr -> pr.setPrecio(pr.getPrecio() * 0.9))
                .toList();
        productosDescuento.forEach(System.out::println);

        System.out.println("----------------------");

        //4. Saca los productos que aparecen en los pedidos de clientes de nivel 2, realizados entre
        //el 01-04-2025 y el 01-05-2025.
        pedidos.stream()
                .filter( ped -> ped.getCliente().getNivel() == 2)
                .filter( ped -> ped.getFechaPedido().isAfter(LocalDate.of(2025,4,1))
                        && ped.getFechaPedido().isBefore(LocalDate.of(2025,5,1)))
                .flatMap(ped -> ped.getProductos().stream())
                .distinct()
                .forEach(System.out::println);

        System.out.println("----------------------");
        //5. Muestra el producto más caro de la categoría Juegos
        Stream.of(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10,
                        prod11,prod12,prod13,prod14,prod15)
                .filter(pr -> pr.getCategoria().equals(CategoriaProducto.JUEGOS))
                .sorted(Comparator.comparing(Producto::getPrecio).reversed())
                .limit(1)
                .forEach(System.out::println);

        Producto juegoCaro = Stream.of(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10,
                        prod11,prod12,prod13,prod14,prod15)
                .filter(pr -> pr.getCategoria().equals(CategoriaProducto.JUEGOS))
                .max(Comparator.comparing(Producto::getPrecio))
                .orElse(null);
        System.out.println(juegoCaro);

        System.out.println("--------------");
        //6. Devuelve los dos pedidos más recientes
        pedidos.stream()
                .sorted(Comparator.comparing(Pedido::getFechaPedido).reversed())
                .limit(2)
                .forEach(System.out::println);

        System.out.println("--------------------");
        //7. Muestra los pedidos hechos hoy, debe aparecer el pedido y debajo la lista de productos
        //de ese pedido
        pedidos.stream()
                .filter(ped -> ped.getFechaPedido().equals(LocalDate.now()))
                .forEach(ped -> {
                    System.out.println(ped);
                    ped.getProductos().stream().forEach(System.out::println);
                });

        System.out.println("xxxxx");
        pedidos.stream()
                .filter(ped -> ped.getFechaPedido().equals(LocalDate.now()))
                .peek(System.out::println)
                .flatMap(ped -> ped.getProductos().stream())
                .forEach(System.out::println); //Pinta todos los productos de esos pedidos

        System.out.println("------------------------");
        //8. Calcula el total de todos los pedidos de abril de 2025
        Double totalAbril = pedidos.stream()
                .filter(ped -> ped.getFechaPedido().getMonth().equals(Month.APRIL))
                //.peek(ped -> System.out.println(ped.getId()))
                .flatMap(ped -> ped.getProductos().stream())
                //.peek( prod -> System.out.println(prod.getId() + "-" + prod.getPrecio()))
                .mapToDouble(Producto::getPrecio)
                .sum();
        System.out.println("Total pedidos Abril= " + totalAbril);

        System.out.println("-----------------------");
        //9. Obtén una colección de estadísticas de los Juegos: número, media, máximo, mínimo,
        //total
        DoubleSummaryStatistics dss = Stream.of(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10,
                        prod11,prod12,prod13,prod14,prod15)
                .filter(pr -> pr.getCategoria().equals(CategoriaProducto.JUEGOS))
                .mapToDouble(Producto::getPrecio)
                .summaryStatistics();

        DoubleSummaryStatistics dss2 = Stream.of(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10,
                        prod11,prod12,prod13,prod14,prod15)
                .filter(pr -> pr.getCategoria().equals(CategoriaProducto.JUEGOS))
                .collect(Collectors.summarizingDouble(Producto::getPrecio));

        System.out.println("Número: " + dss2.getCount());
        System.out.println("Media: " + dss2.getAverage());
        System.out.println("Max: " + dss2.getMax());
        System.out.println("Min: " + dss2.getMin());
        System.out.println("Total: " + dss2.getSum());

        System.out.println("-----------------------");
        //10. Genera un Map<Long, Integer> donde como clave aparezca el id de pedido y como
        //valor el número de productos en el pedido
        Map<Long, Integer> pedidoCount = pedidos.stream()
                .collect(Collectors.toMap(Pedido::getId, ped -> ped.getProductos().size()));
        pedidoCount.forEach( (k,v) -> System.out.println(k + ": " + v));

        System.out.println("-----------------------");
        //11. Genera un Map<Pedido, Double> donde la clave sea cada pedido y el valor sea el total
        //del pedido.
        Map<Pedido,Double> pedidosTotal = pedidos.stream()
                .collect(Collectors.toMap(Function.identity(), ped ->
                        ped.getProductos().stream()
                                .mapToDouble(Producto::getPrecio)
                                .sum()));
        pedidosTotal.forEach((k,v) -> System.out.println(k.getId() + ": "+ v));

        HashMap<Pedido, Double> pedidosTotalMutable = new HashMap<>(pedidosTotal);

        System.out.println("--------------------");
        //12. Genera un Map<String, List<Producto>> con la clave la categoría, y el valor los
        //productos de esa categoría.
        Map<CategoriaProducto, List<Producto>> productosByCategoria = Stream.of(prod1,prod2,prod3,
                        prod4,prod5,prod6,prod7,prod8,prod9,prod10,prod11,prod12,prod13,prod14,prod15)
                .collect(Collectors.groupingBy(Producto::getCategoria));
        productosByCategoria.forEach((k,v) -> {
            System.out.print(k + " -> ");
            v.stream().forEach( pr -> System.out.print(pr.getId() + ", "));
            System.out.println();
        });

        System.out.println("-----------------------");
        //13. Saca el producto más caro de cada categoría
        Map<CategoriaProducto, Optional<Producto>> categoriaMasCaro = Stream.of(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10,prod11,prod12,prod13,prod14,prod15)
                .collect(Collectors.groupingBy(Producto::getCategoria,
                        Collectors.maxBy(Comparator.comparing(Producto::getPrecio))));

        categoriaMasCaro.forEach((k,v) ->
                System.out.println(k + " -> " + v.orElse(null)));


        boolean encontrado = false;
        for(Producto p: productosDescuento) {
            if (p.getCategoria().equals(CategoriaProducto.LIBROS)) {
                encontrado = true;
                break;
            }

            //else
            //    encontrado = false;
        }
        System.out.println(encontrado);

        encontrado = productosDescuento.stream()
                .anyMatch(pr -> pr.getCategoria().equals(CategoriaProducto.LIBROS));

        ArrayList<Producto> nuevaLista = new ArrayList<>(Stream.of(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10,prod11,prod12,prod13,prod14,prod15)
                .toList());
        nuevaLista.remove(2);


    }
}
