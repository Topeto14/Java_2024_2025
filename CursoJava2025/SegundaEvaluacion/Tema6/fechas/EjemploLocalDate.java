package SegundaEvaluacion.Tema6.fechas;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {

        //CREACIÓN DE FECHAS
        System.out.println("CREACIÓN FECHAS ---------------");
        LocalDate hoy = LocalDate.now(); //Fecha hoy
        LocalDate reyes = LocalDate.of(2025, 1, 6);

        System.out.println(hoy.plusYears(1).getDayOfWeek());
        System.out.println(hoy
                .minusMonths(1)
                .minusDays(5)
        );
        LocalDate pasadoMa = hoy.withDayOfMonth(21);
        System.out.println(pasadoMa);


        //MOSTRAR VALORES DE UNA FECHA
        System.out.println("PINTAR FECHAS -------------------------");
        System.out.println(reyes);
        System.out.println(hoy);
        System.out.println(hoy.getYear());
        System.out.println(hoy.getMonth().
                getDisplayName(TextStyle.FULL, Locale.of("ES","es")));
        System.out.println(hoy.getMonthValue());
        System.out.println(hoy.getDayOfWeek());
        System.out.println(hoy.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.of("ES", "es")));
        System.out.println(hoy.getDayOfYear());
        System.out.println(hoy.plusYears(3).lengthOfMonth());

        System.out.println(hoy.get(ChronoField.DAY_OF_YEAR));


        //Comparar fechas
        System.out.println("COMPARAR FECHAS ------------------");
        System.out.println(hoy.isAfter(hoy.plusDays(1)));
        System.out.println(hoy.isAfter(hoy.minusDays(1)));
        System.out.println(hoy.isBefore(hoy.plusDays(1)));
        System.out.println(hoy.isBefore(hoy.minusDays(1)));
        System.out.println(hoy.isEqual(LocalDate.now()));






    }
}
