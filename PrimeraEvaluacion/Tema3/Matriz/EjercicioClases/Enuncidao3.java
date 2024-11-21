package Tema3.Matriz.EjercicioClases;

public class Enuncidao3 {
    public static int generarNumero(int min, int max){
        return (int) (Math.random()*(max-min+1)+min);
    }
    public static void pintar(int matriz[][]) {
        for(int i=0; i < matriz.length; i++) {
            for(int j=0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //3. Simulación de contaminación
        //Tenemos una ciudad dividida en cuadrantes, una matriz NxM, decide tú.
        //Cada celda contiene un número entre 0 y 100 indicando el nivel de contaminación.
        //Pinta una nueva matriz, marcando con un 0 las zonas con contaminación menor a un umbral,
        //p. ej. 10, con un 1 las zonas entre 10 y 80, y con un 2 las zonas con más de 80.
        //Dime las coordenadas(i,j) de las zonas con más de 80 de contaminación.
        //Dime también el nivel de contaminación promedio de la ciudad.

        int ciudad[][]= new int[5][5];
        
        for (int i = 0;  i < ciudad.length; i++) {
            for (int j = 0; j < ciudad[i].length ; j++) {
                ciudad[i][j] = generarNumero(0,100);
            }
        }
        pintar(ciudad);

        int contaminacion [][] = new int [5][5];

        for (int i = 0; i <ciudad.length ; i++) {
            for (int j = 0; j < ciudad[0].length; j++) {
                if (ciudad[i][j] < 10) {
                    contaminacion[i][j] = 0;
                } else if (ciudad[i][j] >= 10 && ciudad[i][j] < 80 ) {
                    contaminacion[i][j] = 1;
                }else {
                    contaminacion[i][j] = 2;
                }
            }
        }
        System.out.println("<-------------->");
        pintar(contaminacion);

        int zonas [][] = new int [10][2];
        System.out.println("<-------------->");
        for (int i = 0; i < ciudad.length; i++) {
            for (int j = 0; j < ciudad[i].length; j++) {
                if (contaminacion[i][j] == 2) {
                    System.out.println("Zonas peligrosas : (" + i + ", " + j + ")" );
                }
            }

        }

        int promedio = 0;

        for (int i = 0; i < ciudad.length ; i++) {
            for (int j = 0; j < ciudad[i].length; j++) {
                promedio += ciudad[i][j];
            }
        }
        System.out.println("<-------------->");
        System.out.println("el promedio es ;" + promedio / (ciudad.length*ciudad[0].length));

    }
}
