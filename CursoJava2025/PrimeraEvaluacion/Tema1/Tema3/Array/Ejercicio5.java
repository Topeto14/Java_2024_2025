package PrimeraEvaluacion.Tema1.Tema3.Array;

public class Ejercicio5 {
    public static double generarNumeroAleatorio(int mayor, int menor) {
        return (double) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void main(String[] args) {

        //Vamos a simular que tenemos un sensor de temperatura en una
        //plantación de tomates (5 y 50 grados)
        //El dispositivo toma la temperatura 120 veces al día
        //Simula el comportamiento del sensor con un array de double
        //que represente la temperatura tomada por el sensor

        //Si la temperatura media actual es superior a un umbral (35 grados)
        //debe saltar una alarma (throw Exception / break + indicador)

        double temperaturas[] = new double[120];
        double suma = 0;

        try {
            for (int i = 0; i < temperaturas.length; i++) {
                temperaturas[i] = generarNumeroAleatorio(50, 15);
                suma += temperaturas[i];

                System.out.println(temperaturas[i] + " -> media = " + (suma / (i + 1)));

                //Ver si la media actual supera 35 grados
                if ((suma / (i + 1)) > 35) {
                    throw new Exception("Alarma, se ha superado el umbral");
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
