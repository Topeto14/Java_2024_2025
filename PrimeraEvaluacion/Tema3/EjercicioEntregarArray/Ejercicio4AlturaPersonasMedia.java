package Tema3.EjercicioEntregarArray;

import java.util.Scanner;

public class Ejercicio4AlturaPersonasMedia {
    public static void  altura(){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Dime cuantas personas vamos a medir ");
        int size= Integer.parseInt(sc.nextLine());
        double ArrayAltura [] = new double[size] ;

        for (int i = 0; i < ArrayAltura.length; i++) {
            System.out.println("Ingrese la altura : " + (i+1) );
            double altura = Double.parseDouble(sc.nextLine());
            ArrayAltura[i]= altura;

        }
        System.out.println("<------------>");
        double sumaAltura = 0 ;
        double mediaAltura = 0;
        int alturaSuperior = 0 ;
        int alturaInferior = 0 ;
        for (int i = 0; i < ArrayAltura.length; i++) {
            System.out.println(ArrayAltura[i]);
            sumaAltura += ArrayAltura[i];
            mediaAltura = sumaAltura/ArrayAltura.length;
            if (i > mediaAltura) {
                alturaSuperior++;
            } else if (i<= mediaAltura) {
                alturaInferior++;
            }
        }
        System.out.println(" La suma de la altura es : " + sumaAltura);
        System.out.println(" La media de la altura es : " + mediaAltura);
        System.out.println(" Hay " + alturaSuperior + " personas con altura superior ");
        System.out.println(" Hay " + alturaInferior + " personas con altura inferior ");
    }
    public static void main(String[] args) {
        // Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas tienen una
        // altura superior a la media y cuántas tienen una altura inferior a la media. El valor de N se pide por teclado y debe
        // ser entero positivo.

        altura();
    }
}
