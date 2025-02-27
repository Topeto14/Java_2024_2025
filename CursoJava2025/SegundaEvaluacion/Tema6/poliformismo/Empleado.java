package SegundaEvaluacion.Tema6.poliformismo;

public class Empleado extends Persona {
    protected Double sueldoBase;

    public Empleado(String nombre, Double sueldoBase) {
        super(nombre);
        this.sueldoBase = sueldoBase;
    }

    public Double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(Double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Empleado{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", sueldoBase=").append(sueldoBase);
        sb.append('}');
        return sb.toString();
    }

    public void trabajar() {
        System.out.println("Estoy trabajando");
    }
}
