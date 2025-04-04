package TerceraEvaluacion.Tema7Parte1.Conjuntos.ejercicioclase.citasmedicas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
    private Persona paciente;
    private LocalDate fecha;
    private LocalTime hora;
    private TipoCita tipo;

    public Cita(Persona paciente, LocalDate fecha, LocalTime hora, TipoCita tipo) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.tipo = tipo;
    }

    public Persona getPaciente() {
        return paciente;
    }

    public void setPaciente(Persona paciente) {
        this.paciente = paciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public TipoCita getTipo() {
        return tipo;
    }

    public void setTipo(TipoCita tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CITA MÉDICA -> ");
        sb.append(paciente.getApellidos());
        sb.append(", ").append(paciente.getNombre());
        sb.append(" fecha=").append(fecha);
        sb.append(" hora=").append(hora);
        sb.append(" tipo=").append(tipo);
        return sb.toString();
    }
}
