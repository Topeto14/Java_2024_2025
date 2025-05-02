package TerceraEvaluacion.Tema7Parte3.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EjemploBuscarArchivos {
    public static void main(String[] args) {


        Path classT1 = Path.of("src/tema7_parte3");
        try {
            Files.find(classT1,10, (path, attr) -> {
                        return path.toString().endsWith(".java") &&
                                attr.isRegularFile();
                    })
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
