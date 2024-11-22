package Tema3.Matriz.Ejercicios;

public class Ejercicio2 {
    public static int generarNumero(int min, int max){
        return (int) (Math.random()*(max-min+1)+min);
    }
    public static void pintar(double matriz[][]) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //Ej2 - Crea una matriz 7x3 de double. Rellénala de valores aleatorios y
        // dime la suma de cada una de las columnas.

     int suma [][]= new int[7][3];
     int sumaColumna1 = 0;
     int sumaColumna2 = 0;
     int sumaColumna3 = 0;
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[0].length; j++) {
                suma[i][j] = generarNumero(1,9);
                System.out.print(suma[i][j]+ "  ");
    }
            System.out.println();
        }
        System.out.println("------------");
        for (int j = 0; j < suma[0].length; j++) {
            for (int i = 0; i < suma.length; i++) {
                System.out.print(suma[i][j] + " ");
                if (j == 0) {
                    sumaColumna1 += suma[i][j];
                } else if (j == 1) {
                    sumaColumna2 += suma[i][j];
                } else if (j==2) {
                    sumaColumna3 += suma[i][j];
                }

            }
            System.out.println();
        }
        System.out.println("-------------");
        System.out.println(" La suma de la columna 1 es " + sumaColumna1);
        System.out.println(" La suma de la columna 2 es " + sumaColumna2);
        System.out.println(" La suma de la columna 3 es " + sumaColumna3);
    }
}

