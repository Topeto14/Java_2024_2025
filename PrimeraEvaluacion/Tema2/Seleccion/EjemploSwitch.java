package Tema2.Seleccion;

import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {

        int dado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número de la cara del dado");
        dado = Integer.parseInt(sc.nextLine());

        switch (dado) {
            case 1: System.out.println("seis");
                break;
            case 2: System.out.println("cinco");
                break;
            case 3: System.out.println("cuatro");
                break;
            case 4: System.out.println("tres");
                break;
            case 5: System.out.println("dos");
                break;
            case 6: System.out.println("uno");
                break;
            default:
                System.out.println("Error número incorrecto");
        }
    }
}
