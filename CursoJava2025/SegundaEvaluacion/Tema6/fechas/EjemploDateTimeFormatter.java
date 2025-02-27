package SegundaEvaluacion.Tema6.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EjemploDateTimeFormatter {
    public static void main(String[] args) {
        //Declaramos el formato que van a tener las fechas
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dth = DateTimeFormatter.ofPattern("HH:mm:ss:nnn");

        //format(DateTimeFormatter) -> pintar con el formato dado
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println( ldt.format(dt) );
        System.out.println( ldt.format(dtf) );
        System.out.println( ldt.format(dth) );

        System.out.println( LocalDate.now().format(dtf));

        //parse(String, DateTimeFormatter) Leer una fecha como String siguiendo
        // un formato y pasarla a LocalDate
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una fecha: dd/MM/yyyy");
        String fecha = sc.nextLine();
        LocalDate fechaLD = LocalDate.parse(fecha, dtf);
        System.out.println(fechaLD);

        System.out.println("Dime una fecha y hora: dd/MM/yyyy - HH:mm");
        fecha = sc.nextLine();
        LocalDateTime fechaHora = LocalDateTime.parse(fecha, dt);
        System.out.println(fechaHora);

        DateTimeFormatter nuevo = DateTimeFormatter.ofPattern("HH:mm 'del' dd 'de' LLL 'de' yyyy");
        System.out.println(fechaHora.format(nuevo));




    }
}
