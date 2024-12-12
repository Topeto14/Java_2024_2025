package PrimeraEvaluacion.Tema1.Tema3.Array;

public class Ejercicio3 {

    public static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    /**
     * Devuelve true si num es Primo, false en caso contrario
     * @param num
     * @return
     */
    public static boolean esPrimo(int num) {
        boolean esPrimo = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                esPrimo = false;
                break; //Una vez encuentre un divisor que termine
            }
        }
        return esPrimo;
    }


    public static void main(String[] args) {

        //Genera un array de 20 números enteros aleatorios (entre 1 y 1000)
        //Muestra sólo aquellos que sean primos

        int numeros[] = new int[20];

        for(int i=0; i < numeros.length; i++) {
            numeros[i] = generarNumeroAleatorio(1000, 1);
        }

        for (int i=0; i < numeros.length; i++) {
            if (esPrimo(numeros[i]))
                System.out.println(numeros[i]);
        }



    }
}
