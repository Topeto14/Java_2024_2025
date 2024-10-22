package Tema2.Dados;

public class CubitusHumerus1 {
    public static int generarNumero(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static void main(String[] args) {
        //Dos romanos asediando una ciudad, están aburridos y se ponen a jugar a los dados
        //Cada uno tira un dado de 20 caras
        //Gana el que saca el dado mayor, o el que si alguno de ellos saca el 9
        //Juega una partida y dime quien gana.

        int CountCubitus = 0 ;
        int CountHumerus = 0 ;
        for (int i = 0; i <=10 ; i++) {
            int dadoCubitus = generarNumero(1,20);
            int dadoHumerus = generarNumero(1,20);

            if (dadoHumerus > dadoCubitus || dadoHumerus==9) {
                System.out.println("El dado de Humerus es :" + dadoHumerus);
                System.out.println("El dado de Cubitus es :" + dadoCubitus);
                System.out.println();
                System.out.println("Gana humerus");
                CountHumerus++;
            } else if (dadoCubitus > dadoCubitus || dadoCubitus==9 ) {
                System.out.println("El dado de Humerus es :" + dadoHumerus);
                System.out.println("El dado de Cubitus es :" + dadoCubitus);
                System.out.println();
                System.out.println("Gana Cubitus");
                CountCubitus++;
            }else if (dadoCubitus==dadoHumerus){
                System.out.println("El dado de Humerus es :" + dadoHumerus);
                System.out.println("El dado de Cubitus es :" + dadoCubitus);
                System.out.println();
                System.out.println("Empatan");
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
