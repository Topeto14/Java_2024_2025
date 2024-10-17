package Tema2.Seleccion;

import java.util.Scanner;

public class ejercicio7Hoja {
    public static void main(String[] args) {

        int minutos;
        String diaSemana;
        String turno; //mañana o tarde
        double coste = 0;

        final double impuestoDomingo = 0.03; //constantes
        final double impuestoMañana = 0.15;
        final double impuestoTarde = 0.10;

        //Leer datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime los minutos de la llamada");
        minutos = Integer.parseInt(sc.nextLine()); //Lee String -> Integer
        //minutos = Double.parseDouble(sc.nextLine());

        System.out.println("Dime el día de la semana (lunes, martes, miércoles, ...)");
        diaSemana = sc.nextLine();

        System.out.println("Dime el turno");
        turno = sc.nextLine();

        // 7 minutos: 5 minutos a 1€/min, 2 minutos a 0.8€/min

        //Minutos
        if (minutos <= 5) {
            coste = 1 * minutos;
        } else if (minutos > 5 && minutos <= 8) {
            coste = (1 * 5) + (0.8 * (minutos - 5));
        } else if (minutos > 8 && minutos <= 10 ) {
            coste = (1 * 5) + (0.8 * 3) + ((minutos - 8) * 0.7);
        } else if (minutos > 10) {
            coste = (1 * 5) + (0.8 * 3) + (2 * 0.7) + ((minutos - 10) * 0.5);
        }

        //Impuestos
        if (diaSemana.equals("domingo")) {
            coste = coste + coste *  impuestoDomingo;
        } else {
            //Turno
            if (turno.equals("mañana")) {
                coste = coste + coste * impuestoMañana;
            } else if (turno.equals("tarde")) {
                coste = coste + coste * impuestoTarde;
            }
        }

        System.out.println("Coste total de la llamada es " + coste + " €");


    }
}
