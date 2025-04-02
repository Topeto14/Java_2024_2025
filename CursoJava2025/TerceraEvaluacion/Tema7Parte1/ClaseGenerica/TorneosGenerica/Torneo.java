package TerceraEvaluacion.Tema7Parte1.ClaseGenerica.TorneosGenerica;

import java.util.ArrayList;

public class Torneo <T extends Equipo>{
    private String nombre;
    private ArrayList<T> equipos;

    public Torneo(String nombre) {
        this.nombre = nombre;
        this.equipos = new ArrayList<>();
    }

    public void inscribirEquipo(T equipo) {
        this.equipos.add(equipo);
    }

    public T jugarTorneo() {
        Integer maximo = Integer.MIN_VALUE;
        T ganador = null;

        for(T equipo: this.equipos) {
            if (equipo.calcularPuntos() > maximo) {
                maximo = equipo.calcularPuntos();
                ganador = equipo;
            }
        }

        return ganador;
    }

    public void imprimirEquipos() {
        for(T equipo: this.equipos) {
            System.out.println(equipo.getNombre() + equipo.getNivel() + equipo.calcularPuntos());
        }
    }
}
