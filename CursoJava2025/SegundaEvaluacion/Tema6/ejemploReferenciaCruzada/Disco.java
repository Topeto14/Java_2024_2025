package SegundaEvaluacion.Tema6.ejemploReferenciaCruzada;

import java.time.LocalDate;

public class Disco {
    private String titulo;
    private LocalDate fechaPublicacion;
    private GrupoMusica grupo; //Referencia cruzada

    public Disco(String titulo, LocalDate fechaPublicacion) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
    }

    public Disco(String titulo, LocalDate fechaPublicacion, GrupoMusica grupo) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.grupo = grupo;
        //this.grupo.addDisco(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public GrupoMusica getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoMusica grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Disco{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", fechaPublicacion=").append(fechaPublicacion);
        sb.append(", grupo=").append(grupo.getNombre()); //Para que no se cuelgue
        sb.append('}');
        return sb.toString();
    }
}
