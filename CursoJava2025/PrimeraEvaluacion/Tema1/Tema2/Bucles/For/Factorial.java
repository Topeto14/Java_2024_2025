package PrimeraEvaluacion.Tema1.Tema2.Bucles.For;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Calcular el factorial de un número. Que es el producto de todos los números
        //anteriores a él hasta el 1
        //Factorial
        //5! = 5 * 4 * 3 * 2 * 1
        //8! =7 * 6 * 5 * 4 * 3 * 2 * 1
        int numero ; //Por encima de 170 saldría infinito
        double total = 1 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        numero = sc.nextInt();
        for (int i = numero; i >=2 ; i--) {
            total *= i; // total = total * i;
            System.out.println("El factorial del numero " + i + " es " + total);
        }
        System.out.println();
        System.out.println("El factorial del numero " + numero + " es " + total);
    }
}
