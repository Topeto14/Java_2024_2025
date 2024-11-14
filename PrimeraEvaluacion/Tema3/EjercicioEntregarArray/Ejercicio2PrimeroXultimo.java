package Tema3.EjercicioEntregarArray;

public class Ejercicio2PrimeroXultimo {
    public static int generarNumero(int min, int max){
        return (int) (Math.random()*(max-min+1)+min);
    }

    public static void intercambiarPosicion (){
        int numeros [] = new int[10];
        int guardarPrimerPosicion = 0;
        int guardarUltimoPosicion = 0;
        for (int i = 0; i < numeros.length; i++) {
           numeros[i] = generarNumero(1,10);
            System.out.println(numeros[i]);
        }
        guardarPrimerPosicion = numeros[9];     // int primerPos = numeros [0];
        guardarUltimoPosicion = numeros[0];     // numeros [0] = numeros [numeros.length - 1 ];
        numeros[0] = guardarPrimerPosicion;     // numeros [numeros.length - 1] = primerPos;
        numeros[9] = guardarUltimoPosicion;

        System.out.println("------------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
    public static void main(String[] args) {
      // Crea una función que reciba como parámetro un array de 10 enteros, debe devolver el mismo array donde se
        // hayan intercambiado el primer elemento y el último elemento.
        intercambiarPosicion();
    }
}
