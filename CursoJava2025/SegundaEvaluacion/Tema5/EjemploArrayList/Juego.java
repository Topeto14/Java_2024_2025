package SegundaEvaluacion.Tema5.EjemploArrayList;

import java.util.Objects;

public class Juego {
    enum Plataforma { PC, PLAYSTATION, XBOX, SWITCH }

    private String nombre;
    private Plataforma plataforma;

    public Juego(String nombre, Plataforma plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Juego{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", plataforma=").append(plataforma);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Juego juego = (Juego) o;
        return Objects.equals(nombre, juego.nombre) && plataforma == juego.plataforma;
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nombre);
        result = 31 * result + Objects.hashCode(plataforma);
        return result;
    }
}
