package TerceraEvaluacion.Tema7Parte3.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EjemploCopiarFicheroStream {
    public static void main(String[] args) {

        Path f1 = Paths.get("resources/prueba.txt");
        Path f2 = Paths.get("resources/prueba2.txt");

        try {
            BufferedReader br = Files.newBufferedReader(f1);
            BufferedWriter bw = Files.newBufferedWriter(f2);

            String linea;
            while ( (linea = br.readLine()) != null ) {
                bw.write(linea);
                bw.newLine();
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
