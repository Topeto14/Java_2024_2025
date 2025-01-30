package SegundaEvaluacion.Tema4.EjercicioEntregar.BladeOfDarkness;

public class Monstruo {
    private String nombre;
    private ClaseMonstruo clase;
    private Integer nivel ;
    private Double salud ; //inicialmente a 100
    private Integer puntosD; //puntos de daño que hace el mosntruo al golpear

    public Monstruo(String nombre, ClaseMonstruo clase, Integer nivel, Double salud, Integer puntosD) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = 1;
        this.salud = 100.0;
        this.puntosD = puntosD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ClaseMonstruo getClase() {
        return clase;
    }

    public void setClase(ClaseMonstruo clase) {
        this.clase = clase;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(Integer puntosD) {
        this.puntosD = puntosD;
    }

    public Double getSalud() {
        return salud;
    }

    public void setSalud(Double salud) {
        this.salud = salud;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Monstruo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase=").append(clase);
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", puntosD=").append(puntosD);
        sb.append('}');
        return sb.toString();
    }
    // Methods
    /**
     * Un método para subir de nivel, subirNivel(), que incremente el nivel en 1 y suba su salud en 2 elevado a nivel.
     * El nivel máximo es 10.
     * */
    public void subirNivel(){
        if (nivel < 10) {
            nivel++;
            salud += Math.pow(2.0,nivel);
        }
    }
    /**
     * Un método reducirVida(int puntosD): reduce la propia salud del monstruo tanto como indica puntosD. Si la
     * salud no es cero tras restar devuelve false, si la salud queda a cero o menos, la salud se pone a cero y se
     * devuelve true (muerto)
     * */
    public Boolean reducirVida(Double puntosD){
        salud -= puntosD;
        if (salud <= 0) {
            salud = 0.0;
            return true;
        }
        return false;
    }
}
