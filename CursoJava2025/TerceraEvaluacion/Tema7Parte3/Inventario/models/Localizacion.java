package TerceraEvaluacion.Tema7Parte3.Inventario.models;

import java.util.Objects;

public class Localizacion {
    private Long id;
    private String nombre;
    private String detalle;

    public Localizacion(Long id, String nombre, String detalle) {
        this.id = id;
        this.nombre = nombre;
        this.detalle = detalle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Localizacion{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", detalle='").append(detalle).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Localizacion that = (Localizacion) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
