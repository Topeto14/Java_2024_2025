package SegundaEvaluacion.ExamenSegundaEvaluacion2024;

public class AsientoTurista extends Asiento {
    private boolean ventana;

    public AsientoTurista(Long id, Double precioBase, Integer fila, String letra, boolean ventana) {
        super(id, precioBase, fila, letra);
        this.ventana = ventana;
        this.tipo = TipoAsiento.Turista; // El tipo se pone a turista
    }

    //Getters and Setters


    public boolean isVentana() {
        return ventana;
    }

    public void setVentana(boolean ventana) {
        this.ventana = ventana;
    }
    //To String


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AsientoTurista{");
        sb.append("ventana=").append(ventana);
        sb.append(", Id=").append(Id);
        sb.append(", pasajero=").append(pasajero);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", fila=").append(fila);
        sb.append(", Letra='").append(Letra).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Si el asiento tiene ventana
     * @return precio base + 10€
     */
    @Override
    public Double calcularPrecio() {
        if (this.ventana) {
            return this.precioBase + 10.0;
        }
        return this.precioBase;
    }

}
