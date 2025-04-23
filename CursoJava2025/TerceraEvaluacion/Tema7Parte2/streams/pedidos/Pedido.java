package TerceraEvaluacion.Tema7Parte2.streams.pedidos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Pedido {
    private Long id;
    private LocalDate fechaPedido;
    private LocalDate fechaEnvio;
    private EstadoPedido estado;
    private Cliente cliente;
    private Set<Producto> productos;

    public Pedido(Long id, Cliente cliente, EstadoPedido estado, LocalDate fechaPedido, LocalDate fechaEnvio) {
        this.id = id;
        this.fechaPedido = fechaPedido;
        this.fechaEnvio = fechaEnvio;
        this.estado = estado;
        this.cliente = cliente;
        this.productos = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pedido{");
        sb.append("id=").append(id);
        sb.append(", fechaPedido=").append(fechaPedido);
        sb.append(", fechaEnvio=").append(fechaEnvio);
        sb.append(", estado=").append(estado);
        sb.append(", cliente=").append(cliente);
        sb.append(", productos=").append(productos);
        sb.append('}');
        return sb.toString();
    }

    public void addProducto(Producto p) {
        //Controlar aumentar la cantidad si el producto ya está en el pedido

        productos.add(p);
    }
}
