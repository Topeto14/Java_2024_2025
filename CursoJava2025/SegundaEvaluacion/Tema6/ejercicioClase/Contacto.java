package SegundaEvaluacion.Tema6.ejercicioClase;
import java.util.Objects;
public class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("[");
        sb.append(nombre).append(" -> ").append(telefono).append(']');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Contacto contacto = (Contacto) o;
        return nombre.equalsIgnoreCase(contacto.nombre); //Ignora mayúsculas
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }
}
