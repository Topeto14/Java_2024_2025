package SegundaEvaluacion.Tema5.EjemploArrayList2;

import java.util.Objects;

public class Alumno {
    private String nombre;
    private String dni;
    private String email;

    public Alumno(String nombre, String dni, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Alumno{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(dni, alumno.dni) && Objects.equals(email, alumno.email);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nombre);
        result = 31 * result + Objects.hashCode(dni);
        result = 31 * result + Objects.hashCode(email);
        return result;
    }
}
