package SegundaEvaluacion.Tema4.CuentaCorriente;

public class TestCuentaCorriente {
    public static void main(String[] args) throws Exception {

        CuentaCorriente cc1 = new CuentaCorriente(1000.0);
        CuentaCorriente cc2 = new CuentaCorriente(500.0);

        System.out.println(cc1);
        System.out.println(cc2);

        try {
            cc2.cargo(1000.0);
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        }

        cc2.cargo(1000.0);

        System.out.println("Gracias por usar el cajero");







    }

}
