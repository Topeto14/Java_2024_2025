package SegundaEvaluacion.Tema6.ejercicioClase;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public List<Contacto> getContactos() {
        return contactos;
    }


    /**
     * Nos indica si un contacto está ya en la agenda
     * @param c
     * @return
     */
    public boolean existeContacto(Contacto c) {
        return this.contactos.contains(c);
    }

    /**
     * Añade un contacto a la agenda.
     * Si ya está, no lo añade y devuelve false
     * Si no está, lo añade y devuelve true
     * @param c
     * @return
     */
    public boolean addContacto(Contacto c) {
        if (!this.existeContacto(c)) {
            this.contactos.add(c);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Pinta los contactos de la agenda
     */
    public void listarContactos() {
        System.out.println("---------------------------------");
        if (this.contactos.size() == 0) {
            System.out.println("Agenda vacía");
        } else {
            for(Contacto c: this.contactos) {
                System.out.println(c);
            }
        }
        System.out.println("---------------------------------");
    }

    /**
     * Busca un contacto por nombre en la agenda
     * @param nombre
     * @return
     */
    public Contacto buscarContacto(String nombre) {
        //indexOf busca llamando a equals de la clase correspondiente (Contacto)
        int posicion = this.contactos.indexOf(new Contacto(nombre,""));
        if (posicion < 0)
            return null;
        else
            return this.contactos.get(posicion);
    }

    /**
     * Elimina un contacto por nombre en la agenda
     * Si lo puede eliminar devuelve true, sino false
     * @param contacto
     * @return
     */
    public boolean eliminarContacto(Contacto contacto) {
        return this.contactos.remove(contacto);
    }

}
