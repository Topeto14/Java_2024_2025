package TerceraEvaluacion.Tema7Parte3.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EjemploNIOFiles {
    public static void main(String[] args) {
    //Definir rutas a ficheros
    Path fichero1 = Path.of("resources/prueba.txt");
    Path fichero2 = Paths.get("resources", "prueba2.txt");

        System.out.println(fichero1.toAbsolutePath());
        System.out.println(fichero2.toAbsolutePath());

    //fichero2.forEach(System.out::println);

        try {
        //Borrar archivos
        Files.deleteIfExists(fichero2);

        //Copiar archivos
        Files.copy(fichero1, fichero2);

        //Crear carpetas
        //Files.createDirectory(Path.of("resources/temp"));

        //Crear fichero temporal
        Files.createTempFile(Path.of("resources/temp"), "temp", ".txt");

        //Crear fichero
        Path ficheroCreado = Files.createFile(Path.of("resources/temp/temp.txt"));

        //Mostrar información del archivo
        System.out.println(Files.getOwner(ficheroCreado));
        System.out.println(Files.isWritable(ficheroCreado));


    } catch (IOException e) {
        throw new RuntimeException(e);
    }


}
}
