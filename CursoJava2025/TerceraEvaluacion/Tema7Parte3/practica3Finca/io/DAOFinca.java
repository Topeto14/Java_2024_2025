package TerceraEvaluacion.Tema7Parte3.practica3Finca.io;

import TerceraEvaluacion.Tema7Parte3.practica3Finca.models.Finca;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class DAOFinca {
    // Propiedades
    private static List<Finca> fincas;
    private static final Path fincasFile = Paths.get("CursoJava2025/TerceraEvaluacion/Tema7Parte3/practica3Finca/resources/finca.csv");


    //Constructor

    public DAOFinca()throws IOException {
        cargarDatos();
    }

    //Getters

    public static List<Finca> getFincas() {
        return fincas;
    }


    //Metodos

    /**Cargar los datos del fichero finca.csv y para cada línea creara un objeto Finca
     * y lo añadira a la fincas
     * */
    private void cargarDatos() throws IOException {
        fincas = Files.newBufferedReader(fincasFile).lines()
                .map(line -> {
                    String[] fincaStr = line.split(",");
                    return new Finca(Long.parseLong(fincaStr[0]),
                            fincaStr[1],
                            Double.parseDouble(fincaStr[2]),
                            Double.parseDouble(fincaStr[3]),
                            Double.parseDouble(fincaStr[4]),
                            fincaStr[5],
                            fincaStr[6]);
                })
                .toList();
    }

    /**
     * Buscar una finca por su id
     * @param id id a buscar
     * @return Finca si existe
     * @throws java.util.NoSuchElementException si no encuentra ninguno
     * */

    public static Finca findById(Long id)throws IOException{
        return fincas.stream()
                .filter(finca -> finca.getId().equals(id))
                .findFirst()
                .orElseThrow();
    }

    /**
     * Añade una Finca a fincas
     * @param f finca que se agrega
     * */

    public  void addFinca(Finca f){
        fincas.add(f);
    }
    /**
     * Elimina una Finca de la lista Finca
     * @param f finca que se elimina
     * */

    public void deleteFinca(Finca f){
        fincas.remove(f);
    }

    /**
     * Buscar eficiente las fincas con ese nombre
     * @param nombre el nombre que tiene la finca a buscar
     * */

    public  Finca findByName(String nombre){
        return fincas.stream()
                .filter(finca -> finca.getNombre().equals(nombre))
                .findFirst()
                .orElseThrow();
    }

    // Segunda Parte Metodos

    /**
     * devuelve todas las fincas ordenadas de menor a mayor superficie.
     * */

    public static List<Finca> getFincasPorSuperficie(){
        return fincas.stream()
                .sorted(Comparator.comparing(Finca::getSuperficie).reversed())
                .toList();
    }

    /**
     * devuelve las tres fincas más grandes
     * */

    public static List<Finca> getMasGrandes(){
        return fincas.stream()
                .sorted(Comparator.comparing(Finca::getSuperficie).reversed())
                .limit(3)
                .toList();
    }

    /**
     * muestra las fincas agrupadas por ciudad.
     * */

    public static HashMap<String, List<Finca>> getFincasPorCiudad(){
        return new  HashMap<>(fincas.stream()
                .collect(Collectors.groupingBy(Finca::getLocalidad)));
    }

    /**
     * devuelve el nombre de todas las fincas entre 50 y 150 metros cuadrados.
     * */

    public static List<String> getFincasMedio(){
        return fincas.stream()
                .filter(finca -> finca.getSuperficie()>=50)
                .filter(finca -> finca.getSuperficie()<=150)
                .map(Finca::getNombre)
                .toList();
    }




}
