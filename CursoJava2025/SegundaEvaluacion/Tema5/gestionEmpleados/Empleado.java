package SegundaEvaluacion.Tema5.gestionEmpleados;

public abstract class Empleado {
    //No se pueden crear objetos de esa clase

    protected String nombre;
    protected Integer edad;
    protected Double salario;

    protected static final Integer PLUS = 300;

    public Empleado(String nombre, Integer edad, Double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado(Empleado emple) {
        this.nombre = emple.nombre;
        this.edad = emple.edad;
        this.salario = emple.salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("[");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", salario=").append(salario);
        sb.append(", salarioFinal=").append(this.calcularSalarioFinal());
        return sb.toString();
    }

    /**
     * Si se aplica o no el PLUS al salario del empleado
     * En esta clase no sabemos el código, se implementará en las clases hijas
     * Por eso es "abstract"
     * @return
     */
    public abstract boolean aplicaPLUS();

    public Double calcularSalarioFinal() {
        if (this.aplicaPLUS()) {
            return this.salario + Empleado.PLUS;
        } else {
            return this.salario;
        }
    }
}
