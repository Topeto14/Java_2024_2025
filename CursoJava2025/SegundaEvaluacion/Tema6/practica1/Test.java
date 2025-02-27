package SegundaEvaluacion.Tema6.practica1;

public class Test {
    public static void main(String[] args) {
        /*
        Arma a1 = new Arma("Espadón", Arma.Tipo.ESPADA, 101, true);
        Jugador j1 = new Jugador("Aragorn", Jugador.Clase.CABALLERO);
        j1.equipar(a1);

        Monstruo m1 = new Monstruo("M1", Monstruo.Clase.GOBLIN, 10);
        Monstruo m2 = new Monstruo("M2", Monstruo.Clase.FANTASMA, 30);
        Monstruo m3 = new Monstruo("M3", Monstruo.Clase.SKRALL, 25);
        Monstruo m4 = new Monstruo("M4", Monstruo.Clase.TROLL, 50);
        m1.setNivel(8);

        List<Monstruo> monstruos = new ArrayList<>(List.of(m1, m2, m3, m4));

        for(Monstruo m: monstruos) {
            j1.golpear(m);
            System.out.println(j1);
            System.out.println(m);
        }
        */

        Partida partida = new Partida(new Jugador("Geralt", Jugador.Clase.BRUJO));

        boolean ganaJugador = false;
        boolean gananMonstruos = false;
        for(int i=0; i<20; i++) {
            ganaJugador = partida.turnoJugador();
            gananMonstruos = partida.turnoMonstruos();
            System.out.println(partida);

            if (ganaJugador) {
                System.out.println("GANASTE, ENHORABUENA");
                break;
            }

            if (gananMonstruos) {
                System.out.println("PERDISTE, VE AL VALHALLA");
                break;
            }
        }





    }
}
