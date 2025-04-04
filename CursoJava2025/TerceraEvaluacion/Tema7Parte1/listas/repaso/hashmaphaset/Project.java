package TerceraEvaluacion.Tema7Parte1.listas.repaso.hashmaphaset;

import java.util.*;

public class Project {
    private String id;
    private String name;
    private Set<Employee> members;
    private Map<Employee, Set<Task>> tasks;

    public Project(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.members = new HashSet<>(5);
        this.tasks = new HashMap<>(5);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Employee> getMembers() {
        return members;
    }

    public Map<Employee, Set<Task>> getTasks() {
        return tasks;
    }

    /**
     * Añadimos el empleado a los miembros del proyecto
     * Creamos su lista de tareas vacía
     * Si el empleado ya estaba en el proyecto, no hacemos nada
     * @param e
     */
    public boolean addTeamMember(Employee e) {
        if (!this.members.contains(e)) {
            this.members.add(e);
            this.tasks.put(e, new HashSet<>());
            return true;
        } else
            return false;
    }

    /**
     * Si el empleado no está en el proyecto return false
     * Si el empleado está en el proyecto, obtenemos su lista
     * de tareas, y le añadimos una nueva
     * @param e
     * @param t
     * @return
     */
    public boolean assignTask(Employee e, Task t) {
        //Comprobar que el empleado esté en el proyecto
        if (!members.contains(e))
            return false;
        else {
            //Sacar el set de tareas de ese empleado y añadirle la tarea
            tasks.get(e).add(t);
            return true;
        }
    }

    /**
     * Mostrar para cada empleado las tareas que tiene asignadas en el proyecto
     */
    public void showInfoProject() {
        for(Employee e: members) {
            System.out.println(e);
            System.out.println("---------------------");
            //Saco las tareas del empleado e
            for(Task t: tasks.get(e)) {
                System.out.println(t);
            }
            System.out.println("_____________________");
        }
    }
}
