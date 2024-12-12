package PrimeraEvaluacion.Tema1.Tema3.Matriz.Ejemplos;

public class Ejemplo3Nombres {
    public static void main(String[] args) {
        String nombres[][] = new String[3][3];

        nombres[0][2] = "Pepe";
        nombres[1][1] = "Lucía";
        nombres[0][0] = "Sonia";

        for(int i=0; i < nombres.length; i++) {
            for(int j=0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + " ");
            }
            System.out.println();
        }
    }
}
