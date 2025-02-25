package SegundaEvaluacion.Tema5;

public class EjemploObject {
    public static void main(String[] args)  {

        Rectangulo r1 = new Rectangulo(1.1, 2.2);
        Rectangulo r2 = new Rectangulo(1.1, 2.2);
        Rectangulo r3 = r1; //r3 y r1 apuntan al mismo objeto en la memoria
        //Si cambia r3 cambia r1
        //r3.setAlto(1.0);
        System.out.println(r1);

        if (r1.equals(r3)) {
            System.out.println("Son iguales");  //Sí, pues son el mismo objeto
        } else {
            System.out.println("Son diferentes");
        }
        if (r1.equals(r2)) {
            System.out.println("Son iguales"); //Sí pues al implementar equals en
            //Rectangulo tienen el mismo alto y ancho
        } else {
            System.out.println("Son diferentes");
        }

        r1 = null; //Liberar un objeto -> el recolector de basura libería la memoria

        Object o = new Object();
        System.out.println(o.toString());


    }


}
