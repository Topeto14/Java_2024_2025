package TerceraEvaluacion.Tema7Parte1.listas.repaso.priorityqueue;


import java.util.Comparator;
import java.util.PriorityQueue;

public class PendingTasks {

    PriorityQueue<Task> tasks;

    public PendingTasks() {
        tasks = new PriorityQueue<>(Comparator.comparing(Task::getPriority));
    }

    /**
     * Add task to priority queue
     * @param t
     * @return
     */
    public boolean addTask(Task t) {
        return tasks.offer(t);
    }

    /**
     * Show task with higher priority
     * @return
     */
    public Task viewHigherPriorityTask() {
        return tasks.peek();
    }

    /**
     * Remove and show higher priority task
     * @return
     */
    public Task pollHigherPriorityTask() {
        return tasks.poll();
    }

    public void showPendingTasks() {
        //No las muestra ordenadas por prioridad
        for(Task t: tasks) {
            System.out.println(t);
        }
    }
}
