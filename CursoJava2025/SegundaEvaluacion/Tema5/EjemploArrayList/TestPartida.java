package SegundaEvaluacion.Tema5.EjemploArrayList;

public class TestPartida {
    public static void main(String[] args) {

        Juego lol = new Juego("League of Legends", Juego.Plataforma.PC);
        Partida partidaEstaNoche = new Partida("Partidaka", lol);

        partidaEstaNoche.addJugador(new Jugador("Profi", Jugador.Nivel.AMATEUR, "España"));
        partidaEstaNoche.addJugador(new Jugador("Marinator", Jugador.Nivel.PROFESIONAL, "España"));

        partidaEstaNoche.getJugadores().set(0, new Jugador("Julia", Jugador.Nivel.INTERMEDIO, "Uruguay"));
        System.out.println(partidaEstaNoche.getJugadores().get(0));
        System.out.println("vs");
        System.out.println(partidaEstaNoche.getJugadores().get(1));

        partidaEstaNoche.addJugador(new Jugador("Mark", Jugador.Nivel.PROFESIONAL, "España"));

        System.out.println(partidaEstaNoche.getJugadores().size());
        partidaEstaNoche.getJugadores().remove(1);
        System.out.println(partidaEstaNoche.getJugadores().size());

        //System.out.println(partidaEstaNoche);

        // arraylist.get(0) --> array[0]
        // arraylist.set(0, algo) --> array[0] = algo
        // arraylist.add(algo) --> array[longitud+1] = algo
        // arraylist.remove(1) --> array[1] == null y desplazar el array

        for(int i=partidaEstaNoche.getJugadores().size()-1; i >= 0 ; i--) {
            System.out.println(partidaEstaNoche.getJugadores().get(i).getNickname());
        }

        //partidaEstaNoche.getJugadores().remove(new Jugador("Julia", null, null));

        for( Jugador j : partidaEstaNoche.getJugadores()) {
            System.out.println(j.getNickname());
        }

        Jugador julia = partidaEstaNoche.buscarJugador("Julia");
        System.out.println(julia);

    }
}
