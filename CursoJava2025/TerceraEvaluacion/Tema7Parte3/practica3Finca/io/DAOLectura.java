package TerceraEvaluacion.Tema7Parte3.practica3Finca.io;


import TerceraEvaluacion.Tema7Parte3.practica3Finca.models.Lectura;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class DAOLectura {
    //Propiedades

    private  Set<Lectura> lecturas;
    private static Path lecturasFile = Paths.get("TerceraEvaluacion/Tema7Parte3/lecturasFile/ficherosCsv/lecturas.csv");

    // Constructor
    public DAOLectura() throws IOException {
        cargarDatos();
    }

    private void cargarDatos() throws IOException {
        lecturas = new HashSet<>(Files.newBufferedReader(lecturasFile).lines()
                .map(line -> {
                    String[] lecturaStr = line.split(",");
                    try {
                        return new Lectura(Long.parseLong(lecturaStr[0]), Double.parseDouble(lecturaStr[1]),
                                Double.parseDouble(lecturaStr[2]), LocalDateTime.parse(lecturaStr[3]),
                                DAOFInca.findById(Long.parseLong(lecturaStr[4])));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                })
                .toList());
    }

    }






}
