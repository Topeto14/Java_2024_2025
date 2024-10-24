package Tema2.FuncionesYmetodos;

public class EjemploFuncionesMultiplosMenores {
    /**
     * Método que dice si el segundo número es múltiplo del primero
     * @param a
     * @param b
     * @return true o false
     */
    public static boolean multiplo(int a, int b) {
        return a % b == 0;
    }
    public static void main(String[] args) {
        //Pinta todos los múltiplo de un número

        int numero = 345;
        for(int i = numero-1; i > 1; i--) {
            if (multiplo(numero, i)) {
                System.out.println(i);
            }
        }


    }
}
