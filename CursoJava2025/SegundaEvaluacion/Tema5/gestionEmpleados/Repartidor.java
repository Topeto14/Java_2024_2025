package SegundaEvaluacion.Tema5.gestionEmpleados;

public class Repartidor extends Operario {
    enum Zona { ZONA1, ZONA2, ZONA3, ZONA4 }

    private Zona zona;

    public Repartidor(String nombre, Integer edad, Double salario,
                      boolean haceHorasExtra, Zona zona) {
        super(nombre, edad, salario, haceHorasExtra);
        this.zona = zona;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Repartidor");
        sb.append(super.toString());
        sb.append(", zona=").append(zona);
        sb.append(']');
        return sb.toString();
    }


    @Override
    public boolean aplicaPLUS() {
        if (this.edad < 25 && this.zona.equals(Zona.ZONA3))
            return true;
        else
            return false;
    }
}
