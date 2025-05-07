package TerceraEvaluacion.Tema7Parte3.Wallapop.services;

import TerceraEvaluacion.Tema7Parte3.Wallapop.models.*;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;
import java.util.stream.Collectors;

public class GestionComprasVentas {
    private Set<VentasUsuario> ventasUsuarios;
    private List<Compra> transacciones;

    public GestionComprasVentas() {
        this.ventasUsuarios = new HashSet<>();
        this.transacciones = new ArrayList<>();
    }

    public void setVentasUsuarios(Set<VentasUsuario> ventasUsuarios) {
        this.ventasUsuarios = ventasUsuarios;
    }

    public void addUsuario(VentasUsuario usuario) {
        this.ventasUsuarios.add(usuario);
    }

    public void deleteUsuario(VentasUsuario usuario) {
        this.ventasUsuarios.remove(usuario);
    }

    /**
     * Realizar una compra entre un comprador y un vendedor de un producto.
     * Creamos la transacción (Compra).
     * Lo añadimos a la lista de transacciones.
     * Lo añadimos a las ventas del UsuarioVenta vendedor
     * Lo añadimos a las compras del Usuarioventa comprador
     * El precio de compra ahora mismo es el precio del producto. Se puede cambiar*
     * @param comprador
     * @param producto
     */
    public void realizarCompra(Usuario comprador, Producto2Mano producto) {
        Compra compra = new Compra(comprador, producto.getUsuario(),
                producto, LocalDate.now(), producto.getPrecio());

        this.transacciones.add(compra);

        //Obtener objeto VentasUsuario del usuario comprador
        this.buscarUsuario(comprador).addCompra(compra);

        //Obtener objeto VentasUsuario del usuario vendedor
        this.buscarUsuario(producto.getUsuario()).addVenta(compra);
    }

    private VentasUsuario buscarUsuario(Usuario usuario) {
        return this.ventasUsuarios.stream()
                .filter(vu -> vu.getUsuario().equals(usuario))
                .findFirst()
                .orElse(null);
    }

    /**
     * STREAMS -----------------------------
     */

    /**
     * Devolver el precio total de todas las compras realizadas por todos los usuarios
     * @return
     */
    public Double totalTransacciones() {
        return this.transacciones.stream()
                .mapToDouble(Compra::getPrecioCompra)
                .sum();
    }

    /**
     * Sacar las transacciones agrupadas por usuario (Map) ordenadas por fecha. (Map<Usuario,
     * List<Compra>>)
     */
    public Map<Usuario, List<Compra>> transaccionesPorUsuario() {
        Map<Usuario, List<Compra>> transaccionesUsuario = this.transacciones.stream()
                .collect(Collectors.groupingBy(Compra::getUsuarioCompra));
        transaccionesUsuario.forEach((u,l) ->
                l.sort(Comparator.comparing(Compra::getFechaCompra)));
        return transaccionesUsuario;
    }

    /**
     * Sacar todas las compras agrupadas por categoría (Map<Categoria, List<Compra>>)
     */
    public Map<CategoriaProducto, List<Compra>> transaccionesPorCategoria() {
        return this.transacciones.stream()
                .collect(Collectors.groupingBy(trans ->
                        trans.getProducto().getCategoria()));
    }

    /**
     * Sacar el número total de compras agrupadas por estado (Map<Estado, Long>)
     */
    public Map<EstadoProducto, Long> transaccionesPorEstado() {
        return this.transacciones.stream()
                .collect(Collectors.groupingBy(trans ->
                                trans.getProducto().getEstado(),
                        Collectors.counting()));
    }

    /**
     * Sacar el número total de compras por categorías para usuarios de menos de 30 años
     */
    public Map<CategoriaProducto, List<Compra>> transaccionesPorCategoriaUsuarioMenor30() {
        return this.transacciones.stream()
                .filter(trans -> LocalDate.now().getYear() -
                        trans.getUsuarioCompra().getFechaNacimiento().getYear() < 30)
                .collect(Collectors.groupingBy(trans ->
                        trans.getProducto().getCategoria()));
    }

    /**
     * Sacar el número total de compras agrupadas por día de la semana (lunes-100, martes-55, …)
     */
    public Map<String, Long> transaccionesPorDiaSemana() {
        return this.transacciones.stream()
                .collect(Collectors.groupingBy(trans ->
                                trans.getFechaCompra().getDayOfWeek()
                                        .getDisplayName(TextStyle.FULL,Locale.of("es", "ES")),
                        Collectors.counting()));
    }

}
