package SegundaEvaluacion.Tema4.Pizza;

public class Pizza {
    enum Size { PEQUEÑA, MEDIANA, FAMILIAR }
    enum Estado { PEDIDA, SERVIDA, COBRADA }
    enum Tipo { MARGARITA, COTTO, CUATROQUESOS, BARBACOA }

    private Size size;
    private Estado estado;
    private Tipo tipo;

    private static Integer totalPedidas=0;
    private static Integer totalServidas=0;

    public Pizza(Size size, Tipo tipo) {
        this.size = size;
        this.estado = Estado.PEDIDA;
        this.tipo = tipo;
        Pizza.totalPedidas++;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public static Integer getTotalPedidas() {
        return totalPedidas;
    }

    public static Integer getTotalServidas() {
        return totalServidas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pizza{");
        sb.append("size=").append(size);
        sb.append(", estado=").append(estado);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

    public void sirve() {
        if (this.estado == Estado.PEDIDA) {
            this.estado = Estado.SERVIDA;
            Pizza.totalServidas++;
        }

    }

}
