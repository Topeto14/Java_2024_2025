package TerceraEvaluacion.Tema7Parte3.practica3Finca.Test;

import TerceraEvaluacion.Tema7Parte3.practica3Finca.io.DAOFinca;
import TerceraEvaluacion.Tema7Parte3.practica3Finca.io.DAOLectura;

import java.util.Scanner;



public class TestFincas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            new DAOFinca();
            new DAOLectura();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("----Fincas ordenadas por superficies-----");
        DAOFinca.getFincasPorSuperficie().forEach(System.out::println);

        System.out.println("---- 3 Fincas mas grandes -----");
        DAOFinca.getMasGrandes().forEach(System.out::println);



    }
}
