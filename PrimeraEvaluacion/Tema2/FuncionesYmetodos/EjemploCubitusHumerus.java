package Tema2.FuncionesYmetodos;

public class EjemploCubitusHumerus {
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
    public static void main(String[] args) {
        //Tiren dos dados de 20 caras y gana el mayor
        int tirada1 = generarNumeroAleatorio(20,1);
        int tirada2 = generarNumeroAleatorio(20,1);
        System.out.println("Cubitus " + tirada1);
        System.out.println("Humerus " + tirada2);

        System.out.println(mayor(tirada1,tirada2));
    }
}
