package SegundaEvaluacion.ExamenSegundaEvaluacion2024.Entidades;

public class AsientoTurista extends Asiento {
    private boolean isVentana;

    public AsientoTurista(Long id, Double precioBase, Integer fila, String letra, boolean isVentana) {
        super(id, precioBase, fila, letra);
        this.isVentana = isVentana;
        this.tipo = TipoAsiento.Turista; // El tipo se pone a turista
    }
    //Getters and Setters


    public boolean isVentana() {
        return isVentana;
    }

    public void setVentana(boolean ventana) {
        this.isVentana = ventana;
    }
    //To String
    /* Ejemplo Profesor:
    *   @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AsientoTurista{");
        sb.append("codigo=").append(this.getCodigo());
        sb.append(" pasajero=").append(this.getPasajero() == null ? "X" : this.getPasajero().getDniPass());
        sb.append(", precio=").append(this.calcularPrecio());
        sb.append(", tipo=").append(tipo);
        sb.append(", isVentana=").append(isVentana);
        sb.append('}');
        return sb.toString();
    }
    * */

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AsientoTurista{");
        sb.append("isVentana=").append(isVentana);
        sb.append(", Id=").append(Id);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", tipo=").append(tipo);
        sb.append(", pasajero=").append(this.getPasajero() == null ? "null" : this.getPasajero());
        sb.append('}');
        return sb.toString();
    }

    /**
     * Si el asiento tiene ventana
     * @return precio base + 10€
     */

    /* Ejemplo profesor

    public Double calcularPrecio() {
        return this.isVentana ? (this.precioBase + 10) : this.precioBase;
    }
    * */
    @Override
    public Double calcularPrecio() {
        if (this.isVentana) {
            return this.precioBase + 10.0;
        }
        return this.precioBase;
    }

}
