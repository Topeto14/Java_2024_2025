package Tema3.EjercicioEntregarArray;
import java.util.Arrays;
public class Ejercicio20TresEnRaya {
    // Funcion para mostrar el tablero
    public static void mostrarTablero (char[][] tablero) {

        System.out.println();

        for (int i = 0; i < tablero.length; i++) {

            System.out.println(Arrays.toString(tablero[i]));

        }

        System.out.println();

    }

    // Funcion que me indica si esta marcada la casilla pasada
    public static boolean estaMarcada (char[][] array, int fila, int columna) {

        if (array[fila][columna] == 'X' || array[fila][columna] == 'O') return true;
        else return false;

    }

    // Funcion que comprueba despues de cada tirada si hay ganador
    public static boolean hayGanador (char[][] array) {

        if (array[0][0] == 'X' && array[0][1] == 'X' && array[0][2] == 'X') return true;
        else if (array[1][0] == 'X' && array[1][1] == 'X' && array[1][2] == 'X') return true;
        else if (array[2][0] == 'X' && array[2][1] == 'X' && array[2][2] == 'X') return true;
        else if (array[0][0] == 'X' && array[1][0] == 'X' && array[2][0] == 'X') return true;
        else if (array[0][1] == 'X' && array[1][1] == 'X' && array[2][1] == 'X') return true;
        else if (array[0][2] == 'X' && array[1][2] == 'X' && array[2][2] == 'X') return true;
        else if (array[0][0] == 'X' && array[1][1] == 'X' && array[2][2] == 'X') return true;
        else if (array[2][0] == 'X' && array[1][1] == 'X' && array[0][2] == 'X') return true;
        else if (array[0][0] == 'O' && array[0][1] == 'O' && array[0][2] == 'O') return true;
        else if (array[1][0] == 'O' && array[1][1] == 'O' && array[1][2] == 'O') return true;
        else if (array[2][0] == 'O' && array[2][1] == 'O' && array[2][2] == 'O') return true;
        else if (array[0][0] == 'O' && array[1][0] == 'O' && array[2][0] == 'O') return true;
        else if (array[0][1] == 'O' && array[1][1] == 'O' && array[2][1] == 'O') return true;
        else if (array[0][2] == 'O' && array[1][2] == 'O' && array[2][2] == 'O') return true;
        else if (array[0][0] == 'O' && array[1][1] == 'O' && array[2][2] == 'O') return true;
        else if (array[2][0] == 'O' && array[1][1] == 'O' && array[0][2] == 'O') return true;
        else return false;
    }

    public static boolean partidaFinalEmpatada (char[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] != 'X' || array[i][j] != 'O') return false;

            }

        }

        return true;

    }

    /*
      20. Vamos a realizar el típico juego del 3 en raya, donde habrá dos jugadores que tengan que hacer el 3 en raya, los
      signos serán el X y el O, cuando haya una posición vacía habrá un –
      El tablero de juego, será una matriz de 3×3 de char.
      El juego termina cuando uno de los jugadores hace 3 en raya o si no hay más posiciones que poner.
      Primero juega una posición un jugador y luego el otro.
      El juego debe pedir las posiciones donde el jugador actual quiera poner su marca ( [0,0], [0,1], [0,2], [1,0], [1,1],
      [1,2], [2,0], [2,1], [2,2] ), esta debe ser validada y por supuesto que no haya una marca ya puesta.
    */

    public static void main(String[] args) {

        char[][] tablero = new char[3][3];
        String ganador = "";
        boolean casilaMarcada = true;

        // Rellenar array con -
        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[i].length; j++) {

                tablero[i][j] = '-';

            }

        }

        mostrarTablero(tablero);

        do {

            int jug1fila = -1, jug1columna = -1, jug2fila = -1, jug2columna = -1;

            while (jug1fila < 0 || jug1fila > 2  || jug1columna < 0 || jug1columna > 2) {

                try {

                    System.out.println("Ingresa la fila en la que el jugador 1 posicionara la X del 0 al 2:");
                    jug1fila = Integer.parseInt(System.console().readLine());

                    System.out.println("Ingresa la columna en la que el jugador 1 posicionara la X del 0 al 2:");
                    jug1columna = Integer.parseInt(System.console().readLine());

                    if (jug1fila < 0 || jug1fila > 2 || jug1columna < 0 || jug1columna > 2) throw new Exception("La fila o la columna no son correctas");

                    if (estaMarcada(tablero, jug1fila, jug1columna)) throw new Exception("La casilla puesta esta ocupada ya");
                    else {

                        tablero[jug1fila][jug1columna] = 'X';
                        casilaMarcada = false;
                    }

                } catch (Exception e) {

                    System.out.println("Error: " + e.getMessage());

                }

            }

            if (hayGanador(tablero)) {

                ganador = "Jugador 1";
                break;

            }

            casilaMarcada = true;
            mostrarTablero(tablero);
            if (partidaFinalEmpatada(tablero)) break;

            while (jug2fila < 0 || jug2fila > 2  || jug2columna < 0 || jug2columna > 2 || casilaMarcada) {

                try {

                    System.out.println("Ingresa la fila en la que el jugador 2 posicionara la O del 0 al 2:");
                    jug2fila = Integer.parseInt(System.console().readLine());

                    System.out.println("Ingresa la columna en la que el jugador 2 posicionara la O del 0 al 2:");
                    jug2columna = Integer.parseInt(System.console().readLine());

                    if (jug2fila < 0 || jug2fila > 2  || jug2columna < 0 || jug2columna > 2) throw new Exception("La fila o la columna no son correctas");

                    if (estaMarcada(tablero, jug2fila, jug2columna)) throw new Exception("La casilla puesta esta ocupada ya");
                    else {

                        tablero[jug2fila][jug2columna] = 'O';
                        casilaMarcada = false;

                    }

                } catch (Exception e) {

                    System.out.println("Error: " + e.getMessage());

                }

            }

            if (hayGanador(tablero)) {

                ganador = "Jugador 2";
                break;

            }

            casilaMarcada = true;
            mostrarTablero(tablero);

        } while (true);

        mostrarTablero(tablero);

        if (partidaFinalEmpatada(tablero)) System.out.println("Ha habido un empate");
        else System.out.println("El ganador del 3 en raya ha sido el jugador: " + ganador);

    }


}
