package ExamenPrimeraEvaluación;
import java.util.Arrays;
public class Ejercicio4CazaDelTesoro {
    public static int generarNumero(int min, int max){

        return (int) (Math.random()*(max-min+1)+min);
    }
    // Funcion para mostrar el tablero

    public static void mostrarTablero (char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }
    }
    public static void colocarBarco(int x, int y, char Letra, char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (x == i && y == j) {
                    tablero[i][j] = Letra;

                    break;
                }
            }
        }
    }
    public static void pintarTablero (char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }
    }
    public static boolean intentos (int x, int y, char[][] tablero) {

        if (tablero[x][y] != 'x' && tablero[x][y] != 'x') {

            tablero[x][y] = 'x';
            return true;

        } else return false;
    }



    public static void main(String[] args) {
        char tablero [][]=new char[10][10];

        pintarTablero(tablero);
        colocarBarco(generarNumero(0,9),generarNumero(0,9),'t',tablero);
        intentos(1,5,tablero);
        mostrarTablero(tablero);
    }
}
