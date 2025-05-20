package TerceraEvaluacion.Examen2024.io;

import TerceraEvaluacion.Examen2024.models.*;
import TerceraEvaluacion.Examen2024.services.ServicioSoporte;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DAOTicketsSoporte {
    public static ServicioSoporte cargarCSV() throws IOException {
        Path tecnicosFile = Paths.get("CursoJava2025/TerceraEvaluacion/Examen2024/resource/tecnico.csv");
        Path usuariosFile = Paths.get("CursoJava2025/TerceraEvaluacion/Examen2024/resource/usuarios.csv");
        Path ticketsFile = Paths.get("CursoJava2025/TerceraEvaluacion/Examen2024/resource/tickets.csv");
        // Crear el objeto ServicioSoporte donde almacenaremos los datos cargados
        ServicioSoporte ss = new ServicioSoporte();

        //Leer Tecnicos----------------------------------------------------------------
        // ---- Leer Técnicos desde el archivo -----------------------------------------
        // Files.lines() lee todas las líneas del fichero (como Stream<String>)
        Set<Tecnico>tecnicos = Files.lines(tecnicosFile)
                .map(linea->{
                    // Para cada línea, separar por comas (CSV)
                    String[] cadenas = linea.split(",");
                    return new Tecnico(Long.parseLong(cadenas[0]), // ID
                                cadenas[1], //Nombre
                                cadenas[2], //Apellidos
                                cadenas[3], //Email
                                cadenas[4], //Movil
                                Especialidad.valueOf(cadenas[5]), // Especialidad
                                Double.parseDouble(cadenas[6]));  //Valoracion
                })
                .collect(Collectors.toSet()); // Recoger todos en un Set para no tener duplicados
        // Asignar el Set de usuarios al objeto ServicioSoporte
        ss.setTecnicos((HashSet<Tecnico>) tecnicos);

        //Leer Usuarios----------------------------------------------------------------
        Set<Usuario> usuarios = Files.lines(usuariosFile)
                .map(linea->{
                    String[] cadenas = linea.split(",");

                    return new Usuario(Long.parseLong(cadenas[0]),
                            cadenas[1],
                            cadenas[2],
                            cadenas[3],
                            cadenas[4],
                            LocalDate.parse(cadenas[5]));

    })
                .collect(Collectors.toSet());
        ss.setUsuarios((HashSet<Usuario>)usuarios);

        //Leer Tickets----------------------------------------------------------------

        List<TicketSoporte> ticketsMutable = Files.lines(ticketsFile)
                .map(lineas->{
                String[] cadenas = lineas.split(",");

                return new TicketSoporte(Long.parseLong(cadenas[0]),
                        LocalDate.parse(cadenas[1]),
                        LocalDate.parse(cadenas[2]),
                        EstadoTicket.valueOf(cadenas[3]),
                        Integer.parseInt(cadenas[4]),
                        ss.findUsuarioById(Long.parseLong(cadenas[5])),
                        ss.findTecnicoById(Long.parseLong(cadenas[6])),
                        cadenas[7]);
                })
                .toList(); // Mutable aunque no garantizado
        //Este ArrayList ya es mutable, se puede modificar, añadir, etc.
        ArrayList<TicketSoporte> tickets = new ArrayList<>(ticketsMutable);
        // Asignar la lista de tickets al objeto ServicioSoporte
        ss.setTickets((ArrayList<TicketSoporte>)tickets);

        // Devolver el objeto con todos los datos cargados
        return ss;

    }

    public static void grabarCSV(ServicioSoporte ss) throws IOException {
        Path tecnicosFile = Paths.get("CursoJava2025/TerceraEvaluacion/Examen2024/resource/tecnico.csv");
        Path usuariosFile = Paths.get("CursoJava2025/TerceraEvaluacion/Examen2024/resource/usuarios.csv");
        Path ticketsFile = Paths.get("CursoJava2025/TerceraEvaluacion/Examen2024/resource/tickets.csv");

        //Tecnicos-----------------------------------------------------------------------

        BufferedWriter bw = Files.newBufferedWriter(tecnicosFile,
                StandardOpenOption.TRUNCATE_EXISTING, // Borra contenido previo
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE); // Sobre escribe el file "fichero"

        for(Tecnico tecnico : ss.getTecnicos()) {
            StringBuffer sb = new StringBuffer();
            sb.append(tecnico.getId()).append(",");
            sb.append(tecnico.getNombre()).append(",");
            sb.append(tecnico.getApellido()).append(",");
            sb.append(tecnico.getEmail()).append(",");
            sb.append(tecnico.getMovil()).append(",");
            sb.append(tecnico.getEspecialidad()).append(",");
            sb.append(tecnico.getValoracion());

            bw.write(sb.toString());
            bw.newLine();
        }
        bw.close();
        
        //USUARIOS ------------------------------------------------------------------
        bw = Files.newBufferedWriter(usuariosFile,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE); //* to rewrite the file

        for(Usuario usuario : ss.getUsuarios()) {
            StringBuffer sb = new StringBuffer();
            sb.append(usuario.getId()).append(",");
            sb.append(usuario.getNombre()).append(",");
            sb.append(usuario.getApellido()).append(",");
            sb.append(usuario.getEmail()).append(",");
            sb.append(usuario.getMovil()).append(",");
            sb.append(usuario.getFechaAlta());

            bw.write(sb.toString());
            bw.newLine();
        }
        bw.close();
        //TICKETS ----------------------------------------------------------
        bw = Files.newBufferedWriter(ticketsFile,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE); //* to rewrite the file

        for(TicketSoporte ts : ss.getTickets()) {
            StringBuffer sb = new StringBuffer();
            sb.append(ts.getId()).append(",");
            sb.append(ts.getFechaCreacion()).append(",");
            sb.append(ts.getFechaFinalizacion()).append(",");
            sb.append(ts.getEstado()).append(",");
            sb.append(ts.getPrioridad()).append(",");
            sb.append(ts.getUsuario().getId()).append(",");
            sb.append(ts.getTecnico().getId()).append(",");
            sb.append(ts.getComentarios());

            bw.write(sb.toString());
            bw.newLine();
        }
        bw.close();
    }
}
