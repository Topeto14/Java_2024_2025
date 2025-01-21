package SegundaEvaluacion.Tema4.EjerciciosPracticar.Satelite;

public class Satelite {
    private Double meridiano ;
    private Double paralelo;
    private Double distancia_tierra;

    public Satelite(Double d, Double p, Double m) {
        this.distancia_tierra = d;
        this.paralelo = p;
        this.meridiano = m;
    }

    public Satelite() {
        this.meridiano = this.paralelo = this.distancia_tierra= 0.0;
    }

    public void setPosicion (Double m,Double p,Double d){
        this.meridiano = m;
        this.paralelo = p;
        this.distancia_tierra = d;
    }
    public void printPosicion(){
        System.out.println("El satelite se encuentra en ");
        System.out.println("el paralelo " + paralelo + " meridiano " + meridiano);
        System.out.println(" a una distancia de la Tierra de " + distancia_tierra + " Kms.");
    }

    // Methods

    public void variaAltura(Double desplazamiento){
        this.distancia_tierra += desplazamiento;
    }
    public boolean enOrbita(){
        return distancia_tierra >0 ;
    }
    public void variarPosicion(Double variarp, Double variarm){
        this.meridiano += variarm;

        this.paralelo += variarp;
    }

}
