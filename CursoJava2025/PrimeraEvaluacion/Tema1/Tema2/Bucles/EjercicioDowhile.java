package PrimeraEvaluacion.Tema1.Tema2.Bucles;

import java.util.Scanner;

public class EjercicioDowhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Mismo del password >= 8
        String password;
        do {
            System.out.println("Dime contraseña");
            password = sc.nextLine();
        } while (password.length() < 8);

        System.out.println("Tu contraseña es " + password);

        //Muestra los números del 1 al 10 usando do-while
        int numero = 1;
        do {
            System.out.println(numero);
            numero++;
        } while (numero < 10);

        numero = 100;
        do {
            System.out.println(numero);
            numero--;
        } while (numero > 0);

    }
}
