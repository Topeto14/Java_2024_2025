package PrimeraEvaluacion.Tema1.Tema3.EjercicioEntregarArray;

public class Ejercicio1ContadorDentroArray {
    public static int generarNumero(int min, int max){
        return (int) (Math.random()*(max-min+1)+min);
    }
    public static void main(String[] args) {
        // Programa Java que guarda en un array 20 números enteros que se generen aleatoriamente entre -100 y 100. A
        //continuación, se recorre el array y calcula cuántos números son positivos y cuántos negativos.

        int  numeros []= new int [20];
        int countpositive = 0 ;
        int countnegative = 0 ;
        for (int i = 0; i < numeros.length; i++) {
            int aleatorio = generarNumero(-100,100);
            if (aleatorio >= 0) {
                countpositive++;
            }else {
                countnegative++;
            }
            System.out.println(aleatorio);
        }
        System.out.println("Hay " + countpositive + " números positivos ");
        System.out.println("Hay " + countnegative + " números negativos ");
    }
}
