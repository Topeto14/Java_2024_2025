package TerceraEvaluacion.Tema7Parte3.Wallapop;

public class Producto2Mano {
    private String id;
    private String nombre;
    private String descripcion;
    private CategoriaProducto categoria;
    private EstadoProducto estado;
    private boolean envio;
    private double precio;
    private Usuario usuario;

    public Producto2Mano(String id, String nombre, String descripcion, CategoriaProducto categoria, EstadoProducto estado, boolean envio, double precio, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.envio = envio;
        this.precio = precio;
        this.usuario = usuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    public EstadoProducto getEstado() {
        return estado;
    }

    public void setEstado(EstadoProducto estado) {
        this.estado = estado;
    }

    public boolean isEnvio() {
        return envio;
    }

    public void setEnvio(boolean envio) {
        this.envio = envio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto2Mano{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", categoria=").append(categoria);
        sb.append(", estado=").append(estado);
        sb.append(", envio=").append(envio);
        sb.append(", precio=").append(precio);
        sb.append(", usuario=").append(usuario);
        sb.append('}');
        return sb.toString();
    }


}
