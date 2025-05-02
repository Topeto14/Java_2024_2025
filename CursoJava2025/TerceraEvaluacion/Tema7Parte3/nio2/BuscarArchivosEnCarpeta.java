package TerceraEvaluacion.Tema7Parte3.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class BuscarArchivosEnCarpeta {
    public static void main(String[] args) {


        Path folder = Path.of("/home/profesor");
        String nameFile = "BuscarArchivoEnCarpeta.java";
        try {
            Files.walk(folder,10)
                    .filter(Files::isRegularFile)
                    .map(Path::getFileName)
                    .filter(path -> path.toString().equals(nameFile))
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            List<Path> ficheros = Files.find(folder,Integer.MAX_VALUE,
                            (path,attr) ->
                                    Files.isRegularFile(path))
                    .toList();

            ficheros.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
