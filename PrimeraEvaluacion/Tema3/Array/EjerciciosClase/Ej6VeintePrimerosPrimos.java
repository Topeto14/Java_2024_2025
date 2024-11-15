package Tema3.Array.EjerciciosClase;

public class Ej6VeintePrimerosPrimos {
    public static boolean esPrimo(int numero) {
        boolean primo = true;

        for(int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0)
                primo = false;
        }

        return primo;
    }

    public static void main(String[] args) {
        //6. Genera un vector de 20 elementos enteros y rellénalo con los 20
        // primeros números primos.

        int numero[]= new int[20];
        int contador=0;
        int num=1;

        while(contador<20){
            if(esPrimo(num)){
                numero[contador]=num;
                contador++;
            }
            num++;
        }

        for(int i=0; i<numero.length; i++){
            System.out.println(numero[i]);
        }

    }
}
