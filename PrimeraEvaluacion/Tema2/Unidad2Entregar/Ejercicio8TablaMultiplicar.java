package Tema2.Unidad2Entregar;

import java.util.Scanner;

public class Ejercicio8TablaMultiplicar {
    public static void numeroMultiplicar(){
        int numeroMultiplicar;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ingrese el número de la tabla de multiplicar ");
        numeroMultiplicar = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println( numeroMultiplicar + " X " + i + " = " + i * numeroMultiplicar);
        }

    }
    public static void main(String[] args) {
        //8. Programa que imprima la tabla de multiplicar de cualquier número entre el 1 y el 10 introducido por teclado.
        numeroMultiplicar();
    }
}
