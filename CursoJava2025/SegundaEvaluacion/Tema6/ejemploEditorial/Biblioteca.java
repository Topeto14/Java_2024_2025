package SegundaEvaluacion.Tema6.ejemploEditorial;
import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Publicacion> publicaciones;

    public Biblioteca() {
        publicaciones = new ArrayList<Publicacion>();
    }

    public ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Biblioteca{");
        sb.append("publicaciones=").append(publicaciones);
        sb.append('}');
        return sb.toString();
    }

    public void addPublicacion(Publicacion publicacion) {
        this.publicaciones.add(publicacion);
    }
}
