package PrimeraEvaluacion.Tema1.Tema2.EjercicioRepaso;

public class Ejercicio3Divisible7ForWhile {
    public static void main(String[] args) {
        //Muestra todos los números divisibles entre 7 entre  el número 500 y el 1.
        /*
        for (int i = 500; i >=1 ; i--) {
            if (i%7 == 0) {
                System.out.println(i);
            }
        }*/
        int number = 500;
        do {
            if(number%7 ==0){
                System.out.println(number);
            }
            number--;
        }while (number>=1);
    }
}
