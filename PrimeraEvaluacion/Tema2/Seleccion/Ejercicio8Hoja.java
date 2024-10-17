package Tema2.Seleccion;

import java.util.Scanner;
public class Ejercicio8Hoja {
    public static void main(String[] args) {

        int dado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número de la cara del dado");
        dado = Integer.parseInt(sc.nextLine());

        if (dado == 1) {
            System.out.println("El opuesto es seis");
        } else if (dado == 2) {
            System.out.println("El opuesto es cinco");
        } else if (dado == 3) {
            System.out.println("El opuesto es cuatro");
        } else if (dado == 4) {
            System.out.println("El opuesto es tres");
        } else if (dado == 5) {
            System.out.println("El opuesto es dos");
        } else if (dado == 6) {
            System.out.println("El opuesto es uno");
        } else {
            System.out.println("Error número incorrecto");
        }
    }
}
