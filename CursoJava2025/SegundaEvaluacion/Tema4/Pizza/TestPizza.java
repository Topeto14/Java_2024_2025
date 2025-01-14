package SegundaEvaluacion.Tema4.Pizza;

public class TestPizza {
    public static void main(String[] args) {

        Pizza pz1 = new Pizza(Pizza.Size.MEDIANA, Pizza.Tipo.BARBACOA);
        Pizza pz2 = new Pizza(Pizza.Size.FAMILIAR, Pizza.Tipo.CUATROQUESOS);

        System.out.println(pz1);
        System.out.println(pz2);

        pz1.sirve();
        pz1.sirve();
        pz2.sirve();

        System.out.println(pz1);
        System.out.println(pz2);


        System.out.println("Pizzas pedidas: " + Pizza.getTotalPedidas());
        System.out.println("Pizzas servidas: " + Pizza.getTotalServidas());

    }
}
