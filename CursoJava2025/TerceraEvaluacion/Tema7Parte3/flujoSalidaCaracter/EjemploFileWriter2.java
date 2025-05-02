package TerceraEvaluacion.Tema7Parte3.flujoSalidaCaracter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.UUID;

public class EjemploFileWriter2 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        for(int i=0; i<20; i++) {
            lista.add(UUID.randomUUID().toString());
        }

        try {
            PrintWriter pw = new PrintWriter(new FileWriter("resources/prueba.txt"));

            lista.forEach(pw::println);

            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
