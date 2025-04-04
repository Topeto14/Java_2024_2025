package TerceraEvaluacion.Tema7Parte1.listas.repaso.priorityqueue;

public class Test {
    public static void main(String[] args) {

        PendingTasks pt = new PendingTasks();
        pt.addTask(new Task(3, "Ver supervivientes"));
        pt.addTask(new Task(2, "Hacer la compra"));
        pt.addTask(new Task(3, "Salir con amigos"));
        pt.addTask(new Task(4, "Quedar con novia/o"));
        pt.addTask(new Task(1, "Estudiar programación"));

        System.out.println(pt.viewHigherPriorityTask());
        System.out.println("Pintar tareas ..........");
        pt.showPendingTasks();

        System.out.println("Eliminando tareas ..........");
        while(true) {
            Task t = pt.pollHigherPriorityTask();
            if (t==null) //vacía
                break;
            System.out.println(t);
        }

    }
}
