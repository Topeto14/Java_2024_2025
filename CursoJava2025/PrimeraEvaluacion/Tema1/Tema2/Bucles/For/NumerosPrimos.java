package PrimeraEvaluacion.Tema1.Tema2.Bucles.For;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        //Introduce un número y di si es un número primo o no
        //Primo : solo divisible entre el mismo y el 1
        //Indicador
        //7-> 7/6 resto!=0, 7/5 resto !=0, 7/4 resto!=0, ... , 7/2 != 0
        //Si algún resto da == 0, significa que No es primo

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero y te dire si es primo  ");
        int number = sc.nextInt(); ;
        boolean esPrimo = true; // Indicador se pone a true, si encuentro un divisor a false

        for (int i = number - 1 ; i >= 2 ; i--) {
            if (number % i == 0){ // Si hay algun divisor, no es primo
                esPrimo =false;
                System.out.println(i);
        }
    }
        if (esPrimo){
            System.out.println(number +" Es primo");
        }else{
            System.out.println(number + " No es primo");
        }


}
}
