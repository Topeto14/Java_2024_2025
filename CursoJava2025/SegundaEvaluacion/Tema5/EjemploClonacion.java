package SegundaEvaluacion.Tema5;

public class EjemploClonacion {
    public static void main(String[] args) throws CloneNotSupportedException {

        Rectangulo r1 = new Rectangulo(1.1,2.2);
        Rectangulo r2 = new Rectangulo(r1); //Constructor copia

        Rectangulo r3 = r2; //Intentar no hacerlo

        r2.setAlto(3.3);

        System.out.println(r1);
        System.out.println(r2);

        if (r1 == r2) { // == Compara si son la misma referencia en memoria
            System.out.println("Iguales");
        } else {
            System.out.println("Diferentes");
        }

        if (r3 == r2) {
            System.out.println("Iguales");
        } else {
            System.out.println("Diferentes");
        }
    }
}
