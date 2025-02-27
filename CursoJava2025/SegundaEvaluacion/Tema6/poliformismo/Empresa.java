package SegundaEvaluacion.Tema6.poliformismo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Empresa{");
        sb.append("empleados=").append(empleados);
        sb.append('}');
        return sb.toString();
    }

    public void addEmpleado(Empleado e) {
        this.empleados.add(e);
    }
}
