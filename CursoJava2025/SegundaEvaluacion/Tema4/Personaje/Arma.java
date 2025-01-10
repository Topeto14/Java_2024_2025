package SegundaEvaluacion.Tema4.Personaje;

//1. Crear una nueva clase Arma
//    Propiedades:
//    - nombre de tipo String
//    - tipo de tipo enum TipoArma
//    - golpe de tipo Integer
//
//    Para crear un enum -> enum TipoArma { ESPADA, MARTILLO, HACHA }
//
//    Constructor:
//    - con todas las propiedades -> new Arma("Espadón", TipoArma.ESPADA, 44);
//    - vacío sin valores (que tome los valores por defecto) -> dejar en blanco el constructor
//
//    Métodos:
//    - Getters, Setters y toString
//    - public void golpear(Personaje personaje) {
//        personaje.setVida(personaje.getVida() - this.golpe);
//      }

public class Arma {

    enum TipoArma {ESPADA, MARTILLO, HACHA}

    private String nombre;
    private TipoArma tipo;
    private Integer golpe;

    public Arma(String nombre, TipoArma tipo, Integer golpe) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.golpe = golpe;
    }

    public Arma() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoArma getTipo() {
        return tipo;
    }

    public void setTipo(TipoArma tipo) {
        this.tipo = tipo;
    }

    public Integer getGolpe() {
        return golpe;
    }

    public void setGolpe(Integer golpe) {
        this.golpe = golpe;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Arma{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", golpe=").append(golpe);
        sb.append('}');
        return sb.toString();
    }
    //Mis métodos

    /**
     * Al personaje que se pasa como parámetro se le resta de vida el golpe del arma
     * @param personaje
     */
    public void golpear(Personaje personaje) {
        personaje.setVida(personaje.getVida()-this.golpe);
    }
}
