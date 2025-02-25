package SegundaEvaluacion.Tema5.EjemploExpediente;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Expediente {
    enum Modalidad { FPB, FPMEDIO, FPSUPERIOR }

    private static int numExpedientes = 0;

    private final Integer id = Expediente.numExpedientes + 10000;
    private String nombre;
    private String apellidos;
    private Character sexo;
    private Modalidad modalidad;
    private LocalDate fechaNacimiento;
    private Integer curso;
    private List<NotasCurso> calificaciones;

    public Expediente(String nombre, String apellidos, Character sexo, Modalidad modalidad,
                      LocalDate fechaNacimiento, Integer curso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.modalidad = modalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.curso = curso;
        this.calificaciones = new ArrayList<>(); //Inicializa ArrayList
        Expediente.numExpedientes++; //Incrementar la propiedad estática con el número de expedient
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getCurso() {
        return curso;
    }

    public void setCurso(Integer curso) {
        this.curso = curso;
    }

    public Integer getId() {
        return id;
    }

    public List<NotasCurso> getCalificaciones() {
        return calificaciones;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Expediente{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", sexo=").append(sexo);
        sb.append(", modalidad=").append(modalidad);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", curso=").append(curso);
        sb.append(", calificaciones=").append(calificaciones); //TODO - Por líneas
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Expediente that = (Expediente) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    /**
     * Añade una nueva calificación (NotasCurso) a las calificaciones de un expediente
     * del expediente
     * @param nc NotasCurso
     */
    public void addNota(NotasCurso nc) {
        this.calificaciones.add(nc);
    }

    /**
     * Añade varias calificaciones (NotasCurso) a las calificaciones de un expediente
     * @param notas
     */
    public void addNotas(List<NotasCurso> notas) {
        this.calificaciones.addAll(notas);
    }

    /**
     * Si es de FPB puede tener dos suspensos para titular
     * Sino tiene que tenerlo aprobado todo para titular
     * @return boolean indicando si titula o no
     */
    public boolean titula() {
        Integer numSuspensos = this.getNumSuspensos();

        //Si FPB -> puede tener dos suspensos
        if (this.modalidad.equals(Modalidad.FPB)) {
            if (numSuspensos > 2) {
                return false;
            } else
                return true;
        } else {
            //Si no FPB no puede tener ningún suspenso
            if (numSuspensos != 0)
                return false;
            else
                return true;
        }
    }

    private Integer getNumSuspensos() {
        Integer numSuspensos = 0;

        //Recorro las calificaciones y para cada una veo la nota final si >= 5
        for(NotasCurso nota : this.calificaciones) {
            if (nota.getNotaFinal() < 5) {
                numSuspensos++;
            }
        }

        /*
        for(int i=0; i<this.calificaciones.size(); i++) {
            NotasCurso nota = this.calificaciones.get(i);

            if (nota.getNotaFinal() < 5) {
                numSuspensos++;
            }
        }
        */

        return numSuspensos;
    }

    /**
     * Suma la notafinal de cada NotaCurso de las calificaciones
     * y lo divide entre el total de calificaciones
     * @return
     */
    public Double getMediaExpediente() {
        Double media = 0.0;
        for(NotasCurso nota : this.calificaciones) {
            media += nota.getNotaFinal();
        }
        return media / this.calificaciones.size();
    }

    /**
     * Devuelve los años transcurridos entre la fecha de nacimiento y la fecha actual
     * Para fechas utilizaremos LocalDate
     * @return
     */
    public Integer getEdad() {
        LocalDate fechaActual = LocalDate.now();
        //Perido de tiempo entre la fecha de nacimiento y la fecha actual
        Period periodo = Period.between(this.fechaNacimiento, fechaActual);
        return periodo.getYears();
    }

    /**
     * Si la edad es mayor o igual que 18 devuelve true, sino devuelve false
     * @return
     */
    public boolean esMayorEdad() {
        return (this.getEdad() >= 18);
    }
}
