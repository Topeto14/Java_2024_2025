package TerceraEvaluacion.Tema7Parte3.practica3Finca.models;

import java.util.Objects;

public class Finca {

    // Propiedades

    private Long id ;
    private String nombre;
    private Double longitud ;
    private Double latitud ;
    private Double superficie;
    private String Localidad;
    private String Provincia;

    //Constructores

    public Finca(Long id, String nombre, Double longitud, Double latitud, Double superficie, String localidad, String provincia) {
        this.id = id;
        this.nombre = nombre;
        this.longitud = longitud;
        this.latitud = latitud;
        this.superficie = superficie;
        this.Localidad = localidad;
        this.Provincia = provincia;
    }
    //Getters And Setters

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

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String localidad) {
        Localidad = localidad;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String provincia) {
        Provincia = provincia;
    }
    // Strings

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Finca{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", longitud=").append(longitud);
        sb.append(", latitud=").append(latitud);
        sb.append(", superficie=").append(superficie);
        sb.append(", Localidad='").append(Localidad).append('\'');
        sb.append(", Provincia='").append(Provincia).append('\'');
        sb.append('}');
        return sb.toString();
    }
    // equals por id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Finca finca = (Finca) o;
        return Objects.equals(id, finca.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
