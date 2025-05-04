package TerceraEvaluacion.Tema7Parte3.practica3Finca.models;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DAOFInca {
    // Propiedades
    private ArrayList<Finca> fincas;
    private static final Path fincasFile = Paths.get("CursoJava2025/TerceraEvaluacion/Tema7Parte3/practica3Finca/ficherosCsv/finca.csv");

    //Constructor

    public DAOFInca() throws IOException {
        fincas = new ArrayList<>();
        cargarDatos();
    }

    //Getters

    public ArrayList<Finca> getFincas() {
        return fincas;
    }

    //Metodos

    /**Cargar los datos del fichero finca.csv y para cada línea creara un objeto Finca
     * y lo añadira a la fincas
     * */
    private void cargarDatos() throws IOException {
       fincas = (ArrayList<Finca>) Files.newBufferedReader(fincasFile).lines()
               .map(line-> {
                   String[] fincaStr = line.split(",");
                   return new Finca(Long.parseLong(fincaStr[0]),fincaStr[1],
                           Double.parseDouble(fincaStr[2]),Double.parseDouble(fincaStr[3]),
                           Double.parseDouble(fincaStr[4]),fincaStr[5],fincaStr[6]);

               })
               .toList();
    }

    /**
     * Buscar una finca por su id
     * @param id id a buscar
     * @return Finca si existe
     * @throws java.util.NoSuchElementException si no encuentra ninguno
     * */



}
