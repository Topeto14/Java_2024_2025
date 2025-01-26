package SegundaEvaluacion.Tema4.Consumo;

public class Consumo {
    private Double kms;
    private Double litros;
    private Double vmed;  //Velocidad Media
    private Double pgas;  //Precio Gasolina

    //Methods
    public Double getTiempo(){
        return kms/vmed;
    }
    public Double consumoMedio(){
        return (litros/kms)*100;
    }
    public Double consumoEuro(){
        return consumoMedio()*pgas;
    }

    public Consumo(Double kms, Double litros, Double vmed, Double pgas) {
        this.kms = kms;
        this.litros = litros;
        this.vmed = vmed;
        this.pgas = pgas;
    }

    public Double getKms() {
        return kms;
    }

    public void setKms(Double kms) {
        this.kms = kms;
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    public Double getVmed() {
        return vmed;
    }

    public void setVmed(Double vmed) {
        this.vmed = vmed;
    }

    public Double getPgas() {
        return pgas;
    }

    public void setPgas(Double pgas) {
        this.pgas = pgas;
    }
}
