package SegundaEvaluacion.ExamenSegundaEvaluacion2024.Entidades;

import java.util.Objects;
import java.util.UUID;

public abstract class Asiento {

    protected Long Id ;
    protected Pasajero pasajero;
    protected Double precioBase;
    protected Integer fila;
    protected String Letra;
    protected TipoAsiento tipo;

    //Constructores sin pasajero ni tipo asiento

    public Asiento(Long id, Double precioBase, Integer fila, String letra) {
        this.Id = id;
        this.precioBase = precioBase;
        this.fila = fila;
        this.Letra = letra;
    }


    // Getters Ands Setters


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String letra) {
        Letra = letra;
    }

    public TipoAsiento getTipo() {
        return tipo;
    }

    public void setTipo(TipoAsiento tipo) {
        this.tipo = tipo;
    }


    //To String Preguntar porque el ojo de String tipo asiento


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Asiento{");
        sb.append("Id=").append(Id);
        sb.append(", pasajero=").append(pasajero.getDniPasaporte());
        sb.append(", precioBase=").append(precioBase);
        sb.append(", fila=").append(fila);
        sb.append(", Letra='").append(Letra).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

    //Equals por Id

    /* Ejemplo profesor

    *   @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Asiento asiento = (Asiento) o;
        return Objects.equals(id, asiento.id);
    }
    * */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asiento asiento = (Asiento) o;
        return Objects.equals(Id, asiento.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(Id);
    }

//Metodos

    /**
     * Metodo que devuelve
     * @return la fila y la letra de un asiento
     */
    /*Ejemplo de Javi

    public String getCodigo() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.fila).append("-").append(this.letra);
        return sb.toString();
    }
    * */

    public String getCodigo(){
        return this.getFila() + " - " + this.getLetra();
    }

    /**
     *Un Metodo Abstracto
     * @return el precio de la asiento
     */
    public abstract Double calcularPrecio();

}
