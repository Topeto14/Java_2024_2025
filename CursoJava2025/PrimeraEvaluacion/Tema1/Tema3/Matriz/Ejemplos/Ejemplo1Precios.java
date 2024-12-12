package PrimeraEvaluacion.Tema1.Tema3.Matriz.Ejemplos;

public class Ejemplo1Precios {
    public static void main(String[] args) {
        int precios[][] = new int[3][5];
        int pre1[] = new int[5];
        int pre2[] = new int[5];
        int pre3[] = new int[5];

        /**
         *
         * fila 0 ->  1  3  5  6  45
         * fila 1 ->  0  9  8  2  3
         * fila 2 ->  3  4  3  33  5
         *
         *            c0 c1 c2 c3 c4
         */


        precios[0][4] = 45;
        precios[2][3] = 33;

        for(int fila=0; fila < 3; fila++) {
            for(int columna=0; columna < 5; columna++) {
                System.out.print(precios[fila][columna] + " ");
            }
            System.out.println();
        }

        //precios.length = número de filas
        //precios[0].length = número de columnas

        for(int i=0; i < precios.length; i++) {
            for(int j=0; j < precios[0].length; j++) {
                System.out.print(precios[i][j] + " ");
            }
            System.out.println();
        }

    }
}
