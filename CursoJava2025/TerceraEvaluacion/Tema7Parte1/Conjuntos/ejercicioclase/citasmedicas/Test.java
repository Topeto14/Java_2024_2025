package TerceraEvaluacion.Tema7Parte1.Conjuntos.ejercicioclase.citasmedicas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {

        CitasConsultaMedica ccm = new CitasConsultaMedica();

        Persona pr1 = new Persona("Javier", "Sánchez", "64644654",
                "javisan@gmail.com", "Calle Bartolomé Flores", "Mojácar");

        Persona pr2 = new Persona("Luis", "González", "74644994",
                "lugon@gmail.com", "Calle del Sol", "Vera");

        Persona pr3 = new Persona("Ana", "Díaz", "75544654",
                "anadiaz@gmail.com", "Calle del Martirio", "Cuevas");

        Persona pr4 = new Persona("Beatriz", "Ramos", "77744654",
                "bearam@gmail.com", "Calle de la Esperanza", "Vera");

        Cita c1 = new Cita(pr1, LocalDate.of(2025,4,12),
                LocalTime.of(10,0),TipoCita.PRIMERA);

        Cita c2 = new Cita(pr2, LocalDate.of(2025,4,4),
                LocalTime.of(11,0),TipoCita.CONSULTA);

        Cita c3 = new Cita(pr3, LocalDate.of(2025,4,4),
                LocalTime.of(12,0),TipoCita.CONSULTA);

        Cita c4 = new Cita(pr4, LocalDate.of(2025,4,4),
                LocalTime.of(13,0),TipoCita.REVISION);

        Cita c5 = new Cita(pr1, LocalDate.of(2025,4,8),
                LocalTime.of(10,0),TipoCita.CONSULTA);

        Cita c6 = new Cita(pr2, LocalDate.of(2025,4,12),
                LocalTime.of(11,0),TipoCita.REVISION);

        ccm.addCita(c1);
        ccm.addCita(c2);
        ccm.addCita(c3);
        ccm.addCita(c4);
        ccm.addCita(c5);
        ccm.addCita(c6);

        System.out.println("CITAS POR NOMBRE ----------------");
        ccm.listarCitasPorNombre();
        System.out.println("CITAS POR APELLIDOS ---------------");
        ccm.listarCitasPorApellidos();
        System.out.println("CITAS POR FECHA Y APELLIDOS -----------");
        ccm.listarCitasPorFechaYApellidos();
        System.out.println("CITAS DEL 4-5-2025 ----------------");
        ccm.listarCitasPorHora(LocalDate.of(2025,4,4));
        System.out.println("CITAS DE " + pr1 + "--------");
        ccm.buscarCitasFuturas(pr1.getEmail());



        /**
         * ¿VES BIEN USAR PARA LAS CITAS UN ARRAYLIST, O USUARÍAS OTRA
         * ESTRUCTURA DIFERENTE? PIENSA QUE NO PUEDE HABER DOS CITAS
         * EN UN MISMO DÍA Y HORA.
         * EN ESE CASO DIME CUÁL Y CÓMO HARÍAS EQUALS
         */


    }
}
