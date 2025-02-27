package SegundaEvaluacion.Tema6.practica1;

public class Monstruo extends Personaje {
    enum Clase { GOBLIN ,TROLL, SKRALL, DEMONIO, FANTASMA }

    protected Clase clase;
    protected Integer puntosD;

    public Monstruo(String nombre, Clase clase, Integer puntosD) {
        super(nombre, 1, 100);
        this.clase = clase;
        this.puntosD = puntosD;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Integer getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(Integer puntosD) {
        this.puntosD = puntosD;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Monstruo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", clase=").append(clase);
        sb.append(", puntosD=").append(puntosD);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean golpear(Personaje personaje) {
        return personaje.reducirVida(this.puntosD);
    }

}
