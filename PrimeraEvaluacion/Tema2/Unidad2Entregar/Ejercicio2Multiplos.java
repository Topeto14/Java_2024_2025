package Tema2.Unidad2Entregar;

import java.util.Scanner;

public class Ejercicio2Multiplos {
    public static int multiploDos (){
        int a = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número y te dire si es múltiplo de " + a );
        int numero = Integer.parseInt(sc.nextLine());
        if (numero % a == 0){
            System.out.println(" El número " + numero + " es multiplo de " + a );
        }else{
            System.out.println(" El númreo " + numero + " NO es multiplo de " + a );
        }
        return numero ;
    }
    public static int multiploTres (){
        int a = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número y te dire si es múltiplo de " + a  );
        int numero = Integer.parseInt(sc.nextLine());
        if (numero % a == 0){
            System.out.println(" El número " + numero + " es multiplo de " + a );
        }else{
            System.out.println(" El númreo " + numero + " NO es multiplo de " + a );
        }
        return numero ;
    }
    public static int multiploCinco (){
        int a = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número y te dire si es múltiplo de " + a );
        int numero = Integer.parseInt(sc.nextLine());
        if (numero % a == 0){
            System.out.println(" El número " + numero + " es multiplo de " + a );
        }else{
            System.out.println(" El númreo " + numero + " NO es multiplo de " + a );
        }
        return numero ;
    }
    public static int multiploSiete (){
        int a = 7;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número y te dire si es múltiplo de " + a );
        int numero = Integer.parseInt(sc.nextLine());
        if (numero % a == 0){
            System.out.println(" El número " + numero + " es multiplo de " + a );
        }else{
            System.out.println(" El númreo " + numero + " NO es multiplo de " + a );
        }
        return numero ;
    }
    public static boolean multiploDosTresCincoySiete (){
        int a = 2;
        int b = 3;
        int c = 5;
        int d = 7;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Escribe un número ");
        int number = Integer.parseInt(sc.nextLine());
        if ( number % a == 0 ){
            System.out.println(" El número " + number + " es multiplo de " + a );
        } else if (number % b == 0) {
            System.out.println(" El número " + number + " es multiplo de " + b );
        } else if (number % c == 0) {
            System.out.println(" El número " + number + " es multiplo de " + c );
        } else if (number % d == 0) {
            System.out.println(" El número " + number + " es multiplo de " + d );
        }else {
            System.out.println("El número " + number + " NO es multiplo de " + a + " - " + b + " - " + c + " - " + d  );
            return false;
        }
        return true;
    }
        public static void elverdaderoMultiplo() {
            Scanner sc = new Scanner(System.in);
            int a = 2;
            int b = 3;
            int c = 5;
            int d = 7;
            System.out.println("Introduce un número y te dire si es multiplo de " + a +" - " + b + " - " + c + " - " + d );
            int number = Integer.parseInt(sc.nextLine());
            if (number % a == 0) {
                System.out.println(" El número " + number + " es multiplo de " + a);
            } else {
                System.out.println(" El número " + number + " NO! es multiplo de " + a);
            }
            if (number % b == 0) {
                System.out.println(" El número " + number + " es multiplo de " + b);
            } else {
                System.out.println(" El número " + number + " NO! es multiplo de " + b);
            }
            if (number % c == 0) {
                System.out.println(" El número " + number + " es multiplo de " + c);
            } else {
                System.out.println(" El número " + number + " NO! es multiplo de " + c);
            }
            if (number % d == 0) {
                System.out.println(" El número " + number + " es multiplo de " + d);
            } else {
                System.out.println(" El número " + number + " NO! es multiplo de " + d);
            }
        }
        /*
        public boolean multiplos (int a){
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
            if ( number %  a == 0) {
                System.out.println(" El número " + number + " es multiplo de " + a);
                return true;
            }else
                System.out.println(" El número " + number + " NO es multiplo de " + a);
            return false;
        }
        */
    public static void main(String[] args) {
        //Programa que lea un número por teclado e indique si es múltiplo de 2, 3, 5 o 7.

       elverdaderoMultiplo() ;

    }

}
