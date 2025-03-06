package SegundaEvaluacion.Tema6.tiendaComics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Comic {
    protected UUID id;
    protected String titulo;
    protected LocalDate fecha;
    protected Double precio;
    protected Integer numPaginas;
    protected ArrayList<Autor> autores;

    public Comic(String titulo, LocalDate fecha, Double precio, Integer numPaginas) {
        this.id = UUID.randomUUID();
        this.titulo = titulo;
        this.fecha = fecha;
        this.precio = precio;
        this.numPaginas = numPaginas;
        this.autores = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append("id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", precio=").append(precio);
        sb.append(", numPaginas=").append(numPaginas);
        sb.append(", autores=\n"); //OJO!!!
        for(Autor autor: this.autores) {
            sb.append(" ")
                    .append(autor.getNombre())
                    .append(" ")
                    .append(autor.getApellidos())
                    .append("\n");
        }
        return sb.toString();
    }

    /**
     * Añadir autor al comic
     * @param autor
     */
    public boolean addAutor(Autor autor) {
        if (!this.autores.contains(autor)) {
            this.autores.add(autor);
            //Añadir a ese autor este comic en su lista
            autor.addComic(this);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeAutor(Autor autor) {
        autor.removeComic(this);
        return this.autores.remove(autor);
    }
}
