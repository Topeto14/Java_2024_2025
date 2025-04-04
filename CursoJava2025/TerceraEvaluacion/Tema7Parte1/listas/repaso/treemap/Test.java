package TerceraEvaluacion.Tema7Parte1.listas.repaso.treemap;

import java.time.LocalDateTime;

public class Test {

    public static void main(String[] args) {
        AgendaCitas ac = new AgendaCitas();
        int accion;

        accion = ac.addCita("Reunión con alumnos en prácticas",
                LocalDateTime.of(2025,4,3,10,0));
        switch (accion) {
            case 0: System.out.println("Cita añadida correctamente"); break;
            case 1: System.out.println("Error, fecha anterior a ahora"); break;
            case 2: System.out.println("Error, ya tienes cita en esa fecha"); break;
        }
        accion = ac.addCita("Reunión con rrhh",
                LocalDateTime.of(2025,4,1,10,0));
        switch (accion) {
            case 0: System.out.println("Cita añadida correctamente"); break;
            case 1: System.out.println("Error, fecha anterior a ahora"); break;
            case 2: System.out.println("Error, ya tienes cita en esa fecha"); break;
        }
        accion = ac.addCita("Reunión con director de ventas",
                LocalDateTime.of(2025,4,7,10,0));
        switch (accion) {
            case 0: System.out.println("Cita añadida correctamente"); break;
            case 1: System.out.println("Error, fecha anterior a ahora"); break;
            case 2: System.out.println("Error, ya tienes cita en esa fecha"); break;
        }
        accion = ac.addCita("Reunión con concejal de infraestructuras",
                LocalDateTime.of(2025,4,4,10,0));
        switch (accion) {
            case 0: System.out.println("Cita añadida correctamente"); break;
            case 1: System.out.println("Error, fecha anterior a ahora"); break;
            case 2: System.out.println("Error, ya tienes cita en esa fecha"); break;
        }
        accion = ac.addCita("Reunión con empresa PR S.A.",
                LocalDateTime.of(2025,4,3,11,0));
        switch (accion) {
            case 0: System.out.println("Cita añadida correctamente"); break;
            case 1: System.out.println("Error, fecha anterior a ahora"); break;
            case 2: System.out.println("Error, ya tienes cita en esa fecha"); break;
        }
        accion = ac.addCita("Reunión con informáticos para el nuevo proyecto",
                LocalDateTime.of(2025,4,3,11,0));
        switch (accion) {
            case 0: System.out.println("Cita añadida correctamente"); break;
            case 1: System.out.println("Error, fecha anterior a ahora"); break;
            case 2: System.out.println("Error, ya tienes cita en esa fecha"); break;
        }
        ac.mostrarProximasCitas();
    }

}
