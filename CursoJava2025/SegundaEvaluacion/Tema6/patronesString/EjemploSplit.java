package SegundaEvaluacion.Tema6.patronesString;

public class EjemploSplit {
    public static void main(String[] args) {

        String ip = "192.168.1.12";
        String[] num = ip.split("\\.");
        for (String s : num) {
            System.out.println(s);
        }

        String texto = "192.34    33.55      66.87";
        String[] ts = texto.split("[\\s]+");
        for (String s : ts) {
            System.out.println(s);
        }

    }
}
