package SegundaEvaluacion.Tema4.SteamJuego;


import java.util.*;
//**Crea tres juegos diferentes y píntalos ordenados por el puesto en las ventas. Después llama a jugadoresDia para
//los tres juegos indicando el número de jugadores que han jugado ese día, y muestra la nueva media de jugadores
//diarios de cada juego.

public class TestSteamJuego {
    public static void main(String[] args) {
        SteamJuego juego1 = new SteamJuego("counter","shooter",800.0,60, 0.0,3);
        SteamJuego juego2 = new SteamJuego("mario bross","arcade",900.0,10, 50.0,2);
        SteamJuego juego3 = new SteamJuego("Tekkem","fighter",500.0,80, 35.0,1);

        List<SteamJuego> juegos = new ArrayList<SteamJuego>(); // Se crea una lista par llamar a los juegos y agregarlos
        juegos.add(juego1);
        juegos.add(juego2);
        juegos.add(juego3);

        Collections.sort(juegos, Comparator.comparingInt(SteamJuego::getPuestoMasVendidos)); //
        System.out.println("Juegos ordenados por los puestos mas vendidos");
        for (SteamJuego juego : juegos) {
            System.out.println(juego);
        }

        // Llamar a jugadoresDia
        juego1.jugadoresDia(400);
        juego2.jugadoresDia(700);
        juego3.jugadoresDia(600);

        System.out.println(" La nueva media de jugadores diarios ");
        for (SteamJuego juego :juegos){
            System.out.println(juego.getNombre() + ":" + juego.getMediaJugadoresDiarios());
        }

    }
}
