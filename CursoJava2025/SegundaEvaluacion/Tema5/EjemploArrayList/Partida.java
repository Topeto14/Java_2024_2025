package SegundaEvaluacion.Tema5.EjemploArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Partida {
    private String nombre;
    private Juego juego;

    private ArrayList<Jugador> jugadores; //No se incluye en el constructor
    //Pero se inicializa en el constructor


    public Partida(String nombre, Juego juego) {
        this.nombre = nombre;
        this.juego = juego;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Partida{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", juego=").append(juego);
        sb.append(", jugadores=").append(jugadores);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Partida partida = (Partida) o;
        return Objects.equals(nombre, partida.nombre) && Objects.equals(juego, partida.juego);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nombre);
        result = 31 * result + Objects.hashCode(juego);
        return result;
    }

    public void addJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public Jugador buscarJugador(String nickname) {
        for(Jugador jugador: this.jugadores) {
            if (jugador.getNickname().equals(nickname))
                return jugador;
        }

        return null;
    }

    public Jugador buscarJugador2(Jugador jugador) {
        //Buscar en qué posición hay un objeto igual a ese
        int posicion = this.jugadores.indexOf(jugador);
        if (posicion < 0)
            return null; //Not found
        else
            return this.jugadores.get(posicion);
    }

}
