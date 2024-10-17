package Tema2.Seleccion;

public class EjemploIf {
    public static void main(String[] args) {
        //VidaPersonaje: Si tiene más de 50 está bien
        //               Sino pintaremos: toma una poción

        int vidaPersonaje = 50;

        if (vidaPersonaje > 50)  {
            System.out.println("Está bien");
        } else {
            System.out.println("Toma una poción");
        }

        // > 50
        // <= 50
    }
}
