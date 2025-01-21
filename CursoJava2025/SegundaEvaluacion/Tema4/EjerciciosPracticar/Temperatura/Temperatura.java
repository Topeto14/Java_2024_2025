package SegundaEvaluacion.Tema4.EjerciciosPracticar.Temperatura;

public class Temperatura {

    // Methods
    public static double celsiusToFarenheit (double celsius) {
        double F = (1.8)* celsius +32 ;
        return F;
    }
    public static  double farenheitToCelsius (double farenheit) {
        double C = (farenheit-32)*1.8;
        return C;
    }
}
