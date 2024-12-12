package PrimeraEvaluacion.Tema1.Tema3.Array.EjerciciosClase;

public class Ej5Temperatura {
    //5. Vamos a crear un array de 1000 valores double,
    // debes rellenarlos con valores aleatorios entre 5 y 50 (temperaturas).
    // Debes devolver la media y la mediana = ((máximo + mínimo) / 2)

    public static double numero_aleatorio(int min , int max){
        return Math.random()*(max-min+1) +min;
    }

    public static double maximo(double temp[]) {
        double max = temp[0];
        for(int i=1; i < temp.length; i++){
            if (temp[i] > max) {
                max = temp[i];
            }
        }
        return max;
    }
    public static double minimo(double temp[]) {
        double min = temp[0];
        for(int i=1; i < temp.length; i++){
            if (temp[i] < min) {
                min = temp[i];
            }
        }
        return min;
    }

    public static double minimo(double num1, double num2){
        if(num1 < num2){
            return num1;
        } else {
            return num2;
        }
    }

    public static double maximo(double num1, double num2){
        if(num1 > num2){
            return num1;
        } else {
            return num2;
        }
    }
    public static void main(String[] args) {
        double temp[] = new double[1000];
        double totalTemp = 0;
        double max = 0, min = 50;

        for (int i = 0; i < temp.length; i++) {
            temp[i] = numero_aleatorio(5,50);
            max = maximo(max, temp[i]);
            min = minimo(min, temp[i]);
            totalTemp += temp[i];
        }

        //max = maximo(temp);
        //min = minimo(temp);

        System.out.println("minima " + min + " maxima " + max);
        System.out.println("Temperatura media: " + (totalTemp / temp.length));
        System.out.println("Mediana: " + ((max + min) / 2 ));
    }

}

