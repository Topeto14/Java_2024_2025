package PrimeraEvaluacion.Tema1.Tema2.Bucles.For;


import java.util.Scanner;

public class EjemploFor {
    public static void main(String[] args) {
        /*
        //Pintar numeros del 1 al 10
        for (int num= 1; num <=10 ; num++) {
            System.out.println(num);

        }

        //Numeros pares del 2 al 40
        for (int num = 2; num <=40 ; num+=2) {
            System.out.println(num);

        //Recorrer la cadena caracter a caracter
        String cadena = "Programacion";
        for(int i = 0; i < cadena.length();i++){ // 0 - 11
                System.out.println(cadena.charAt(i)); //Pinta la posicion i de la cadena
            }

        //Con un for pintar la cuenta atrás del 10 al 1

            for (int i = 10; i > 0 ; i--) {
                System.out.println(i);

        //Genera 10 tiradas de un dado usando for

          int tirada;

                for (int i =1; i<=  10 ; i++) { //Repetir algo 10 veces
                    tirada = (int) (Math.random() * (6)) + 1;
                    System.out.println(tirada);
              }
         // Preguntar por teclado 5 nombres  de personas


        Scanner sc = new Scanner(System.in);
        String nombre ;
        for(int i=0; i<5; i++) {
            System.out.println("Dime un nombre");
            sc.nextLine();
            System.out.println(nombre);
            sc.nextLine();
        }


        //Pregunta por teclado 5 nombres y pintalos seguidos
        //Tenemos que ir guardando los nombres en una variable
        //nombres = nombres + nuevo;
        Scanner sc = new Scanner(System.in);
        String nombre ;
        String cadenaNombre = "" ;
        for(int i=0; i<5; i++ ){
            System.out.println("Dime tu nombre");
            nombre = sc.nextLine();
            cadenaNombre = cadenaNombre + nombre + " ";
        }
        System.out.println(cadenaNombre);


        //Pintar por pantalla la tabla de multiplicar del número 7

        int numero = 7;

        for (int i = 0; i <11 ; i++) {

            System.out.println(i + " x 7 = " + (i * numero));
        }



        //Pintar la tabla del 4 al revés

        int numero = 4;

        for (int i=10; i>=0; i--){
            System.out.println(i + " x 4 = " + (i*numero));
        }

        //Tira un dado de seis caras 100 veces
        //Dime cuantos veas solo el seis.

        int tirada ;
        int count = 0 ;

        for (int i = 0; i <=100 ; i++) {
            tirada = (int) (Math.random() * (6)) + 1;
            if (tirada == 6) {
                count++;
            }
        }

        System.out.println("El numero de veces que sale el 6 es : " + count);
        System.out.println("El porcentaje de veces es " + count *100/100 + " % ");

        //Suma todos los números pares del 1 al 100
        int total = 0 ;
        for (int i = 1; i <=100 ; i++) {
            if ( i%2 == 0) {
                total = total + i ;
            }
        }
        System.out.println("La suma de todos los números pares es : " + total);

        //Pide 5 precios por teclado
        //Imprime el total

        Scanner sc = new Scanner(System.in);
        int total=0 ;
        int cantidad =0 ;
        for (int i = 1; i <=5; i++) {
            System.out.println("El precio numero " + i + " Te lo sumare con los siguientes que me des hasta el  5");
            cantidad = sc.nextInt();
            total = cantidad + total ;
        }
        System.out.println("La cantidad que te he sumado es " + total);
        */
        // Genera 100 números aletorios entre 1 y 100
        //muestra la suma de los pares y la suma de los impares
        int countPar = 0 ;
        int countImpar = 0 ;
        int numero;
        int totalPares = 0, totalImpares = 0 ;
        for (int i = 1; i <=10 ; i++) {
            numero = (int) (Math.random() * (100)) + 1;
            if ( i%2 == 0) {
                totalPares = totalPares + numero;
                countPar++;
            }else{
                totalImpares = totalImpares + numero;
                countImpar++;
            }
        }
        System.out.println(" Total de impares " + totalImpares );
        System.out.println(" Total de Pares " + totalPares );
        System.out.println(" Cantidad de número pares " + countPar);
        System.out.println(" Cantidad de números Impares " + countImpar);
    }
}
