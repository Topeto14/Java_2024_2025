package TerceraEvaluacion.Tema7Parte1.ClaseGenerica.TorneosGenerica;

public class EquipoFIFA extends Equipo{

    private Boolean permiteCartasGold;

    public EquipoFIFA(String nombre, Integer nivel, Boolean permiteCartasGold) {
        super(nombre, nivel);
        this.permiteCartasGold = permiteCartasGold;
    }

    @Override
    public Integer calcularPuntos() {
        return permiteCartasGold ? 5 * nivel : 2 * nivel;
    }
}
