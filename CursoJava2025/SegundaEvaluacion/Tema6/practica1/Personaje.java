package SegundaEvaluacion.Tema6.practica1;

public abstract class Personaje {

    protected String nombre;
    protected Integer nivel;
    protected Integer salud;

    public Personaje(String nombre, Integer nivel, Integer salud) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append('}');
        return sb.toString();
    }

    public void subirNivel() {
        this.nivel++;
        this.salud += (int) Math.pow(3, nivel);

        if (this.nivel > 10) {
            this.nivel = 10;
        }
    }

    /**
     * Devuelve true si el monstrue se queda sin salud, muere
     * Devuelve false si el monstruo sigue vivo
     * @param puntos
     * @return
     */
    public boolean reducirVida(int puntos) {
        this.salud -= puntos;
        if (this.salud > 0)
            return false; //vivo
        else {
            this.salud = 0;
            return true; //muerto
        }
    }

    public abstract boolean golpear(Personaje personaje);


}
