package Tema3.PracticasClases;
import java.util.Arrays;
public class Ejercicio2Dados {
    // Funcion para generar tirada del dado
    public static int tirarDado () {

        return (int) Math.ceil(Math.random() * 6);

    }

    // Funcion para calcular porcentaje de aparicion de cada numero del dado
    public static double[] estadisticas (int n) {

        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, dado;

        for (int i = 0; i != n; i++) {

            dado = tirarDado();

            if (dado == 1) n1++;
            else if (dado == 2) n2++;
            else if (dado == 3) n3++;
            else if (dado == 4) n4++;
            else if (dado == 5) n5++;
            else if (dado == 6) n6++;

        }

        // Insertar los porcentajes haciendo el calculo y castenado el valor a double
        double[] array = { (double) n1 / n * 100, (double) n2 / n * 100, (double) n3 / n * 100, (double) n4 / n * 100, (double) n5 / n * 100, (double) n6 / n * 100,};

        return array;

    }

    public static void main(String[] args) {

        int nTiradas = 0, sumaDados = 0, dado1 = -1, dado2 = 7;

        // Realizar tiradas de los dados
        while (dado1 != 6 || dado2 != 6) {

            dado1 = tirarDado();
            dado2 = tirarDado();
            nTiradas++;
            sumaDados += dado1 + dado2;

            System.out.println("Tirada " + nTiradas);
            System.out.println("El dado 1 ha sacado " + dado1);
            System.out.println("El dado 2 ha sacado " + dado2);
            System.out.println();

        }

        System.out.println("La suma de los resultados hasta que los dos dados han sido 6 es: " + sumaDados);
        System.out.println();

        // Tirar dado 100 y 1000 veces y calcular su estadistica

        double[] Array100 = estadisticas(100);

        double[] Array1000 = estadisticas(1000);

        System.out.println("El array con el porcentaje de aparaciones de cada numero del dado con 100 tiradas es:");
        System.out.println(Arrays.toString(Array100));

        System.out.println();

        System.out.println("El array con el porcentaje de aparaciones de cada numero del dado con 1000 tiradas es:");
        System.out.println(Arrays.toString(Array1000));

    }

}
