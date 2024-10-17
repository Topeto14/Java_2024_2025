package Tema2.Bucles;

public class EjerciciosDadoWhile {
    public static void main(String[] args) {

        //Simula lanzar un dado de seis caras, hasta que te salga un seis
        //Generar un número aleaotorio del 1 al 6
        /*
        int tirada=0;

        while (tirada != 6) {
            tirada = (int) (Math.random() * (6 - 1 + 1)) + 1;
            System.out.println(tirada);
        }


        //Simula lanzar un dado de seis caras, hasta que te salga un seis
        //Cuenta el número de tiradas que has necesitado hasta sacar un seis
        //Necesito una variable que se incremente cada vez que entro en el while
        int tirada=0;
        int contador=0;
        while (tirada != 6) { //Cuando esto sea false termina
            contador++;
            tirada = (int) (Math.random() * (6 - 1 + 1)) + 1;
            System.out.println("Dado " + tirada + " Contador " + contador);
        }

        System.out.println("Has necesitado " + contador + " tiradas");
        */

        //Simula tirar un dado de 20 caras, hasta que te salga el 1 o el 20
        //La condición de salida: numero == 1 || numero == 20
        //La condición del while es lo contrario:
        //1. numero != 1 && numero != 20
        //2. !(numero == 1 || numero == 20)

        int numero;
        do {
            numero = (int) (Math.random() * (20 - 1 + 1)) + 1;
        } while (numero != 1 && numero != 20);

        System.out.println(numero);

    }
}
