package SegundaEvaluacion.Tema6.tiendaComics;

import java.util.ArrayList;
import java.util.List;

public class TiendaComics {
    private ArrayList<Comic> comics;

    public TiendaComics() {
        this.comics = new ArrayList<>();
    }

    public boolean addComic(Comic comic) {
        if (!this.comics.contains(comic)) {
            this.comics.add(comic);
            return true;
        } else {
            return false; //repetido
        }
    }

    public void addComics(List<Comic> comics) {
        this.comics.addAll(comics);
    }

    public boolean removeComic(Comic comic) {
        return this.comics.remove(comic);
    }

    public void listarComics() {
        for(Comic comic: this.comics) {
            System.out.print(comic.getTitulo() + ": ");
            for(Autor autor: comic.getAutores()) {
                System.out.print(autor.getNombre() + " "
                        + autor.getApellidos()
                        + " " + autor.getRol()
                        + ", ");
            }
            System.out.println();
        }
    }

}
