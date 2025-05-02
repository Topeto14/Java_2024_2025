package TerceraEvaluacion.Tema7Parte3.flujoSalidaCaracter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EjemploPrintWriter {
    public static void main(String[] args) {

        PrintWriter pw = new PrintWriter(System.err);
        pw.println("Hola mundo");
        pw.println("A Ver");
        pw.close();

        //pw = new PrintWriter(new FileWriter("resources/prueba.txt"));

        try {
            pw = new PrintWriter("resources/prueba.txt");

            pw.println("Hola mundo");
            pw.println("A ver");
            pw.printf("El valor de %s es %.4f", "PI", Math.PI);

            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
