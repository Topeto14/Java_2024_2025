package SegundaEvaluacion.Tema4.EjercicioEntregar.BladeOfDarkness;

public class Jugador {
    private String nombre ;
    private ClaseJugador clase ;
    private Integer nivel ;
    private Integer experiencia ;
    private Double salud ;
    private Arma armaDerecha ;
    private Arma armaIzquierda;

    public Jugador(String nombre, ClaseJugador clase, Integer nivel, Integer experiencia, Integer salud, Arma armaDerecha, Arma armaIzquierda) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = 1;
        this.experiencia = 0;
        this.salud = 200.0;
        this.armaDerecha = null;
        this.armaIzquierda = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ClaseJugador getClase() {
        return clase;
    }

    public void setClase(ClaseJugador clase) {
        this.clase = clase;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Double getSalud() {
        return salud;
    }

    public void setSalud(Double salud) {
        this.salud = salud;
    }

    public Arma getArmaDerecha() {
        return armaDerecha;
    }

    public void setArmaDerecha(Arma armaDerecha) {
        this.armaDerecha = armaDerecha;
    }

    public Arma getArmaIzquierda() {
        return armaIzquierda;
    }

    public void setArmaIzquierda(Arma armaIzquierda) {
        this.armaIzquierda = armaIzquierda;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", clase=").append(clase);
        sb.append(", nivel=").append(nivel);
        sb.append(", experiencia=").append(experiencia);
        sb.append(", salud=").append(salud);
        sb.append(", armaDerecha=").append(armaDerecha);
        sb.append(", armaIzquierda=").append(armaIzquierda);
        sb.append('}');
        return sb.toString();
    }
    //Methods
    /**
     * Se incrementa el nivel en 1 y suba su salud 2.5 elevado al nivel . El nivel máximo es 10.
     * */
    public void subirNivel(){
        if (nivel < 10) {
            nivel++;
            salud += Math.pow(2.5, nivel);
        }
    }
    /**
     *Si están libres el arma derecha o izquierda, asignará esa arma a uno de los
     * dos y devolverá true. Si están ocupados los dos devolverá false pues no se puede poner el arma. Si lo que
     * intentas equipar es un arma a dos manos, solo se puede poner si están los dos brazos libres, y se pone la
     * misma arma en los brazos. Se empieza equipando por la derecha.
     * */
    public boolean equipar (Arma arma) {
        if (arma.getDosManos()) {
            if (armaDerecha == null && armaIzquierda == null) {
                armaDerecha = arma;
                armaIzquierda = arma;
                return true;
            }
        }else {
            if (armaDerecha == null){
                armaDerecha = arma;
                return true;
            } else if (armaIzquierda == null) {
                armaIzquierda = arma;
                return true;
            }
        }
        return false;
    }
    /**
     * Un método tomarPocion(int puntosS): método que sube la salud del jugador tanto como indica puntosS,
     * hasta un máximo de 10000.
     * */
    public void tomarPocion(Double puntosS){
        salud += puntosS;
        if (salud > 10000.0) {
            salud = 10000.0;
        }
    }
    /**
     * Un método reducirVida(int puntosD): reduce la propia salud del jugador tanto como indica puntosD. Si la
     * salud no es cero tras restar devuelve false, si la salud queda a cero o menos, la salud se pone a cero y se
     * devuelve true (muerto).
     * */
    public Boolean reducirVida(Double puntosD){
        salud -= puntosD;
        if (salud <= 0) {
            salud = 0.0;
            return true;
        }
        return false;
    }
    /**
     * Un método golpear(Monstruo monstruo): reduce la salud del monstruo tanto como sea el valor de la
     * propiedad puntosD de las armas que lleve equipada el jugador, si el arma es doble solo quita el valor de uno
     * de los brazos. Para reducir la salud debes llamar al método correspondiente reducirVida de la clase Monstruo.
     * Si del golpe matas a un monstruo tu experiencia sube 10 por el nivel del monstruo. Además, cada vez que tu
     * experiencia suba una centena (100, 200, 300, …) subes de nivel. El máximo de experiencia será por tanto
     * 1000.
     * */
    public void golpear(Monstruo monstruo){
        if (this.getArmaDerecha() != null) {
            monstruo.reducirVida(this.getArmaDerecha().getPuntosD());
            if (!this.getArmaDerecha().getDosManos()) {
                if (this.getArmaIzquierda() != null) {
                    monstruo.reducirVida(this.getArmaIzquierda().getPuntosD());
                }
            }
        }
        // Comprobar si has matado al monstruo
        if(monstruo.getSalud()<=0){
            monstruo.setSalud(0.0);  ;
            System.out.println("El monstruo ha muerto ");
            if (salud==0){
              experiencia = (experiencia += 10)* monstruo.getNivel();
            } else if (experiencia >= 100) {
                nivel++;
            }
        }
    }
        //Subir la experiencia y el nivel si correspondiera

}
