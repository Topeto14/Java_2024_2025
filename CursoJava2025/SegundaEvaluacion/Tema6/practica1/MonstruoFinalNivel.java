package SegundaEvaluacion.Tema6.practica1;

public class MonstruoFinalNivel extends Monstruo{
    private Integer puntosGolpeEspecial;
    private Integer usosGolpeEspecial;


    public MonstruoFinalNivel(String nombre, Clase clase, Integer puntosD,
                              Integer pGE) {
        super(nombre, clase, puntosD);
        this.puntosGolpeEspecial = pGE;
        this.usosGolpeEspecial = 3;
    }

    public Integer getPuntosGolpeEspecial() {
        return puntosGolpeEspecial;
    }

    public void setPuntosGolpeEspecial(Integer puntosGolpeEspecial) {
        this.puntosGolpeEspecial = puntosGolpeEspecial;
    }

    public Integer getUsosGolpeEspecial() {
        return usosGolpeEspecial;
    }

    public void setUsosGolpeEspecial(Integer usosGolpeEspecial) {
        this.usosGolpeEspecial = usosGolpeEspecial;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MonstruoFinalNivel{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", clase=").append(clase);
        sb.append(", puntosD=").append(puntosD);
        sb.append(", puntosGolpeEspecial=").append(puntosGolpeEspecial);
        sb.append(", usosGolpeEspecial=").append(usosGolpeEspecial);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean golpear(Personaje personaje) {
        if (this.usosGolpeEspecial > 0) {
            this.usosGolpeEspecial--;
            return personaje.reducirVida(this.puntosGolpeEspecial);
        } else {
            return super.golpear(personaje);
        }
    }
}
