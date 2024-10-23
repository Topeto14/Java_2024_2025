package Tema2.Bucles.For;

public class EjemploIndicador {
    public static int generarNumero(int min,int max){
        return (int)(Math.random()*(max-min+1))+min;
    }
    public static void main(String[] args) {
        // Si tiramos un dado 20 veces y queremos saber si ha salido algún 6

        int tirada = 0;
        boolean haSalido6 = false; // No ha salido el 6

        for (int i = 0; i <20 ; i++) {
            tirada = generarNumero(1,6);
            if (tirada == 6) {
                haSalido6 = true ;
            }
            System.out.println(tirada);
        }
        //Al finalizar el bucle puedo comprobar la variable booleana para saber si ha ocurrido
        System.out.println("Ha salido 6? " + haSalido6);
    }
}
