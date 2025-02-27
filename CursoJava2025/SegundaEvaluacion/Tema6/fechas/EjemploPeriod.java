package SegundaEvaluacion.Tema6.fechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class EjemploPeriod {
    public static void main(String[] args) {
        //CLASE PARA SABER EL TIEMPO TRANSCURRIDO ENTRE FECHAS

        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2025,3,13);
        ld2 = ld2.plusDays(50);

        //Period.between(LocalDate, LocalDate)
        Period period = Period.between(ld1, ld2);
        System.out.println("Dias: " + period.getDays());
        System.out.println("Meses: " + period.getMonths());
        System.out.println("Años " + period.getYears());
        System.out.println(period);

        //until
        System.out.println( ld1.until(ld2, ChronoUnit.DAYS) );
        System.out.println( ChronoUnit.DAYS.between(ld1, ld2));
        System.out.println( ChronoUnit.MONTHS.between(ld1, ld2));


    }
}
