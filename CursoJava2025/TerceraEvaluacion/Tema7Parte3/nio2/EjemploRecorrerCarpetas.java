package TerceraEvaluacion.Tema7Parte3.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EjemploRecorrerCarpetas {
    public static void main(String[] args) {

        Path home = Path.of(System.getProperty("user.home")); //indep. SO
        Path home2 = Path.of("/home/profesor");

        System.out.println(home.toAbsolutePath());
        System.out.println(home2.toAbsolutePath());

        //Número de ficheros regulares en la carpeta home
        try {
            long numFiles = Files.walk(home,15)
                    .filter(Files::isRegularFile)
                    .count();
            System.out.println(numFiles);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Tamaño de todos los ficheros regulares en la carpeta home/profesor
        try {
            double size = Files.walk(home,20)
                    .filter(Files::isRegularFile)
                    .mapToDouble(pat -> {
                        try {
                            return Files.size(pat);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .sum();
            System.out.println(size / 1024 / 1024 / 1024); //GB
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Mostrar todos los ficheros .class en /home/profesor
        Path classT1 = Path.of("out/production/java2025/tema1");
        try {
            Files.walk(classT1,10)
                    .filter(path -> path.toString().endsWith(".class"))
                    .peek(p -> {
                        try {
                            Files.deleteIfExists(p);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
