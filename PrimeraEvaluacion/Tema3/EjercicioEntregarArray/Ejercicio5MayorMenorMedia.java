package Tema3.EjercicioEntregarArray;

public class Ejercicio5MayorMenorMedia {
    public static int generarNumero(int min, int max){

        return (int) (Math.random()*(max-min+1)+min);
    }
    public static void mediaNumeros(){
        int media[] = new int[10];
        double mediaN = 0;
        double sum = 0;
        for(int i = 0; i < media.length; i++){
            media[i] = generarNumero(1,10);
            System.out.println(media[i]);
            sum += media[i];
            mediaN = sum/media.length;
        }
        System.out.println(" La media de los números es  " + mediaN );
        int numeroMayor = media[0] ;
        int numeroMenor = media[0] ;
        for (int i = 0; i < media.length; i++) {
            if (media[i] > numeroMayor) {
                numeroMayor = media[i];
            }else if (media[i] < numeroMenor) {
                numeroMenor = media[i];
            }
        }
        System.out.println(" El numero mayor es " + numeroMayor);
        System.out.println(" El numero menor es " + numeroMenor);
    }
    /*public static int encontrarMayor(int[] array) {
        int mayor = array[0]; // Asumimos que el primer elemento es el mayor
        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i]; // Actualizamos el mayor si encontramos un número más grande
            }
        }
        return mayor;
    }*/
    public static void main(String[] args) {
        //  Leer 10 números enteros y a continuación mostrar la media de los números introducidos, el mayor valor y el
        //  menor valor. Usar un array para almacenar los valores y sacar toda la información en una sola iteración del array.
        //  Si puedes mejóralo implementando una función para cada tarea (media, mayor, menor), pasando el array.
    mediaNumeros();
    }
}
