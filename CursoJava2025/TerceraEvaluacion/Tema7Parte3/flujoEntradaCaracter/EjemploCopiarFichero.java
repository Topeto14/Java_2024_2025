package TerceraEvaluacion.Tema7Parte3.flujoEntradaCaracter;

import java.io.*;

public class EjemploCopiarFichero {
    public static void main(String[] args) {

        //Copiar un archivo en otro
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("resources/prueba.txt"));
            bw = new BufferedWriter(new FileWriter("resources/prueba2.txt"));

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine(); //Salto de línea
            }

            bw.close();
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
