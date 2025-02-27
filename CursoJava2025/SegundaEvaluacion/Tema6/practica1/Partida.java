package SegundaEvaluacion.Tema6.practica1;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Partida {
    private Jugador jugador;
    private ArrayList<Monstruo> monstruos;

    public Partida(Jugador jugador) {
        this.jugador = jugador;
        this.monstruos = new ArrayList<>(10);
        this.iniciarPartida();
    }

    public Jugador getJugador() {
        return jugador;
    }

    public ArrayList<Monstruo> getMonstruos() {
        return monstruos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Partida - ");
        sb.append("jugador=")
                .append(jugador.getNivel())
                .append(" ")
                .append(jugador.getSalud())
                .append(" ")
                .append(jugador.getExperiencia())
                .append("\n");

        sb.append(", monstruos=\n");
        for(Monstruo m: monstruos) {
            sb.append(m.getNombre()).append(" - ")
                    .append(m.nivel).append(" - ")
                    .append(m.salud).append("\n");
        }

        return sb.toString();
    }

    public void iniciarPartida() {
        //Equipar jugador
        Arma a1 = new Arma("Hacha del ocaso", Arma.Tipo.HACHA,
                200, true);
        this.jugador.equipar(a1);

        //Crear monstruos
        for(int i=0; i < 5; i++) {
            Monstruo m = new Monstruo("Goblin", Monstruo.Clase.GOBLIN, 25);
            m.setNivel(3);
            this.monstruos.add(m);
        }
        MonstruoFinalNivel mfn = new MonstruoFinalNivel("Goblin Jefe",
                Monstruo.Clase.GOBLIN, 30, 50 );
        mfn.setNivel(5);
        this.monstruos.add(mfn);

        for(int i=0; i < 5; i++) {
            Monstruo m = new Monstruo("Skrall", Monstruo.Clase.SKRALL, 20);
            m.setNivel(4);
            this.monstruos.add(m);
        }
        MonstruoFinalNivel mfn2 = new MonstruoFinalNivel("Skrall Jefe",
                Monstruo.Clase.GOBLIN, 25, 40 );
        mfn2.setNivel(7);
        this.monstruos.add(mfn2);

    }

    public boolean turnoJugador() {
        boolean bichoMuerto = this.jugador.golpear(this.monstruos.get(0));
        if (bichoMuerto) {
            this.monstruos.remove(0);
            if (this.monstruos.isEmpty()) {
                return true; //Gana la partida
            }
        }

        return false; //Sigue luchando
    }

    public boolean turnoMonstruos() {
        try {
            return this.monstruos.get(0).golpear(this.jugador);
        } catch (NoSuchElementException ex) {
            System.out.println("No hay más monstruos, qué fiera eres");
        }

        return false;
    }
}
