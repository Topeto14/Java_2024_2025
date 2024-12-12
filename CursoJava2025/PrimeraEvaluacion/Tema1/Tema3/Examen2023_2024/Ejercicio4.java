package PrimeraEvaluacion.Tema1.Tema3.Examen2023_2024;
import java.util.Arrays;
/*
  [4 puntos] Nos piden crear una matriz 10×10 de caracteres, que inicialmente rellenaremos
  con la letra ‘a’ (agua). Vamos, ha simular el juego “Batalla Naval”. Tienes que implementar:
  8. Un método pintarTablero(char[][] tablero): que pinte toda la matriz.
  9. Un método colocarBarco(int x, int y, String dirección, int longitudBarco, char letra,
  char[][] tablero): este método pintará la letra indicada en la posición (x,y) del
  tablero indicada. Además, en la dirección que se le pase (“Izquierda”, “Derecha”,
  “Arriba”, “Abajo”), continuará pintando esa misma letra, tantas posiciones como
  indique longitudBarco. Importante: debes comprobar que el barco se puede colocar
  y no se sale del tablero, llamando al siguiente método.
  10.Un método comprobarBarco(int x, int y, String direccion, int longitudBarco, char[][]
  tablero): comprobará si el barco se puede poner, cabe, en la posición y dirección
  indicada. Devuelve false si no se puede poner, y true si se puede colocar.
  11.Un método disparar(int x, int y, char[][] tablero): devolverá false si en esa posición
  hay agua, y true si en esa posición hay un barco. Pondrá una ‘x’ en esa posición.
  Haz un main, donde se coloque un barco de longitud 2 con la letra ‘l’ (lancha), uno de
  longitud 3 con la letra ‘s’ (submarino), uno de longitud 4 con la letra ‘c’ (crucero) y uno de
  longitud 4 con la letra ‘p’ (portaaviones). Dispara a un barco. Pinta el tablero.
*/
public class Ejercicio4 {
    // Funcion para mostrar el tablero
    public static void mostrarTablero (char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }
    }

    // Funcion que devuelve si el barco se sale del tablero o no
    public static boolean comprobarBarco(int x, int y, String direccion, int longitudBarco, char[][] tablero) {
        if (direccion.equals("Izquierda") && (y - longitudBarco > 0 && y <= tablero.length - 1) && tablero[x][y] == 'a') return true;
        else if (direccion.equals("Derecha") && (y >= 0 && y + longitudBarco < tablero.length - 1) && tablero[x][y] == 'a') return true;
        else if (direccion.equals("Arriba") && (x - longitudBarco > 0 && y <= tablero.length - 1) && tablero[x][y] == 'a') return true;
        else if (direccion.equals("Abajo") && (x >= 0 && y + longitudBarco < tablero.length - 1) && tablero[x][y] == 'a') return true;
        else return false;
    }

    // Funcion que devuelve si al disparar le has dado a un barco o no, y si le has dado pinta una x
    public static boolean disparar (int x, int y, char[][] tablero) {
        if (tablero[x][y] != 'a' && tablero[x][y] != 'x') {

            tablero[x][y] = 'x';
            return true;

        } else return false;
    }

    // Funcion para colocar el barco con la longitud que tenga y la letra pasada por parametro
    public static void colocarBarco(int x, int y, String direccion, int longitudBarco, char letra, char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (x == i && y == j) {
                    if (direccion.equals("Izquierda")) {
                        for (int k = i; k > i - longitudBarco; k--) {
                            tablero[i][k] = letra;
                        }
                    } else if (direccion.equals("Derecha")) {
                        for (int k = i; k < i + longitudBarco; k++) {
                            tablero[i][k] = letra;
                        }
                    } else if (direccion.equals("Arriba")) {
                        for (int k = j; k > j - longitudBarco; k--) {
                            tablero[k][j] = letra;
                        }
                    } else if (direccion.equals("Abajo")) {
                        for (int k = j; k < j + longitudBarco; k++) {
                            tablero[k][j] = letra;
                        }
                    }
                    break;
                }
            }
        }
    }

    // Funcion para pintar el tablero de agua
    public static void pintarTablero (char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 'a';
            }
        }
    }

    public static void main(String[] args) {

        char[][] tablero = new char[10][10];

        pintarTablero(tablero);
        if (comprobarBarco(5, 5, "Izquierda", 2, tablero)) colocarBarco(5, 5, "Izquierda", 2, 'l', tablero);
        if (comprobarBarco(0, 0, "Abajo", 3, tablero)) colocarBarco(0, 0, "Abajo", 3, 's', tablero);
        if (comprobarBarco(2, 2, "Derecha", 4, tablero)) colocarBarco(2, 2, "Derecha", 4, 'c', tablero);
        if (comprobarBarco(6, 6, "Arriba", 4, tablero)) colocarBarco(6, 6, "Arriba", 4, 'p', tablero);
        if (disparar(0, 0, tablero)) System.out.println("Disparo acertado");
        else System.out.println("Disparo al agua");
        mostrarTablero(tablero);


    }


}
