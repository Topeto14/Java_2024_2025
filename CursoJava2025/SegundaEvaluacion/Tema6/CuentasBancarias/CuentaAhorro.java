package SegundaEvaluacion.Tema6.CuentasBancarias;

public class CuentaAhorro extends CuentaBancaria {
    private Double tipoInteres;

    public CuentaAhorro(Double saldo, Double comisionesMes, Double tipoInteres) {
        super(saldo, false, false, comisionesMes, 0.5);
        this.tipoInteres = tipoInteres;
    }

    public CuentaAhorro(CuentaAhorro otra) {
        super(otra);
        this.tipoInteres = otra.tipoInteres;
    }

    public Double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(Double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CuentaAhorro{");
        sb.append("numeroCuenta='").append(numeroCuenta).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append(", tieneTCredito=").append(tieneTCredito);
        sb.append(", tieneTDebito=").append(tieneTDebito);
        sb.append(", comisionesMes=").append(this.getComisionesMes());
        sb.append(", modifComisiones=").append(modifComisiones);
        sb.append(", tipoInteres=").append(tipoInteres);
        sb.append('}');
        return sb.toString();
    }
}
