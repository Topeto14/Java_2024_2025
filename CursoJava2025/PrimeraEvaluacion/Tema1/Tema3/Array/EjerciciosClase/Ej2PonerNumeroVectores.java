package PrimeraEvaluacion.Tema1.Tema3.Array.EjerciciosClase;
import java.util.Scanner;
public class Ej2PonerNumeroVectores {
    public static void main(String[] args) {
        int n1[]=new int[10];
        int n2[]=new int[10];
        int n3[]=new int[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n1.length; i++) {
            System.out.println("Dime un número para el primer vector");
            n1[i] =Integer.parseInt(sc.nextLine());
            System.out.println("Dime un número para el segundo vector");
            n2[i] =Integer.parseInt(sc.nextLine());
            n3[i] = n1[i]+n2[i];
        }
        for (int i = 0; i < n3.length; i++) {
            System.out.println(n3[i]);
        }
    }
}
