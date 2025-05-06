package TerceraEvaluacion.Tema7Parte3.practica3Finca.io;


import TerceraEvaluacion.Tema7Parte3.practica3Finca.models.Lectura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class DAOLectura {
    //Propiedades

    private static Set<Lectura> lecturas;
    private static final Path lecturasFile = Paths.get("TerceraEvaluacion/Tema7Parte3/practica3Finca/resources/finca.csv");

    // Constructor




    public DAOLectura() throws IOException {
        lecturas = new HashSet<>();
        cargarDatos();
    }

    private void cargarDatos() throws IOException { // Tira una excepcion si el archivo no es encontrado
        try (BufferedReader leerArchivo = Files.newBufferedReader(lecturasFile)) { // Se leen los archivos línea por línea
            lecturas = leerArchivo.lines()
                    .map(line -> {
                        String[] lecturaStr = line.split(",");
                        try {
                            return new Lectura(
                                    Long.parseLong(lecturaStr[0]), // id
                                    Double.parseDouble(lecturaStr[1]), // Temperatura
                                    Double.parseDouble(lecturaStr[2]), // humedad
                                    LocalDateTime.parse(lecturaStr[3]), // momento
                                    DAOFinca.findById(Long.parseLong(lecturaStr[4])) // Id de la finca
                            );
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .collect(Collectors.toSet());
        }
    }
    /**
     * tomará la colección de lecturas y las grabará en el fichero de texto lecturas.csv
     * */

    public void  grabarDatos()throws IOException{
        Files.deleteIfExists(lecturasFile);
        BufferedWriter bw = Files.newBufferedWriter(lecturasFile,
                StandardOpenOption.CREATE,
                StandardOpenOption.WRITE,
                StandardOpenOption.APPEND);
        lecturas.stream()
                .map(lectura -> {
                    StringBuffer sb = new StringBuffer();
                    sb.append(lectura.getId()).append(",");
                    sb.append(lectura.getTemperatura()).append(",");
                    sb.append(lectura.getHumedad()).append(",");
                    sb.append(lectura.getMomento()).append(",");
                    sb.append(lectura.getFinca().getId());
                    return sb.toString();
                })
                .forEach(line->{
                    try {
                        bw.write(line);
                        bw.newLine();
                    }catch (IOException e){
                        System.out.println("No se pudo escribir en el archivo");
                    }
                });
        bw.close();
    }

    /**
     * añade una Lectura a lecturas
     * @param lectura
     * */
    public  void addLectura (Lectura lectura){
        lecturas.add(lectura);
    }

    /**
     * elimina una Lectura de lecturas.
     * @param lectura
     * */
    public void deleteLectura (Lectura lectura){
        lecturas.remove(lectura);
    }

    // Segunda Parte Metodos

    /**
     * devuelve todas las lecturas agrupadas por finca (por su id).
     * */
    public static HashMap<Long, List<Lectura>> getLectrurasPorFinca(){
        return new HashMap<>(lecturas.stream()
                .collect(Collectors.groupingBy(lectura -> lectura.getFinca().getId())));

    }

    /**
     * devuelve la temperatura máxima de todas las lecturas de una finca.
     * @param id
     * */

    public static Double getTempMaximaFinca(Integer id){
        return lecturas.stream()
                .filter(lectura -> lectura.getFinca().getId().equals(id))
                .map(Lectura::getTemperatura)
                .max(Double::compareTo)
                .orElseThrow();
    }

    /**
     * devuelve la temperatura mínima de todas las lecturas de una finca.
     * @param id
     * */

    public static Double getTempMinimaFinca(Integer id){
        return lecturas.stream()
                .filter(lectura -> lectura.getFinca().getId().equals(id))
                .map(Lectura::getTemperatura)
                .min(Double::compareTo)
                .orElseThrow();
    }

    /**
     * para una finca devuelve una lista de los valores de humedad ordenados por fecha.
     * @param id
     * */

    public static List<Double> getHunedadPorFinca(Integer id){
        return lecturas.stream()
                .filter(lectura -> lectura.getFinca().getId().equals(id))
                .sorted(Comparator.comparing(Lectura::getMomento))
                .map(Lectura::getHumedad)
                .toList();
    }
    /**
     * para una finca devuelve una lista de los valores de temperatura ordenados por fecha.
     * @param id
     * */
    public static List<Double> getTemperaturaPorFinca(Integer id){
        return lecturas.stream()
                .filter(lectura -> lectura.getFinca().getId().equals(id))
                .sorted(Comparator.comparing(Lectura::getMomento))
                .map(Lectura::getTemperatura)
                .toList();
    }

    /**
     * muestra todas las temperaturas de una finca en un día concreto ordenado por fecha (hora).
     * @param dia
     * @param id
     * @return temperatura
     * */
    public static List<Double> getTemDiaPorFinca(Integer id,LocalDate dia){
        return lecturas.stream()
                .filter(lectura -> lectura.getFinca().getId().equals(id))
                .filter(lectura -> lectura.getMomento().toLocalDate().equals(id))
                .sorted(Comparator.comparing(lectura -> lectura.getMomento().toLocalDate()))
                .map(Lectura::getTemperatura)
                .toList();
    }







}
