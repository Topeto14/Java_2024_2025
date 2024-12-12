package PrimeraEvaluacion.Tema1.Tema2.Unidad2Entregar;

import java.util.Scanner;

public class Ejercicio5Bucle1al10 {
    public static void numerosfuerade1al10 (){
        int num;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un numero: ");
            num = Integer.parseInt(sc.nextLine());
        }while ( num >10 || num < 1);
    }
    public static void main(String[] args) {
     // Programa que pida al usuario un número repetidamente hasta que esté entre 1 y 10.
        /*
        int num;
     do {
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese un numero: ");
         num = Integer.parseInt(sc.nextLine());
     }while ( num >10 || num < 1);

      */
        numerosfuerade1al10();
    }
}
