package PrimeraEvaluacion.Tema1.Tema3.Matriz.Ejemplos;

public class EjemploAlumnoMedia {
    public static double numero_aleatorio(double min , double max){
        return (Math.random()*(max-min+1) +min);
    }

    public static void pintar(double matriz[][]) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Tenemos una clase con 11 alumnos.
        //Para la asignatura de Programación tenemos las siguientes notas
        // 3 notas de examenes finales (50%), 1 nota de un trabajo (25%), 1 nota de clase (25%)

        String nombres[] = {"Juan", "Juan2", "July", "Mark", "MarySea", "Ann", "Rob",
                "Mo", "Nouh", "Faty", "Roland"};

        double notas[][] = new double[11][5];
        double mediaExams, mediaAlumno;

        for(int i=0; i < notas.length; i++) {
            for(int j=0; j < notas[i].length; j++) {
                notas[i][j] = numero_aleatorio(3.0, 9.0);
            }
        }

        pintar(notas);

        for(int i=0; i < notas.length; i++) {
            mediaExams = (notas[i][0] + notas[i][1] + notas[i][2]) / 3;
            mediaAlumno = mediaExams * 0.5 + notas[i][3] * 0.25 + notas[i][4] * 0.25;
            System.out.println("La nota de " + nombres[i] + " es " + mediaAlumno);
        }
    }
}
