package SegundaEvaluacion.Tema6.practica1;

public class Arma {
    enum Tipo { ESPADA, HACHA, BASTON, ARCO}

    private String nombre;
    private Tipo tipo;
    private Integer puntosD;
    private boolean dosManos;

    public Arma(String nombre, Tipo tipo, Integer puntosD, boolean dosManos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.puntosD = puntosD;
        this.dosManos = dosManos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Integer getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(Integer puntosD) {
        this.puntosD = puntosD;
    }

    public boolean isDosManos() {
        return dosManos;
    }

    public void setDosManos(boolean dosManos) {
        this.dosManos = dosManos;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Arma{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", puntosD=").append(puntosD);
        sb.append(", dosManos=").append(dosManos);
        sb.append('}');
        return sb.toString();
    }
}
