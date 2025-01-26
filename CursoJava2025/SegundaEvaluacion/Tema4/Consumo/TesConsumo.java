package SegundaEvaluacion.Tema4.Consumo;

public class TesConsumo {
    public static void main(String[] args) {
        Consumo consumo1 = new Consumo(100.0,30.0,120.0,1.40);
        System.out.println("Tiempo de viaje : " + consumo1.getTiempo());
        System.out.println("Consumo medio : " + consumo1.consumoMedio());
        System.out.println("Consumo Euros " + consumo1.consumoEuro());

        consumo1.setKms(150.0);
        consumo1.setLitros(20.0);
        consumo1.setVmed(100.0);
        consumo1.setPgas(1.30);
        System.out.println("-----El nuevo consumo--- ");
        System.out.println("Tiempo de viaje : " + consumo1.getTiempo());
        System.out.println("Consumo medio : " + consumo1.consumoMedio());
        System.out.println("Consumo Euros " + consumo1.consumoEuro());
    }
}
