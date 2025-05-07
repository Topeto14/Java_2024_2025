package TerceraEvaluacion.Tema7Parte3.Inventario.io;

import TerceraEvaluacion.Tema7Parte3.Inventario.models.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class FileUtils {
    public static Set<Material> loadMaterialCSV() throws IOException {

        List<Localizacion> locals = new ArrayList<>();
        Set<Material> materiales = new HashSet<>();

        //1. Leer localizaciones
        Files.lines(Path.of("resources/local.csv"))
                .forEach(linea -> {
                    List<String> tokens = Arrays.asList(linea.split(","));
                    Localizacion lo = new Localizacion(
                            Long.valueOf(tokens.get(0)), tokens.get(1), tokens.get(2)
                    );
                    locals.add(lo);
                });

        //2. Leer materiales
        //Cuando veamos el id de localización lo buscamos en locals
        Files.lines(Path.of("resources/material.csv"))
                .forEach(linea -> {
                    List<String> tokens = Arrays.asList(linea.split(","));
                    Material ma = new Material(
                            tokens.get(0), tokens.get(1), tokens.get(2),
                            EstadoMaterial.valueOf(tokens.get(3)),
                            TipoMaterial.valueOf(tokens.get(4)),
                            Departamento.valueOf(tokens.get(5)),
                            FileUtils.buscar(Long.valueOf(tokens.get(6)),locals)
                    );
                    materiales.add(ma);
                });

        return materiales;
    }


    public static List<Localizacion> loadLocalizacionesCSV() throws IOException {

        List<Localizacion> locals = new ArrayList<>();

        Files.lines(Path.of("resources/local.csv"))
                .forEach(linea -> {
                    List<String> tokens = Arrays.asList(linea.split(","));
                    Localizacion lo = new Localizacion(
                            Long.valueOf(tokens.get(0)), tokens.get(1), tokens.get(2)
                    );
                    locals.add(lo);
                });
        return locals;
    }

    public static Localizacion buscar(Long id, List<Localizacion> localizaciones) {
        return localizaciones.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public static void saveMaterialesCSV(Set<Material> materiales) throws IOException {
        //Para cada objeto Material, crear una línea como string, separado cada
        //elemento por comas
        List<String> lineas = new ArrayList<>();

        //Recorrer cada material y generar linea
        materiales.forEach(material -> {
            StringBuffer linea = new StringBuffer();
            linea.append(material.getId());
            linea.append(",");
            linea.append(material.getNombre());
            linea.append(",");
            linea.append(material.getDescripcion());
            linea.append(",");
            linea.append(material.getEstado().name());
            linea.append(",");
            linea.append(material.getTipo().name());
            linea.append(",");
            linea.append(material.getDepartamento().name());
            linea.append(",");
            linea.append(material.getLocalizacion().getId());

            lineas.add(linea.toString());
        });

        //Borramos el fichero y lo reescribimos con los nuevos datos
        Files.write(Path.of("resources/material.csv"),
                lineas, //todas las líneas generadas a partir de cada objeto material
                StandardOpenOption.CREATE, StandardOpenOption.WRITE,
                StandardOpenOption.TRUNCATE_EXISTING);

    }

}
