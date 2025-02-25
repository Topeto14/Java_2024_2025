package SegundaEvaluacion.Tema5.EjemploArrayList2;

public class TestClase {
    public static void main(String[] args) {

        Alumno al1 = new Alumno("Alumno1", "4545454F", "alumno1@g.educaand.es");
        Alumno al2 = new Alumno("Alumno2", "8484848A", "alumno2@g.educaand.es");
        Alumno al3 = new Alumno("Alumno3","30850938B", "alumno3@g.educaand.es");

        ClaseProgramacion divertida = new ClaseProgramacion("Javi");
        divertida.addAlumno(al1);
        divertida.addAlumno(al2);
        divertida.addAlumno(al3);

        divertida.removeAlumno(al2);

        System.out.println(divertida);

        System.out.println(divertida.buscar(al1));
        System.out.println(divertida.buscar(new Alumno("Alumno1", "4545454F", "alumno1@g.educaand.es")));
        System.out.println(divertida.buscarPorDNI("3085098B"));

    }

}
