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
    private int vida;

    public Personaje(String pepito, String barbaro, String hombre, int i) {
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Personaje{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase='").append(clase).append('\'');
        sb.append(", sexo='").append(sexo).append('\'');
        sb.append(", vida=").append(vida);
        sb.append('}');
        return sb.toString();
    }

    public Personaje() {
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

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
