package PrimeraEvaluacion.Tema1.Tema3.EjercicioEntregarArray;

import java.util.Arrays;

public class Ejercicio6DesordenadoUltimoPrimero {
    public static int generarNumero(int min, int max){

        return (int) (Math.random()*(max-min+1)+min);
    }
    public static void ordenar(){
        int array[] = new int [10];

        for (int i = 0; i < array.length; i++) {
            array[i] = generarNumero(1,10);
            System.out.println(array[i]);
        }
        System.out.println("El array original es : " + Arrays.toString(array));

        int ordenado [] = new int [10];

        int contador1 = 0;
        int contador2 = array.length - 1;
        for (int i = 0; i < array.length; i+=2) {
            ordenado[i] = array[contador1];
            ordenado[i+1] = array[contador2];
            contador1++;
            contador2--;
        }
        System.out.println("El array modificado es " + Arrays.toString(ordenado));
    }
    public static void main(String[] args) {
        // Generar 10 números enteros aleatorios. Debemos mostrarlos en el siguiente orden: el primero, el último, el
        // segundo, el penúltimo, el tercero, etc… Pista: primero los guardas en un array y luego lo recorres como indica.

       ordenar();
    }
}
