package PrimeraEvaluacion.Tema1.Tema3.EjercicioEntregarString;
import java.util.Arrays;
public class Ejercicio18MayorMenorMedia {
    // Funcion para devolver un numero entre 1 y 50
    public static int genNum () {
        return (int) Math.ceil(Math.random() * 50);
    }

    // Pintar matriz
    public static void pintarMatriz (int[] nums) {

        System.out.println("La matriz es: " + Arrays.toString(nums));

    }

    // Rellenar arrays pasado por parametro con numeros aleatorios
    public static void rellenarArray (int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            nums[i] = genNum();

        }

    }

    // Sacar el numero mayor del array
    public static int devolverMayor (int[] nums) {

        int numMayor = 0;

        for (int i = 0; i < nums.length; i++) {

            if (numMayor < nums[i]) numMayor = nums[i];

        }

        return numMayor;

    }

    // Sacar el numero menor del array
    public static int devolverMenor (int[] nums) {

        int numMenor = 51;

        for (int i = 0; i < nums.length; i++) {

            if (numMenor > nums[i]) numMenor = nums[i];

        }

        return numMenor;

    }

    // Sacar la media del array
    public static int devolverMedia (int[] nums) {

        int sumaMedia = 0;

        for (int i = 0; i < nums.length; i++) {

            sumaMedia += nums[i];

        }

        return sumaMedia / nums.length;

    }

    public static void main(String[] args) {

        int[] nums = new int[50];

        rellenarArray(nums);

        pintarMatriz(nums);

        System.out.println("La media es: " + devolverMedia(nums));
        System.out.println("El mayor numero es: " + devolverMayor(nums));
        System.out.println("El menor numero es: " + devolverMenor(nums));

    }
}
