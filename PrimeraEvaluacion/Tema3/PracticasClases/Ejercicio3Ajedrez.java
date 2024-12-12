package Tema3.PracticasClases;
import java.util.Arrays;
/*
EJERCICIO MATRICES
Tablero de ajedrez
En este ejercicio tienes que dibujar un tablero de ajedrez y poner las piezas en el tablero. Un
tablero de ajedrez es un tablero de 8x8 con 64 piezas. Tendréis que guardar el tablero en un
array bidimensional.
Para inicializarlo lo rellenaremos inicialmente con B para las casillas negras y W para las
blancas.

A continuación, coloca las piezas como en el ajedrez teniendo en cuenta que:
- Peón -> I
- Torre -> T
- Alfil -> X
- Caballo -> L
- Reina -> O
- Rey -> +

Realiza esa parte de pintar el tablero con una función y pruébala.
Mejora la función para que pinte si la pieza es blanca o negra. Ej. “TN o TB”.
Realiza un método coordenadasAjedrez(int i, int j), que dada la coordenada de una casilla, te
devuelva la coordenada como si fuera un tablero de ajedrez, las filas van de la 1 a la 8, y las
columnas de la A a la H. Ej. La coordenada 5,5 es (3,G).
Realiza un método pintarMovimientosCaballo(int i, int j, String tablero[][]), que se le pasen
unas coordenadas (i,j), donde se supone que hay un caballo, y debe pintar por pantalla las
ocho posibilidades donde puede mover un caballo (mueve en L, dos casillas en horizontal o
vertical y una casilla perpendicular al movimiento anterior). No pintes aquellas posibilidades
que queden fuera de tablero, o donde haya ya una pieza, que no sea W o B. Prueba ese
método para un caballo que se encontrara en la coordenada (5,5), teniendo en cuenta que
(0,0) es donde está la torre izquierda negra.
*/

public class Ejercicio3Ajedrez {
    // Funcion para pintar tablero
    public static void pintarTablero (String[][] tablero) {

        for (int i = 0; i < tablero.length; i++) {

            System.out.println(Arrays.toString(tablero[i]));

        }

    }

    // Funcion que devuelve si una casilla esta ocupada por una ficha o no
    public static boolean casillaOcupada (String[][] tablero, int fila, int columna) {

        if (tablero[fila][columna].equals("B") || tablero[fila][columna].equals("W")) return false;
        else return true;

    }

    // Funcion que dada una posicion pinta los posibles movimientos de un caballo estando en esa posicion
    public static void pintarMovimientosCaballo (int fila, int columna, String[][] tablero) throws Exception {

        if (fila < 0 || fila > 7 || columna < 0 || columna > 7) throw new Exception("Los numeros de la columna y de la fila tienen que estar entre 0 y 7 para poder decirte en que coordenada de ajedrez se encuentra esa posicion");

        int filaMov = -1, colMov = -1, posibilidades = 0;

        for (int i = 0; i != 8; i++) {

            // Generar los 8 posibles movimientos
            if (i == 0) {

                filaMov = fila + 1;
                colMov = columna + 2;

            } else if (i == 1) {

                filaMov = fila + 1;
                colMov = columna - 2;

            } else if (i == 2) {

                filaMov = fila + 2;
                colMov = columna + 1;

            } else if (i == 3) {

                filaMov = fila + 2;
                colMov = columna - 1;

            } else if (i == 4) {

                filaMov = fila - 1;
                colMov = columna + 2;

            } else if (i == 5) {

                filaMov = fila - 1;
                colMov = columna - 2;

            } else if (i == 6) {

                filaMov = fila - 2;
                colMov = columna + 1;

            } else if (i == 7) {

                filaMov = fila - 2;
                colMov = columna - 1;

            }

            // Si la posicion no esta fuera del tablero o la casilla no esta ocupada imprime la posible posicion para mover

            if (filaMov >= 0 && filaMov < 8 && colMov >= 0 && colMov < 8 && !casillaOcupada(tablero, filaMov, columna)) {

                System.out.println("La posibilidad " + (posibilidades + 1) + " es: (" + filaMov + ", " + colMov + ")");
                posibilidades++;

            }

        }

    }

    public static String coordenadasAjedrez (int fila, int columna) throws Exception {

        if (fila < 0 || fila > 7 || columna < 0 || columna > 7) throw new Exception("Los numeros de la columna y de la fila tienen que estar entre 0 y 7 para poder decirte en que coordenada de ajedrez se encuentra esa posicion");

        StringBuilder coordenadaAjedrez = new StringBuilder();

        if (fila == 0) coordenadaAjedrez.append("8");
        else if (fila == 1) coordenadaAjedrez.append("7");
        else if (fila == 2) coordenadaAjedrez.append("6");
        else if (fila == 3) coordenadaAjedrez.append("5");
        else if (fila == 4) coordenadaAjedrez.append("4");
        else if (fila == 5) coordenadaAjedrez.append("3");
        else if (fila == 6) coordenadaAjedrez.append("2");
        else if (fila == 7) coordenadaAjedrez.append("1");

        coordenadaAjedrez.append(", ");

        if (columna == 0) coordenadaAjedrez.append("A");
        else if (columna == 1) coordenadaAjedrez.append("B");
        else if (columna == 2) coordenadaAjedrez.append("C");
        else if (columna == 3) coordenadaAjedrez.append("D");
        else if (columna == 4) coordenadaAjedrez.append("E");
        else if (columna == 5) coordenadaAjedrez.append("F");
        else if (columna == 6) coordenadaAjedrez.append("G");
        else if (columna == 7) coordenadaAjedrez.append("H");

        return coordenadaAjedrez.toString();

    }

    // Funcion para poner las piezas en el tablero
    public static void ponerPiezas (String[][] tablero) {

        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[i].length; j++) {

                if (i == tablero.length - 2) tablero[i][j] = "IB";
                else if (i == 1) tablero[i][j] = "IN";
                else if (i == 0) {

                    if (j == 0 || j == tablero[i].length - 1) tablero[i][j] = "TN";
                    else if (j == 1 || j == tablero[i].length - 2) tablero[i][j] = "XN";
                    else if (j == 2 || j == tablero[i].length - 3) tablero[i][j] = "LN";
                    else if (j == 3) tablero[i][j] = "+N";
                    else tablero[i][j] = "ON";

                } else if (i == tablero.length -1) {

                    if (j == 0 || j == tablero[i].length - 1) tablero[i][j] = "TB";
                    else if (j == 1 || j == tablero[i].length - 2) tablero[i][j] = "XB";
                    else if (j == 2 || j == tablero[i].length - 3) tablero[i][j] = "LB";
                    else if (j == 3) tablero[i][j] = "+B";
                    else tablero[i][j] = "OB";

                }

            }

        }

    }

    public static void main(String[] args) {

        String[][] tablero = new String[8][8];

        // Pintar casillas del tablero de blanco o negro
        for (int i = 0; i < tablero.length; i++) {

            for (int j = 0; j < tablero[i].length; j++) {

                if (i % 2 == 0) {

                    if (j % 2 == 0) tablero[i][j] = "W";
                    else tablero[i][j] = "B";

                } else {

                    if (j % 2 == 0) tablero[i][j] = "B";
                    else tablero[i][j] = "W";

                }

            }

        }

        System.out.println("Pintar el tablero con solo casillas rellenas");
        pintarTablero(tablero);

        System.out.println();

        System.out.println("Pintar el tablero con las piezas puestas");
        ponerPiezas(tablero);
        pintarTablero(tablero);

        System.out.println();

        // Pedir fila y columna por teclado y pasarlo a la funcion de coordenadasAjedrez y pintar lo que devuelve
        int fila = -1, columna = -3;

        do {

            try {

                System.out.println("Inserte el numero de fila de la cual quiere saber la coordenada, tiene que ser un numero del 0 al 7");
                fila = Integer.parseInt(System.console().readLine());

                System.out.println("Ingrese el numero de columna de la cual quiere saber la coordenada, tiene que ser un numero del 0 al 7");
                columna = Integer.parseInt(System.console().readLine());

                System.out.println("La coordenada del tablero de ajedrez de la posicion ingresada es: " + coordenadasAjedrez(fila, columna));

            } catch (Exception e) {

                System.out.println("Error: " + e);

            }

        } while (fila < 0 || fila > 7 || columna < 0 || columna > 7);

        // Pedir posicion del caballo en el tablero y pasarlo a la funcion pintarMovimientosCaballo para saber los posible movimientos
        int filaCab = -1, colCab = -3;

        do {

            try {

                System.out.println("Inserte el numero de fila en la que se encuentra el caballo, tiene que ser un numero del 0 al 7");
                filaCab = Integer.parseInt(System.console().readLine());

                System.out.println("Ingrese el numero de columna en la que se encuentra el caballo, tiene que ser un numero del 0 al 7");
                colCab = Integer.parseInt(System.console().readLine());

                pintarMovimientosCaballo(filaCab, colCab, tablero);

            } catch (Exception e) {

                System.out.println("Error: " + e);

            }

        } while (filaCab < 0 || filaCab > 7 || colCab < 0 || colCab > 7);



    }

}
