package Tema2.Excepciones;

import java.util.Scanner;

public class EjemploCapturaExcepcion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean error = true;
        while (error == true) {
            System.out.println("Dame un número");

            //Controlar errores
            try {
                //Intento ejecutar todo este código
                int numero = Integer.parseInt(sc.nextLine());
                System.out.println(numero / 0);
                error = false;

            } catch (NumberFormatException ex) {
                //Si hay una excepción se ejecuta este código y no salta el error
                System.out.println("No has introducido un número válido");
                //System.out.println(ex.getMessage());
            } catch (ArithmeticException ex) {
                System.out.println("Error en la división");
            } catch (Exception ex) {
                System.out.println("Cualquier otro error");
            }
        }





        /*
        int numero1 = 100;
        int numero2 = 0;

        try {
            System.out.println(numero1 / numero2);
        } catch (Exception ex) {
            System.out.println("No se ha realizado la operación " + ex.getMessage());
        }
        */
    }
}
