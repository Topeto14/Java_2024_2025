package SegundaEvaluacion.Tema6.CuentasBancarias;

public class Test {
    public static void main(String[] args) {

        CuentaAhorro cAhorro = new CuentaAhorro(2000.0, 10.0, 0.25);
        CuentaCorriente cCorriente = new CuentaCorriente(5000.0, 20.0,
                new Tarjeta("tc-001", 600.0), new Tarjeta("td-002", 300.0));
        CuentaJoven cJoven = new CuentaJoven(600.0, 5.0);

        System.out.println(cAhorro);
        System.out.println(cCorriente);
        System.out.println(cJoven);

        //Clase Banco
        //Meter las tarjetas al banco
        //Hacer ingresos y retiradas en las cuentas
        //Imprimir el objeto Banco

        Banco banco = new Banco();
        banco.addCuentaBancaria(cAhorro);
        banco.addCuentaBancaria(cCorriente);
        banco.addCuentaBancaria(cJoven);

        cAhorro.ingresar(10000.0);
        cCorriente.ingresar(20000.0);
        cJoven.retirar(100.0);

        System.out.println(banco);

    }
}
