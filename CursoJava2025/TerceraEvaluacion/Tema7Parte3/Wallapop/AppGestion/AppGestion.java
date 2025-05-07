package TerceraEvaluacion.Tema7Parte3.Wallapop.AppGestion;

import TerceraEvaluacion.Tema7Parte3.Wallapop.io.FileUtils;
import TerceraEvaluacion.Tema7Parte3.Wallapop.services.GestionComprasVentas;

public class AppGestion {
    public static void main(String[] args) {

        GestionComprasVentas gcv = FileUtils.loadCSV();

        gcv.transaccionesPorCategoria().forEach((k,v) -> {
            System.out.println(k);
            v.stream()
                    .forEach(compra -> {
                        System.out.println(compra.getProducto().getId() + " - " +
                                compra.getUsuarioCompra().getId());
                    });
        });

        gcv.transaccionesPorUsuario().forEach((k,v) -> {
            System.out.println(k.getDni());
            v.stream()
                    .forEach(compra -> {
                        System.out.println(compra.getProducto().getId() + " - " +
                                compra.getUsuarioCompra().getId());
                    });
        });


    }
}
