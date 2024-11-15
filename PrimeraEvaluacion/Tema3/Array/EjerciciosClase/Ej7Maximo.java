package Tema3.Array.EjerciciosClase;

public class Ej7Maximo {
    public static int numero_aleatorio(int min , int max){
        return(int) (Math.random()*(max-min+1) )+min;
    }

    public static int maximo(int temp[]) {
        int max = temp[0];
        int posicion = 0;
        for(int i=1; i < temp.length; i++){
            if (temp[i] > max) {
                max = temp[i];
                posicion = i;
            }
        }
        return posicion;
    }

    public static void main(String[] args) {
        int numeros[] = new int[100];
        int repetidos[] = new int[100];

        for(int i=0; i<numeros.length; i++){
            numeros[i] =numero_aleatorio(1,100);

        }
        for (int num = 1; num <= numeros.length ; num++) {
            for (int j = 0; j <numeros.length ; j++) {
                if(numeros[j]== num){
                    repetidos[num-1]++;
                }
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]+ " " + (i+1) + " " + repetidos[i] );
        }

        int posicion = maximo(repetidos);
        System.out.println("La moda es " + (posicion+1));

    }
}
