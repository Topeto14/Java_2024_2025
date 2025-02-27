package SegundaEvaluacion.Tema6.fechas;

import java.time.Duration;
import java.time.LocalTime;

public class EjemploDuration {
    public static void main(String[] args) {
        //CLASE UTILIZADA PARA PERIODOS DE TIEMPO EN HORAS

        Duration duration;

        LocalTime ahora = LocalTime.now();
        LocalTime estaMañana = LocalTime.now().minusHours(5);

        //Duration.between(LocalTime, LocalTime)
        duration = Duration.between(estaMañana, ahora);

        System.out.println(duration.getSeconds() + "." + duration.getNano());

        double elapsed = duration.getSeconds() / 60.0 / 60.0;
        System.out.println(elapsed);






    }
}
