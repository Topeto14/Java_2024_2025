package Tema2.Unidad2Entregar;

import java.util.Scanner;

public class Ejercicio1 {
    public static int mayorDos( int a, int b){
        if (a > b)
            return a;
        if (b > a)
            return b;
        else
            return a;
    }
    /**
     * Metodo que devuelve el Mayor de 3 Números
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int mayorTres(int a, int b, int c){
        if (a > b && a > c)
            return a;
        if (b > a && b > c)
            return b;
        if (c > a && c > b)
            return c;
        else
            return a;
    }
    public static int mayorMejorado (int a, int b, int c){
        return mayorTres(a,b,c);
    }
    public static void main(String[] args) {
        // Crea una función (método) que reciba como parámetros tres números enteros y devuelva el mayor de
        // los tres números.
        // Utilizar esa función para el calcular el mayor de cuatro números enteros.
        // Sería así:
        // public int mayor (int a, int b, int c) { … }

        Scanner sc = new Scanner(System.in);

        int numero = 0 ;
        int mayor ;
        for (int i = 1; i <=3 ; i++) {
            System.out.println(" Dime el "+ i + " número ");
            numero = Integer.parseInt(sc.nextLine());
            mayor = numero;
            numero = mayor;
        }
        System.out.println(mayorMejorado(numero,numero,numero));
    }
}
