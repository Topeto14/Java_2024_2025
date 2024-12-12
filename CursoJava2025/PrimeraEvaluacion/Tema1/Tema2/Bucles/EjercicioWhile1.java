package PrimeraEvaluacion.Tema1.Tema2.Bucles;

import java.util.Scanner;

public class EjercicioWhile1 {

    public static void main(String[] args) {

        /*
        int numero = 1;
        while (numero <= 50) {
            //System.out.println(numero);
            numero = numero + 1;
        }

        //Pinta los números pares del 1 al 20
        numero = 2;
        while (numero <= 20) {
            System.out.println(numero);
            numero+=2; //numero = numero + 2
        }

        //Cuenta atrás del 10 al 1
        int numero = 10;
        while (numero >= 1) {
            System.out.println(numero);
            numero--;
        }


        //Muestra los números que son decenas del 1 al 100
        int numero = 10;
        while (numero <= 100) {
            System.out.println(numero);
            numero+=10; //numero = numero + 10
        }

        //Muestra los números que son decenas del 1 al 100
        int numero = 1;
        while (numero <= 100) {
            if (numero % 10 == 0) { //Comprobar si el número es o no múltiplo de 10
                System.out.println(numero);
            }
            numero++; // numero = numero + 1
        }

        //Del 1 al 200 muestra los números impares que no sean múltiplos de 7
        //Impares -> numero % 2 != 0
        //Múltiplos de 7 -> numero % 7 == 0

        int numero = 1;
        while (numero <= 200) {
            if ( (numero % 2 != 0) && (numero % 7 != 0) ) {
                System.out.println(numero);
            }
            numero++;
        }

        //Pida por teclado un contraseña mientras la longitud sea menor de 8 caracteres
        // password.length() --> devuelve la longitud del String password
        String password = "1";
        Scanner sc = new Scanner(System.in);
        while (password.length() < 8) {
            System.out.println("Introduce contraseña:");
            password = sc.nextLine(); //Lo que nos acerca a que se cumpla es pedir por teclado
        }
         System.out.println("Tu contraseña válida es " + password);
        */


        //Pida por teclado una contraseña mientras la longitud sea menor de 10 caracteres
        //y tenga al menos una letra mayúscula
        // password.toUpperCase() pasa la cadena a mayúsculas
        // password.toLowerCase() pasa la cadena a minúsculas


        String password = "hola";
        Scanner sc = new Scanner(System.in);
        //Mientras pass igual passMinuscula  Y  pass menor 10
        while ( (password.equals(password.toLowerCase()) ) || (password.length() < 10) ) {
            System.out.println("Introduce contraseña:");
            password = sc.nextLine(); //Lo que nos acerca a que se cumpla es pedir por teclado
        }
        System.out.println("Tu contraseña válida es " + password);


        //Lo que yo quiero es que el bucle termine cuando
        // password.length() >= 10 && !password.equals(password.toLowerCase())
        //Lo contrario de eso, que es lo que pongo en el while
        // password.length() < 10 || password.equals(password.toLowerCase())



    }
}
