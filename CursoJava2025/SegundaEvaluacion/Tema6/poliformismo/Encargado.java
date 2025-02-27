package SegundaEvaluacion.Tema6.poliformismo;

public class Encargado extends Empleado{
    public Encargado(String nombre, Double sueldoBase) {
        super(nombre, sueldoBase);
    }

    @Override
    public Double getSueldoBase() {
        return super.getSueldoBase()*1.1;
    }

    public void supervisar() {
        System.out.println("Estoy supervisando");
    }

    @Override
    public void trabajar() {
        super.trabajar();
        System.out.println("Pero menos que ellos");

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Encargado{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", sueldoBase=").append(sueldoBase);
        sb.append('}');
        return sb.toString();
    }
}
