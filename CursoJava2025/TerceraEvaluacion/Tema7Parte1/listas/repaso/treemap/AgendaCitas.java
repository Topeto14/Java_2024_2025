package TerceraEvaluacion.Tema7Parte1.listas.repaso.treemap;

import java.time.LocalDateTime;
import java.util.TreeMap;

public class AgendaCitas {
    private TreeMap<LocalDateTime, String> citas;

    public AgendaCitas() {
        //this.citas = new TreeMap<>(Comparator.reverseOrder()); //Ordena por LocalDateTime al revés
        this.citas = new TreeMap<>(); //Ordena por LocalDateTime por defecto
    }

    public int addCita(String desc, LocalDateTime fecha) {
        if (fecha.isBefore(LocalDateTime.now()))
            return 1; //No puedes organizar una cita anterior a ahora

        //Comprobar que no tenemos una cita en esa fecha
        if (this.citas.containsKey(fecha))
            return 2;

        this.citas.put(fecha, desc);
        return 0; //correcto
    }

    public void mostrarProximasCitas() {
        for(LocalDateTime f: this.citas.keySet()) {
            System.out.println(f + " -> " + this.citas.get(f));
        }
    }

    public String deleteCita(LocalDateTime fecha) {
        return this.citas.remove(fecha);
    }

}
