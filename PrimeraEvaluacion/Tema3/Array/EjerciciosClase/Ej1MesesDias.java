package Tema3.Array.EjerciciosClase;
import java.util.Scanner;
public class Ej1MesesDias {
    public static void main(String[] args) {
        String mes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
                "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int posicion;

        System.out.println("Dime el número de mes:");
        Scanner sc = new Scanner (System.in);
        posicion = Integer.parseInt(sc.nextLine());

        System.out.println("El mes " + mes[posicion-1] + " tiene " + dias[posicion-1]);
    }
}
