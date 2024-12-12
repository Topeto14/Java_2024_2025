package PrimeraEvaluacion.Tema1.Tema3.EjercicioEntregarArray;
import java.util.Arrays;
public class Ejercicio18SumaParcialesFilasColumnasMatriz {
    // Funcion que genera un numero del 0 al 9
    public static int genNum () {
        return (int) Math.ceil(Math.random() * 10) - 1;
    }
    /*
      18. Escribe un programa que genere al azar 20 números enteros comprendidos entre 0 y 9. Estos números se deben
      introducir en un array de 4 filas por 5 columnas.
      El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La
      suma total debe aparecer en la esquina inferior derecha.
    */
    public static void main(String[] args) {

        int[][] nums = new int[5][6];
        int sumaFilas = 0, sumaColumnas = 0;

        // Bucle para ingresar los valores en el array y sumar las filas
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                if (j != nums[i].length - 1) {

                    int numGenerado = genNum();
                    sumaFilas += numGenerado;
                    nums[i][j] = numGenerado;

                } else {

                    nums[i][j] = sumaFilas;
                    sumaFilas = 0;

                }

            }

        }

        // Bucle para sumar las columnas y poner el total
        for (int i = 0; i < nums[0].length; i++) {

            for (int j = 0; j < nums.length; j++) {

                if (j != nums.length - 1) {

                    sumaColumnas += nums[j][i];

                } else {

                    nums[j][i] = sumaColumnas;
                    sumaColumnas = 0;

                }

            }

        }

        // Bucle para mostrar el array
        for (int i = 0; i < nums.length; i++) {

            System.out.println(Arrays.toString(nums[i]));

        }

    }

}
