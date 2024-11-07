package Tema3.Array;

public class Ejercicio5 {
    public static double generarNumero(double min, double max){
        return (double) (Math.random()*(max-min+1)+min);
    }
    public static void main(String[] args) {
        // Vamos a simular que tenemos un sensor de temperatura en una
        // plantación de tomates (15 y 55 grados)
        // El dispostivo toma la temperatura 120 veces al dia
        // Simula el comportamiento del sensor con un array de double
        // que represente la temperatura tomada por el sensor

        // Si la temperatura media actual es superior a un umbral (35 grados)
        // debe saltar una alarma (throw Exception)

        double temperatura [] = new double [120];
        double suma = 0 ;
        boolean alarma = false;
        for (int i = 0; i <temperatura.length ; i++) {
            temperatura[i] = generarNumero(5,50);
            suma = suma +temperatura[i];
            if (suma / (i+1) > 35) {
                alarma = true;
            }
        }


    }
}
