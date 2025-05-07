package TerceraEvaluacion.Tema7Parte3.Wallapop.io;

import TerceraEvaluacion.Tema7Parte3.Wallapop.models.*;
import TerceraEvaluacion.Tema7Parte3.Wallapop.services.GestionComprasVentas;
import TerceraEvaluacion.Tema7Parte3.Wallapop.services.VentasUsuario;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FileUtils {
    public static GestionComprasVentas loadCSV() {
        GestionComprasVentas gcv = new GestionComprasVentas();

        List<Usuario> usuarios;
        List<Producto2Mano> productos;

        //Cargar usuarios
        try {
            usuarios = Files.lines(Paths.get("resources/usuarios.csv"))
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        Usuario user = new Usuario(tokens.get(0),
                                tokens.get(1),
                                tokens.get(2),
                                Genero.valueOf(tokens.get(3)),
                                LocalDate.parse(tokens.get(4)),
                                tokens.get(5),
                                tokens.get(6),
                                tokens.get(7)
                        );
                        return user;
                    }) //Stream<Gamer>
                    .toList();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //usuarios.forEach(System.out::println);

        //Cargar productos2mano
        try {
            productos = Files.lines(Paths.get("resources/productos.csv"))
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        Producto2Mano p2m = new Producto2Mano(
                                tokens.get(0),
                                tokens.get(1),
                                tokens.get(2),
                                CategoriaProducto.valueOf(tokens.get(3)),
                                EstadoProducto.valueOf(tokens.get(4)),
                                Boolean.parseBoolean(tokens.get(5)),
                                Double.parseDouble(tokens.get(6)),
                                usuarios.get(usuarios.indexOf(new Usuario(tokens.get(7),
                                        null,null,null,null,null,null,null))));

                        return p2m;
                    }) //Stream<Gamer>
                    .toList();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Crear VentaUsuario
        Set<VentasUsuario> usuariosVentasStream = usuarios.stream()
                .map(VentasUsuario::new)
                .collect(Collectors.toSet());
        Set<VentasUsuario> usuariosVentas = new HashSet<>(usuariosVentasStream);

        //Añadimos los productos que vende cada usuario
        for(VentasUsuario vu: usuariosVentas) {
            Set<Producto2Mano> products = new HashSet<>();
            for(Producto2Mano p2m: productos) {
                if (p2m.getUsuario().equals(vu.getUsuario())) {
                    products.add(p2m);
                }
            }
            vu.setProductosALaVenta(products);
        }

        //Añadir VentasUsuario a GestionComprasVentas
        gcv.setVentasUsuarios(usuariosVentas);

        //Cargar compras
        try {
            Files.lines(Paths.get("resources/compras.csv"))
                    .forEach(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        String idUsuario = tokens.get(0);
                        String idProducto = tokens.get(1);

                        Usuario user = usuarios.stream()
                                .filter(u -> u.getId().equals(idUsuario))
                                .findFirst()
                                .orElse(null);

                        Producto2Mano product = productos.stream()
                                .filter(p -> p.getId().equals(idProducto))
                                .findFirst()
                                .orElse(null);

                        //Añade la compra que hay en el fichoer a GestionComprasVentas
                        gcv.realizarCompra(user, product);
                    });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return gcv;
    }
}
