package SegundaEvaluacion.Tema6.ejemploEditorial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libro extends Publicacion{
    private String isbn;
    private Integer numCapitulos;
    private Autor autor;
    private Genero genero;

    public Libro(String titulo, String editorial, LocalDate fechaPublicacion,
                 Integer numPaginas, Double precio, String isbn, Integer numCapitulos,
                 Autor autor, Genero genero
    ) {
        super(titulo, editorial, fechaPublicacion, numPaginas, precio);
        this.isbn = isbn;
        this.numCapitulos = numCapitulos;
        this.autor  = autor;
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNumCapitulos() {
        return numCapitulos;
    }

    public void setNumCapitulos(Integer numCapitulos) {
        this.numCapitulos = numCapitulos;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Libro{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", editorial='").append(editorial).append('\'');
        sb.append(", fechaPublicacion=").append(fechaPublicacion);
        sb.append(", numPaginas=").append(numPaginas);
        sb.append(", precio=").append(precio);
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", numCapitulos=").append(numCapitulos);
        sb.append(", autor=").append(autor);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }
    /*
    @Override
    public ArrayList<Autor> getAutores() {
        return new ArrayList<>(List.of(this.autor));
    }*/
}
