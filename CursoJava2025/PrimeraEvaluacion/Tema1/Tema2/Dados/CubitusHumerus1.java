package PrimeraEvaluacion.Tema1.Tema2.Dados;

public class CubitusHumerus1 {
    public static int generarNumero(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static void main(String[] args) {
        //Dos romanos asediando una ciudad, están aburridos y se ponen a jugar a los dados
        //Cada uno tira un dado de 20 caras
        //Gana el que saca el dado mayor, o el que si alguno de ellos saca el 9
        //Juega una partida y dime quien gana.

        //1. Saca 9 Humurus y Cubitus != 9 -> Gana H
        //2. Saca 9 Cubitus y Humerus != 9 -> Gana C
        //3. Sacan 9 los dos -> Empate
        //4.1 Sacan != 9 los dos y Humerus > Cubitus -> Gana H
        //4.2 Sacan != 9 los dos y Cubitus > Humerus -> Gana C
        //4.3 Sacan != 9 los dos y Cubitus == Humerus -> Empate

        int CountCubitus = 0 ;
        int CountHumerus = 0 ;
        for (int i = 1; i <=10 ; i++) {
            int dadoCubitus = generarNumero(1,20);
            int dadoHumerus = generarNumero(1,20);

            if ((dadoHumerus == 9 && dadoCubitus !=9) || ((dadoCubitus !=9 && dadoHumerus !=9) && dadoHumerus>dadoCubitus)) {
                System.out.println("El dado de Humerus es :" + dadoHumerus);
                System.out.println("El dado de Cubitus es :" + dadoCubitus);
                System.out.println("Gana humerus");
                System.out.println();
                CountHumerus++;
            } else if ((dadoCubitus == 9 && dadoHumerus !=9) || ((dadoHumerus !=9 && dadoCubitus !=9) && dadoCubitus>dadoHumerus))  {
                System.out.println("El dado de Humerus es :" + dadoHumerus);
                System.out.println("El dado de Cubitus es :" + dadoCubitus);
                System.out.println("Gana Cubitus");
                System.out.println();
                CountCubitus++;
            }else if (dadoCubitus==dadoHumerus){
                System.out.println("El dado de Humerus es :" + dadoHumerus);
                System.out.println("El dado de Cubitus es :" + dadoCubitus);
                System.out.println("Empatan");
                System.out.println();
            }
        }

        if (CountHumerus > CountCubitus) {
            System.out.println("Gana Humerus");
        } else if (CountHumerus==CountCubitus) {
            System.out.println("Empatan");
        }else {
            System.out.println("Gana Cubitus");
        }

        System.out.println("Partidas Ganadas de Humerus " + CountHumerus);
        System.out.println("Partidas Ganadas de Cubitus " + CountCubitus);
    }
    }
