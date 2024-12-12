package PrimeraEvaluacion.Tema1.Tema3.EjercicioEntregarArray;
import java.util.Arrays;
public class Ejercicio21MatrizTraspuesta {
    public static void imprimirArray (int[][] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.println(Arrays.toString(array[i]));

        }

    }

    // Funcion que devuelve un numero random del 0 al 9
    public static int genNum () {
        return (int) Math.ceil(Math.random() * 10) - 1;
    }
    /*
      21. Crea un método que dada una determinada matriz nxm devuelva su matriz traspuesta.

      [1, 4, 3]
      [2, 5, 5]     [1, 2, 4 ,6 ,5]
      [4, 8, 7] ==> [4, 5, 8, 5, 3]
      [6, 5, 9]     [3, 5, 7, 9, 9]
      [5, 3, 9]

    */
    public static void main(String[] args) {

        int filas = 1, columnas = 1;

        try {

            // Pedir al usuario el numero de columnas y numero de filas que tiene su tabla
            System.out.println("Dime como es tu tabla y te mostrare como seria traspuesta");

            System.out.println("¿De cuantas filas es tu tabla?");
            filas = Integer.parseInt(System.console().readLine());

            System.out.println("¿De cuantas columnas es tu tabla?");
            columnas = Integer.parseInt(System.console().readLine());

            if (columnas < 1 || filas < 1) throw new Exception("Las filas y columnas tienen que ser mayor o igual que 1");

            int[][] tablaUser = new int[filas][columnas], tablaTraspuesta = new int[columnas][filas];

            // Bucle para rellenar con numero del 1 al 10
            for (int i = 0; i < tablaUser.length; i++) {

                for (int j = 0; j < tablaUser[i].length; j++) {

                    tablaUser[i][j] = genNum();

                }

            }

            System.out.println("Tabla usuario:");
            imprimirArray(tablaUser);

            for (int i = 0; i < tablaUser[0].length; i++) {

                for (int j = 0; j < tablaUser.length; j++) {

                    tablaTraspuesta[i][j] = tablaUser[j][i];

                }

            }

            System.out.println("Tabla traspuesta:");
            imprimirArray(tablaTraspuesta);

        } catch (Exception e) {

            System.out.println("Error: "+ e);

        }

    }
}
