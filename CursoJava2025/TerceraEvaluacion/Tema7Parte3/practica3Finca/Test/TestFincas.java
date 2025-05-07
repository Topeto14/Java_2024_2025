package TerceraEvaluacion.Tema7Parte3.practica3Finca.Test;

import TerceraEvaluacion.Tema7Parte3.practica3Finca.io.DAOFinca;
import TerceraEvaluacion.Tema7Parte3.practica3Finca.io.DAOLectura;

import java.time.LocalDate;
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

        System.out.println("Fincas por ciudad");
        DAOFinca.getFincasPorCiudad().forEach((k, v) -> System.out.println(k + ": " + v) );
        System.out.println("----------------------------------------------------------------");
        System.out.println("Fincas entre 50 y 150 metros cuadrados");
        DAOFinca.getFincasMedio().forEach(System.out::println);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Lecturas por finca");
        DAOLectura.getLectrurasPorFinca().forEach((k, v) -> System.out.println(k + ": " + v) );
        System.out.println("----------------------------------------------------------------");
        System.out.println("Temperatura máxima finca");
        System.out.println(DAOLectura.getTempMaximaFinca(30));
        System.out.println("----------------------------------------------------------------");
        System.out.println("Temperatura mínima finca");
        System.out.println(DAOLectura.getTempMinimaFinca(2));
        System.out.println("----------------------------------------------------------------");
        System.out.println("Humedad finca");
        System.out.println(DAOLectura.getHunedadPorFinca(5));
        System.out.println("----------------------------------------------------------------");
        System.out.println("Temperatura finca");
        System.out.println(DAOLectura.getTemperaturaPorFinca(10));
        System.out.println("----------------------------------------------------------------");
        /**System.out.println("Temperatura finca en un dia especifico");
        DAOLectura.getTemperaturaPorFinca(10, LocalDate.of(2023, 7, 20))
                .forEach(System.out::println);
        System.out.println("----------------------------------------------------------------");*/


    }
}
