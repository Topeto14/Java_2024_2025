package PrimeraEvaluacion.Tema1.Tema3.EjercicioEntregarArray;
import java.util.Arrays;
public class Ejercicio12MatrizBordes1 {
    /*
  12. Crear una matriz “marco” de tamaño 8x6. Una matriz “marco” es aquella que todos sus elementos son 0 salvo los
  de los bordes que deben ser 1. Mostrarla.
*/
    public static void main(String[] args) {

        int[][] marco = new int[8][6];

        // Rellenar los bordes del marco de 1
        for (int i = 0; i < marco.length; i++) {

            for (int j = 0; j < marco[i].length; j++) {

                if (i == 0 || i == marco.length - 1 || j == 0 || j == marco[i].length - 1) marco[i][j] = 1;

            }

        }

        // Mostrar el Array de arrays en forma de marco
        for (int i = 0; i < marco.length; i++) {

            System.out.println(Arrays.toString(marco[i]));

        }

    }

}
