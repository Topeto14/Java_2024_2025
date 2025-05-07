package TerceraEvaluacion.Tema7Parte3.Inventario.models;

import java.util.Objects;

public class Material {
    private String id;
    private String nombre;
    private String descripcion;
    private EstadoMaterial estado;
    private TipoMaterial tipo;
    private Departamento departamento;
    private Localizacion localizacion;

    public Material(String id, String nombre, String descripcion, EstadoMaterial estado, TipoMaterial tipo, Departamento departamento, Localizacion localizacion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tipo = tipo;
        this.departamento = departamento;
        this.localizacion = localizacion;
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

    public EstadoMaterial getEstado() {
        return estado;
    }

    public void setEstado(EstadoMaterial estado) {
        this.estado = estado;
    }

    public TipoMaterial getTipo() {
        return tipo;
    }

    public void setTipo(TipoMaterial tipo) {
        this.tipo = tipo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Material{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", estado=").append(estado);
        sb.append(", tipo=").append(tipo);
        sb.append(", departamento=").append(departamento);
        sb.append(", localizacion=").append(localizacion.getNombre());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Material material = (Material) o;
        return Objects.equals(getId(), material.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
