package Tema2.FuncionesYmetodos;
import java.util.Scanner;

public class EjercicioFunciones {
    public static void pintarOpciones() {
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elige la opción");
    }
    public static double operacion(int n1, int n2, String operador) {
        switch (operador) {
            case "sumar": return n1+n2;
            case "restar": return n1-n2;
            case "multiplicar": return n1*n2;
            case "dividir": return (double) n1 / n2;
        }
        return 0;
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
            pintarOpciones();
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception ex) {
                opcion = 6; //Si no metes un número correcto, que salga Opción Incorrecta
            }
            if (opcion < 5) { //Solo si la opcion es 1,2,3 o 4 pide los números
                System.out.println("Dime primer número");
                numero1 = Integer.parseInt(sc.nextLine());
                System.out.println("Dime segundo número");
                numero2 = Integer.parseInt(sc.nextLine());
            }
            switch (opcion) {
                case 1:
                    resultado = operacion(numero1, numero2, "sumar");
                    System.out.println("Resultado = " + resultado);
                    break;
                case 2:
                    resultado = operacion(numero1, numero2, "restar");
                    System.out.println("Resultado = " + resultado);
                    break;
                case 3:
                    resultado = operacion(numero1, numero2, "multiplicar");
                    System.out.println("Resultado = " + resultado);
                    break;
                case 4:
                    resultado = operacion(numero1, numero2, "dividir");
                    System.out.println("Resultado = " + resultado);
                    break;
                case 5:
                    System.out.println("Hasta la próxima");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }
    }
}
