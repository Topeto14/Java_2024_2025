package SegundaEvaluacion.Tema6.tiendaComics;

import java.time.LocalDate;
import java.util.ArrayList;

public class Autor {
    private String nombre;
    private String apellidos;
    private String email;
    private LocalDate fechaNacimiento;
    private Rol rol;
    private ArrayList<Comic> comics;

    public Autor(String nombre, String apellidos, String email, LocalDate fechaNacimiento, Rol rol) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
        this.comics = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public ArrayList<Comic> getComics() {
        return comics;
    }


    /**
     * Añadir comic al autor
     * @param comic
     * @return
     */
    public boolean addComic(Comic comic) {
        if (!this.comics.contains(comic)) {
            this.comics.add(comic);
            //Añade este autor a la lista de autores del comic
            comic.addAutor(this);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeComic(Comic comic) {
        comic.removeAutor(this);
        return this.comics.remove(comic);

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Autor{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", rol=").append(rol);
        //sb.append(", comics=").append(comics); // OJO!!
        sb.append('}');
        return sb.toString();
    }
}
