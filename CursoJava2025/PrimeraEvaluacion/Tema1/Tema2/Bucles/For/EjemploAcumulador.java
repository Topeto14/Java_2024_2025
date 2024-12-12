package PrimeraEvaluacion.Tema1.Tema2.Bucles.For;

import java.util.Scanner;

public class EjemploAcumulador {
    public static void main(String[] args) {
        //Pide 5 precios por teclado y pinta la suma total
        int total = 0;
        int precio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dimer 5 precios que te los voy a sumar ");
        for (int i = 0; i < 5; i++) {
            precio = sc.nextInt();
            total  += precio; // Es lo mismo que esto; total = total + precio

        }
        System.out.println("El total es : " + total);
    }
}
