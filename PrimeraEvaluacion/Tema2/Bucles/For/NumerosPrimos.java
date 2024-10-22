package Tema2.Bucles.For;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        //Introduce un número y di si es un número primo o no
        //Primo : solo divisible entre el mismo y el 1
        //Indicador
        //7-> 7/6 resto!=0, 7/5 resto !=0, 7/4 resto!=0, ... , 7/2 != 0
        //Si algún resto da == 0, significa que No es primo
        Scanner sc = new Scanner(System.in);
        int number = 7 ;
        boolean esPrimo = true;
        for (int i = number -1 ; i >= 2 ; i--) {
            if (number % i == 0){
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
