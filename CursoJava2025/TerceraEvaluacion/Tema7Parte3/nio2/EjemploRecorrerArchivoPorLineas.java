package TerceraEvaluacion.Tema7Parte3.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EjemploRecorrerArchivoPorLineas {
    public static void main(String[] args) {

        Path file = Path.of("src/tema7_parte3/nio2/EjemploRecorrerArchivoPorLineas.java");

        try {
            Files.lines(file)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
