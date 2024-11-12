package Tema3.Array;

public class Ejemplo1 {
    public static void main(String[] args) {
        //Crear un array de 10 enteros le pone el valor por defecto, 0
        int numeros[] = new int[10];
        //Valores -> 0 0 0 0 0 0 0 0 0 0
        //Índices -> 0 1 2 3 4 5 6 7 8 9

        numeros[1] = 55;
        numeros[5] = 99;
        //Valores -> 0 55 0 0 0 99 0 0 0 0
        //Índices -> 0 1  2 3 4 5  6 7 8 9

        numeros[5] = 8;
        //Valores -> 0 55 0 0 0 8 0 0 0 0
        //Índices -> 0 1  2 3 4 5 6 7 8 9

        System.out.println(numeros[5]);
        System.out.println(numeros.length);

        for(int i =0; i < numeros.length; i++) {
            numeros[i] = 1;
        }
        //Valores -> 1 1 1 1 1 1 1 1 1 1
        //Índices -> 0 1 2 3 4 5 6 7 8 9

        for(int i=0; i < numeros.length; i++) {
            System.out.println("Posicion " + i + " numeros["+i+"]=" + numeros[i]);
        }

        int nota1, nota2, nota3;
        nota1 = 5;
        nota2 = 6;
        nota3 = 9;
        System.out.println(nota1);
        System.out.println(nota2);
        System.out.println(nota3);

        int notas[] = new int[3];
        notas[0] = 5;
        notas[1] = 6;
        notas[2] = 9;

        for(int i=0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        double puntuaciones[] = new double[100];
        for(int i=0; i < puntuaciones.length; i++) {
            puntuaciones[i] = Math.random() * 10;
        }

        for(int i=0; i < puntuaciones.length; i++) {
            System.out.println(puntuaciones[i]);
        }

        puntuaciones[50] = 666;
        System.out.println("Elemento en la posición 50 " + puntuaciones[50]);


    }
}
