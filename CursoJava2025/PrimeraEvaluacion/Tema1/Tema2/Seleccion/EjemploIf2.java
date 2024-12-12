package PrimeraEvaluacion.Tema1.Tema2.Seleccion;

public class EjemploIf2 {
    public static void main(String[] args) {


        //Personaje tiene vida y tiene maná
        //Si la vida es menor de 50 pinto que tiene que tomar poción de vida
        //Si el maná es menor de 50 pinto que tiene que tomar poción de magia
        //Si la vida es menor que 50 y el maná es menor que 50 que pinte "CORRE"

        int vidaP = 45;
        int manaP = 33;

        if (vidaP <= 50) {
            System.out.println("Toma poción de vida");
        }
        if (manaP <= 50) {
            System.out.println("Toma poción de magia");
        }
        if (vidaP <= 50 && manaP <= 50) {
            System.out.println("CORRE");
        }
    }
}
