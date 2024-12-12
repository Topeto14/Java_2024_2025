package PrimeraEvaluacion.Tema1.Tema3.Matriz.Ejercicios;

public class Ejercicio3 {
    public static double generarNumero(double min, double max){
        return (double) (Math.random()*(max-min+1)+min);
    }

    public static void main(String[] args) {
        /*
            En una plantación tenemos seis zonas diferentes.
            En cada zona tenemos tres sensores, uno de temperatura (-5, 55), otro de
            humedad (0, 100), y otro de pH (0, 10) del suelo.
            Cada sensor nos da la temperatura media del día.

            Vamos a almacenar esa información donde cada fila es una zona y cada
            columna la media de cada tipo de sensor.

            Escribe un programa Java que:
            1. Genere aleatoriamente los datos de los sensores.
            2. Pinte toda la información
            3. Calcule el promedio de cada tipo de sensor en toda la plantación
            4. Identifique la zona con la temperatura más alta
            5. Diga si alguna zona tiene una humedad inferior al 30%

         */

        double sensores[][] = new double[6][3];

        for (int i = 0; i < sensores.length ; i++) {
            sensores[i][0] = generarNumero(-5,55);
            sensores[i][1] = generarNumero(0,100);
            sensores [i][2] = generarNumero(10,0);
        }

    }
}
