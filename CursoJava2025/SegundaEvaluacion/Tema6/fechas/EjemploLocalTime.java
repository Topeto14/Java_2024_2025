package SegundaEvaluacion.Tema6.fechas;

import java.time.LocalDate;
import java.time.LocalTime;

public class EjemploLocalTime {
    public static void main(String[] args) {

        //Creación de horas
        System.out.println("Creación de horas ------------");
        LocalTime ahora = LocalTime.now();
        LocalTime salida = LocalTime.of(22,0, 10);
        System.out.println(ahora.plusHours(1));
        System.out.println(ahora.minusMinutes(10));
        System.out.println(salida.withSecond(50));
        System.out.println(ahora
                .plusHours(1)
                .minusMinutes(10)
                .plusSeconds(20));

        LocalTime horaCanarias = LocalTime.now().minusHours(1);

        //Pintar horas
        System.out.println(ahora);
        System.out.println(salida);
        System.out.println(ahora.getHour());
        System.out.println(ahora.getMinute());
        System.out.println(ahora.getSecond());
        System.out.println(ahora.getNano());

        //Comparar horas
        System.out.println(ahora.isBefore(salida));
        System.out.println(salida.isAfter(ahora));
        System.out.println(ahora.equals(ahora.plusSeconds(1).minusSeconds(1)));

        //Parsear String -> Generar una hora o una fecha con un formato por defecto

        //HH:MM:SS
        LocalTime hora = LocalTime.parse("22:00");
        System.out.println(hora);

        //YYYY-mm-dd
        LocalDate fecha = LocalDate.parse("1999-12-31");
        System.out.println(fecha);




    }
}
