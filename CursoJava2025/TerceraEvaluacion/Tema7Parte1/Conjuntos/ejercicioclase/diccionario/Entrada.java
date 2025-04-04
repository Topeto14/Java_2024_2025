package TerceraEvaluacion.Tema7Parte1.Conjuntos.ejercicioclase.diccionario;
import java.util.Objects;
public class Entrada implements Comparable<Entrada> {
    private String palabra;
    private String traduccion;

    public Entrada(String palabra, String traduccion) {
        this.palabra = palabra;
        this.traduccion = traduccion;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getTraduccion() {
        return traduccion;
    }

    public void setTraduccion(String traduccion) {
        this.traduccion = traduccion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Entrada{");
        sb.append("palabra='").append(palabra).append('\'');
        sb.append(", traduccion='").append(traduccion).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Entrada entrada = (Entrada) o;
        return Objects.equals(getPalabra(), entrada.getPalabra());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPalabra());
    }

    @Override
    public int compareTo(Entrada o) {
        return palabra.compareTo(o.palabra);
    }
}
