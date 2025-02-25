package SegundaEvaluacion.Tema5.gestionEmpleados;

public class Test {
    public static void main(String[] args) {

        Comercial cm1 = new Comercial("Manuel", 22, 2000.0, 100.0);
        Comercial cm2 = new Comercial("Sonia", 31, 2000.0, 210.0);

        System.out.println(cm1);
        System.out.println(cm2);

        Repartidor r1 = new Repartidor("Noemí", 23, 1600.0,
                true, Repartidor.Zona.ZONA3);
        Repartidor r2 = new Repartidor("Luis", 22, 1500.0,
                false, Repartidor.Zona.ZONA2);

        System.out.println(r1);
        System.out.println(r2);

        MozoAlmacen ma1 = new MozoAlmacen("Isabel", 29, 1400.0,
                true, MozoAlmacen.Peligrosidad.PELIGROSIDAD3);
        MozoAlmacen ma2 = new MozoAlmacen("Antonio", 31, 1600.0,
                true, MozoAlmacen.Peligrosidad.PELIGROSIDAD2);

        System.out.println(ma1);
        System.out.println(ma2);

    }
}
