package SegundaEvaluacion.ExamenSegundaEvaluacion2024.Entidades;

import java.util.ArrayList;
import java.util.UUID;

public class ReservaVuelo {
    private String id;
    private Vuelo vuelo;
    private ArrayList<Pasajero> pasajeros;
    private TipoTarifa tipoTarifa;
    private TipoAsiento tipoAsiento;

    // Constructor
    /* Constructor 1:
    * Genera un ID único automáticamente.
    Inicializa una lista vacía de pasajeros.
    Usado cuando no se tiene una lista de pasajeros inicial o el ID debe generarse internamente.
    * */
    public ReservaVuelo( Vuelo vuelo, ArrayList<Pasajero> pasajeros, TipoTarifa tipoTarifa, TipoAsiento tipoAsiento) {
        this.id = UUID.randomUUID().toString();
        this.vuelo = vuelo;
        this.pasajeros = new ArrayList<>();
        this.tipoTarifa = tipoTarifa;
        this.tipoAsiento = tipoAsiento;
    }

    /*
    * Constructor 2:
    * Genera un ID único automáticamente.
        Permite pasar una lista completa de pasajeros al momento de la creación de la reserva.
        Usado cuando ya se tiene un ID y/o una lista de pasajeros listos para ser asignados a la reserva.
        * String id deveria de quitarse
    * */
    public ReservaVuelo(String id, Vuelo vuelo, ArrayList<Pasajero> pasajeros, TipoTarifa tipoTarifa, TipoAsiento tipoAsiento) {
        this.id = UUID.randomUUID().toString();
        this.vuelo = vuelo;
        this.pasajeros = pasajeros;
        this.tipoTarifa = tipoTarifa;
        this.tipoAsiento = tipoAsiento;
    }

    public ReservaVuelo(Vuelo vuelo, TipoTarifa tTarifa, TipoAsiento tAsiento) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public TipoTarifa getTipoTarifa() {
        return tipoTarifa;
    }

    public void setTipoTarifa(TipoTarifa tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

    public TipoAsiento getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(TipoAsiento tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ReservaVuelo{");
        sb.append("id='").append(id).append('\'');
        sb.append(", vuelo=").append(vuelo.getCodigo()); // OJO
        sb.append(", dias para el vuelo=").append(vuelo.diasFaltanVuelo()); //OJO
        sb.append(", billetes=").append(this.imprimirBilletes()); //OJO
        sb.append('}');
        return sb.toString();
    }

    //Metodos
    /**Añadir pasajero
     * */
    private void AddPasajero(Pasajero pasajero){
        this.pasajeros.add(pasajero);
    }
    /* Ejemplo profesor
    Este método verifica primero si el pasajero ya está en la lista de pasajeros (this.pasajeros) antes de agregarlo.
    this.pasajeros.contains(pasajero): Aquí, contains() revisa si el objeto pasajero ya existe en la lista. Si el pasajero ya está presente, no se agrega nuevamente.
    Solo agrega el pasajero si no está previamente en la lista.

    private void addPasajero(Pasajero pasajero) {
        if (!this.pasajeros.contains(pasajero)) {
            this.pasajeros.add(pasajero);
        }
    }
    * */

    /**Eliminar Pasajero
     * */
    public void removePasajero(Pasajero pasajero){
        this.pasajeros.remove(pasajero);
    }
    /**
     * Devuelve todos los asientos de la reserva que han sido asignados a cada pasajero
     * @return
     */
    public ArrayList<Asiento> getAsientos() {
        ArrayList<Asiento> asientos = new ArrayList<>();
        for (Pasajero pasajero : this.pasajeros) {
            asientos.add(pasajero.getAsiento());
        }
        return asientos;
    }

    /**
     * Si hay disponibilidad de asientos, ocupa el asiento en el vuelo, y añade
     * el pasajero a la lista de pasajeros de la reserva
     * @param pasajero
     * @return
     */
    public boolean reservarAsiento(Pasajero pasajero) {
        if (this.vuelo.verificarDisponibilidad(this.tipoAsiento) <= 0) {
            return false;
        } else {
            Asiento asiento = this.vuelo.buscarAsientoDisponible(this.tipoAsiento);
            Pasajero nuevo = new Pasajero(pasajero); //Clonamos el pasajero
            this.getVuelo().ocuparAsiento(nuevo,asiento);
            this.AddPasajero(nuevo); //Solo añadir pasajeros si podemos reservar asiento
            return true;
        }
    }

    public Double calcularPrecioTotal() {
        Double total = 0d;
        for(Asiento asiento: this.getAsientos()) {
            if (this.tipoTarifa.equals(TipoTarifa.Confort)) {
                total += 1.15 * asiento.calcularPrecio();
            }
            if (this.tipoTarifa.equals(TipoTarifa.Optima)) {
                total += 1.1 * asiento.calcularPrecio();
            }
            if (this.tipoTarifa.equals(TipoTarifa.Flexible)) {
                total += 1.30 * asiento.calcularPrecio();
            }
        }
        return total;
    }

    public String imprimirBilletes() {
        StringBuffer sb = new StringBuffer();
        for(Pasajero pasajero: this.getPasajeros()) {
            sb.append(pasajero.getDniPasaporte());
            sb.append(" -> ");
            sb.append(pasajero.getAsiento().getCodigo());
            sb.append("\n");
        }
        sb.append("Precio total = ");
        sb.append(this.calcularPrecioTotal());

        return sb.toString();
    }


}
