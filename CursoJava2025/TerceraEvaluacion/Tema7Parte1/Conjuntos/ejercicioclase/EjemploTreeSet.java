package TerceraEvaluacion.Tema7Parte1.Conjuntos.ejercicioclase;
import java.util.TreeSet;
public class EjemploTreeSet {
    public static void main(String[] args) {

        TreeSet<String> palabras = new TreeSet<>();

        palabras.add("hola");
        palabras.add("adiós");
        palabras.add("lluvia");
        palabras.add("calorcito");

        System.out.println(palabras);

    }
}
