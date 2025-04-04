package TerceraEvaluacion.Tema7Parte1.listas.repaso.collections;

public class Carta {
    Integer numero;
    String palo;

    public Carta(Integer numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Carta{");
        sb.append("numero=").append(numero);
        sb.append(", palo='").append(palo).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
