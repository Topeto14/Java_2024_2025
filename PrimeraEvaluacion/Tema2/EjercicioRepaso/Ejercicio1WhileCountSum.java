package Tema2.EjercicioRepaso;

import java.util.Scanner;

public class Ejercicio1WhileCountSum {
    public static void main(String[] args) {
        // Realiza un programa que vaya pidiendo números enteros
        // mientras no introduzcas el -1.
        // Como resultado debe resolver la cantidad de números introducidos y la suma de esos números.

        Scanner sc = new Scanner(System.in);
        int number = 0 ;
        int count = 1 ;
        int total = 0  ;
        while(number != -1){
            System.out.println("Dime números enteros ");
            number = sc.nextInt();
            System.out.println("La cantidad de números que has introducido es : " + count);
            count++;
            total = total + number ;
            System.out.println("La suma de esos números es :" + total);
        }

    }
}
