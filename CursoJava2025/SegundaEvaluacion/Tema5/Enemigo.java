package SegundaEvaluacion.Tema5;

import java.util.Objects;
import java.util.logging.Logger;

public class Enemigo {
    private String nombre;
    private String tipo;
    private Double vida;

    private static Integer numEnemigos=0;

    public Enemigo(String nombre, String tipo, Double vida) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        Enemigo.numEnemigos++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Enemigo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipo='").append(tipo).append('\'');
        sb.append(", vida=").append(vida);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Enemigo enemigo = (Enemigo) o;
        return Objects.equals(nombre, enemigo.nombre) && Objects.equals(tipo, enemigo.tipo) && Objects.equals(vida, enemigo.vida);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nombre);
        result = 31 * result + Objects.hashCode(tipo);
        result = 31 * result + Objects.hashCode(vida);
        return result;
    }


    public void morir() {
        this.vida = 0.0;
        Enemigo.numEnemigos--;
        Logger logger = MiLogger.getLogger();
        logger.info("Enemigo " + this.nombre + " ha muerto");

    }

    public void reducirVida(Integer vida) {
        this.vida -= vida;
        vida = -5;
    }

    public void transferirVida(Enemigo ene) {
        this.vida += ene.vida;
        ene.setVida(0.0);
        MiLogger.getLogger().info("Transfiriendo vida");
    }

    public static Integer getNumEnemigos() {
        return Enemigo.numEnemigos;
    }

    public static void main(String[] args) {
        Enemigo en1 = new Enemigo("En1", "T1", 100.0);
        Enemigo en2 = new Enemigo("En2", "T2", 80.0);
        Integer vida = 8;
        en1.reducirVida(vida);
        en1.transferirVida(en2);

        System.out.println(en1);
        System.out.println(vida);
        System.out.println(en2);

        System.out.println(Enemigo.getNumEnemigos());
        en1.morir();
        System.out.println(Enemigo.getNumEnemigos());
        en2.morir();


    }
}
