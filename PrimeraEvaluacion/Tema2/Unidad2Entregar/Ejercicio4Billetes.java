package Tema2.Unidad2Entregar;

import java.util.Scanner;

public class Ejercicio4Billetes {

    public static void billetes () {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Dime una cantidad de dinero ");
        int cantidadBilletes = Integer.parseInt(sc.nextLine());
        int billetesQuinientos = 500, billetesDoscientos = 200,billetesCien = 100,billetesCincuenta = 50,billetesVeinte = 20;
        int billetesDiez = 10,billetesCinco = 5,monedasDos = 2,monedasUno = 1;
        int resto;
        do {
            billetesQuinientos = cantidadBilletes / 500;
            resto = cantidadBilletes % 500;
            billetesDoscientos = resto / 200;
            resto = resto % 200;
            billetesCien = resto / 100;
            resto = resto % 100;
            billetesCincuenta = resto / 50;
            resto = resto % 50;
            billetesVeinte = resto / 20;
            resto = resto % 20;
            billetesDiez = resto / 10;
            resto = resto % 10;
            billetesCinco = resto / 5;
            resto = resto % 5;
            monedasDos = resto / 2;
            resto = resto % 2;
            monedasUno = resto / 1;
            resto = resto % 1;
            System.out.println("Tienes " + billetesQuinientos + " billetes de 500€ ");
            System.out.println("Tienes " + billetesDoscientos + " billetes de 200€ ");
            System.out.println("Tienes " + billetesCien + " billetes de 100€ ");
            System.out.println("Tienes " + billetesCincuenta + " billetes de 50€ ");
            System.out.println("Tienes " + billetesVeinte + " billetes de 20€ ");
            System.out.println("Tienes " + billetesDiez + " billetes de 10€ ");
            System.out.println("Tienes " + billetesCinco + " billetes de 5€ ");
            System.out.println("Tienes " + monedasDos + " monedas de 2€ ");
            System.out.println("Tienes " + monedasUno + " monedas de 1€ ");

        } while (resto != 0);
    }

        /*
        if (cantidadBilletes >= 500) {
            int billetesQuinientos = cantidadBilletes / 500;
            cantidadBilletes = cantidadBilletes % 500;
            System.out.println(" Tienes " + billetesQuinientos + " billetes de quinientos ");
            if (cantidadBilletes >= 200 ) {
                int billetesDoscientos = cantidadBilletes / 200;
                cantidadBilletes = cantidadBilletes % 200;
                System.out.println(" Tienes " + billetesDoscientos + " billetes de doscientos ");
            }if (cantidadBilletes >= 100 ) {
                int billetesCien = cantidadBilletes / 100;
                cantidadBilletes = cantidadBilletes % 100;
                System.out.println(" Tienes " + billetesCien + " billetes de cien");
            }if (cantidadBilletes >= 50 ) {
                int billetesCincuenta = cantidadBilletes / 50;
                cantidadBilletes = cantidadBilletes % 50;
                System.out.println(" Tienes " + billetesCincuenta + " billetes de cincuenta");
            }if (cantidadBilletes >= 20 ) {
                int billetesVeinte = cantidadBilletes / 20;
                cantidadBilletes = cantidadBilletes % 20;
                System.out.println(" Tienes " + billetesVeinte + " billetes de veinte");
            }if (cantidadBilletes >= 10) {
                int billetesDiez = cantidadBilletes / 10;
                cantidadBilletes = cantidadBilletes % 10;
                System.out.println(" Tienes " + billetesDiez + " billetes de diez");
            }if (cantidadBilletes >= 5) {
                int billetesCinco = cantidadBilletes / 5;
                cantidadBilletes = cantidadBilletes % 5;
                System.out.println(" Tienes " + billetesCinco + " billetes de cinco");
            }if (cantidadBilletes >= 2) {
                int monedasDos = cantidadBilletes / 2;
                cantidadBilletes = cantidadBilletes % 2;
                System.out.println(" Tienes " + monedasDos + " monedas de dos");
            }if (cantidadBilletes >= 1) {
                int monedasUno = cantidadBilletes / 1;
                cantidadBilletes = cantidadBilletes % 1;
                System.out.println("Tienes " + monedasUno + " monedas de cinco");
            }

        }*/





    public static void main(String[] args) {
        //  Crea una función que no devuelva nada (void) que, dado un importe en euros, nos indique el mínimo
        //  número de billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad. Ejemplo:
        //  362 euros → 1 billete de 200, 1 billete de 100, 1 billete 50, un billete de 10, sobran 2 euros. Pista:
        //  hay que ir sacando la división entera, y el resto se lleva al siguiente billete.
        billetes();
    }
}
