package TerceraEvaluacion.Tema7Parte3.Inventario.services;

import TerceraEvaluacion.Tema7Parte3.Inventario.models.Departamento;
import TerceraEvaluacion.Tema7Parte3.Inventario.models.EstadoMaterial;
import TerceraEvaluacion.Tema7Parte3.Inventario.models.Material;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Inventario {
    private Set<Material> materiales;

    public Inventario() {
        materiales = new HashSet<>();
    }

    public Inventario(Set<Material> materiales) {
        this.materiales = materiales;
    }

    public Set<Material> getMateriales() {
        return materiales;
    }

    public void addMaterial(Material material) {
        this.materiales.add(material);
    }

    public void removeMaterial(Material material) {
        this.materiales.remove(material);
    }

    public void removeMaterial(String id) {
        this.materiales.removeIf(material -> material.getId().equals(id));
    }

    /**
     * MÉTODOS DE STREAMS ------------------
     */

    /**
     * Mostrar todos los materiales agrupados por localización.
     */
    public void materialesPorLocalizacion() {
        materiales.stream()
                .collect(Collectors.groupingBy(Material::getLocalizacion))
                .forEach((l,lm) -> {
                    System.out.println(l.getNombre());
                    lm.forEach(System.out::println);
                    System.out.println("---------------------------");
                });
    }

    /**
     * Mostrar todos los materiales agrupados por departamento
     */
    public void materialesPorDepartamento() {
        materiales.stream()
                .collect(Collectors.groupingBy(Material::getDepartamento))
                .forEach((d,lm) -> {
                    System.out.println(d.toString());
                    lm.forEach(System.out::println);
                    System.out.println("---------------------------");
                });
    }

    /**
     * Mostrar todos los materiales agrupados por estado, mostrando la
     * cantidad que hay de cada uno.
     */
    public void materialesPorEstado() {
        materiales.stream()
                .collect(Collectors.groupingBy(Material::getEstado, Collectors.counting()))
                .forEach((e,c) -> System.out.println(e + " - " + c));
    }

    /**
     * Generar una lista con todos los materiales del departamento de
     * informática que estén para tirar a la basura, mostrando su
     * localización.
     */
    public List<Material> materialesParaTirarInformatica() {
        List<Material> mats = materiales.stream()
                .filter(m -> m.getDepartamento().equals(Departamento.INFORMATICA))
                .filter(m -> m.getEstado().equals(EstadoMaterial.BASURA))
                .toList(); //inmutable

        return new ArrayList<Material>(mats); //mutable
    }
}
