package TerceraEvaluacion.Tema7Parte1.listas.mapas.entry;

import java.util.*;

public class AgendaGamer {
    //Nombre juego -> Lista de contactos que juegan a ese juego
    private TreeMap<String, Set<ContactGamer>> agenda;

    public AgendaGamer() {
        agenda = new TreeMap<>(Comparator.reverseOrder());
    }

    public TreeMap<String, Set<ContactGamer>> getAgenda() {
        return agenda;
    }

    /**
     * Añadimos un par clave-valor, en este caso, juego - set vacío
     * @param juego
     */
    public void addJuego(String juego) {
        agenda.put(juego, new HashSet<>());
    }

    public void addJugador(String juego, ContactGamer jugador) {
        //Obtenemos el value de la key, el conjunto de jugadores de ese juego
        Set<ContactGamer> jugadores = agenda.get(juego);
        //Añadimos jugador al conjunto de jugadores de ese juego
        jugadores.add(jugador);
    }

    public void listarJugadores(String juego) {
        Set<ContactGamer> jugadores = agenda.get(juego); //Value
        System.out.println(juego + " ------------- ");
        for(ContactGamer cg: jugadores) {
            System.out.println(cg.getNick()+" - "+cg.getEmail());
        }
    }

    /**
     * Recorrer agenda con keySet: Set<key> y para cada key obtenemos su valor con get(key)
     */
    public void listarTodosV1() {
        //Sacamos todas las claves
        Set<String> juegos = agenda.keySet();
        //Para cada clave sacamos todos los jugadores de ese juego
        for(String juego: juegos) {
            System.out.println(juego + " ------------- ");
            for(ContactGamer cg: agenda.get(juego)) { //get jugadores
                System.out.println(cg.getNick()+" - "+cg.getEmail());
            }
        }
    }

    /**
     * Recorrer agenda con entrySet: devuelve un Set< Map.Entry<clave,valor>
     * Para sacar la clave -> getKey()
     * Para sacar el valor -> getValue()
     */
    public void listarTodosV2() {
        //Sacamos todos los pares juego-jugadores
        Set< Map.Entry<String, Set<ContactGamer>> > juegoJugadores = agenda.entrySet();
        for( Map.Entry<String, Set<ContactGamer>> par  : juegoJugadores) {
            System.out.println(par.getKey() + "--------------");
            for(ContactGamer cg: par.getValue()) {
                System.out.println(cg.getNick()+" - "+cg.getEmail());
            }
        }
    }
}
