package Tema2.Unidad2Entregar;

import java.util.Scanner;

public class Ejercicio7Factorial {
    public static void factorial() {
        int numero;
        int total = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número que le hare factorial ");
        numero = sc.nextInt();
        for (int i = numero; i >=2 ; i--) {
            total *= i; // total = total * i;
            System.out.println("El factorial del numero " + i + " es " + total);
    }
        System.out.println("El factorial del numero " + numero + " es " + total);
    }
    public static void main(String[] args) {
       // 7.Función que calcule el factorial de un número entero positivo pasado como parámetro.
        factorial();
    }
}
