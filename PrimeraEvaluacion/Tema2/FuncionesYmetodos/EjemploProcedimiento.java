package Tema2.FuncionesYmetodos;

public class EjemploProcedimiento {
    //Declaración del procedimiento
    public static void imprimeNumero(int numero) {
        String mensaje = "El número generado es ";
        System.out.println(mensaje + numero);
    }

    public static int generarNumeroAleatorio(int mayor, int menor) {
        int numero = (int) (Math.random() * (mayor - menor + 1)) + menor;

        return numero;
    }

    public static int mayor(int a, int b) {
        if (a > b)
            return a;
        else if (a < b)
            return b;
        else
            return a;
    }

    public static int mayor(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else if (c > a && c > b)
            return c;
        else //los tres iguales
            return a;
    }

    public static int mayorMejorado(int a, int b, int c) {
        return mayor(a, b, mayor(a, c));
    }

    public static int mayorEntreCuatro(int a, int b, int c, int d) {
        return mayor(mayor(a,b), mayor(c,d));
    }

    public static void main(String[] args) {
        //Genera tres números aleatorios y dime el mayor

        int tirada1;
        int tirada2;
        int tirada3;
        int mayor=0;
        int numero=4;

        tirada1 = generarNumeroAleatorio(1000,1);
        tirada2 = generarNumeroAleatorio(1000, 1);
        tirada3 = generarNumeroAleatorio(1000, 1);

        //Invocación del procedimiento
        imprimeNumero(tirada1);
        imprimeNumero(tirada2);
        imprimeNumero(tirada3);

        System.out.println(mayorMejorado(tirada1, tirada2, tirada3));

    }
}
