package TerceraEvaluacion.Tema7Parte3.ejercicioGamers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Discord {
    private HashSet<Gamer> jugadores;

    public Discord() {
        //Cargar jugadores desde el fichero gamers.txt
        jugadores = new HashSet<>(loadGamers());
    }

    public void addGamer(Gamer gamer) {
        jugadores.add(gamer);
    }

    public void removeGamer(Gamer gamer) {
        jugadores.remove(gamer);
    }

    public HashSet<Gamer> getJugadores() {
        return jugadores;
    }

    public void listGamers() {
        jugadores.forEach(System.out::println);
    }

    public Gamer findGamer(String nick) {
        return jugadores.stream()
                .filter(g -> g.getNick().equals(nick))
                .findFirst()
                .orElse(null);
    }

    //MÉTODOS DE PERSISTENCIA
    private List<Gamer> loadGamers() {
        try {
            List<Gamer> gamers = Files.lines(Paths.get("src/tema7_parte3/ejercicioGamers/gamers.csv"))
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        //tokens[0] -> Bnei
                        //tokens[1] -> jjavier@gmail.com
                        //tokens[2] -> AoEIV
                        //tokens[3] -> MALILLO
                        return new Gamer(tokens.get(0), tokens.get(1), tokens.get(2),
                                Nivel.valueOf(tokens.get(3)));
                    }) //Stream<Gamer>
                    .toList();

            return gamers;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void saveGamers() {
        try {

            Files.write(Paths.get("src/tema7_parte3/ejercicioGamers/gamers.csv"),
                    jugadores.stream()
                            .map(g -> g.toString())
                            .toList());
        } catch (IOException e) {}
    }

}
