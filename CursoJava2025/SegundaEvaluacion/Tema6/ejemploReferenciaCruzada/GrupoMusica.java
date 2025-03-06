package SegundaEvaluacion.Tema6.ejemploReferenciaCruzada;

import java.time.LocalDate;
import java.util.ArrayList;

public class GrupoMusica {
    private String nombre;
    private Genero genero;
    private LocalDate fechaCreacion;
    private Integer numComponentes;
    private ArrayList<Disco> discos;

    public GrupoMusica(String nombre, Genero genero, LocalDate fechaCreacion, Integer numComponentes) {
        this.nombre = nombre;
        this.genero = genero;
        this.fechaCreacion = fechaCreacion;
        this.numComponentes = numComponentes;
        this.discos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getNumComponentes() {
        return numComponentes;
    }

    public void setNumComponentes(Integer numComponentes) {
        this.numComponentes = numComponentes;
    }

    public ArrayList<Disco> getDiscos() {
        return discos;
    }

    public void setDiscos(ArrayList<Disco> discos) {
        this.discos = discos;
    }

    /**
     * Añade un disco a un grupo
     * @param d
     */
    public void addDisco(Disco d) {
        if (! this.discos.contains(d)) { //EVITAR REPETIDOS
            d.setGrupo(this);
            this.discos.add(d);
        }
    }

    public void removeDisco(Disco d) {
        d.setGrupo(null); //El disco no sabemos a quién pertenece
        this.discos.remove(d);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GrupoMusica{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", genero=").append(genero);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append(", numComponentes=").append(numComponentes);
        sb.append(", discos=").append(discos);
        sb.append('}');
        return sb.toString();
    }
}
