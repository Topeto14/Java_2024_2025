package TerceraEvaluacion.Tema7Parte1.Conjuntos.EjercicioOrdenacion;

import java.util.Comparator;
import java.util.TreeSet;

public class EnvioPublicidadTreeSet {
    /**
     * Sirve para ordenar, pero también para no añadir repetidos
     */
    private TreeSet<Direccion> direcciones;

    public EnvioPublicidadTreeSet() {
        direcciones = new TreeSet<>(Comparator.comparing(Direccion::getTipo));

        /*
        direcciones = new TreeSet<>(new Comparator<Direccion>() {

            @Override
            public int compare(Direccion o1, Direccion o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        */
    }

    public TreeSet<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(TreeSet<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("EnvioPublicidad{");
        sb.append("direcciones=\n");
        for(Direccion d: direcciones) {
            sb.append(d);
            sb.append("\n");
        }
        sb.append('}');
        return sb.toString();
    }

    public void addDireccion(Direccion d) {
        direcciones.add(d);
    }

    public void removeDireccion(Direccion d) {
        direcciones.remove(d);
    }
}
