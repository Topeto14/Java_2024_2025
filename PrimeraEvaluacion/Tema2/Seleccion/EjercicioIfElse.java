package Tema2.Seleccion;

import java.util.Scanner;

public class EjercicioIfElse {
    public static void main(String[] args) {

        //Pedir por teclado la hora del día (0-23)
        //6-12 Buenos días
        //12-20 Buenas tardes
        //En otro caso Buenas noches

        //Pedir nivel del jugador (1-5)
        //1-5:
        // 1. Iniciado
        // 2. Amateur
        // 3. Profesional
        // 4. Experto
        // 5. Dios

        // Buenos días jugador de nivel Iniciado
        // Buenos tardes jugador de nivel Experto
        //....

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la hora del día");
        int hora = sc.nextInt();

        System.out.println("Dime tu nivel (1-5)");
        int nivel = sc.nextInt();

        if (hora >= 6 && hora <= 12) {
            //Buenos días
            if (nivel == 1) {
                System.out.println("Buenos días jugador de nivel iniciado");
            } else if (nivel == 2) {
                System.out.println("Buenos días jugador de nivel amateur");
            } else if (nivel == 3) {
                System.out.println("Buenos días jugador de nivel profesional");
            } else if (nivel == 4) {
                System.out.println("Buenos días jugador de nivel experto");
            } else if (nivel == 5) {
                System.out.println("Buenos días jugador de nivel dios");
            }
        } else if (hora >= 13 && hora <= 20) {
            //Buenas tardes
            if (nivel == 1) {
                System.out.println("Buenos tardes jugador de nivel iniciado");
            } else if (nivel == 2) {
                System.out.println("Buenos tardes jugador de nivel amateur");
            } else if (nivel == 3) {
                System.out.println("Buenos tardes jugador de nivel profesional");
            } else if (nivel == 4) {
                System.out.println("Buenos tardes jugador de nivel experto");
            } else if (nivel == 5) {
                System.out.println("Buenos tardes jugador de nivel dios");
            }
        } else {
            //Buenas noches
            if (nivel == 1) {
                System.out.println("Buenos noches jugador de nivel iniciado");
            } else if (nivel == 2) {
                System.out.println("Buenos noches jugador de nivel amateur");
            } else if (nivel == 3) {
                System.out.println("Buenos noches jugador de nivel profesional");
            } else if (nivel == 4) {
                System.out.println("Buenos noches jugador de nivel experto");
            } else if (nivel == 5) {
                System.out.println("Buenos noches jugador de nivel dios");
            }
        }


    }
}
