package TerceraEvaluacion.Tema7Parte3.Inventario.Test;

import TerceraEvaluacion.Tema7Parte3.Inventario.io.FileUtils;
import TerceraEvaluacion.Tema7Parte3.Inventario.models.Departamento;
import TerceraEvaluacion.Tema7Parte3.Inventario.models.EstadoMaterial;
import TerceraEvaluacion.Tema7Parte3.Inventario.models.Material;
import TerceraEvaluacion.Tema7Parte3.Inventario.models.TipoMaterial;
import TerceraEvaluacion.Tema7Parte3.Inventario.services.Inventario;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {

        try {
            Inventario inventario = new Inventario(FileUtils.loadMaterialCSV());
            inventario.getMateriales().forEach(System.out::println);

            //Añadimos material
            inventario.addMaterial(new Material("8ff6ce90-778e-49af-9031-f79287701869",
                    "Impresora láser", "Impresora multifuncional láser",
                    EstadoMaterial.DEFECTUOSO, TipoMaterial.PERIFERICO, Departamento.INFORMATICA,
                    FileUtils.buscar(2l, FileUtils.loadLocalizacionesCSV())));

            //Eliminamos material
            inventario.removeMaterial("59177db0-2919-4f0d-9d59-243260946d0c");

            //Grabamos a disco
            //FileUtils.saveMaterialesCSV(inventario.getMateriales());

            inventario.materialesPorLocalizacion();
            inventario.materialesPorDepartamento();
            inventario.materialesPorEstado();
            System.out.println("Materiales tirar de Informática:");
            inventario.materialesParaTirarInformatica()
                    .forEach(System.out::println);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
