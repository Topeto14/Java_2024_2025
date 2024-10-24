package Tema2.Unidad2Entregar;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        // 21. Pedir un número entero positivo N. A continuación, introducir por teclado N números enteros.
        // Mostrar la media de los N números introducidos, el mayor y el menor.

        int numerosAIntroducir=0;
        int numero;
        int mayor=0;
        int menor=0;
        int acumulador=0;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Dime cuántos números tengo que pedir");
            numerosAIntroducir = Integer.parseInt(sc.nextLine());

            //En un for pedimos todos esos números
            for(int i=1; i <= numerosAIntroducir; i++) {
                System.out.println("Dime el número " + i + ": ");
                numero = Integer.parseInt(sc.nextLine());
                acumulador += numero;

                //El primer número que me digas es el mayor y el menor
                if (i == 1) {
                    mayor = numero;
                    menor = numero;
                }
                if (numero > mayor) {
                    //Si el número es mayor que el mayor, el mayor ahora es el número
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }

        } catch (NumberFormatException ex) {
            System.out.println("Número incorrecto");
        }

        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
        System.out.println("La media es: " + ((double)acumulador / numerosAIntroducir));


    }

}

