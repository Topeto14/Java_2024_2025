package SegundaEvaluacion.Tema6.CuentasBancarias;

import java.util.Objects;

public class CuentaBancaria {
    protected String numeroCuenta;
    protected Double saldo;
    protected boolean tieneTCredito;
    protected boolean tieneTDebito;
    protected Double comisionesMes;
    protected Double modifComisiones;

    public CuentaBancaria(Double saldo, boolean tieneTCredito, boolean tieneTDebito,
                          Double comisionesMes, Double modifComisiones) {
        this.numeroCuenta = generarNumeroCuenta();
        this.saldo = saldo;
        this.tieneTCredito = tieneTCredito;
        this.tieneTDebito = tieneTDebito;
        this.comisionesMes = comisionesMes;
        this.modifComisiones = modifComisiones;
    }

    public CuentaBancaria(CuentaBancaria otra) {
        this.numeroCuenta = otra.numeroCuenta;
        this.saldo = otra.saldo;
        this.tieneTCredito = otra.tieneTCredito;
        this.tieneTDebito = otra.tieneTDebito;
        this.comisionesMes = otra.comisionesMes;
        this.modifComisiones = otra.modifComisiones;
    }

    public CuentaBancaria() {
    }

    private static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
    }

    private String generarNumeroCuenta() {
        StringBuffer sb = new StringBuffer(20);
        for(int i=0; i < 20; i++) {
            sb.append(generarNumeroAleatorio(9,0));
        }
        return sb.toString();
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean isTieneTCredito() {
        return tieneTCredito;
    }

    public void setTieneTCredito(boolean tieneTCredito) {
        this.tieneTCredito = tieneTCredito;
    }

    public boolean isTieneTDebito() {
        return tieneTDebito;
    }

    public void setTieneTDebito(boolean tieneTDebito) {
        this.tieneTDebito = tieneTDebito;
    }

    public Double getComisionesMes() {
        return comisionesMes * this.modifComisiones;
    }

    public void setComisionesMes(Double comisionesMes) {
        this.comisionesMes = comisionesMes;
    }

    public Double getModifComisiones() {
        return modifComisiones;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CuentaBancaria{");
        sb.append("numeroCuenta='").append(numeroCuenta).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append(", tieneTCredito=").append(tieneTCredito);
        sb.append(", tieneTDebito=").append(tieneTDebito);
        sb.append(", comisionesMes=").append(this.getComisionesMes());
        sb.append(", modifComisiones=").append(modifComisiones);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        CuentaBancaria that = (CuentaBancaria) o;
        return Objects.equals(numeroCuenta, that.numeroCuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numeroCuenta);
    }

    public void ingresar(Double cantidad) {
        this.saldo += cantidad;
    }

    public boolean retirar(Double cantidad) {
        if (this.saldo - cantidad < 0)
            return false;
        else {
            this.saldo -= cantidad;
            return true;
        }
    }
}
