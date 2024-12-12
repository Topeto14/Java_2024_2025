package PrimeraEvaluacion.Tema1.Tema3.EjercicioEntregarArray;
import java.util.Arrays;
public class Ejercicio16AleatorioNOrepetidos {
    public static boolean estaEnArray (int[][] array, int num) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] == num) return true;

            }

        }

        return false;

    }

    // Funcion que genera un numero del 1 al 1000
    public static int genNum () {
        return (int) Math.ceil(Math.random() * 1000);
    }

    public static void main(String[] args) {

        int[][] matriz = new int[3][6];

        // Rellenar el array de numeros aleatorios
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                while (true) {

                    int numGen = genNum();

                    if (!estaEnArray(matriz, numGen)) {
                        matriz[i][j] = numGen;
                        break;

                    }

                }

            }

        }

        for (int i = 0; i < matriz.length; i++) {

            System.out.println(Arrays.toString(matriz[i]));

        }

    }

}
