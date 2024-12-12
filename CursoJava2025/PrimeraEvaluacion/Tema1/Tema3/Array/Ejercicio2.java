package PrimeraEvaluacion.Tema1.Tema3.Array;

public class Ejercicio2 {
    public static double generarNumero(double min, double max){
        return (double) (Math.random()*(max-min+1)+min);
    }
    public static void main(String[] args) {
        // Genera de forma aleatoria un array de double con 30 elementos
        // Los valores estaran entre -100 y 100
        // Pinta los valores
        // Pinta los valores al revés
        // Dime la media de todos los valores

        double aleatorioArray[]= new double[30];

        for(int i= 0 ; i < aleatorioArray.length; i++){
            aleatorioArray[i] = generarNumero(-100,100);

        }
        for(int i = 0 ; i < aleatorioArray.length; i++){
            System.out.println(aleatorioArray[i]);
        }
        System.out.println("----------------------------------------");
        for (int i = aleatorioArray.length - 1 ; i >=0; i--){
            System.out.println(aleatorioArray[i]);
        }


    }




}
