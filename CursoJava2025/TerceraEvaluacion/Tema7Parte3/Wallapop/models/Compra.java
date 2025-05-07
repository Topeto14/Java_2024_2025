package TerceraEvaluacion.Tema7Parte3.Wallapop.models;

import java.time.LocalDate;

public class Compra {
    private Usuario usuarioCompra;
    private Usuario usuarioVende;
    private Producto2Mano producto;
    private LocalDate fechaCompra;
    private Double precioCompra;

    public Compra(Usuario usuarioCompra, Usuario usuarioVende, Producto2Mano producto, LocalDate fechaCompra, Double precioCompra) {
        this.usuarioCompra = usuarioCompra;
        this.usuarioVende = usuarioVende;
        this.producto = producto;
        this.fechaCompra = fechaCompra;
        this.precioCompra = precioCompra;
    }

    public Usuario getUsuarioCompra() {
        return usuarioCompra;
    }

    public void setUsuarioCompra(Usuario usuarioCompra) {
        this.usuarioCompra = usuarioCompra;
    }

    public Usuario getUsuarioVende() {
        return usuarioVende;
    }

    public void setUsuarioVende(Usuario usuarioVende) {
        this.usuarioVende = usuarioVende;
    }

    public Producto2Mano getProducto() {
        return producto;
    }

    public void setProducto(Producto2Mano producto) {
        this.producto = producto;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Compra{");
        sb.append("usuarioCompra=").append(usuarioCompra);
        sb.append(", usuarioVende=").append(usuarioVende);
        sb.append(", producto=").append(producto);
        sb.append(", fechaCompra=").append(fechaCompra);
        sb.append(", precioCompra=").append(precioCompra);
        sb.append('}');
        return sb.toString();
    }
}
