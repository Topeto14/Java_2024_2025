package SegundaEvaluacion.ExamenSegundaEvaluacion2024.Entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

public class Vuelo {
    private String codigo;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private LocalTime hora;
    private Double precioBase;
    private Integer asientoDisponibles;
    private ArrayList<Asiento> asientos;

    // EL UUID.randomUUID().toString(); genera codigos unicos de 36 caracteres aleatorios ejemplo f47ac10b-58cc-4372-a567-0e02b2c3d479
    public Vuelo(String origen, String destino, LocalDate fecha, LocalTime hora, Double precioBase, Integer asientoDisponibles, ArrayList<Asiento> asientos) {
        this.codigo = UUID.randomUUID().toString();
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.precioBase = precioBase;
        this.asientoDisponibles = asientoDisponibles;

        this.asientos = new ArrayList<>();//Se Crea el arraylist poniendo el new ArrayList<>();

        //Crear Asientos
        // Hago un bucle en el que se inicie en cero hasta los asientos disponibles
        //El String.valueof convierte un valor de tipo char  en un String.
        for (int i = 0; i < this.asientoDisponibles; i++) {
            if (i<this.asientoDisponibles * 0.3){
                this.asientos.add(new AsientoBussines((long)i, this.precioBase, i + 1, String.valueOf((char)('A' + i % 10)), false));
            }else {
                this.asientos.add(new AsientoTurista((long)i, this.precioBase,i+1, String.valueOf((char)( 'A'+ i % 10)),false));
            }
        }
    }
    /* Ejemplo profesor

    public Vuelo(String origen, String destino, LocalDate fecha,
                 LocalTime hora, Double precioBase, Integer asientosDisponibles) {
        this.codigo = UUID.randomUUID().toString();
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.precioBase = precioBase;
        this.asientosDisponibles = asientosDisponibles;

        //Generar los asientos del vuelo
        int numBusiness=0;
        this.asientos = new ArrayList<>(this.asientosDisponibles);
        for(int i=0; i < (this.asientosDisponibles*0.3); i++) {
           char letra = (char) (65 + (i % 4));
           AsientoBusiness ab = new AsientoBusiness((long) i, 200.0, i / 4,
                   Character.toString(letra), true);
           this.asientos.add(ab);
           numBusiness++;
        }

        for(int i=numBusiness; i < (this.asientosDisponibles*0.7) + numBusiness; i++) {
            char letra = (char) (65 + (i % 4));
            AsientoTurista ab = new AsientoTurista((long) i,
                    120.0, i / 4,
                    Character.toString(letra), true);
            this.asientos.add(ab);
        }

    }
    * */

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getAsientoDisponibles() {
        return asientoDisponibles;
    }

    public void setAsientoDisponibles(Integer asientoDisponibles) {
        this.asientoDisponibles = asientoDisponibles;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(ArrayList<Asiento> asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vuelo{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", origen='").append(origen).append('\'');
        sb.append(", destino='").append(destino).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", hora=").append(hora);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", asientoDisponibles=").append(asientoDisponibles);
        sb.append(", asientos=").append(asientos);
        sb.append('}');
        // Bucle que recorre la lista de asientos
        for(Asiento as: this.asientos) {
            sb.append(as.toString()); // Añade el resultado de toString() de cada asiento
            sb.append("\n"); // Añade un salto de línea después de cada asiento
        }
        sb.append('}');
        return sb.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return Objects.equals(codigo, vuelo.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
    //Metodos Extras
    /**
     * Devuelve el número de asientos disponibles (sin Pasajero asignado) del tipo indicado
     * @param tipoAsiento
     * @return contador ;
     */
    public Integer verificarDisponibilidad(TipoAsiento tipoAsiento) {
        Integer contador = 0; //Inicializa un contador a 0
        for (Asiento asiento : this.asientos) { //Recorre todos los asientos (Asiento"La clase" asiento "el nombre que le pondre": this.asiento"nombre de la propiedad que utilizare")
            if (asiento.getTipo().equals(tipoAsiento)&& asiento.getPasajero()==null){
                // Si el asiento es del tipo indicado y no tiene pasajero, incrementa el contador
                contador++;
            }
        }
        return contador; //Devuelve el numero de asientos libres
    }
    /**
     * Devuelve el primer asiento del tipoAsiento indicado que está libre o null si no hay ninguno libre
     * @param tipoAsiento
     * @return
     */
    public Asiento buscarAsientoDisponible(TipoAsiento tipoAsiento) {
        for(Asiento asiento: asientos) {
            if (asiento.getTipo().equals(tipoAsiento) && asiento.getPasajero() == null) {
                return asiento;
            }
        }

        return null;
    }

    /**
     * Ocupa el asiento por el pasajero, si el asiento no tiene pasajero
     * @param pasajero
     * @param asiento
     * @return
     */
    /* Ejemplo profesor
    *  public boolean ocuparAsiento(Pasajero pasajero, Asiento asiento) {
        if (asiento.getPasajero() == null) { //disponible
            pasajero.setAsiento(asiento);
            asiento.setPasajero(pasajero);
            return true;
        }
        return false;
    }
    * */
    public boolean ocuparAsiento(Pasajero pasajero, Asiento asiento) {
        if (asiento.getPasajero() == null) {
            asiento.setPasajero(pasajero);
            pasajero.setAsiento(asiento);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Se libera el asiento quitando el posible pasajero asociado al asiento
     * Si el asiento tenía pasajero asignado, al asiento de ese pasajero se le pone null también
     * @param asiento
     */
    public void liberarAsiento(Asiento asiento) {
        if (asiento.getPasajero() != null) {
            //Asiento -> pasajero
            //Pasajero -> asiento

            asiento.getPasajero().setAsiento(null);
            asiento.setPasajero(null);
        }
    }
    /* Ejemplo profesor

    *     public void liberarAsiento(Asiento asiento) {
        asiento.getPasajero().setAsiento(null); //Importante esto primero
        asiento.setPasajero(null);
    }
    * */

    /**
     * Calcula los días que faltan hasta el día del vuelo
     * @return
     * Se utilizaria LocalDateTime si quiero la diferencia de horas.
     */
    public long diasFaltanVuelo() {
        ////Period.between --> num años, num meses, num dias
        return ChronoUnit.DAYS.between(LocalDate.now(), this.getFecha());
    }

    /**
     * Devolvemos todos los pasajeros que tienen asiento asignado ya en el vuelo
     * @return ArrayList<Pasajero>
     */
    public ArrayList<Pasajero> getPasajeros() {
        ArrayList<Pasajero> pasajerosVuelo = new ArrayList<>();
        for(Asiento asiento: this.asientos) {
            if (asiento.getPasajero() != null)
                pasajerosVuelo.add(asiento.getPasajero());
        }

        return pasajerosVuelo;
    }
}
