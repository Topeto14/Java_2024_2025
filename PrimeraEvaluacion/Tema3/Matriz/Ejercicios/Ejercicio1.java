package Tema3.Matriz.Ejercicios;

public class Ejercicio1 {
    public static int generarNumero(int min, int max){
        return (int) (Math.random()*(max-min+1)+min);
    }
    public static void main(String[] args) {
        // Ej1 - Crea una matriz 6x6 de enteros. Rellénala de valores aleatorios y
        //   dime la suma de la diagonal principal y la diagonal secundaria

        int suma [][]= new int[6][6];
        int sumPrincipal = 0 ;
        int sumSecundaria = 0 ;
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma.length; j++) {
                suma[i][j] = generarNumero(1,9);
                System.out.print(suma[i][j]+ "  ");
                if (i == j) {
                    sumPrincipal += suma[i][j];
                } else if (i+j==5 ) {
                    sumSecundaria += suma[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(" La suma de la diagonal principal es " + sumPrincipal);
        System.out.println(" La suma de la diagonal principal es " + sumSecundaria);
    }
}
