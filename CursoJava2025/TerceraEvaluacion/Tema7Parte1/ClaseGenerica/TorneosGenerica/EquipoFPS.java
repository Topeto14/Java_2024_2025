package TerceraEvaluacion.Tema7Parte1.ClaseGenerica.TorneosGenerica;

public class EquipoFPS extends Equipo{

    private Integer punteria;

    public EquipoFPS(String nombre, Integer nivel, Integer punteria) {
        super(nombre, nivel);
        this.punteria = punteria;
    }

    public Integer getPunteria() {
        return punteria;
    }

    public void setPunteria(Integer punteria) {
        this.punteria = punteria;
    }

    @Override
    public Integer calcularPuntos() {
        return this.nivel + (this.punteria * 5);
    }
}
