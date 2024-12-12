package PrimeraEvaluacion.Tema1.Tema3.Array;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Pide número double por teclado
        // Guardalos directamente en un array
        // Pinta el array entero

        // Variables, sc tipo Scanner, número de tipo array

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el tamaño del array ");
        int size = Integer.parseInt(sc.nextLine());

        double numberArray[] = new double [size];

        for (int i = 0; i <numberArray.length ; i++) {
            System.out.println("Dime un número decimal ");
            double number = Double.parseDouble(sc.nextLine());
            numberArray [i]= number;

        }
        for (int i = 0; i< numberArray.length; i++){
            System.out.println(numberArray[i]);
        }

    }
}
