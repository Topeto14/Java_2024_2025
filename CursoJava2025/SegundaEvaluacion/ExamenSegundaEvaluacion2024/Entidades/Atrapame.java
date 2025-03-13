package SegundaEvaluacion.ExamenSegundaEvaluacion2024.Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Atrapame {
    private ArrayList<Vuelo> vuelos;
    private ArrayList<ReservaVuelo> reservas;

    public Atrapame() {
        this.vuelos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public ArrayList<ReservaVuelo> getReservas() {
        return reservas;
    }

    public void addVuelo (Vuelo v) {
        this.vuelos.add(v);
    }
    /**
     * Metodo que crea Reserva comprueba que haya tantos asientos disponibles del tipo de asiento como números de pasajeros hay en la reserva.
     * Si no hay devuelve false. Si hay, crear la reserva añade a la reserva de cada pasajeros hay en la reserva a la lista de reservas.
     * */
    public boolean crearReserva(Vuelo vuelo, ArrayList<Pasajero> pasajeros,
                                TipoTarifa tTarifa, TipoAsiento tAsiento) {

        if (vuelo.verificarDisponibilidad(tAsiento) >= pasajeros.size()) {
            ReservaVuelo reserva = new ReservaVuelo(vuelo,tTarifa,tAsiento);
            for(Pasajero pasajero: pasajeros) {
                reserva.reservarAsiento(pasajero);
            }
            this.reservas.add(reserva);
            return true;

        } else {
            return false;
        }
    }
    /**antes de eliminar la reserva de la colección, debe entrar a su vuelo y liberar los
     asientos que tenían asignados en el vuelo
     * */
    public void cancelarReserva(String id) {
        for(ReservaVuelo reserva: this.reservas) {
            if (reserva.getId().equals(id)) {
                //Liberar asientos del vuelo
                for(Asiento asiento: reserva.getAsientos()) {
                    reserva.getVuelo().liberarAsiento(asiento);
                }

                this.reservas.remove(reserva); //A partir de la versión 21 de Java
                break;
            }
        }
    }

    /**
     * Buscar Vuelos por Destinos
     * */
    public ArrayList<Vuelo> buscarVuelos(String destino) {
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        for(Vuelo vuelo: this.vuelos) {
            if (vuelo.getDestino().equalsIgnoreCase(destino)) {
                vuelos.add(vuelo);
            }
        }
        return vuelos;
    }

    /**
     * Buscar Vuelos por Fecha
     * */
    public ArrayList<Vuelo> buscarVuelos(LocalDate fecha) {
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        for(Vuelo vuelo: this.vuelos) {
            if (vuelo.getFecha().equals(fecha)) {
                vuelos.add(vuelo);
            }
        }
        return vuelos;
    }

    /**
     * Buscar Veulos por Fecha y Destino
     * */
    public ArrayList<Vuelo> buscarVuelos(LocalDate fecha, String destino) {
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        for(Vuelo vuelo: this.vuelos) {
            if (vuelo.getFecha().equals(fecha) &&
                    vuelo.getDestino().equalsIgnoreCase(destino)) {
                vuelos.add(vuelo);
            }
        }
        return vuelos;
    }

    /**
     * Buscar Reservas por DNI
     * */
    public ArrayList<ReservaVuelo> buscarReservas(String dni) {
        ArrayList<ReservaVuelo> reservasFound = new ArrayList<>();
        for(ReservaVuelo reserva: this.reservas) {
            Pasajero ps = new Pasajero();
            ps.setDniPasaporte(dni);
            if (reserva.getPasajeros().contains(ps)) {
                reservasFound.add(reserva);
            }
        }

        return reservasFound;
    }


}
