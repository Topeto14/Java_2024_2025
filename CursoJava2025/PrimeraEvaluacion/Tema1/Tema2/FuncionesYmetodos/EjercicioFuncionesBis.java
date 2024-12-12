package PrimeraEvaluacion.Tema1.Tema2.FuncionesYmetodos;
import java.util.Scanner;
public class EjercicioFuncionesBis {
    public static void pintarOpcionesMenu() {
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        System.out.println("Elige la opción");
    }

    public static double operacion(int n1, int n2, int operador) {
        double resultado = 0;
        switch (operador) {
            case 1:
                resultado = n1 + n2;
                break;
            case 2:
                resultado = n1 - n2;
                break;
            case 3:
                resultado = n1 * n2;
                break;
            case 4:
                resultado = (double) n1 / n2;
                break;
        }

        return resultado;
    }
    public static void main(String[] args) {
        //Menú con una calculadora (suma, resta, multiplique, divide) de dos números
        // 1. Suma
        // 2. Resta
        // 3. Multiplica
        // 4. Divide
        // 5. Salir

        int opcion = 0;
        double resultado = 0;
        int numero1=0, numero2=0;
        Scanner sc = new Scanner(System.in);

        while (opcion != 5) {
            pintarOpcionesMenu();

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception ex) {
                opcion = 6; //Si no metes un número correcto, que salga Opción Incorrecta
            }

            if (opcion < 5) { //Solo si la opcion es 1,2,3 o 4 pide los números
                try {
                    System.out.println("Dime primer número");
                    numero1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Dime segundo número");
                    numero2 = Integer.parseInt(sc.nextLine());
                    resultado = operacion(numero1, numero2, opcion);
                    System.out.println("Resultado = " + resultado);
                } catch (Exception e) {
                    System.out.println("Error al introducir números");
                }

            } else if (opcion == 5) {
                System.out.println("Adiós");
            } else {
                System.out.println("Opción incorrecta");
            }

        }

    }
}
