package PrimeraEvaluacion.Tema1.Tema3.EjercicioEntregarArray;
import java.util.Arrays;
public class Ejercicio19PilaInsertar {
    // Funcion para crear una pila vacia, la pila tiene que rellenarse de - para considerarse vacia
    public static String[] crearPilaVacia () {

        String[] pila = new String[20];

        Arrays.fill(pila, "-");

        return pila;

    }

    // Funcion que comprueba si la pila esta vacia, es decir esta rellena de -
    public static boolean estaPilaLlena (String[] pila) {

        for (int i = 0; i < pila.length; i++) {

            if (pila[i] == "-") return false;

        }

        return true;

    }

    // Sacar una palabra de la pila y mostrarla
    public static void sacarPalabraPila (String[] pila) {

        System.out.println("La palabra que se ha sacado de la pila es: " + pila[0]);

        for (int i = 0; i < pila.length - 1; i++) {

            pila[i] = pila[i + 1];

        }

    }

    // Funcion para mostrar pila por terminal
    public static void mostrarPila (String[] pila) {

        System.out.println(Arrays.toString(pila));

    }

    // Añadir una palabra a la pila
    public static void addPalabraPila (String[] pila, String palabra) throws Exception {

        if (estaPilaLlena(pila)) throw new Exception("No se puede agregar la palabra " + palabra + " porque la pila esta llena, saquele alguna palabra.");

        for (int i = pila.length - 1; i > 0; i--) {

            pila[i] = pila[i - 1];

        }

        pila[0] = palabra;

        System.out.println("La palabra " + palabra + " ha sido agregada correctamente.");

    }

    /*
      19. Implementación de una Pila con un vector de 20 elementos. Una Pila se basa en el concepto “Primero en entrar
      Último en salir”. De modo que se saca siempre el último que se añadió. Implementa métodos para crear una pila
      vacía, insertar elemento en la pila, sacar elemento de la pila (lo muestra y lo quita), comprobar si la pila está
      llena.
    */
    public static void main(String[] args) {

        int opcionMenu = 0;
        String palabra = "";

        String[] pila = crearPilaVacia();
        System.out.println("Se acaba de crear una pila para que puedas jugar con ella.");
        System.out.println();

        // Mostrar menu hasta que se inserte un 5
        do {
            try {

                System.out.println();
                System.out.println("---- Menu ----");
                System.out.println("1. Añadir palabra a la pila");
                System.out.println("2. Sacar palabra de la pila y mostrarla");
                System.out.println("3. Ver si la pila esta llena");
                System.out.println("4. Mostrar la pila");
                System.out.println("5. Salir del programa");

                opcionMenu = Integer.parseInt(System.console().readLine());

                if (opcionMenu < 1 || opcionMenu > 5) throw new Exception("La opcion del menu ingresada no existe, por favor ingrese un correcta");

                switch (opcionMenu) {
                    case 1:
                        System.out.println("Que palabra quieres añadir a la pila");
                        palabra = System.console().readLine();
                        addPalabraPila(pila, palabra);
                        break;
                    case 2:
                        sacarPalabraPila(pila);
                        break;
                    case 3:
                        if (estaPilaLlena(pila)) System.out.println("La pila esta llena");
                        else System.out.println("La pila no esta llena");
                        break;
                    case 4:
                        mostrarPila(pila);
                        break;
                    default:
                        System.out.println("Saliendo...");
                        break;
                }
            } catch (Exception e) {

                System.out.println("Error: " + e);

            }

        } while (opcionMenu != 5);


    }

}
