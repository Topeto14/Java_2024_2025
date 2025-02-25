package SegundaEvaluacion.Tema5.EjemploExpediente;

import java.util.Objects;

public class NotasCurso {
    private String asignatura;
    private Integer curso;
    private Double nota1Ev;
    private Double nota2Ev;
    private Double nota3Ev;
    private Double notaFinal; //No entra en el constructor porque se calcula con las otras

    public NotasCurso(String asignatura, Integer curso, Double nota1Ev, Double nota2Ev, Double nota3Ev) {
        this.asignatura = asignatura;
        this.nota3Ev = nota3Ev;
        this.nota2Ev = nota2Ev;
        this.nota1Ev = nota1Ev;
        this.curso = curso;
        this.notaFinal = this.calcularNotaFinal();
    }

    public NotasCurso(String asignatura, Integer curso) {
        this.asignatura = asignatura;
        this.curso = curso;
        this.nota3Ev = 0.0;
        this.nota2Ev = 0.0;
        this.nota1Ev = 0.0;
        this.notaFinal = 0.0;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public Double getNota1Ev() {
        return nota1Ev;
    }

    public void setNota1Ev(Double nota1Ev) {
        this.nota1Ev = nota1Ev;
    }

    public Double getNota2Ev() {
        return nota2Ev;
    }

    public void setNota2Ev(Double nota2Ev) {
        this.nota2Ev = nota2Ev;
    }

    public Double getNota3Ev() {
        return nota3Ev;
    }

    public void setNota3Ev(Double nota3Ev) {
        this.nota3Ev = nota3Ev;
    }

    public Double getNotaFinal() {
        this.notaFinal = calcularNotaFinal();
        return this.notaFinal;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NotasCurso{");
        sb.append("asignatura='").append(asignatura).append('\'');
        sb.append(", curso=").append(curso);
        sb.append(", notaFinal=").append(notaFinal);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        NotasCurso that = (NotasCurso) o;
        return Objects.equals(asignatura, that.asignatura) && Objects.equals(curso, that.curso) && Objects.equals(nota1Ev, that.nota1Ev) && Objects.equals(nota2Ev, that.nota2Ev) && Objects.equals(nota3Ev, that.nota3Ev);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(asignatura);
        result = 31 * result + Objects.hashCode(curso);
        result = 31 * result + Objects.hashCode(nota1Ev);
        result = 31 * result + Objects.hashCode(nota2Ev);
        result = 31 * result + Objects.hashCode(nota3Ev);
        return result;
    }

    /**
     * Devuelve la nota media de las tres evaluaciones
     * @return
     */
    public Double calcularNotaFinal() {
        return (this.nota1Ev + this.nota2Ev + this.nota3Ev) / 3;
    }
}
