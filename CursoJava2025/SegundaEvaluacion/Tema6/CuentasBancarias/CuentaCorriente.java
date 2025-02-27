package SegundaEvaluacion.Tema6.CuentasBancarias;

public class CuentaCorriente extends CuentaBancaria {
    private Tarjeta tarjetaCredito;
    private Tarjeta tarjetaDebito;

    public CuentaCorriente(Double saldo, Double comisionesMes, Tarjeta tarjetaCredito,
                           Tarjeta tarjetaDebito) {
        super(saldo, true, true, comisionesMes, 0.4);
        this.tarjetaCredito = tarjetaCredito;
        this.tarjetaDebito = tarjetaDebito;
    }

    public CuentaCorriente(CuentaBancaria otra) {
        super(otra);
    }

    public Tarjeta getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(Tarjeta tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public Tarjeta getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(Tarjeta tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CuentaCorriente{");
        sb.append("numeroCuenta='").append(numeroCuenta).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append(", tieneTCredito=").append(tieneTCredito);
        sb.append(", tieneTDebito=").append(tieneTDebito);
        sb.append(", comisionesMes=").append(this.getComisionesMes());
        sb.append(", modifComisiones=").append(modifComisiones);
        sb.append(", tarjetaCredito=").append(tarjetaCredito);
        sb.append(", tarjetaDebito=").append(tarjetaDebito);
        sb.append('}');
        return sb.toString();
    }
}
