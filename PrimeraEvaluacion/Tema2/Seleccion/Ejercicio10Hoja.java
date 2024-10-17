package Tema2.Seleccion;

import java.util.Scanner;

public class Ejercicio10Hoja {
    public static void main(String[] args) {

        int a,b,c;
        double solucion1, solucion2;

        //ax2 + bx + c = 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el valor de a");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Dime el valor de b");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("Dime el valor de c");
        c = Integer.parseInt(sc.nextLine());

        int disc = b * b  - (4 * a * c);
        if (a == 0) {
            System.out.println("No hay solución, a es 0");
        } else if (disc == 0) {
            solucion1 = -1 * b / (2 * a);
            System.out.println("Solución es: " + solucion1);
        } else if (disc < 0) {
            System.out.println("No tiene solución real");
        } else if (disc > 0) {
            solucion1 = (-b + Math.sqrt(disc)) / (2 * a);
            solucion2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("La solución 1 es " + solucion1);
            System.out.println("La solución 2 es " + solucion2);
        }
    }
}
