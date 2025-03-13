package SegundaEvaluacion.Tema6.ejemploEditorial;

import java.time.LocalDate;
import java.util.ArrayList;

public class Revista extends Publicacion {
    private Integer numero;
    private ArrayList<Articulo> articulos;
    private Tematica tematica;

    public Revista(String titulo, String editorial, LocalDate fechaPublicacion,
                   Integer numPaginas, Double precio, Integer numero,
                   Tematica tematica) {
        super(titulo, editorial, fechaPublicacion, numPaginas, precio);
        this.numero = numero;
        this.tematica = tematica;
        this.articulos = new ArrayList<Articulo>();
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }

    public void addArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Revista{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", editorial='").append(editorial).append('\'');
        sb.append(", fechaPublicacion=").append(fechaPublicacion);
        sb.append(", numPaginas=").append(numPaginas);
        sb.append(", precio=").append(precio);
        sb.append(", numero=").append(numero);
        sb.append(", articulos=").append(articulos);
        sb.append(", tematica=").append(tematica);
        sb.append('}');
        return sb.toString();
    }
    /*
    @Override
    public ArrayList<Autor> getAutores() {
        //Creamos una lista de autores
        ArrayList<Autor> autores = new ArrayList<Autor>();

        //Recorremos cada artículo y su autor lo añadimos a la lista de autores
        for(Articulo ar: this.articulos) {
            autores.add(ar.getAutor());
        }

        return autores;
    }*/
}
