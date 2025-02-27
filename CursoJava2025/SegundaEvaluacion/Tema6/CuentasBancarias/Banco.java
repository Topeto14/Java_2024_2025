package SegundaEvaluacion.Tema6.CuentasBancarias;


import java.util.ArrayList;

public class Banco {

    private ArrayList<CuentaBancaria> cuentas;

    public Banco() {
        this.cuentas = new ArrayList<CuentaBancaria>();
    }

    public ArrayList<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<CuentaBancaria> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Banco{");
        sb.append("cuentas=").append(cuentas);
        sb.append('}');
        return sb.toString();
    }

    public void addCuentaBancaria(CuentaBancaria cuentaB) {
        this.cuentas.add(cuentaB);
    }

    public CuentaBancaria getCuentaBancaria(String numCuenta) {
        CuentaBancaria cb = new CuentaBancaria();
        cb.setNumeroCuenta(numCuenta);
        int pos = this.cuentas.indexOf(cb);
        if (pos < 0) {
            return null;
        } else {
            return this.cuentas.get(pos);
        }
    }

}
