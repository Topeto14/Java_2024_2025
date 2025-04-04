package TerceraEvaluacion.Tema7Parte1.listas.mapas.agendaPro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;

public class Agenda {
    private HashMap<String, Contacto> agenda;

    public Agenda() {
        agenda = new HashMap<>();
    }

    public void addContacto(String nombre, Contacto contacto) {
        agenda.put(nombre, contacto);
    }

    public boolean haveContacto(String nombre) {
        return agenda.containsKey(nombre);
    }

    public ArrayList<Contacto> getContacto(String texto) {
        // "juan" -> "Juan Antonio Solís", "Jose Juan López", "Juan Antonio el viciado"
        ArrayList<Contacto> contactosCoincide = new ArrayList<>();

        Set<String> keys = agenda.keySet(); //Las claves no tienen duplicados
        for(String key: keys) {
            //Buscamos si alguna clave contiene el texto pasado como parámetro
            if (key.toLowerCase().contains(texto.toLowerCase())) {
                //Añadimos el contacto al ArrayList que vamos a devolver
                contactosCoincide.add(agenda.get(key));
            }
        }

        return contactosCoincide;
    }

    public void listarAgenda() {
        for(String movil: agenda.keySet()) {
            System.out.println(movil + " -> " + agenda.get(movil));
        }
    }

    public void listarAgendaOrdenado() {
        ArrayList<String> claves = new ArrayList<>(agenda.keySet());
        claves.sort(Comparator.comparing(String::trim));
        for(String key: claves) {
            System.out.println(key + " -> " + agenda.get(key));
        }
    }

}
