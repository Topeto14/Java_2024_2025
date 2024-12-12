package PrimeraEvaluacion.Tema1.Tema2.Unidad2Entregar;

import java.util.Scanner;

public class Ejercicio9ContarNumeroDigitos {
    public static void numeroDigitosContar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para que le cuente cuantos digitos tiene : ");
        int numero = sc.nextInt();
        int contar = 0;
        while (numero != 0) {
            numero = numero / 10;
            System.out.println(numero);
            contar ++;
        }
        System.out.println("En total hay " + contar + " dígitos");
    }
    public static void main(String[] args) {
        //9. Crea un método que, dado un número entero pasado como parámetro, devuelva cuántos dígitos lo forman.
        // P.ej.: el número 54326 consta de 5 dígitos. Pista: cuántas veces se puede dividir entre 10.
        numeroDigitosContar();
    }
}
