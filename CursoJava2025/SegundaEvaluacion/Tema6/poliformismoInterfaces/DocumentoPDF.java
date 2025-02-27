package SegundaEvaluacion.Tema6.poliformismoInterfaces;

public class DocumentoPDF extends Documento{
    private boolean firmadoDigitalmente;

    public DocumentoPDF(String nombre, Integer size, String autor, boolean firmadoDigitalmente) {
        super(nombre, size, autor);
        this.firmadoDigitalmente = firmadoDigitalmente;
    }

    public boolean isFirmadoDigitalmente() {
        return firmadoDigitalmente;
    }

    public void setFirmadoDigitalmente(boolean firmadoDigitalmente) {
        this.firmadoDigitalmente = firmadoDigitalmente;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DocumentoPDF{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", size=").append(size);
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", firmadoDigitalmente=").append(firmadoDigitalmente);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean validate() {
        return super.validate() && this.firmadoDigitalmente;
    }
}
