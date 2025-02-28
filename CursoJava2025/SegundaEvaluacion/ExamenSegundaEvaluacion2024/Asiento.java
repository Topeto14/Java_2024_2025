package SegundaEvaluacion.ExamenSegundaEvaluacion2024;

import java.util.Objects;

public abstract class Asiento {

    protected static Long Id = 0L;

    protected Pasajero pasajero;
    protected Double precioBase;
    protected Integer fila;
    protected String Letra;
    protected TipoAsiento tipo;

    //Constructores sin pasajero ni tipo asiento
    public Asiento(Double precioBase, Integer fila, String letra) {
        this.precioBase = precioBase;
        this.fila = fila;
        Letra = letra;
        Asiento.Id ++;
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
        sb.append("pasajero=").append(pasajero);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", fila=").append(fila);
        sb.append(", Letra='").append(Letra).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
    //Equals por Id

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asiento asiento = (Asiento) o;
        return Objects.equals(Id, asiento.Id) && Objects.equals(pasajero, asiento.pasajero) && Objects.equals(precioBase, asiento.precioBase) && Objects.equals(fila, asiento.fila) && Objects.equals(Letra, asiento.Letra) && tipo == asiento.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, pasajero, precioBase, fila, Letra, tipo);
    }

    //Metodos

    /**
     * Metodo que devuelve
     * @return la fila y la letra de un asiento
     */

    public String getCodigo(){
        return fila + Letra;
    }

    /**
     *Un Metodo Abstracto
     * @return el precio de la asiento
     */
    public abstract Double calcularPrecio();

}
