package Tema2.Bucles;

public class EjercicioClase2 {
    public static void main(String[] args) {
        //Tenemos que pintar la siguiente figura
        //10000000
        //01000000
        //00100000
        //00010000
        //00001000
        //00000100
        //00000010
        //00000001

        //Un for dentro de otro for
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                //Aquí hay que hacer algo
                if (i == j) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
