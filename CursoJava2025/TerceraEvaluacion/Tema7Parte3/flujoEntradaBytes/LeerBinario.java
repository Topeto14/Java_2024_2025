package TerceraEvaluacion.Tema7Parte3.flujoEntradaBytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerBinario {
    public static void main(String[] args) {

        int c;
        try {
            FileInputStream fis = new FileInputStream("resources/prueba.pdf");

            while ((c = fis.read()) != -1) {
                System.out.print(c);
            }

            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
