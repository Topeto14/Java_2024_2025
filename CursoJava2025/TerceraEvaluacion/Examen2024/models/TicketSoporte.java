package TerceraEvaluacion.Examen2024.models;

import java.time.LocalDate;
import java.util.Objects;

public class TicketSoporte implements Comparable<TicketSoporte> {
    private Long id ;
    private LocalDate fechaCreacion;
    private LocalDate fechaFinalizacion;
    private EstadoTicket estado ;
    private Integer prioridad;
    private Usuario usuario;
    private Tecnico tecnico;
    private String comentarios;

    //Constructor con id


    public TicketSoporte(Long id, LocalDate fechaCreacion, LocalDate fechaFinalizacion, EstadoTicket estado, Integer prioridad, Usuario usuario, Tecnico tecnico, String comentarios) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.usuario = usuario;
        this.tecnico = tecnico;
        this.comentarios = comentarios;
    }
    //Sin id
    public TicketSoporte(LocalDate fechaCreacion, LocalDate fechaFinalizacion, EstadoTicket estado, Integer prioridad, Usuario usuario, Tecnico tecnico, String comentarios) {
        this.fechaCreacion = fechaCreacion;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.usuario = usuario;
        this.tecnico = tecnico;
        this.comentarios = comentarios;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public EstadoTicket getEstado() {
        return estado;
    }

    public void setEstado(EstadoTicket estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TicketSoporte{");
        sb.append("id=").append(id);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append(", fechaFinalizacion=").append(fechaFinalizacion);
        sb.append(", estado=").append(estado);
        sb.append(", usuario=").append(usuario);
        sb.append(", tecnico.csv=").append(tecnico);
        sb.append(", comentarios='").append(comentarios).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketSoporte that = (TicketSoporte) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    //Comparable por fecha de creación
    @Override
    public int compareTo(TicketSoporte o) {
        return this.getFechaCreacion().compareTo(o.getFechaCreacion());
    }
}
