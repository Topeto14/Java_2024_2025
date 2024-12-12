package ExamenPrimeraEvaluación;

import java.util.Scanner;

public class Ejercicio2ReinoDeLosDadosMagicos {
    public static int generarNumero(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vidaJ1 = 40;
        int vidaJ2 = 40;
        System.out.println("Dime cuantas rondas vamos a jugar");
        int rondas = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < rondas; i++) {
           int dadoJ1 = generarNumero(1,6);
           int dadoJ2 = generarNumero(1,6);
        }
    }
}
