package TerceraEvaluacion.Tema7Parte1.listas.repaso.hashmaphaset;

public class Task {
    private String description;
    private State state;

    public Task(String description) {
        this.description = description;
        this.state = State.INITIALIZED;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Task{");
        sb.append("description='").append(description).append('\'');
        sb.append(", state=").append(state);
        sb.append('}');
        return sb.toString();
    }
}
