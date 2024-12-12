package Tema3.EjercicioEntregarArray;
import java.util.Arrays;
public class Ejercicio13SumaDeCadaFilaMatriz {
    /*
  13. Crear una tabla bidimensional de tamaño 3x4 de números enteros (leídos desde teclado). Mostrar la matriz y la
  suma de los valores de cada fila.
   */

    public static void main(String[] args) {

        int[][] nums = new int[3][4];

        // Rellenar el array de numeros introudcidos por teclado
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {
                try {

                    System.out.println("Ingrese el numero que quiere ingresar en la posicion [" + i + "][" + j + "]");
                    nums[i][j] = Integer.parseInt(System.console().readLine());

                } catch (Exception e) {

                    System.out.println("Error: " + e);

                }

            }

        }

        int sumaFila = 0;

        // Mostrar el array de arrays mas la suma de cada fila
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                sumaFila += nums[i][j];

            }

            System.out.print(Arrays.toString(nums[i]));
            System.out.println(" ===> " + sumaFila);

            sumaFila = 0;

        }

    }

}
