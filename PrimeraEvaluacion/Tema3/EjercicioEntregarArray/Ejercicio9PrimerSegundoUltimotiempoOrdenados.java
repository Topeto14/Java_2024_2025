package Tema3.EjercicioEntregarArray;
import java.util.Arrays;
public class Ejercicio9PrimerSegundoUltimotiempoOrdenados {
    public static void main(String[] args) {

        int[] tiempos = new int[10], tiemposOrdenados = new int[tiempos.length];

        //Ingresar valores en el array por pantalla
        try {

            for (int i = 0; i < tiempos.length; i++) {
                System.out.println("Ingrese el tiempo en segundos del corredor numero " + (i + 1));
                tiempos[i] =  Integer.parseInt(System.console().readLine());
            }

            // Clonar el array y ordenarlo
            tiemposOrdenados = tiempos.clone();
            Arrays.sort(tiemposOrdenados);

            // Buscar los valores del primer, segundo y ultimo
            System.out.println("El ganador de la carrera ha sido el corredor numero " + (Arrays.binarySearch(tiempos, tiemposOrdenados[0]) + 1) + " con un tiempo de " + tiemposOrdenados[0] + " segundos");
            System.out.println("El subcampeon de la carrera ha sido el corredor numero " + (Arrays.binarySearch(tiempos, tiemposOrdenados[1]) + 1) + " con un tiempo de " + tiemposOrdenados[1] + " segundos");
            System.out.println("El ultimo de la carrera ha sido el corredor numero " + (Arrays.binarySearch(tiempos, tiemposOrdenados[tiemposOrdenados.length - 1]) + 1) + " con un tiempo de " + tiemposOrdenados[tiemposOrdenados.length - 1] + " segundos");

        } catch (Exception e) {

            System.out.println("Error: " + e);

        }

    }

}
