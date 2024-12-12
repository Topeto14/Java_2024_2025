package ExamenPrimeraEvaluación;
import java.util.Scanner;
import java.util.Arrays;
/*
    1. [2 puntos] Nos piden crear una matriz 20×20 de números enteros que inicialmente
    rellenamos de valores aleatorios (1-100), nos piden hacer un menú con estas opciones:
    1. Intercambiar columna. Te pedirá dos números de columna e intercambiará los
    valores de la primera por los valores de la segunda.
    2. Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
    3. Comprueba si la diagonal principal y la inversa son iguales.
    4. Pintar las coordenadas i,j donde se encuentra el menor elemento de la matriz.
    5. Muestra la matriz con las filas ordenadas de menor a mayor
    6. Salir
* */
// Funcion para generar numero aleatorio


public class Ejercicio1Menu {
    // Funcion para pintar por terminal una matriz
    public static void pintarMatriz (int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
        System.out.println();
    }
    public static int generarNumero(int min, int max){

        return (int) (Math.random()*(max-min+1)+min);
    }
    // Funcion que intercambia 2 filas pasadas por parametro
    public static void intercambiaColumna (int[][] nums, int columna1, int columna2) {

        int[] arrayTemp = new int[nums.length];

        System.out.println("Matriz antes de intercambiar columna:");
        pintarMatriz(nums);

        // Intercambiar columna
        arrayTemp = nums[columna1];
        nums[columna1] = nums[columna2];
        nums[columna2] = arrayTemp;


        System.out.println("Matriz despues de intercambiar columna");
        pintarMatriz(nums);

    }
    public static int sumaFila (int fila, int[][] nums) {

        int sumaFila = 0;

        for (int j = 0; j < nums.length; j++) {
            sumaFila += nums[j][fila];
        }

        return sumaFila;

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

    public static int menu () throws Exception {
        System.out.println("---- Menu ----");
        System.out.println("1. Intercambiar columnas");
        System.out.println("2. Sumar una Fila");
        System.out.println("3. Comprobar si la diagonal principal y la inversa son iguales" );
        System.out.println("4. Pintar las posiciones donde se encuentra el numero mas pequeño de la matriz");
        System.out.println("5. Mostrar matriz con filas ordenadas de menor a mayor");
        System.out.println("6. Salir...");
        int opcion = Integer.parseInt(System.console().readLine());
        if (opcion > 7 || opcion < 1) throw new Exception("Tienes que elegir un opcion que coincida con las del menu");
        return opcion;
    }

    public static int[] numMenorMatriz (int[][] nums) {

        // Array a devolver en la que la posicion 0 sera la i, la 1 la j y la 2 sera el valor que hay en esas posiciones
        int[] numMenor = {-1, -1, 0};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                // Si el numero de la posicion i, j es menor que el numero qu esta guardado en la posicion 2 de nummenor, se cambian los valores de numMenor
                if (numMenor[2] < nums[i][j]) {
                    numMenor[0] = i;
                    numMenor[1] = j;
                    numMenor[2] = nums[i][j];
                }

            }
        }

        return numMenor;

    }
    // Funcion que devuelve el array ordenado de mayor a menor
    public static void ordenarFilaMenorAMayor (int[] nums) {

        int temp;

        // Usar metodo burbuja para ordenar de menor a mayor
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                // Si el numero en la posicion j es menor que el numero de la siguiente posicion se intercambian
                if (nums[j] > nums[j + 1]) {
                    temp =  nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

    }
    // Funcion que genera una matriz copia de la pasada por parametros y ordena todas las filas de menor a mayor y la manda a pintarMatriz
    public static void matrizConFilasOrdenadas (int[][] nums) {

        System.out.println("Matriz antes de ordenar las filas:");
        pintarMatriz(nums);

        for (int i = 0; i < nums.length; i++) {
            ordenarFilaMenorAMayor(nums[i]);
        }

        System.out.println("Matriz despues de ordenar filas:");
        pintarMatriz(nums);

    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int[][] nums = new int[20][20];
        int opcionMenu = 0;

        // Rellenar matriz de numeros aleatorios
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = generarNumero(1,100);
            }
        }
        do {

            try {

                opcionMenu = menu();

                switch (opcionMenu) {
                    case 1:
                        System.out.println("Ingrese la columna numero 1 que quiere intercambiar (Tiene qu ser un numero entre 0 y 19)");
                        int columna1 = Integer.parseInt(Sc.nextLine());

                        System.out.println("Ingrese la columna numero 2 que quiere intercambiar (Tiene qu ser un numero entre 0 y 19)");
                        int columna2 = Integer.parseInt(Sc.nextLine());

                        if (columna1 < 0 || columna2 > 19 || columna2 < 0 || columna2 > 19) throw new Exception("Una o las dos de las columnas introducidas no existe");

                        intercambiaColumna(nums, columna2, columna2);
                        break;
                    case 2:
                        System.out.println("Dime que fila quieres que te sume (entre 0 y 19) ");
                        int fila = Integer.parseInt(Sc.nextLine());
                        if (fila < 0 || fila > 19) throw new Exception("La fila ingresada no existe");
                        System.out.println("La suma de la fila " + fila + " es: " + sumaFila(fila, nums));
                        break;
                    case 3:
                        int[] sumasDiagonales = sumarDiagonales(nums);
                        System.out.println("La suma de la diagonal principal es: " + sumasDiagonales[0]);
                        System.out.println("La suma de la diagonal inversa es: " + sumasDiagonales[1]);
                        if (sumasDiagonales[0] == sumasDiagonales[1]) {
                            System.out.println(" Las Diagonales son iguales ");
                        }else {
                            System.out.println(" Las Diagonales no son iguales ");
                        }
                        break;
                    case 4:
                        int[] numMenor = numMenorMatriz(nums);
                        System.out.println("El numero mas pequeño de la matriz es el numero: " + numMenor[2] + " que esta en la posicion i = " + numMenor[0] + " y j = " + numMenor[1]);
                        break;

                    case 5:
                        matrizConFilasOrdenadas(nums);
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                }

            } catch (Exception e) {

                System.out.println("Error: " + e);

            }

        } while (opcionMenu != 7);

    }

    }

