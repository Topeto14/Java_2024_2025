package Tema2.Unidad2Entregar;

import java.util.Scanner;

public class Ejercicio1Mayor {
    public static int mayor(int a, int b) {
        if (a > b)
            return a;
        else if (a < b)
            return b;
        else
            return a;
    }

    public static int mayor(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else if (c > a && c > b)
            return c;
        else                            //los tres iguales
            return a;
    }

    public static int mayorMejorado(int a, int b, int c) {
        return mayor(a, b, mayor(a, c));
    }

    public static int mayorEntreCuatro(int a, int b, int c, int d) {
        return mayor(mayor(a,b), mayor(c,d));
    }

    public static int mayorForTres (){
        Scanner sc = new Scanner(System.in);
        int a = -999999999; // Se pone el número mas bajo posible para que al poner otro sea si o si mayor
        try {
            for (int i = 1; i <=3; i++) { // Del uno a la tres que son los números de intentos
                System.out.println(" Dime el numero " + i  );
                int numero = Integer.parseInt(sc.nextLine()); // Se introduce el númer por teclado
                if (numero > a) {      // Si número es mayor que a = -99999999
                    a = numero;        // a sera el número. osea el mayor
                }
            }
        }catch (Exception e){
            System.out.println(" Introduce un número entero ");
        }
        return a;
    }
    public static int mayorForCuatro () {
        Scanner sc = new Scanner(System.in);
        int a = -999999999;
        try {
            for (int i = 1; i <= 4; i++) {
                System.out.println(" Dime el numero " + i);
                int numero = Integer.parseInt(sc.nextLine());
                if (numero > a) {
                    a = numero;
                }
            }
        } catch (Exception e) {
            System.out.println(" Introduce un número entero ");

        }
        return a;
    }

    public static void main(String[] args) {
        // Crea una función (método) que reciba como parámetros tres números enteros y devuelva el mayor de
        // los tres números.
        // Utilizar esa función para el calcular el mayor de cuatro números enteros.
        // Sería así:
        // public int mayor (int a, int b, int c) { … }

        int mayor = mayorForTres();
        System.out.println("El numero mayor con tres números es : " + mayor);
        int mayorCuatro = mayorForCuatro();
        System.out.println("El número mayor con cuatro número es : " + mayorCuatro);
    }
}
