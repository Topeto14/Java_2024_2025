package Tema3.Array.EjerciciosClase;

public class Ej3CubitusHumerus {
    public static int numero_aleatorio(int min , int max){
        return (int)(Math.random()*(max-min+1) +min);
    }
    public static void main(String[] args) {
       /*3. Cubitus y Humerus juegan hoy otra vez a los dados.
        Ambos lanzan dos dados de 6 caras y un dado de 15 caras.
        Si en su tirada Cubitus obtiene un valor mayor en los dados de 6 caras
        que en el de 15 suma tres puntos al total. Si en su tirada Humerus obtiene
        un valor mayor en el dado de 15 caras que en los de 6 suma tres puntos al total.
        Gana la ronda el que tenga más puntos. Simula el juego de 100 partidas,
        guarda los resultados en un array, y dime cuál es la media de la puntuación
        de las partidas jugadas, y quién es el ganador. */
        int partidas[] = new int[100];
        int puntosCubitus, puntosHumerus;
        int partidastotal = 0;
        int contaC = 0;
        int contaH = 0;
        for (int i = 0; i < partidas.length; i++) {
            puntosCubitus = tiradaCubitus();
            puntosHumerus = tiradaHumerus();
            if (puntosCubitus > puntosHumerus) {
                partidas[i] = puntosCubitus;
                System.out.println("Gana Cubitus: " + puntosCubitus);
                contaC++;
            } else if (puntosCubitus < puntosHumerus) {
                partidas[i] = puntosHumerus;
                System.out.println("Gana Humerus: " + puntosHumerus);
                contaH++;
            }
        }
        for (int i = 0; i < partidas.length; i++) {
            partidastotal += partidas[i];
        }
        if (contaC > contaH) {
            System.out.println("El ganador es Cubitus: " + contaC);
        } else if (contaC < contaH) {
            System.out.println("El ganador es Humerus: " + contaH);
        }
        System.out.println("La media del puntos es de :"+ partidastotal/partidas.length);

    }
    public static int tiradaCubitus(){
        int dado1, dado2, dado3;
        dado1 = numero_aleatorio(1,6);
        dado2 = numero_aleatorio(1,6);
        dado3 = numero_aleatorio(1,15);
        int total = dado1 + dado2 + dado3;
        if ((dado1 + dado2) > dado3){
            total += 3;
        }
        return total;
    }
    public static int tiradaHumerus(){
        int dado1, dado2, dado3;
        dado1 = numero_aleatorio(1,6);
        dado2 = numero_aleatorio(1,6);
        dado3 = numero_aleatorio(1,15);
        int total = dado1 + dado2 + dado3;
        if ((dado1 + dado2) < dado3){
            total += 3;
        }
        return total;
    }
}
