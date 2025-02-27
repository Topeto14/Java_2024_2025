package SegundaEvaluacion.Tema6.patronesString;
import java.util.StringTokenizer;
public class EjemploStringTokenizer {
    public static void main(String[] args) {

        String nombre = "Javier,  Guillén  Benavente    \n" +
                "Luisa, Pérez Sánchez";
        StringTokenizer tokens = new StringTokenizer(nombre, ",");
        while(tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken().trim());
        }
    }
}
