package TerceraEvaluacion.Tema7Parte1.Conjuntos.ejercicioclase.diccionario;

public class Test {
    public static void main(String[] args) {

        Diccionario dic = new Diccionario();

        dic.addEntrada(new Entrada("tarde", "afternoon"));
        dic.addEntrada(new Entrada("respuesta", "replay"));
        dic.addEntrada(new Entrada("superficie", "expanse"));
        dic.addEntrada(new Entrada("disponible","available"));
        dic.addEntrada(new Entrada("cesta", "basket"));
        dic.addEntrada(new Entrada("antes", "before"));
        dic.addEntrada(new Entrada("mejor","better"));
        dic.addEntrada(new Entrada("pájaro","bird"));
        dic.addEntrada(new Entrada("rama", "branch"));
        dic.addEntrada(new Entrada("puente", "bridge"));
        dic.addEntrada(new Entrada("pastel", "cake"));
        dic.addEntrada(new Entrada("cierto", "certain"));
        dic.addEntrada(new Entrada("cereza","cherry"));
        dic.addEntrada(new Entrada("nube","cloud"));

        dic.listarPalabras();

        System.out.println("Traducción de 'disponible' es: " +
                dic.buscarEntrada("disponible"));
        System.out.println("Traducción de 'perro' es: " +
                dic.buscarEntrada("perro"));


        /**
         * ¿ CÓMO HARÍAS SI CADA PALABRA TUVIERA VARIAS ACEPCIONES/SIGNIFICADOS ?
         */

    }
}
