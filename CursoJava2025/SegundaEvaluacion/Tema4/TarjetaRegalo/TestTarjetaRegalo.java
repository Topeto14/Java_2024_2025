package SegundaEvaluacion.Tema4.TarjetaRegalo;

public class TestTarjetaRegalo {
    public static void main(String[] args) {

        TarjetaRegalo tr1 = new TarjetaRegalo(25.0);
        TarjetaRegalo tr2 = new TarjetaRegalo(50.0);

        System.out.println(tr1);
        System.out.println(tr2);

        tr1.fusionar(tr2);

        System.out.println(tr1);
        System.out.println(tr2);
    }
}
