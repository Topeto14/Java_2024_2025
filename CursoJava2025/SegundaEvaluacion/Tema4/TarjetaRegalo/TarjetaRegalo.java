package SegundaEvaluacion.Tema4.TarjetaRegalo;

public class TarjetaRegalo {
    private String numero;
    private Double saldo;

    private static Integer numTR=0;

    //TR-1, TR-2

    public TarjetaRegalo(Double saldo) {
        TarjetaRegalo.numTR++;
        this.saldo = saldo;
        this.numero = "TR-" + TarjetaRegalo.numTR;
    }

    public String getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TarjetaRegalo{");
        sb.append("numero='").append(numero).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    public void fusionar(TarjetaRegalo tr) {
        //this.setSaldo(this.getSaldo() + tr.getSaldo());
        this.saldo += tr.getSaldo();
        tr.setSaldo(0.0);
    }
}
