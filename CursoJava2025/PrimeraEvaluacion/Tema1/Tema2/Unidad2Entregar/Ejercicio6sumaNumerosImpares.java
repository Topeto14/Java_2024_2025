package PrimeraEvaluacion.Tema1.Tema2.Unidad2Entregar;

import java.util.Scanner;


public class Ejercicio6sumaNumerosImpares {
    public static void sumaNumerosImpares (){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0 ;
        for (int i = 1; i <100 ; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " es un numero Impar");
                sum = sum + i;
                count++;
            }
        }
        System.out.println(" La suma de todos los números Impares es " + sum );
        System.out.println(" Hay " + count + " numeros impares entre 1 y 100 ");
    }
    public static void main(String[] args) {
        /*
        // Programa que sume los 100 primeros números enteros impares.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0 ;
        for (int i = 1; i <100 ; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " es un numero Impar");
                sum = sum + i;
                count++;
            }
        }
        System.out.println(" La suma de todos los números Impares es " + sum );
        System.out.println(" Hay " + count + " numeros impares entre 1 y 100 ");

         */
        sumaNumerosImpares();
    }
}
