package Tema2.Seleccion;

public class EjercicioifElse2 {
    public static void main(String[] args) {

        // VidaJugador = 0-100
        // VidaMonstruo = 0-60
        // PuntosEspada = 0-60
        // RunaMagica = true/false

        // Es un combate entre el jugador y el monstruo.
        // Gana el jugador si:
        //          - VidaJugador > 50 y PuntosEspada > 30
        //          - VidaJugador < 50 y PuntosEspada > 50
        //          - VidaJugador < 50 y PuntosEspada < 30 y RunaMagica = true

        // Gana el monstruo si:
        //          - Si la vida del jugador es menor de 50 y los puntos
        //          de la espada menor que 50,
        //          O si la vida del jugador es menor de 50 y RunaMagica = false

        int vidaJugador = 30;
        int vidaMonstruo = 40;
        int puntosEspada = 20;
        boolean runaMagica = true;

        if ( (vidaJugador > 50 && puntosEspada > 30) ||
                (vidaJugador < 50 && puntosEspada > 50) ||
                (vidaJugador < 50 && puntosEspada < 30 && runaMagica==true) ) {
            System.out.println("Gana jugador");
        } else if ( (vidaJugador < 50 && puntosEspada < 50) ||
                (vidaJugador < 50 && runaMagica==false) ) {
            System.out.println("Gana monstruo");
        }

    }
}
