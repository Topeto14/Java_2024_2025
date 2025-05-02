package TerceraEvaluacion.Tema7Parte3.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class EjemploAddLineasFichero {
    public static void main(String[] args) {

        Path f1 = Paths.get("resources/prueba.txt");
        Path f2 = Paths.get("resources/prueba2.txt");

        try {
            //Leer todas las líneas del fichero
            List<String> lineas = Files.readAllLines(f1);

            //Escribir todas las líneas de un List, pero las añadimos al final
            Files.write(f2, lineas,
                    StandardOpenOption.APPEND);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
