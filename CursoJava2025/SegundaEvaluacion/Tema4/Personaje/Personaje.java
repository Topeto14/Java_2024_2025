package SegundaEvaluacion.Tema4.Personaje;
// // Crear una clase Personaje
//    -nombre de tipo String
//    -clase de tipo String (elfo,barbaro...)
//    -sexo de tipo String (hombre,mujer, nodefinido)
//    -vida de tipo Integer (0-100)
//
//    Constructor
//    -Todas las propiedades -> new Personaje ("Aragorn", "Guerrero", "hombre",50 )
//    -Vacio-> new Personaje() -> que ponga por defecto ("SinNombre", " Humano", "nodefinido",10)
//
//    Metodos
//    -Getter
//    -Setter
//    -ToString

public class Personaje {

    private String nombre;
    private String clase;
    private String sexo;
    private Integer vida;
    private Arma arma;


    public Personaje(String nombre, String clase, String sexo, Integer vida, Arma arma) {
        this.nombre = nombre;
        this.clase = clase;
        this.sexo = sexo;
        this.vida = vida;
        this.arma = arma;
    }

    public Personaje() {
        this.nombre = " SinNombre";
        this.clase = " Humano";
        this.sexo = " Masculino";
        this.vida = 10;
        this.arma = null ;

    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase='").append(clase).append('\'');
        sb.append(", sexo='").append(sexo).append('\'');
        sb.append(", vida=").append(vida);
        sb.append(", tipo=").append(arma);
        sb.append('}');
        return sb.toString();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    /*Mis Metodo
    - Añade un método en Personaje que sea golpear
    public void golpear(Personaje personaje) {
        this.arma.golpear(personaje);
    }
    */

    public void golpear(Personaje personaje) {
        this.arma.golpear(personaje);
    }



}
