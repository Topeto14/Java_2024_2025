package SegundaEvaluacion.ExamenSegundaEvaluacion2024;

public class AsientoBussines extends Asiento{
    protected boolean Comida;

    //Constructor
    public AsientoBussines(Long id, Double precioBase, Integer fila, String letra, boolean comida) {
        super(id, precioBase, fila, letra);
        Comida = comida;
        this.tipo = TipoAsiento.Business; // El asiento se pone a bussines.
    }
    //Getters and Setters

    public boolean isComida() {
        return Comida;
    }

    public void setComida(boolean comida) {
        Comida = comida;
    }

    // To String

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AsientoBussines{");
        sb.append("Comida=").append(Comida);
        sb.append(", Id=").append(Id);
        sb.append(", pasajero=").append(pasajero);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", fila=").append(fila);
        sb.append(", Letra=").append(Letra);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }


    //Metodo Extra
    /**
     * Si solo es bussines se le suma un 25% al precio del asiento
     * Si Tiene asiento Turista y Comida se le añade 30€
     * @return precio + 25%
     */
    @Override
    public Double calcularPrecio() {
        if (this.Comida) {
            return (this.precioBase * 1.25) + 30.0;
        }
        return this.precioBase * 1.25;
    }
}
