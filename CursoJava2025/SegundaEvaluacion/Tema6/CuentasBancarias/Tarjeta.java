package SegundaEvaluacion.Tema6.CuentasBancarias;

import java.util.Objects;

public class Tarjeta {
    protected String numero;
    protected Double saldo;

    public Tarjeta(String numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tarjeta{");
        sb.append("numero='").append(numero).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Tarjeta tarjeta = (Tarjeta) o;
        return Objects.equals(numero, tarjeta.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }
}
