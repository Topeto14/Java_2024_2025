package PrimeraEvaluacion.Tema1.Tema2.Excepciones;

import java.util.Scanner;

public class EjemploExcepciones {
    public static void main(String[] args) {
        //Vamos a pedir un precio por teclado y vamos a mostrar el precio con IVA (21%)
        //Controlar que el precio sea un double y no escriba otra cosa
        //Controlar si es un número negativo vamos a lanzar una excepción (no importante)
        double precio=0;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Introduce precio del producto");
            precio = Double.parseDouble(sc.nextLine());

            //Si el precio es negativo
            if (precio < 0) {
                //Genero el error y salta la excepción
                throw new Exception("Precio menor que cero");
            }

            System.out.println("El precio con IVA es: " + precio * 1.21);
        } catch (NumberFormatException ex) {
            System.out.println("No has introducido un precio correcto");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Adiós");
    }
}
