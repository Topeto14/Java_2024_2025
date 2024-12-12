package PrimeraEvaluacion.Tema1.Tema3.Matriz.EjercicioClases;

public class Enunciado2 {
    public static int generarNumero(int min, int max){

        return (int) (Math.random()*(max-min+1)+min);
    }
    public static void pintar(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //2. Simulación sensores de movimiento
        //Un edificio tiene una matriz de sensores de movimiento simulando una sala.
        //Tendría una matriz de 5x5, total 25 sensores. Si tiene un 0 una casilla
        //es que no hay movimiento, si tiene 1, es que sí hay movimiento
        //- Genera aleatoriamente el estado de los sensores de la sala
        //- Calcula cuántos sensores están activados
        //- Identifica si hay una región de movimiento contínuo, es decir al menos un bloque 2x2 con
        //todos los sensores activados.

        int edificio[][] = new int [5][5];
        int countActivos = 0 ;
        for (int i = 0; i < edificio.length; i++) {
            for (int j = 0; j < edificio[i].length; j++) {
                edificio[i][j] = generarNumero(0,1);
                if (edificio[i][j] == 1) {
                    countActivos++;
                }
            }
        }

        pintar(edificio);
        System.out.println("<------------->");
        System.out.println(" Hay " + countActivos + " sensores activos");
        System.out.println("<------------->");

        for (int i = 0; i < edificio.length; i++) {
            for (int j = 0; j < edificio[i].length; j++) {
                if (j != edificio.length-1 && i != edificio.length-1) {
                    if (edificio[i][j] == 1  && edificio[i+1][j] == 1 && edificio[i][j+1] == 1 && edificio[i+1][j+1]==1 ) {
                        System.out.println("Zonas activas : (" + i + ", " + j + ")" + "(" + (i+1) + ", " + j + ")" + "(" + i + ", " + (j+1) + ")" + "(" + (i+1) + ", " + (j+1) + ")" );
                    }
                }

            }
        }



    }
}
