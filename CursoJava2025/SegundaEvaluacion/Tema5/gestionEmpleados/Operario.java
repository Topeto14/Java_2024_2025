package SegundaEvaluacion.Tema5.gestionEmpleados;

public abstract class Operario extends Empleado {
    protected boolean haceHorasExtra;

    public Operario(String nombre, Integer edad, Double salario, boolean haceHorasExtra) {
        super(nombre, edad, salario);
        this.haceHorasExtra = haceHorasExtra;
    }

    public boolean isHaceHorasExtra() {
        return haceHorasExtra;
    }

    public void setHaceHorasExtra(boolean haceHorasExtra) {
        this.haceHorasExtra = haceHorasExtra;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(super.toString());
        sb.append(", haceHorasExtra=").append(haceHorasExtra);
        return sb.toString();
    }

    public abstract boolean aplicaPLUS();

    @Override
    public Double calcularSalarioFinal() {
        if (this.aplicaPLUS()) {
            if (this.haceHorasExtra) {
                return this.salario + (Empleado.PLUS * 2);
            } else {
                return this.salario + (Empleado.PLUS);
            }
        } else {
            return this.salario;
        }
    }
}
