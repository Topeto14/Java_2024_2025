package TerceraEvaluacion.Tema7Parte1.listas.mapas.agenda;

import SegundaEvaluacion.Tema6.ejercicioClase.Contacto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.*;
public class Agenda {
   /*
    private HashMap<String, Contacto> agenda;

    public Agenda() {
        agenda = new HashMap<>();
    }

    public void addContacto(String movil, Contacto contacto) {
        agenda.put(movil, contacto);
    }

    public boolean haveContacto(String movil) {
        return agenda.containsKey(movil);
    }

    public Contacto getContacto(String movil) {
        return agenda.get(movil);
    }

    public Contacto getContactoEmail(String email) {
        Collection<Contacto> valores = agenda.values();

        for(Contacto c: valores) {
            if (c.getEmail().equals(email))
                return c;
        }

        return null;
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

    */

}
