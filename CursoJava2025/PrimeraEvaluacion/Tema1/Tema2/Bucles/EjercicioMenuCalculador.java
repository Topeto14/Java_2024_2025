package PrimeraEvaluacion.Tema1.Tema2.Bucles;

import java.util.Scanner;

public class EjercicioMenuCalculador {
    public static void main(String[] args) {

        //- Mostrar un menú con las siguientes opciones
        //1. Sumar (pide dos números y súmalos)
        //2. Restar (pide dos números y réstalos)
        //3. Multiplicar (pide dos núemros y los multiplicas)
        //4. Dividir (pide dos números y los divides)
        //5. Resto división (pide dos números y muestra el resto de la división
        //6. Elevar a  (pide dos números y eleva el primero al segundo)
        //7. Salir

        int opcion = -1;
        int numero1=0, numero2=0;

        Scanner sc = new Scanner(System.in);

        while (opcion != 7) { //7 porque es la opción de salir
            //Pintar las opciones
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Resto");
            System.out.println("6. Elevar");
            System.out.println("7. Salir");

            //Leer de teclado la opción
            System.out.println("Introduce opción elegida:");
            opcion = Integer.parseInt(sc.nextLine());

            //Pedir los números
            if (opcion >= 1 && opcion < 7) {
                System.out.println("Dime el primer número");
                numero1 = Integer.parseInt(sc.nextLine());
                System.out.println("Dime el segundo número");
                numero2 = Integer.parseInt(sc.nextLine());
            }

            //Dependiendo de la opción elegida hacemos lo correspondiente
            switch (opcion) {
                case 1:
                    System.out.println("La suma es " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("La resta es " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("La multiplicación es " + (numero1 * numero2));
                    break;
                case 4:
                    System.out.println("La división es " + (numero1 / numero2));
                    break;
                case 5:
                    System.out.println("El resto es " + (numero1 % numero2));
                    break;
                case 6:
                    System.out.println("La potencia es " + (Math.pow(numero1,numero2)));
                    break;
                case 7:
                    System.out.println("Adiós, gracias por usar este programa");
                    break;
                default:
                    System.out.println("Error, opción incorrecta");
            }

            //Para ver el resultado tranquilamente
            if (opcion != 7) {
                System.out.println("Pulsa cualquier tecla para continuar");
                sc.nextLine();
            }
        }


    }
}
