package TerceraEvaluacion.Tema7Parte1.Conjuntos.EjercicioOrdenacion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class EnvioPublicidad {
    private HashSet<Direccion> direcciones;

    public EnvioPublicidad() {
        direcciones = new HashSet<>();
    }

    public HashSet<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(HashSet<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public void addDireccion(Direccion d) {
        this.direcciones.add(d);
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

    /**
     * Ordena por nombre alfabéticamente, al revés
     */
    public void pintarDireccionesOrdenadasPorNombreReves() {
        ArrayList<Direccion> elementos = new ArrayList<>(this.direcciones);
        elementos.sort(Comparator.comparing(Direccion::getNombre).reversed());
        pintarElementos(elementos);
    }

    /**
     * Ordena por ciudad alfabéticamente
     */
    public void pintarDireccionesOrdenadasPorCiudad() {
        ArrayList<Direccion> elementos = new ArrayList<>(this.direcciones);
        elementos.sort(Comparator.comparing(Direccion::getCiudad));
        pintarElementos(elementos);
    }

    /**
     * Ordena por nombre, y en caso del mismo nombre, ordena por número
     */
    public void pintarDireccionesOrdenadasPorNombreYNumero() {
        ArrayList<Direccion> elementos = new ArrayList<>(this.direcciones);
        elementos.sort( new Comparator<Direccion>() {

            @Override
            public int compare(Direccion o1, Direccion o2) {
                if (o2.getNombre().compareTo(o1.getNombre()) == 0) {
                    return o1.getNumero().compareTo(o2.getNumero());
                } else {
                    return o2.getNombre().compareTo(o1.getNombre());
                }
            }
        });
        pintarElementos(elementos);
    }

    /**
     * Pintar un ArrayList
     * @param elementos
     */
    private void pintarElementos(ArrayList<Direccion> elementos) {
        final StringBuffer sb = new StringBuffer("EnvioPublicidad{");
        sb.append("direcciones=\n");
        for(Direccion d: elementos) {
            sb.append(d);
            sb.append("\n");
        }
        sb.append('}');
        System.out.println(sb);
    }
}
