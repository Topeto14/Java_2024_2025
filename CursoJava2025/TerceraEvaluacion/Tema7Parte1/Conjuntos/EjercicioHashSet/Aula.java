package TerceraEvaluacion.Tema7Parte1.Conjuntos.EjercicioHashSet;

import java.util.ArrayList;

public class Aula {
    private String nombre;
    private String ubicacion;
    private ArrayList<Persona> alumnos;

    public Aula(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Aula{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", ubicacion='").append(ubicacion).append('\'');
        sb.append(", alumnos=").append(alumnos);
        sb.append('}');
        return sb.toString();
    }

    public void addAlumno(Persona al) {
        this.alumnos.add(al);
    }

    public boolean removeAlumno(Persona al) {
        return this.alumnos.remove(al);
    }

    public void setAlumnos(ArrayList<Persona> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Persona> getAlumnos() {
        return alumnos;
    }

    public void listarAlumnos() {
        for(Persona al: this.alumnos) {
            System.out.println(al.getDni() + ": " + al.getNombre() + " " + al.getApellidos());
        }
    }
}
