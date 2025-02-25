package SegundaEvaluacion.Tema4.EjercicioEntregar.BladeOfDarkness;

public class Arma {
    private String nombre ;
    private TipoArma tipo ;
    private Double puntosD ; // Puntos de daño
    private Boolean dosManos ;

    public Arma(String nombre, TipoArma tipo, Boolean dosManos, Double puntosD) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.dosManos = dosManos;
        this.puntosD = puntosD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoArma getTipo() {
        return tipo;
    }

    public void setTipo(TipoArma tipo) {
        this.tipo = tipo;
    }

    public Double getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(Double puntosD) {
        this.puntosD = puntosD;
    }

    public Boolean getDosManos() {
        return dosManos;
    }

    public void setDosManos(Boolean dosManos) {
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
