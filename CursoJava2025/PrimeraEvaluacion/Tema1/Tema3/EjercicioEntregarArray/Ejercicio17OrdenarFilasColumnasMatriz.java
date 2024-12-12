package PrimeraEvaluacion.Tema1.Tema3.EjercicioEntregarArray;
import java.util.Arrays;

public class Ejercicio17OrdenarFilasColumnasMatriz {
    // Funcion que genera un numero del 1 al 500
    public static int genNum () {
        return (int) Math.ceil(Math.random() * 500);
    }

    // Funcion para ordenar las filas de la matriz
    public static void ordenarFilas (int[][] nums) {

        for (int i = 0; i < nums.length; i++) {
            Arrays.sort(nums[i]);
        }

    }

    // Funcion para ordenar las columnas de la matriz
    public static void ordenarColumnas (int[][] nums) {

        int[] ArrayColumnas = new int[nums.length];

        // Bucle que recorre de columna en columna e inserta la columna entera en un array
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                ArrayColumnas[j] = nums[j][i];

            }

            Arrays.sort(ArrayColumnas);

            for (int j = 0; j < nums[i].length; j++) {

                nums[j][i] = ArrayColumnas[j];

            }

        }

    }

    public static void main(String[] args) {

        int[][] nums = new int[50][50];

        // Rellenar el array de numeros aleatorios
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                nums[i][j] = genNum();

            }

        }

        // Copiar arrays para ordenar por filas o columnas
        int[][] numsPorFilas = new int[nums.length][nums[0].length], numsPorColumnas = new int[nums.length][nums[0].length];

        for (int i = 0; i < nums.length; i++) {

            numsPorFilas[i] = Arrays.copyOf(nums[i], nums.length);
            numsPorColumnas[i] = Arrays.copyOf(nums[i], nums.length);

        }

        // Bucle para imprimir el array de arrays sin ordenar
        System.out.println("El array sin ordenar es: ");
        for (int i = 0; i < nums.length; i++) {

            System.out.println(Arrays.toString(nums[i]));

        }

        ordenarFilas(numsPorFilas);

        // Bucle para imprimir el array de arrays ordenado por filas
        System.out.println("El array ordenado por filas es: ");
        for (int i = 0; i < numsPorFilas.length; i++) {

            System.out.println(Arrays.toString(numsPorFilas[i]));

        }

        ordenarColumnas(numsPorColumnas);

        // Bucle para imprimir el array de arrays ordenado por columnas
        System.out.println("El array ordenado por columnas es: ");
        for (int i = 0; i < numsPorColumnas.length; i++) {

            System.out.println(Arrays.toString(numsPorColumnas[i]));

        }

    }

}
