package SegundaEvaluacion.Tema6.CuentasBancarias;

public class CuentaJoven extends CuentaBancaria {
    public CuentaJoven(Double saldo, Double comisionesMes) {
        super(saldo, false, false, comisionesMes, 0.25);
    }

    public CuentaJoven(CuentaBancaria otra) {
        super(otra);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CuentaJoven{");
        sb.append("numeroCuenta='").append(numeroCuenta).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append(", tieneTCredito=").append(tieneTCredito);
        sb.append(", tieneTDebito=").append(tieneTDebito);
        sb.append(", comisionesMes=").append(this.getComisionesMes());
        sb.append(", modifComisiones=").append(modifComisiones);
        sb.append('}');
        return sb.toString();
    }
}
