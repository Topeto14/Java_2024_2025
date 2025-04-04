package TerceraEvaluacion.Tema7Parte1.listas.repaso.collections;

public class Test {
    public static void main(String[] args) {
        System.out.println("Baraja francesa");
        Baraja bf = new Baraja();
        System.out.println(bf);

        System.out.println(bf.sacarAbajo());
        System.out.println(bf.sacarAbajo());
        System.out.println(bf.sacarArriba());

        bf.ordenarPorNumero();
        System.out.println(bf);

        bf.ordenarPorPalo();
        System.out.println(bf);

    }
}
