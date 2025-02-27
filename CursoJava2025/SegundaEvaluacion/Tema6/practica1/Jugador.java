package SegundaEvaluacion.Tema6.practica1;

public class Jugador extends Personaje {
    enum Clase { BRUJO, MAGO, BARBARO, CABALLERO }

    private Clase clase;
    private Integer experiencia;
    private Arma armaD;
    private Arma armaI;

    public Jugador(String nombre, Clase clase) {
        super(nombre, 1, 200);
        this.clase = clase;
        this.experiencia = 0;
        this.armaD = null;
        this.armaI = null;
    }


    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }

    public Arma getArmaD() {
        return armaD;
    }

    public void setArmaD(Arma armaD) {
        this.armaD = armaD;
    }

    public Arma getArmaI() {
        return armaI;
    }

    public void setArmaI(Arma armaI) {
        this.armaI = armaI;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append(", clase=").append(clase);
        sb.append(", experiencia=").append(experiencia);
        sb.append(", armaD=").append(armaD);
        sb.append(", armaI=").append(armaI);
        sb.append('}');
        return sb.toString();
    }


    public boolean equipar(Arma arma) {

        if (this.armaD != null && this.armaI != null) {
            return false;
        }

        if (arma.isDosManos()) {
            if (this.armaD == null && this.armaI == null) {
                this.armaD = arma;
                this.armaI = arma;
                return true;
            } else {
                return false;
            }
        } else {
            if (this.armaD == null || this.armaI == null) {
                if (this.armaD == null) {
                    this.armaD = arma;
                } else {
                    this.armaI = arma;
                }
                return true;
            }
        }

        return false;
    }

    public void tomarPocion(int puntos) {
        this.salud += puntos;
        if (this.salud > 10000)
            this.salud = 10000;
    }


    @Override
    public boolean golpear(Personaje monstruo) {
        boolean muere = false;

        //Golpear
        if (this.getArmaD() == null && this.getArmaI() == null) {
            return false;
        } else if (this.getArmaD() != null && this.getArmaI() != null) {
            //Dos manos
            if (this.getArmaD().isDosManos()) {
                muere = monstruo.reducirVida(this.getArmaD().getPuntosD());
            } else {
                //Golpear con las dos
                monstruo.reducirVida(this.getArmaD().getPuntosD());
                muere = monstruo.reducirVida(this.getArmaI().getPuntosD());
            }
        } else if (this.getArmaI() == null) {
            muere = monstruo.reducirVida(this.getArmaD().getPuntosD());
        }


        //Comprobar si el monstruo muere
        if (muere == false) {
            return false;
        } else {
            //En qué centena estamos
            int centena = this.experiencia / 100;
            //Subir la experiencia y el nivel
            this.experiencia += 10 * monstruo.getNivel();
            //En qué centena estoy después de subir la experiencia
            int nuevaCentena = this.experiencia / 100;

            //Detectar si hay un cambio de centena en la experiencia
            if (centena != nuevaCentena) {
                this.subirNivel();
            }
            return true;
        }

    }

}
