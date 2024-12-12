package PrimeraEvaluacion.Tema1.Tema2.Dados;

public class CubitusHumerus2 {
    public static int generarNumero(int min,int max ){
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static void main(String[] args) {
        //Nuestros dos romanos favoritos juegan a los dados
        //Cada uno tira dos dados
        //Gana aquel de los dos cuya suma de sus dados sea mayor, o
        //aquel cuyos dos dados sean iguales
        //Juega 20 rondas y dime quién gana

        // 1. si total dados cubitus > total dados humerus : Gana Cubitus
        // 1.1 si dadocubitus1 = dadocubitus2 : Gana Cubitus
        // 2. si total dados humerus > total dados cubitus : Gana Humerus
        // 2.1 si dadohumerus1 = dadohumerus2 : Gana Humerus
        // 3 si totalDadoCubitu == totalDadoHumerus || dadoCubitus1 == dadoCubitus2 && dadoHumerus1 == dadoHumerus2 : Empatan

        int totalDadoCubitus = 0;
        int totalDadoHumerus = 0;

        int countDadoCubitus = 0;
        int countDadoHumerus = 0;

        for (int i = 0; i < 20; i++) {
            int dadoCubitus1 = generarNumero(1,6);
            int dadoCubitus2= generarNumero(1,6);
            totalDadoCubitus = dadoCubitus1 + dadoCubitus2;

            int dadoHumerus1= generarNumero(1,6);
            int dadoHumerus2 = generarNumero(2,6);
            totalDadoHumerus = dadoHumerus1 + dadoHumerus2;


            if ((totalDadoCubitus > totalDadoHumerus) || (dadoCubitus1 == dadoCubitus2)) {
                System.out.println(" Primer Dado de cubito " + dadoCubitus1 + " Segundo dado de cubitus " + dadoCubitus2 + " La suma total es :" + totalDadoCubitus);
                System.out.println(" Primer Dado de Humerus " + dadoHumerus1 + " Segundo dado de Humerus " + dadoHumerus2 + " La suma total es :" + totalDadoHumerus);
                System.out.println(" GANA Cubitus ");
                System.out.println("------------------" );
                countDadoCubitus++;
            } else if ((totalDadoHumerus > totalDadoCubitus) || (dadoHumerus1 == dadoHumerus2)) {
                System.out.println(" Primer Dado de Cubitus " + dadoCubitus1 + " Segundo dado de cubitus " + dadoCubitus2 + " La suma total es :" + totalDadoCubitus);
                System.out.println(" Primer Dado de Humerus " + dadoHumerus1 + " Segundo dado de Humerus " + dadoHumerus2 + " La suma total es :" + totalDadoHumerus);
                System.out.println(" GANA Humerus ");
                System.out.println("------------------" );
                countDadoHumerus++;
            } else if ((totalDadoCubitus==totalDadoHumerus) || ((dadoCubitus1 == dadoCubitus2) && (dadoHumerus1==dadoHumerus2))) {
                System.out.println(" Primer Dado de Cubitus " + dadoCubitus1 + " Segundo dado de cubitus " + dadoCubitus2 + " La suma total es :" + totalDadoCubitus);
                System.out.println(" Primer Dado de Humerus " + dadoHumerus1 + " Segundo dado de Humerus " + dadoHumerus2 + " La suma total es :" + totalDadoHumerus);
                System.out.println(" Empatan ");
                System.out.println("-------------------");
            }
        }
        if (countDadoCubitus > countDadoHumerus) {
            System.out.println(" Gana Cubitus " + countDadoCubitus + " a " + countDadoHumerus);
        } else if (countDadoHumerus > countDadoCubitus) {
            System.out.println(" Gana Humerus " + countDadoCubitus + " a " + countDadoHumerus);
        } else {
            System.out.println(" Empatan " + countDadoCubitus + " a " +  countDadoHumerus );
        }


    }

}

