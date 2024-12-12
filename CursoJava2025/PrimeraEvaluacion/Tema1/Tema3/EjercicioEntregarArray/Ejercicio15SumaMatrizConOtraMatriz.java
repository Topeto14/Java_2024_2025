package PrimeraEvaluacion.Tema1.Tema3.EjercicioEntregarArray;
import java.util.Arrays;
public class Ejercicio15SumaMatrizConOtraMatriz {
    public static int genNum () {
        return (int) Math.ceil(Math.random() * 9);
    }
    /*
      15. Crear dos matrices 3x3 de números enteros (generadas aleatoriamente), pintarlas, sumarlas y mostrar su suma. El
      resultado será también una matriz (suma) donde cada elemento será la suma de los elementos de las otras
      matrices en la misma posición.
    */
    public static void main(String[] args) {

        int sumaNums = 0;
        int[][] matriz = new int[3][3], suma = new int[3][3];

        // Insertar numeros aleatorios en el array e ir calculando la suma e insertarla en el segundo array
        for (int i = 0; i != matriz.length; i++) {

            for (int j = 0; j != matriz[i].length; j++) {

                matriz[i][j] = genNum();

                sumaNums += matriz[i][j];
                suma[i][j] = sumaNums;

            }

        }

        // Mostrar por pantalla el array generado aleatoriamente
        System.out.println("El array generado aleatoriamente es:");

        for (int i = 0; i < matriz.length; i++) {

            System.out.println(Arrays.toString(matriz[i]));

        }

        // Mostrar por pantalla el array suma
        System.out.println("El array generado a partir de las sumas del primer array es:");

        for (int i = 0; i < matriz.length; i++) {

            System.out.println(Arrays.toString(suma[i]));

        }

    }

}
