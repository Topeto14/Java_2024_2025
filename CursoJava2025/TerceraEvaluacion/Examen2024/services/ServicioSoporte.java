package TerceraEvaluacion.Examen2024.services;

import TerceraEvaluacion.Examen2024.models.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class ServicioSoporte {
    private List<TicketSoporte> tickets;
    private HashSet<Usuario> usuarios;
    private HashSet<Tecnico> tecnicos;

    public ServicioSoporte() {
        tickets = new ArrayList<>();
        usuarios = new HashSet<>();
        tecnicos = new HashSet<>();
    }

    public List<TicketSoporte> getTickets() {
        return tickets;
    }

    public void setTickets(List<TicketSoporte> tickets) {
        this.tickets = tickets;
    }

    public HashSet<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashSet<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public HashSet<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(HashSet<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    /**
     * Metodos para añadir y eliminar objetos en coleccion
     */
    public void addTecnico(Tecnico tecnico) {
        this.tecnicos.add(tecnico);
    }

    /**
     * addUsuario(Usuario u), deleteUsuario(int id)
     * */

    public void addUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }
    /**
     * addTecnico(Tecnico u), deleteTecnico(int id)
     * */

    public void deleteTecnico(Long id) {
        tecnicos.removeIf(tecnico -> Objects.equals(tecnico.getId(), id));
    }

    public void deleteUsuario(Long id) {
        usuarios.removeIf(usuario -> usuario.getId().equals(id));
    }

    /**
     * addTicketSoporte(fechaCreacion, fechaFinalizacion, prioridad, comentarios,
     * usuario, tecnico.csv). Para sacar el id del ticket deberías sacar el máximo
     * de los ids que ya hay y sumarle uno.
     * */

    public void addTicketSoporte(LocalDate fechaCreacion, LocalDate fechaFinalizacion,
                                 Integer prioridad, String comentarios, Usuario usuario, Tecnico tecnico) {

        //Sacamos el mayor id de todos los tickets
        Long idMaximo = tickets.stream().mapToLong(TicketSoporte::getId).max().orElse(0L);
        //Creamos el ticketSoporte
        TicketSoporte ts = new TicketSoporte(idMaximo + 1, fechaCreacion, fechaFinalizacion, EstadoTicket.ABIERTO, prioridad, usuario, tecnico, comentarios);
        //Añadimos a los tickets
        tickets.add(ts);
    }

    /**
     * deleteTicketSoporte(int id): elimina un Ticket de la lista correspondiente.
     * */

    public void removeTicketSoporte(Long id) {
        tickets.removeIf(ticket -> ticket.getId().equals(id));
    }

    /**
     * Metodos de consultas sobre colleciones
     */

    /**
     * Tecnico findTecnicoById(int id): técnico con el id indicado.
     * */

    public Tecnico findTecnicoById(Long id) {
        return tecnicos.stream()
                .filter(tecnico -> tecnico.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    /**
     * Usuario findUsuarioById(int id): usuario con el id indicado.
     * */

    public Usuario findUsuarioById(Long id) {
        return usuarios.stream()
                .filter(usuario -> usuario.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    /**
     * List<Tecnico> getTecnicosByEspecialidad(Especialidad esp):
     * lista de técnicos de una especialidad.
     * */
    public List<Tecnico> getTecnicosByEspecialidad(Especialidad esp) {
        return tecnicos.stream()
                .filter(tecnico -> tecnico.getEspecialidad().equals(esp))
                .toList();
    }
    /**
     * Map<Especialidad, List<Tecnico>> getTecnicosGroupByEspecialidad():
     * mapa con especialidad y para cada una la lista de técnicos de esa especialidad
     * ordenados por valoración.
     * */
    public Map<Especialidad, List<Tecnico>> getTecnicosGroupByEspecialidad() {
        //Obtener técnicos agrupados por especialidad
        Map<Especialidad, List<Tecnico>> tecs = tecnicos.stream()
                .collect(Collectors.groupingBy(Tecnico::getEspecialidad));
        //Ordenar cada lista de técnicos por valoracion
        tecs.forEach((K, v) -> {
            v.sort(Comparator.comparing(Tecnico::getValoracion));
        });
        return tecs;
    }

    /**
     * TicketSoporte findTicketById(int id): ticket de soporte con el id indicado.
     * */

    public TicketSoporte findTicketSoporteById(Long id) {
        return tickets.stream()
                .filter(tickets-> tickets.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    /**
     * List<TicketSoporte> getTicketsAbiertos(): lista con todos los tickets abiertos
     * ordenados por fecha de creacion descendente.
     * */
    public List<TicketSoporte> getTicketsAbiertos(){
        return tickets.stream()
                .filter(tickets->tickets.getEstado().equals(EstadoTicket.ABIERTO))
                .sorted(Comparator.comparing(TicketSoporte::getFechaCreacion).reversed())
                .toList();
    }

    /**
     * List<TicketSoporte> getTicketsCerrados(): lista con todos los tickets resueltos
     * ordenados por fecha de finalización descendente.
     * */
    public List<TicketSoporte> getTicketsCerrados(){
        return tickets.stream()
                .filter(tickets->tickets.getEstado().equals(EstadoTicket.RESUELTO))
                .sorted(Comparator.comparing(TicketSoporte::getFechaFinalizacion).reversed())
                .toList();
    }

    /**
     * List<TicketSoporte> getTicketsEnProcesoTecnicoInformatico():
     * devuelve todos los tickets ENPROCESO que tienen asignado un técnico
     * de la especialidad de informática.
     * */

    public List<TicketSoporte> getTicketsEnProcesoTecnicoInformatico(){
        return tickets.stream()
                .filter(tickets->tickets.getTecnico().getEspecialidad().equals(Especialidad.INFORMATICA))
                .filter(tickets->tickets.getEstado().equals(EstadoTicket.ENPROCESO))
                .toList();

    }

    /**
     * Integer getTotalTicketsResueltos(Integer prioridad):
     * devuelve el total de tickets resueltos de una determinada prioridad.
     * */

    public Long getTotalTicketsResueltos(Integer prioridad){
        return tickets.stream()
                .filter(tickets-> tickets.getPrioridad().equals(prioridad))
                .filter(tickets->tickets.getEstado().equals(EstadoTicket.RESUELTO))
                .count();
    }

    /**
     * Set<TicketSoporte> findTicketsByEstadoAndPrioridad
     * (Estado estado, Integer prioridad):
     * conjunto con los tickets con el estado y la prioridad indicados,
     * ordenados por fecha de creación ascendente.
     * */

    public Set<TicketSoporte> findTicketsByEstadoAndPrioridad(EstadoTicket estado, Integer prioridad){
        return tickets.stream()
                .filter(tickets->tickets.getPrioridad().equals(prioridad))
                .filter(tickets->tickets.getEstado().equals(estado))
                .sorted(Comparator.comparing(TicketSoporte::getFechaCreacion).reversed())
                .collect(Collectors.toCollection(TreeSet::new));
    }

    /**
     * Map<Especialidad, List<Tecnico>> findTecnicosInTickets():
     * muestra todos los técnicos que han trabajado en algún ticket,
     * agrupados por especialidad.
     * */

    public Map<Especialidad,List<Tecnico>> findTecnicosInTickets(){
        return tickets.stream()
                .map(TicketSoporte::getTecnico)
                .collect(Collectors.groupingBy(Tecnico::getEspecialidad));
    }

    /**
     * Set<Tecnico> findTecnicosRapidos(): muestra una lista de los técnicos
     * que han solucionado tickets en menos de 5 días.
     * */

    public Set<Tecnico> findTecnicosRapidos(){
        return tickets.stream()
                .filter(tickets-> ChronoUnit.DAYS.between(tickets.getFechaFinalizacion(),tickets.getFechaCreacion())<=5)
                        .map(TicketSoporte::getTecnico)
                        .collect(Collectors.toSet());
    }

    /**
     * Integer getTotalTicketsRetardados(): devuelve el total de tickets cerrados
     * que han tardado más de una semana en cerrarse desde que se abrieron.
     * */
    public Long getTotalTicketsRetardados(){
        return tickets.stream()
                .filter(tickets->tickets.getEstado().equals(EstadoTicket.RESUELTO))
                .filter(tickets->ChronoUnit.DAYS.between(tickets.getFechaFinalizacion(),tickets.getFechaCreacion())>7)
                .count();
    }

    /**
     * Double getMediaResolucionTickets(Integer prioridad):
     * devuelve la media de días en que se resuelven los tickets
     * de una determinada prioridad.
     * */

    public Double getMediaResolucionTickets(Integer prioridad){
        return tickets.stream()
                .filter(tickets->tickets.getEstado().equals(prioridad))
                .filter(tickets->tickets.getEstado().equals(EstadoTicket.RESUELTO))
                .mapToLong(tickets->ChronoUnit.DAYS.between(tickets.getFechaFinalizacion(),tickets.getFechaCreacion()))
                .average()
                .orElse(0.0);
    }

    /**
     * Map<Tecnico, Double> getMediaResolucionTicketsGroupByTecnico():
     * devuelve un mapa donde para cada técnico que resuelve tickets
     * muestre la media de días en que resuelve los tickets.
     * */

    public Map<Tecnico, Double> getMediaResolucionTicktetsGroupByTecnico(){
        return tickets.stream()
                .filter(tickets->tickets.getEstado().equals(EstadoTicket.RESUELTO))
                .collect(Collectors.groupingBy(TicketSoporte::getTecnico,
                        Collectors.averagingLong(tickets->
                                ChronoUnit.DAYS.between(tickets.getFechaFinalizacion(),tickets.getFechaCreacion()))));

    }

    /**
     * Boolean areAllTicketsFinishedLessThanTenDays():
     * dice si todos los tickets han sido o no resueltos
     * en menos de 10 días, solo para los tickets resueltos.
     * */

    public boolean areAllTicketsFinishedLessThanTendDays(){
        return tickets.stream()
                .allMatch(tickets->ChronoUnit.DAYS.between(tickets.getFechaFinalizacion(),tickets.getFechaCreacion())<10);
    }

    /**
     * Optional<TicketSoporte> getFirstTicketSolvedOneDay():
     * devuelve un ticket que haya sido resuelto el mismo día.
     * */

    public Optional<TicketSoporte> getFirstTicketSolvedOneDay(){
        return tickets.stream()
                .filter(tickets->tickets.getEstado().equals(EstadoTicket.RESUELTO))
                .filter(tickets->ChronoUnit.DAYS.between(tickets.getFechaFinalizacion(),tickets.getFechaCreacion())==1)
                .findFirst();
    }




}
