package SegundaEvaluacion.Tema6.fechas;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class EjemploLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ahora = LocalDateTime.now();
        System.out.println(ahora);
        System.out.println(ahora.getHour() + " - " + ahora.getYear());
        System.out.println(ahora.plusDays(1).minusHours(3));

        LocalDateTime domingo = LocalDateTime.of(2025, 2, 24, 12, 0);
        System.out.println(domingo);

        LocalDateTime ldt = LocalDate.now().atTime(LocalTime.now().plusHours(1));
        LocalDateTime ldt2 = LocalTime.now().atDate(LocalDate.now());

        System.out.println(ldt);
        System.out.println(ldt2);

        LocalDateTime ldt3 = LocalDateTime.parse("2024-04-01T21:00:00");
        System.out.println(ldt3);
    }
}
