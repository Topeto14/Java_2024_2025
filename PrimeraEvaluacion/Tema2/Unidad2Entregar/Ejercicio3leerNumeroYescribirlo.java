package Tema2.Unidad2Entregar;

import java.util.Scanner;

public class Ejercicio3leerNumeroYescribirlo {
    public static String leerNumero () {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Escribe un número que te lo voy a poner con letras ");
        int number  = sc.nextInt();

            if (number == 0) {
                System.out.println(" Cero ");
            }else if (number == 1) {
                System.out.println(" Uno ");
            }else if (number == 2) {
                System.out.println(" Dos ");
            } else if (number == 3) {
                System.out.println(" Tres ");
            } else if (number == 4) {
                System.out.println(" Cuatro ");
            }else if (number == 5) {
                System.out.println(" Cinco ");
            } else if (number == 6) {
                System.out.println(" Seis ");
            } else if (number == 7) {
                System.out.println(" Siete");
            } else if (number == 8 ) {
                System.out.println(" Ocho ");
            }else if (number == 9) {
                System.out.println(" Nueve ");
            }else {
                System.out.println(" Introduce solo numero de un  digito ");
            }
        return String.valueOf(number);
    }
    public static void main(String[] args) {
        //Programa que lea un número positivo de un dígito por teclado y diga en letra a qué dígito corresponde
        // (uno, dos, tres, cuatro, …). Ejemplo: si se introduce el 1, se mostrará por pantalla el “uno”;
        // si se introduce el 11, se mostrará el mensaje “Error: no es un número de un dígito”.

        String leer = leerNumero();
        System.out.println(leer);
    }
}
