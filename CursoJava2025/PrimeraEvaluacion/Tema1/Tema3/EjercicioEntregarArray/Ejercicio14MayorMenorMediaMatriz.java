package PrimeraEvaluacion.Tema1.Tema3.EjercicioEntregarArray;
import java.util.Arrays;
public class Ejercicio14MayorMenorMediaMatriz {
    public static int genNum () {
    return (int) Math.ceil(Math.random() * 100);
}

    public static void main(String[] args) {

        int sumaMedia = 0, mayor = 0, menor = 101;
        int[][] matriz = new int[5][3];

        // Insertar numeros aleatorios en el array e ir calculando la suma para la media el numMayor y el menor
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                int numgenerado = genNum();

                matriz[i][j] = numgenerado;

                if (numgenerado < menor) menor = numgenerado;
                if (numgenerado > mayor) mayor = numgenerado;
                sumaMedia += numgenerado;

            }

        }

        for (int i = 0; i < matriz.length; i++) {

            System.out.println(Arrays.toString(matriz[i]));

        }

        System.out.println("La media es: " + (sumaMedia / (matriz.length * matriz[0].length)));
        System.out.println("El mayor numero generado es: " + mayor);
        System.out.println("El menor numero generado es: " + menor);

    }

}
