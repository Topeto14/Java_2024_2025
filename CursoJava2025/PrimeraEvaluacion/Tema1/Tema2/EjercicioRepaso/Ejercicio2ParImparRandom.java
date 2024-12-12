package PrimeraEvaluacion.Tema1.Tema2.EjercicioRepaso;

public class Ejercicio2ParImparRandom {
    public static int generarNumero(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static void main(String[] args) {
    // Realiza un programa que genere 20 numeros aleatorios entre 1 y 200
    // que diga cuántos números pares han salido y cuántos impares.

        int number ;
        int totalPAr = 0 ;
        int totalImpar = 0 ;
        for (int i = 1; i <=20 ; i++) {
            number = generarNumero(1,200);
            System.out.println(number );
            if (number % 2  == 0) {
                System.out.println("Este número es par " + number);
                totalPAr++;
            }else{
                System.out.println("Este número es Impar " + number);
                totalImpar++;
            }
            System.out.println("Numeros Pares = " + totalPAr);
            System.out.println("Números Impar = " + totalImpar);
        }

    }
}
