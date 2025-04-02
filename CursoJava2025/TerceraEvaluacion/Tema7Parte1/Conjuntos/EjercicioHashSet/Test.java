package TerceraEvaluacion.Tema7Parte1.Conjuntos.EjercicioHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Test {
    public static void main(String[] args) {

        Persona pe1 = new Persona("48456801A","Alumno1","Apellido1",
                "alumno1@gmail.com", "Cuevas");
        Persona pe2 = new Persona("48456802A","Alumno2","Apellido2",
                "alumno2@gmail.com", "Cuevas");
        Persona pe3 = new Persona("48456803A","Alumno3","Apellido3",
                "alumno3@gmail.com", "Cuevas");
        Persona pe4 = new Persona("48456804A","Alumno4","Apellido4",
                "alumno4@gmail.com", "Cuevas");
        Persona pe5 = new Persona("48456805A","Alumno5","Apellido5",
                "alumno5@gmail.com", "Cuevas");
        Persona repe = new Persona("48456805A","Alumno5","Apellido4",
                "alumno5@gmail.com", "Cuevas");

        Aula al73 = new Aula("Informatica I", "Aula 73");
        al73.addAlumno(pe1);
        al73.addAlumno(pe2);
        al73.addAlumno(pe3);
        al73.addAlumno(pe4);
        al73.addAlumno(pe5);
        al73.addAlumno(repe);

        System.out.println("Aula Informática I --------------------------------");
        al73.listarAlumnos();

        AulaNueva al75 = new AulaNueva("Informatica II", "Aula 75");
        al75.addAlumno(pe1);
        al75.addAlumno(pe2);
        al75.addAlumno(pe3);
        al75.addAlumno(pe4);
        al75.addAlumno(pe5);
        al75.addAlumno(repe);

        System.out.println("Aula Informática II --------------------------------");
        al75.listarAlumnos();


        //6. ArrayList pinta en el orden de insercción, es un array internamente
        //Pero HashSet utiliza una tabla Hash y no garantiza ningún orden al recorrer
        //con un for.


        //7. Cómo hacer fácil que un ArrayList no tenga repetidos.
        al73.setAlumnos(new ArrayList<>(al75.getAlumnos()));
        System.out.println("Aula Informática I - Sin repetidos ------------------");
        al73.listarAlumnos();


        ArrayList<String> palabras = new ArrayList<>(List.of("Casa", "Casa", "Coche"));
        HashSet<String> palabrasNoRep = new HashSet<>(palabras); //Quita repes
        System.out.println(palabrasNoRep);
        palabras = new ArrayList<>(palabrasNoRep);

    }
}
