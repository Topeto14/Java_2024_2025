package Tema2.Unidad2Entregar;

import java.util.Scanner;

public class Ejercicio4Billetes {
    public static int billetes (){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ingresa una cantida de dinero ");
        int quantity  = Integer.parseInt(sc.nextLine());
        if (quantity > 500) {
           int billetesQuinientos = quantity % 10 ;
            System.out.println("Serian " + billetesQuinientos + " billetes de quientos ");
        }
        return quantity;
    }
    public static void main(String[] args) {
        // Crea una función que no devuelva nada (void) que, dado un importe en euros, nos indique el mínimo
        // número de billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad. Ejemplo:
        // 362 euros → 1 billete de 200, 1 billete de 100, 1 billete 50, un billete de 10, sobran 2 euros. Pista: hay
        // que ir sacando la división entera, y el resto se lleva al siguiente billete.

        int cambio = billetes();
        System.out.println(cambio);
    }
}
