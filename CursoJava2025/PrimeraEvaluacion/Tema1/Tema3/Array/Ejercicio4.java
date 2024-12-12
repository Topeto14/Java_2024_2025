package PrimeraEvaluacion.Tema1.Tema3.Array;

public class Ejercicio4 {
    public static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    public static void main(String[] args) {

        boolean faltas[] = new boolean[85];
        int contador=0;
        int limite = 20 * 85 / 100;

        for(int i=0; i < faltas.length; i++) {
            if (generarNumeroAleatorio(5,1) == 1) {
                faltas[i] = true;
            } else {
                faltas[i] = false;
            }

            if (faltas[i] == true)
                contador++;
        }

        System.out.println("Ha faltado " + contador + " días");
        if (contador > limite) {
            System.out.println("Pierde la evaluación contínua");
        } else {
            System.out.println("Muy bien, vienes a clase a menudo");
        }


    }
}
