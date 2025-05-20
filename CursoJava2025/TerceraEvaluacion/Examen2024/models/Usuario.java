package TerceraEvaluacion.Examen2024.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Usuario extends Persona {
    private LocalDate fechaAlta;

    public Usuario(Long id, String nombre, String apellido, String email, String movil, LocalDate fechaAlta) {
        super(id, nombre, apellido, email, movil);
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Usuario{");
        sb.append("fechaAlta=").append(fechaAlta);
        sb.append(", id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", movil='").append(movil).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
