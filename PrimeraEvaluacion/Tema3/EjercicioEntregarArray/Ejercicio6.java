package Tema3.EjercicioEntregarArray;

import java.util.Scanner;

public class Ejercicio6 {
    public static int generarNumero(int min, int max){

        return (int) (Math.random()*(max-min+1)+min);
    }
    public static void ordenar(){
        int array[] = new int [10];
        for (int i = 0; i < array.length; i++) {
            array[i] = generarNumero(1,10);
            System.out.println(array[i]);
        }
        int ordenado [] = new int [10];
        for (int i = 0; i < ordenado.length; i++) {

        }
    }
    public static void main(String[] args) {
        // Generar 10 números enteros aleatorios. Debemos mostrarlos en el siguiente orden: el primero, el último, el
        // segundo, el penúltimo, el tercero, etc… Pista: primero los guardas en un array y luego lo recorres como indica.

       ordenar();
    }
}
