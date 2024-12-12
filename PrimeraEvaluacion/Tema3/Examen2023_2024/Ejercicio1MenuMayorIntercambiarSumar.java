package Tema3.Examen2023_2024;
/*
  1. [2 puntos] Nos piden crear una matriz 20×20 de números enteros que inicialmente
  rellenamos de valores aleatorios (1-100), nos piden hacer un menú con estas opciones:
  1. Intercambiar fila. Te pedirá dos números de fila e intercambiará los valores de la
  primera por los valores de la segunda.
  2. Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
  3. Sumar la diagonal principal y la diagonal inversa, y mostrar las dos sumas
  4. Pintar las coordenadas i,j donde se encuentra el mayor elemento de la matriz.
  5. Pinta la matriz traspuesta
  6. Muestra la matriz con las filas ordenadas de mayor a menor
  7. Salir
*/
import java.util.Arrays;
public class Ejercicio1MenuMayorIntercambiarSumar {
    // Funcion para pintar por terminal una matriz
    public static void pintarMatriz (int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
        System.out.println();
    }

    // Funcion para generar numero aleatorio
    public static int genNum () {
        return (int) Math.ceil(Math.random() * 100);
    }

    // Funcion para pintar la tabla traspuesta
    public static void trasponerMatriz (int[][] nums) {

        int[][] tablaTraspuesta = new int[nums[0].length][nums.length];

        System.out.println("Matriz no traspuesta:");
        pintarMatriz(nums);

        for (int i = 0; i < nums[0].length; i++) {

            for (int j = 0; j < nums.length; j++) {

                tablaTraspuesta[i][j] = nums[j][i];

            }

        }

        System.out.println("Matriz traspuesta:");
        pintarMatriz(tablaTraspuesta);

    }

    // Funcion que devuelve el array ordenado de mayor a menor
    public static void ordenarFilaMayorAMenor (int[] nums) {

        int temp;

        // Usar metodo burbuja para ordenar de mayor a menor
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                // Si el numero en la posicion j es menor que el numero de la siguiente posicion se intercambian
                if (nums[j] < nums[j + 1]) {
                    temp =  nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

    }

    // Funcion que genera una matriz copia de la pasada por parametros y ordena todas las filas de mayor a menor y la manda a pintarMatriz
    public static void matrizConFilasOrdenadas (int[][] nums) {

        System.out.println("Matriz antes de ordenar las filas:");
        pintarMatriz(nums);

        for (int i = 0; i < nums.length; i++) {
            ordenarFilaMayorAMenor(nums[i]);
        }

        System.out.println("Matriz despues de ordenar filas:");
        pintarMatriz(nums);

    }

    public static int[] numMayorMatriz (int[][] nums) {

        // Array a devolver en la que la posicion 0 sera la i, la 1 la j y la 2 sera el valor que hay en esas posiciones
        int[] numMayor = {-1, -1, 0};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                // Si el numero de la posicion i, j es mayor que el numero qu esta guardado en la posicion 2 de nummayor, se cambian los valores de numMayor
                if (numMayor[2] < nums[i][j]) {
                    numMayor[0] = i;
                    numMayor[1] = j;
                    numMayor[2] = nums[i][j];
                }

            }
        }

        return numMayor;

    }

    // Funcion que suma la diagonal principal y la inversa y las devuelve en el mismo array
    public static int[] sumarDiagonales (int[][] nums) {

        // Array que guarda en la primera posicion la suma de la diagonal principal y en la segunda posicion la suma de la diagonal inversa
        int[] sumarDiagonales = {0, 0};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i == j) sumarDiagonales[0] += nums[i][j];
                if (i + j == nums.length - 1) sumarDiagonales[1] += nums[i][j];
            }
        }

        return sumarDiagonales;

    }

    // Funcion que dada un numero de una columna devuelve la suma de los valores que hay en esa columna
    public static int sumaColumna (int columna, int[][] nums) {

        int sumaColumna = 0;

        for (int i = 0; i < nums.length; i++) {
            sumaColumna += nums[i][columna];
        }

        return sumaColumna;

    }

    // Funcion que intercambia 2 filas pasadas por parametro
    public static void intercambiaFilas (int[][] nums, int fila1, int fila2) {

        int[] arrayTemp = new int[nums[0].length];

        System.out.println("Matriz antes de intercambiar filas:");
        pintarMatriz(nums);

        // Intercambiar filas
        arrayTemp = nums[fila1];
        nums[fila1] = nums[fila2];
        nums[fila2] = arrayTemp;


        System.out.println("Matriz despues de intercambiar filas");
        pintarMatriz(nums);

    }

    // Funcion para pintar el menu y devolver la opcion seleccionada
    public static int menu () throws Exception {
        System.out.println("---- Menu ----");
        System.out.println("1. Intercambiar filas");
        System.out.println("2. Sumar una columna");
        System.out.println("3. Sumar la diagonal principal y la inversa");
        System.out.println("4. Pintar las posiciones donde se encuentra el numero mas grande de la matriz");
        System.out.println("5. Pintar la matriz traspuesta");
        System.out.println("6. Mostrar matriz con filas ordenadas de mayor a menor");
        System.out.println("7. Salir...");
        int opcion = Integer.parseInt(System.console().readLine());
        if (opcion > 7 || opcion < 1) throw new Exception("Tienes que elegir un opcion que coincida con las del menu");
        return opcion;
    }

    public static void main(String[] args) {

        int[][] nums = new int[20][20];
        int opcionMenu = 0;

        // Rellenar matriz de numeros aleatorios
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = genNum();
            }
        }

        do {

            try {

                opcionMenu = menu();

                switch (opcionMenu) {
                    case 1:
                        System.out.println("Ingrese la fila numero 1 que quiere intercambiar (Tiene qu ser un numero entre 0 y 19)");
                        int fila1 = Integer.parseInt(System.console().readLine());

                        System.out.println("Ingrese la fila numero 2 que quiere intercambiar (Tiene qu ser un numero entre 0 y 19)");
                        int fila2 = Integer.parseInt(System.console().readLine());

                        if (fila1 < 0 || fila1 > 19 || fila2 < 0 || fila2 > 19) throw new Exception("Una o las dos de las filas introducidas no existe");

                        intercambiaFilas(nums, fila1, fila2);
                        break;
                    case 2:
                        System.out.println("Ingrese una columna valida (Entre 0 y 19)");
                        int columna = Integer.parseInt(System.console().readLine());
                        if (columna < 0 || columna > 19) throw new Exception("La columna ingresada no existe");
                        System.out.println("La suma de la columna " + columna + " es: " + sumaColumna(columna, nums));
                        break;
                    case 3:
                        int[] sumasDiagonales = sumarDiagonales(nums);
                        System.out.println("La suma de la diagonal principal es: " + sumasDiagonales[0]);
                        System.out.println("La suma de la diagonal inversa es: " + sumasDiagonales[1]);
                        break;
                    case 4:
                        int[] numMayor = numMayorMatriz(nums);
                        System.out.println("El numero mas grande de la matriz es el numero: " + numMayor[2] + " que esta en la posicion i = " + numMayor[0] + " y j = " + numMayor[1]);
                        break;
                    case 5:
                        trasponerMatriz(nums);
                        break;
                    case 6:
                        matrizConFilasOrdenadas(nums);
                        break;
                    case 7:
                        System.out.println("Saliendo del programa...");
                        break;
                }

            } catch (Exception e) {

                System.out.println("Error: " + e);

            }

        } while (opcionMenu != 7);

    }
}
