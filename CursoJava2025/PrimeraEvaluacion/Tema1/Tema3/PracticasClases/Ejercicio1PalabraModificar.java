package PrimeraEvaluacion.Tema1.Tema3.PracticasClases;

public class Ejercicio1PalabraModificar {
    // Funcion para sustituir vocales en una cadena recorriendo la cadena e insertando los valores en un StringBuilder
    public static String sustituirVocales (String cad, String vocal) {

        StringBuilder cadMod = new StringBuilder();

        for (int i = 0; i < cad.length(); i++) {

            if (cad.charAt(i) == 'A' || cad.charAt(i) == 'E' || cad.charAt(i) == 'I' || cad.charAt(i) == 'O' || cad.charAt(i) == 'U') cadMod.append(vocal.toUpperCase());
            else if (cad.charAt(i) == 'a' || cad.charAt(i) == 'e' || cad.charAt(i) == 'i' || cad.charAt(i) == 'o' || cad.charAt(i) == 'u') cadMod.append(vocal);
            else cadMod.append(cad.charAt(i));

        }

        return cadMod.toString();

    }

    public static void main(String[] args) {

        String vocal = "";

        // Pedir cadena a cambiar
        System.out.println("Ingresa la cadena a modificar:");
        String cadena = System.console().readLine();

        // Mientras que la vocal no se una sola vocal pedir de nuevo
        do {

            try {

                System.out.println("Ingrese la vocal por la que quiere cambiar las vocales de la cadena:");
                vocal = System.console().readLine();

                if (vocal.length() != 1) throw new Exception("Debe ser solo una vocal");
                if (!(vocal.equals("a")) && !(vocal.equals("e")) && !(vocal.equals("i")) && !(vocal.equals("o")) && !(vocal.equals("u"))) throw new Exception("Ingrese una vocal en minuscula");

            } catch (Exception ex) {

                System.out.println("Error: " + ex.getMessage());

            }

        } while (vocal.length() != 1 || (!(vocal.equals("a")) && !(vocal.equals("e")) && !(vocal.equals("i")) && !(vocal.equals("o")) && !(vocal.equals("u"))));

        // Imprimir cad sin modificar y modificada
        System.out.println("La cadena ingresada es: " + cadena);
        System.out.println("La cadena con la vocales sustituidas por la vocal " + vocal + " es: " + sustituirVocales(cadena, vocal));

    }
}
