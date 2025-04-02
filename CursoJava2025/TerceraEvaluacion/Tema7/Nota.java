package TerceraEvaluacion.Tema7;

public class Nota<T, E> {
    private T propietario;
    private E examen;

    public Nota(T propietario, E examen) {
        this.propietario = propietario;
        this.examen = examen;
    }

    public T getPropietario() {
        return propietario;
    }

    public void setPropietario(T propietario) {
        this.propietario = propietario;
    }

    public E getExamen() {
        return examen;
    }

    public void setExamen(E examen) {
        this.examen = examen;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Nota{");
        sb.append("propietario=").append(propietario);
        sb.append(", examen=").append(examen);
        sb.append('}');
        return sb.toString();
    }
}
