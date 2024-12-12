package PrimeraEvaluacion.Tema1.Tema2.Seleccion;

import java.util.Scanner;

public class Ejercicio5Hoja {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un año");
        int year = sc.nextInt();

        //Comprobar si es bisiesto
        if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }

    }
}
