package TerceraEvaluacion.Tema7Parte1.listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploHashSet {
    public static void main(String[] args) {

        List<String> lista = List.of("manzana","pera","plátano");
        List<String> otra = new ArrayList<>(List.of("manzana", "pera", "tomate"));
        ArrayList<String> arrayl = new ArrayList<>(List.of("manzana", "pera", "tomate"));
        arrayl.get(2); // Object[2]

        LinkedList<String> listaenlazada = new LinkedList<>(List.of("melocotón", "uva"));
        listaenlazada.get(2); //Recorrerse la lista desde el principio hasta la posicón x



    }
}
