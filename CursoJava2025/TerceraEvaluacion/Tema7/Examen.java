package TerceraEvaluacion.Tema7;

import java.time.LocalDate;

public class Examen {
    private LocalDate fecha;
    private Double nota;
    private String asignatura;

    public Examen(LocalDate fecha, Double nota, String asignatura) {
        this.fecha = fecha;
        this.nota = nota;
        this.asignatura = asignatura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Examen{");
        sb.append("fecha=").append(fecha);
        sb.append(", nota=").append(nota);
        sb.append(", asignatura='").append(asignatura).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
