package SegundaEvaluacion.Tema5;

import java.util.Objects;

public class Rectangulo {
    private Double alto;
    private Double ancho;

    public Rectangulo(Double alto, Double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    //CONSTRUCTOR COPIA
    public Rectangulo(Rectangulo otro) {
        this.alto = otro.alto;
        this.ancho = otro.ancho;
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


    public Rectangulo incrementarAlto() {
        this.alto++;
        return this;
    }

    public Rectangulo decrementAlto() {
        this.alto--;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rectangulo{");
        sb.append("alto=").append(alto);
        sb.append(", ancho=").append(ancho);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;

        Rectangulo that = (Rectangulo) o; //Casting
        return Objects.equals(alto, that.alto) && Objects.equals(ancho, that.ancho);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(alto);
        result = 31 * result + Objects.hashCode(ancho);
        return result;
    }
}
