package SegundaEvaluacion.Tema4.CuentaCorriente;

public class CuentaCorriente {
    private String numero;
    private Double saldo;

    private static int numCuentas=0;

    //ES3400 - 10000 y 99999 - numCuentas
    //ES3400-22222-1
    //ES3400-32455-2

    public CuentaCorriente(Double saldo) {
        CuentaCorriente.numCuentas++; //Incremento en uno la propiedad estática, valor común
        this.numero = CuentaCorriente.generarNumeroDeCuenta();
        this.saldo = saldo;
    }

    public CuentaCorriente() {
    }

    /**
     * Privado para que solo se pueda usar en el constructor
     * Nadie puede usarlo fuera de la clase
     * @return
     */
    private static String generarNumeroDeCuenta() {
        int number = CuentaCorriente.generarNumeroAleatorio(99999,11111);
        return "ES3400-" + number + "-" + CuentaCorriente.numCuentas;
    }

    private static int generarNumeroAleatorio(int mayor, int menor) {
        return (int) (Math.random() * (mayor - menor + 1)) + menor;
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
        final StringBuffer sb = new StringBuffer("CuentaCorriente{");
        sb.append("numero='").append(numero).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    public void ingreso(Double cantidad) {
        this.saldo += cantidad;
    }

    public void cargo(Double cantidad) throws Exception {
        if ((this.saldo - cantidad) >= 0) { //Queda dinero
            this.saldo -= cantidad;
        } else {
            throw new Exception("No hay dinero en la cuenta");
        }
    }
}
