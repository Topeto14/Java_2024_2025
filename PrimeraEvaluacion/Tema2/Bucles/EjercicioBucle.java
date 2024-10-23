package Tema2.Bucles;

import java.util.Scanner;

public class EjercicioBucle {
    public static void main(String[] args) {
        //Hay que pedir números hasta que introduzcamos el cero.
        //El resultado es la suma y la media de los números introducidos
        //Acumulador (la suma) y contador (el total de números introducidos, sin el cero final)

        //6,7,10,11,1 --> Suma = 35, Media = 35/5

        int numero = -1 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce números ");

        int count = 0 ; // Contador
        double sum = 0 ; // Acumulador

        boolean cero= false;
        while (numero!=0){ // Mientras que no ponga el 0 seguira el bucle poniendo los números
            numero = Integer.parseInt(sc.nextLine());

            //Sumarlo en el acumulador si es el número de salida
            // El 0 no se cuenta para la media
            if (numero != 0) {
                sum += numero; //suma = suma + numero
                count++;
            }

        }
        System.out.println("La suma es : "+ sum +" y la media es " + (sum/count));
    }
}
