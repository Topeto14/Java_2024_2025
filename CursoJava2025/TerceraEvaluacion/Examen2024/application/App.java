package TerceraEvaluacion.Examen2024.application;

import TerceraEvaluacion.Examen2024.io.DAOTicketsSoporte;
import TerceraEvaluacion.Examen2024.models.Especialidad;
import TerceraEvaluacion.Examen2024.models.Tecnico;
import TerceraEvaluacion.Examen2024.services.ServicioSoporte;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static TerceraEvaluacion.Examen2024.io.DAOTicketsSoporte.grabarCSV;

public class App {
    public static void main(String[] args) throws IOException {

        ServicioSoporte ss = DAOTicketsSoporte.cargarCSV();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Listar todos los tickets abiertos");
            System.out.println("2. Listar técnicos agrupados por especialidad");
            System.out.println("3. Mostrar el total de tickets resueltos");
            System.out.println("4. Mostrar la media de resolución de tickets por prioridad");
            System.out.println("5. Insertar ticket soporte");
            System.out.println("6. Eliminar ticket soporte");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    ss.getTicketsAbiertos().forEach(System.out::println);
                    break;
                case 2:
                    Map<Especialidad, List<Tecnico>> map = ss.getTecnicosGroupByEspecialidad();
                    map.forEach((esp, tecnicos) -> {
                        System.out.println("Especialidad: " + esp);
                        tecnicos.forEach(System.out::println);
                    });
                    break;
                case 3:
                    long totalResueltos = ss.getTicketsCerrados().size();
                    System.out.println("Total tickets resueltos: " + totalResueltos);
                    break;
                case 4:
                    System.out.print("Introduce prioridad (1-3): ");
                    int prioridad = Integer.parseInt(scanner.nextLine());
                    Double media = ss.getMediaResolucionTickets(prioridad);
                    System.out.println("Media de resolución en días: " + (media != null ? media : "No disponible"));
                    break;
                case 5:
                    // Aquí solo mostramos un ejemplo simple, debería validarse y capturar más datos.
                    System.out.print("ID usuario: ");
                    int idUsuario = Integer.parseInt(scanner.nextLine());
                    System.out.print("ID técnico: ");
                    int idTecnico = Integer.parseInt(scanner.nextLine());
                    System.out.print("Prioridad (1-3): ");
                    int prio = Integer.parseInt(scanner.nextLine());
                    System.out.print("Comentarios: ");
                    String comentarios = scanner.nextLine();
                    ss.addTicketSoporte(LocalDate.now(), null, prio, comentarios,
                            ss.findUsuarioById(0L), ss.findTecnicoById(1L));
                    System.out.println("Ticket añadido correctamente.");
                    break;
                case 6:
                    System.out.print("Introduce ID del ticket a eliminar: ");
                    int idEliminar = Integer.parseInt(scanner.nextLine());
                    ss.removeTicketSoporte(0L);
                    System.out.println("Ticket eliminado.");
                    break;
                case 7:
                    DAOTicketsSoporte.grabarCSV(ss);
                    System.out.println("Datos guardados. Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
    }


}

