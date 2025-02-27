package SegundaEvaluacion.Tema6.ejercicioClase;
import java.util.Comparator;
import java.util.Scanner;
public class MiAgenda {
    public static void main(String[] args) {
        Agenda miAgenda = new Agenda();

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("AGENDA");
            System.out.println("===========================================");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Estado de la agenda");
            System.out.println("6. Salir");
            System.out.println("INTRODUCE OPCIÓN: (1-6)");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Dime nombre:");
                    String nombre = sc.nextLine();
                    System.out.println("Dime teléfono:");
                    String telefono = sc.nextLine();
                    if (miAgenda.addContacto(new Contacto(nombre, telefono)))
                        System.out.println("Contacto añadido");
                    else
                        System.out.println("Contacto repetido");
                    break;
                case 2:
                    miAgenda.listarContactos();
                    break;
                case 3:
                    System.out.println("Dime nombre a buscar");
                    Contacto contacto = miAgenda.buscarContacto(sc.nextLine());
                    if (contacto == null) {
                        System.out.println("No encontrado");
                    } else {
                        System.out.println(contacto);
                    }
                    break;
                case 4:
                    System.out.println("Dime nombre de contacto a borrar");
                    if (miAgenda.eliminarContacto(new Contacto(sc.nextLine(), "")))
                        System.out.println("Eliminado correctamente");
                    else
                        System.out.println("No encontrado");
                    break;
                case 5:
                    System.out.println("La agenda tiene actualmente "
                            + miAgenda.getContactos().size() + " contactos.");
                    miAgenda.getContactos().sort(Comparator.comparing(Contacto::getNombre));
                    miAgenda.listarContactos();
                    break;
                case 6:
                    System.out.println("Adiós, gracias por usar esta agenda ...");
                    break;
                default:
                    System.out.println("Opción incorrecta, introduce número entre 1 y 6");
            }


        } while (opcion != 6);
    }
}
