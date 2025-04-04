package TerceraEvaluacion.Tema7Parte1.listas.repaso.priorityqueue;

public class Task {
    private Integer priority; //low number higher priority
    private String description;

    public Task(Integer priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Task{");
        sb.append("priority=").append(priority);
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
