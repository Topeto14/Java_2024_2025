package SegundaEvaluacion.Tema6.ejemploEditorial;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {

        Autor a1 = new Autor("Pepe", "pepe@gmail.com", "45353535");
        Autor a2 = new Autor("Pepa", "pepa@gmail.com", "45359335");

        Libro l1 = new Libro("Titulo", "Editorial", LocalDate.now(),
                340, 22.9, "ADFAF-993939393", 5,
                a1, Genero.NOVELA);

        Articulo ar1 = new Articulo("Articulo1", a1, "alsdjkflñasjfñ");
        Articulo ar2 = new Articulo("Articulo2", a2, "Loren Ipsum");
        Revista revista = new Revista("NG febrero", "NG", LocalDate.now(),
                65, 7.95, 245, Tematica.HISTORIA);
        revista.addArticulo(ar1);
        revista.addArticulo(ar2);

        Biblioteca bb = new Biblioteca();
        bb.addPublicacion(l1);
        bb.addPublicacion(revista);

        for(Publicacion p: bb.getPublicaciones()) {
            System.out.println(p.getTitulo());
            System.out.println(p.getAutores());

            if (p instanceof Libro) {
                System.out.println( ((Libro) p).getIsbn() );
            }

            if (p instanceof Revista) {
                System.out.println( ((Revista) p).getTematica());
            }
        }





    }
}
