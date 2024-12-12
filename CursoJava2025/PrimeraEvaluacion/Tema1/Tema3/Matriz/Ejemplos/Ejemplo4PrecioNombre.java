package PrimeraEvaluacion.Tema1.Tema3.Matriz.Ejemplos;
import java.util.Scanner;
public class Ejemplo4PrecioNombre {
    public static void main(String[] args) {
        String productos[][] = { {"Kitkat", "Caramelos", "Chicles"},
                {"Gominola", "GalletaChoco", "Barrita"},
                {"M&M", "Donuts", "GalletaMantequilla"} };
        double precios[][] = { {1.2, 2.0, 2.11} ,
                {2.6, 4.5, 2.2 },
                {1.2, 1.9, 3.8}};

        int fila, columna;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el código del producto (i,j):");

        fila = Integer.parseInt(sc.nextLine());
        columna = Integer.parseInt(sc.nextLine());

        System.out.println("El precio de " + productos[fila][columna] +
                " es " + precios[fila][columna] + " euros");

    }
}
