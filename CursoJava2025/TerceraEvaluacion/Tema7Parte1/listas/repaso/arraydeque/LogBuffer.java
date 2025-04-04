package TerceraEvaluacion.Tema7Parte1.listas.repaso.arraydeque;

import java.util.ArrayDeque;

/**
 * Vamos guardando mensajes de log en el buffer
 * Cuando superamos la capacidad, borramos el primer log que se insertó
 * Así siempre tenemos un buffer del tamaño elegido con los últimos logs
 */
public class LogBuffer {
    private ArrayDeque<String> logs; //Se podría hacer igual con LinkedList
    private Integer capacity;

    public LogBuffer(Integer capacity) {
        this.capacity = capacity;
        this.logs = new ArrayDeque<>(capacity);
    }

    public Integer getCapacity() {
        return this.capacity; //Tamaño máximo del buffer
    }

    public Integer getLogsSize() {
        return this.logs.size(); //Tamaño actual del buffer
    }

    /**
     * Si el tamaño actual es menor que la capacidad, se añade el log nuevo
     * Si el tamaño actual es igual que la capacidad, se borra el log más antiguo
     * y se añade el nuevo
     * @param log
     */
    public void addLog(String log) {
        if (this.capacity > this.getLogsSize()) {
            this.logs.add(log);
        } else {
            this.logs.removeFirst();
            this.logs.add(log);
        }
    }

    public void showLogs() {
        for(String s: logs) {
            System.out.println(s);
        }
    }

}
