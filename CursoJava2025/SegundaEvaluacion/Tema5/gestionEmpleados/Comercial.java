package SegundaEvaluacion.Tema5.gestionEmpleados;

public class Comercial extends Empleado {
    private Double comision;

    public Comercial(String nombre, Integer edad, Double salario, Double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Comercial");
        sb.append(super.toString());
        sb.append(", comision=").append(comision);
        sb.append(']');
        return sb.toString();
    }

    @Override
    public boolean aplicaPLUS() {
        if (this.edad > 30 && this.comision > 200)
            return true;
        else
            return false;
    }
}
