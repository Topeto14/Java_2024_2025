package Tema3.Array;

public class EjercicioClasesBoleanArrays {
    public static int generarNumero(int min, int max){
        return (int) (Math.random()*(max-min+1)+min);
    }
    public static void main(String[] args) {
        // En el primer trimestre del curso hay 85 días de clase
        // En un array de bolean guardamos
        // si un alumno ha faltado (true) o no (false)
        // Realiza un programa que diga si el alumno ha perdido
        // la evaluación continua (20% de faltas al trimestre)

        boolean faltas[] = new boolean [85];
        int count = 0 ;
        int limite = 20 * 85 / 100 ;

        for (int i = 0; i <faltas.length ; i++) {

            if (generarNumero(0,1) == 0) {
                faltas[i] = true;
                count++;
            }else {
                faltas[i] = false;
            }
            if (faltas[i]== true)
                count++;

            System.out.println(faltas[i]);
            count++;
        }
        System.out.println(count);
    }




}
