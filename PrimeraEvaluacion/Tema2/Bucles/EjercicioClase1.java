package Tema2.Bucles;

public class EjercicioClase1 {
    public static void main(String[] args) {
        //Dado dos números numero1 y número2, dime cuantos multiplos de 5 hay entre ellos
        int numero1 = 120;
        int numero2 = 327;
        int count = 0 ;
        int temp;

        //Que pasa si numero 1 es mayor que numero 2
        if (numero1 > numero2) {
            //Intercambiar los números

            temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
        for (int i = numero1; i <= numero2; i++) {
            if ( i % 5 == 0) {
                count++;
            }

        }

        System.out.println(" Hay " + count + " múltiplos de 5 ");

    }
}
