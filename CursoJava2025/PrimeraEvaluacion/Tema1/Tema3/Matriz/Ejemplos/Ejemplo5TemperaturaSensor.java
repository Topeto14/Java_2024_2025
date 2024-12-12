package PrimeraEvaluacion.Tema1.Tema3.Matriz.Ejemplos;

public class Ejemplo5TemperaturaSensor {
    public static void pintar(double matriz[][]) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static double numero_aleatorio(double min , double max){
        return (Math.random()*(max-min+1) +min);
    }

    public static void main(String[] args) {
        //Matriz guardar las temperaturas de tres sensores, cada día de la semana

        double temps[][] = new double[10][10];

        for(int i=0; i < temps.length; i++) {
            for(int j=0; j < temps[i].length; j++) {
                temps[i][j] = numero_aleatorio(0.0, 45.0);
            }
        }

        pintar(temps);

        //Dime la temperatura media semanal de cada sensor
        double suma=0;
        for(int i=0; i < temps.length; i++) {
            for(int j=0; j < temps[i].length; j++) {
                suma += temps[i][j];
            }
            System.out.println("T-media sensor " + i + " = " + (suma/temps[i].length));
            suma = 0;
        }
    }

}
