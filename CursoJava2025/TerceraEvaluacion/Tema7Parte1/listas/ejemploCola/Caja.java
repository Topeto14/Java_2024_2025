package TerceraEvaluacion.Tema7Parte1.listas.ejemploCola;

public class Caja {
    private Double alto;
    private Double ancho;
    private Double profundidad;
    private String contenido;

    public Caja(Double alto, Double ancho, Double profundidad, String contenido) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.contenido = contenido;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(Double profundidad) {
        this.profundidad = profundidad;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Caja{");
        sb.append("alto=").append(alto);
        sb.append(", ancho=").append(ancho);
        sb.append(", profundidad=").append(profundidad);
        sb.append(", contenido='").append(contenido).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
