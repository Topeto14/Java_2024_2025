package TerceraEvaluacion.Tema7Parte3.flujoSalidaCaracter;

import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("resources/prueba.txt");
            fw.write("Hola mundo\nA Ver");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
