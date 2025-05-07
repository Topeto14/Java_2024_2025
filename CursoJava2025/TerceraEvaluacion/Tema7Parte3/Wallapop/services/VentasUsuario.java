package TerceraEvaluacion.Tema7Parte3.Wallapop.services;

import TerceraEvaluacion.Tema7Parte3.Wallapop.models.Compra;
import TerceraEvaluacion.Tema7Parte3.Wallapop.models.Producto2Mano;
import TerceraEvaluacion.Tema7Parte3.Wallapop.models.Usuario;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class VentasUsuario {
    private Usuario usuario;
    private Set<Producto2Mano> productosALaVenta;
    private ArrayList<Compra> compras;
    private ArrayList<Compra> ventas;

    public VentasUsuario(Usuario usuario) {
        this.usuario = usuario;
        this.ventas = new ArrayList<>();
        this.compras = new ArrayList<>();
        this.productosALaVenta = new HashSet<>();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Set<Producto2Mano> getProductosALaVenta() {
        return productosALaVenta;
    }

    public void setProductosALaVenta(Set<Producto2Mano> productosALaVenta) {
        this.productosALaVenta = productosALaVenta;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    public ArrayList<Compra> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Compra> ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("VentasUsuario{");
        sb.append("usuario=").append(usuario);
        sb.append(", productosALaVenta=").append(productosALaVenta);
        sb.append(", compras=").append(compras);
        sb.append(", ventas=").append(ventas);
        sb.append('}');
        return sb.toString();
    }

    public void addProductoALaVenta(Producto2Mano producto) {
        this.productosALaVenta.add(producto);
    }

    public void addCompra(Compra compra) {
        this.compras.add(compra);
    }

    public void addVenta(Compra compra) {
        this.ventas.add(compra);
    }


}
