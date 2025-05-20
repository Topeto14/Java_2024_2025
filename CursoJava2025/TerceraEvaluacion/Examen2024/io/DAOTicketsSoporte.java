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
import java.util.*;
import java.util.stream.Collectors;

public class DAOTicketsSoporte {

    public static ServicioSoporte loadCSV() {

        //OBJETO SERVICIO SOPORTE QUE DEVOLVERMOS CON TODA LA INFO CARGADA
        ServicioSoporte ss = new ServicioSoporte();

        //1. Cargar usuarios
        //List<Usuario> usuarios;
        try {
            Files.lines(Paths.get("CursoJava2025/TerceraEvaluacion/Examen2024/resource/usuarios.csv"))
                    .map(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        Usuario user = new Usuario(
                                Long.valueOf(tokens.get(0)),
                                tokens.get(1),
                                tokens.get(2),
                                tokens.get(3),
                                tokens.get(4),
                                LocalDate.parse(tokens.get(5))
                        );
                        return user;
                    }) //Stream<Usuario>
                    .forEach(ss::addUsuario);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //ss.setUsuarios(new HashSet<>(usuarios));

        //2. Cargar técnicos
        try {
            Files.lines(Paths.get("CursoJava2025/TerceraEvaluacion/Examen2024/resource/tecnico.csv"))
                    .forEach(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));
                        Tecnico tec = new Tecnico(
                                Long.valueOf(tokens.get(0)),
                                tokens.get(1),
                                tokens.get(2),
                                tokens.get(3),
                                tokens.get(4),
                                Especialidad.valueOf(tokens.get(5)),
                                Double.valueOf(tokens.get(6))
                        );
                        ss.addTecnico(tec);
                    }) ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //3. Cargar Tickets Soporte
        try {
            Files.lines(Paths.get("CursoJava2025/TerceraEvaluacion/Examen2024/resource/tickets.csv"))
                    .forEach(linea -> {
                        List<String> tokens = Arrays.asList(linea.split(","));

                        EstadoTicket estado = EstadoTicket.valueOf(tokens.get(3));
                        //Distinguir si hay que poner fecha de finalización o no
                        LocalDate fechaFin = null;
                        if (estado.equals(EstadoTicket.RESUELTO)) {
                            fechaFin = LocalDate.parse(tokens.get(2));
                        }

                        TicketSoporte ts = new TicketSoporte(
                                Long.valueOf(tokens.get(0)),
                                LocalDate.parse(tokens.get(1)),
                                fechaFin,
                                estado,
                                Integer.valueOf(tokens.get(4)),
                                ss.findUsuarioById(Long.valueOf(tokens.get(5))),
                                ss.findTecnicoById(Long.valueOf(tokens.get(6))),
                                tokens.get(7)
                        );

                        ss.addTicketSoporte(ts);
                    }) ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return ss;

    }

    public static void saveCSV(ServicioSoporte ss) {
        try {
            //Usuarios
            Files.write(Paths.get("CursoJava2025/TerceraEvaluacion/Examen2024/resource/usuarios.csv"),
                    ss.getUsuarios().stream()
                            .map(g -> { //objeto Usuario -> String (línea)
                                StringBuffer sb = new StringBuffer();
                                sb.append(g.getId()).append(",");
                                sb.append(g.getNombre()).append(",");
                                sb.append(g.getApellido()).append(",");
                                sb.append(g.getEmail()).append(",");
                                sb.append(g.getMovil()).append(",");
                                sb.append(g.getFechaAlta());
                                return sb.toString();
                            })
                            .toList());

            //Técnicos
            Files.write(Paths.get("CursoJava2025/TerceraEvaluacion/Examen2024/resource/tecnico.csv"),
                    ss.getTecnicos().stream()
                            .map(g -> { //objeto Tecnico -> String (línea)
                                StringBuffer sb = new StringBuffer();
                                sb.append(g.getId()).append(",");
                                sb.append(g.getNombre()).append(",");
                                sb.append(g.getApellido()).append(",");
                                sb.append(g.getEmail()).append(",");
                                sb.append(g.getMovil()).append(",");
                                sb.append(g.getEspecialidad()).append(",");
                                sb.append(g.getValoracion());
                                return sb.toString();
                            })
                            .toList());

            //Tickets
            Files.write(Paths.get("CursoJava2025/TerceraEvaluacion/Examen2024/resource/tickets.csv"),
                    ss.getTickets().stream()
                            .map(g -> { //objeto Tecnico -> String (línea)
                                StringBuffer sb = new StringBuffer();
                                sb.append(g.getId()).append(",");
                                sb.append(g.getFechaCreacion()).append(",");
                                if (g.getFechaFinalizacion() != null) {
                                    sb.append(g.getFechaFinalizacion()).append(",");
                                } else{
                                    sb.append(",");
                                }
                                sb.append(g.getEstado()).append(",");
                                sb.append(g.getPrioridad()).append(",");
                                sb.append(g.getUsuario().getId()).append(",");
                                sb.append(g.getTecnico().getId()).append(",");
                                if (g.getComentarios() != null) {
                                    sb.append(g.getComentarios());
                                }
                                return sb.toString();
                            })
                            .toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*public static ServicioSoporte cargarCSV() throws IOException {
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
    }*/
}
