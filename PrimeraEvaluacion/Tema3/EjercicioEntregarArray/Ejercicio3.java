package Tema3.EjercicioEntregarArray;

import java.util.Scanner;

public class Ejercicio3 {
    public static int generarNumero(int min, int max){
        return (int) (Math.random()*(max-min+1)+min);

    }
    public static void AcabadoDigito () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array ");
        int size = Integer.parseInt(sc.nextLine());
        int Array[] = new int[size];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = generarNumero(1, 300);
            System.out.println(Array[i]);

        }
        int numeroFinal [] = new int[size];
        /*int count = 0;*/
        System.out.println(" Dime cual es el último digito que quieres que te enseñe de los numeros que tenemos ");
        int ultimoDigito = Integer.parseInt(sc.nextLine());
        while (ultimoDigito < 0 || ultimoDigito > 9) {
            System.out.println("Tienes que introducir un número entre 0 y 9");
            ultimoDigito = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Los numeros acabados en  " + ultimoDigito+ " Son : ");

        for (int i = 0; i < Array.length; i++) {
                if (Array[i] % 10 == ultimoDigito) {
                    numeroFinal[i] = Array[i];
                    /*count++;*/
                    System.out.println(numeroFinal[i]);
                }
        }
    }
    public static void main(String[] args) {
        // Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios entre 1 y 300
        // y mostrar aquellos números que acaben en un dígito que nosotros le indiquemos por teclado (debes controlar
        // que se introduce un numero correcto), estos deben guardarse en un nuevo array. Por ejemplo, en un array de 10
        // posiciones e indicamos mostrar los números acabados en 5, podría salir 155, 25, etc. Cuando llene el segundo
        // array finalizamos.

        AcabadoDigito();

    }
}

