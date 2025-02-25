package SegundaEvaluacion.Tema5.gestionEmpleados;

public class MozoAlmacen extends Operario {
    enum Peligrosidad { PELIGROSIDAD1, PELIGROSIDAD2, PELIGROSIDAD3 }

    private Peligrosidad peligrosidad;

    public MozoAlmacen(String nombre, Integer edad, Double salario,
                       boolean haceHorasExtra, Peligrosidad peligrosidad) {
        super(nombre, edad, salario, haceHorasExtra);
        this.peligrosidad = peligrosidad;
    }

    public Peligrosidad getPeligrosidad() {
        return peligrosidad;
    }

    public void setPeligrosidad(Peligrosidad peligrosidad) {
        this.peligrosidad = peligrosidad;
    }

    @Override
    public boolean aplicaPLUS() {
        if ( (this.peligrosidad.equals(Peligrosidad.PELIGROSIDAD3)) ||
                (this.edad > 30 && this.peligrosidad.equals(Peligrosidad.PELIGROSIDAD2)) ||
                (this.edad <= 30 && this.peligrosidad.equals(Peligrosidad.PELIGROSIDAD1))
        ) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MozoAlmacen");
        sb.append(super.toString());
        sb.append(", peligrosidad=").append(peligrosidad);
        sb.append(']');
        return sb.toString();
    }
}
