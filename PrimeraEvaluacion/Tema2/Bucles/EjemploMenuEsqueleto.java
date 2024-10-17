package Tema2.Bucles;

import java.util.Scanner;

public class EjemploMenuEsqueleto {
    public static void main(String[] args) {


        int opcion = -1;
        Scanner sc = new Scanner(System.in);

        while (opcion != 5) { //5 porque es la opción de salir
            //Pintar las opciones
            System.out.println("1. Hacer una cosa");
            System.out.println("2. Hacer otra cosa");
            System.out.println("3. Hacer una cosa diferente");
            System.out.println("4. Hacer lo que diga el profe");
            System.out.println("5. Salir");

            //Leer de teclado la opción
            System.out.println("Introduce opción elegida:");
            opcion = Integer.parseInt(sc.nextLine());

            //Dependiendo de la opción elegida hacemos lo correspondiente
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido la opción 1");
                    //Aquí vendría el código de lo que haya que hacer en la opción 1
                    break;
                case 2:
                    System.out.println("Has elegido la opción 2");
                    //Aquí vendría el código de lo que haya que hacer en la opción 2
                    break;
                case 3:
                    System.out.println("Has elegido la opción 3");
                    //Aquí vendría el código de lo que haya que hacer en la opción 3
                    break;
                case 4:
                    System.out.println("Has elegido la opción 4");
                    //Aquí vendría el código de lo que haya que hacer en la opción 4
                    break;
                case 5:
                    System.out.println("Adiós, gracias por usar este programa");
                    break;
                default:
                    System.out.println("Error, opción incorrecta");
            }

        }
    }
}
