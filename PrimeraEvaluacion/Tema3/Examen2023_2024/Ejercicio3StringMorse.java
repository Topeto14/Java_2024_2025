package Tema3.Examen2023_2024;
/*
  Vamos a implementar funciones para usar Morse. En primer lugar, te pongo la
  equivalencia de las letras a caracteres Morse.
  Tienes que implementar una función convertirAMorse que reciba como
  parámetro una cadena de texto en español y devolver un String con la
  misma cadena, pero traducida a Morse. Los espacios entre palabras ponlos
  con el carácter “#”. Cada letra Morse la separaremos por un espacio.
  Pruébala. Ej: “hola mundo”  “…. --- .-.. .-#-- ..- -. -.. ---“
  Ahora vas a realizar una función que haga lo contrario convertirDeMorse
  que reciba una cadena con un texto en Morse, las palabras separadas por el
  carácter “#” y debes pintar el texto original en español. Además, para leer
  bien cada letra Morse, irá separada por un espacio.
  Recuerda que puedes usar indexOf pasándole un segundo parámetro que te
  diga a partir de donde buscar. Intenta hacer el ejercicio al principio solo con
  una palabra, y cuando lo tengas prueba a hacerlo con más de una palabra.
  Pista: para la equivalencia construye dos arrays de Strings, uno con las letras
  y otro con las traducciones a Morse. Al estar en la misma posición, tienes la
  traducción. Como un diccionario.
*/

public class Ejercicio3StringMorse {
    // Funcion que busca una letra en el array y devuelve la posicion
    public static int buscarPosAbecedario (String[] abecedario, String palabraABuscar) {

        for (int i = 0; i < abecedario.length; i++) {
            if (abecedario[i].equals(palabraABuscar)) return i;
        }
        return -1;

    }

    // Funcion que convierte de morse a español
    public static String convertirDeMorse (String[] abecedario, String[] abcMorse, String cadenaAConvertir) {

        StringBuilder cadConvertida = new StringBuilder();

        String[] arrayAConvertir = cadenaAConvertir.split(" ");

        for (int i = 0; i < arrayAConvertir.length; i++) {
            if (buscarPosAbecedario(abcMorse, arrayAConvertir[i]) != -1) cadConvertida.append(abecedario[buscarPosAbecedario(abcMorse, arrayAConvertir[i])]);
                // Si la funcion buscarPosAbecedario devuelve -1 entonces spliteamos el string por # y agregamos las letras separadas por un espacio
            else {
                String[] letrasConEspacios = arrayAConvertir[i].split("#");
                for (int j = 0; j < letrasConEspacios.length; j++) {
                    cadConvertida.append(abecedario[buscarPosAbecedario(abcMorse, letrasConEspacios[j])]);
                    if (j == 0) cadConvertida.append(" ");
                }
            }
        }

        return cadConvertida.toString();

    }

    // Funcion que convierte de morse a español
    public static String convertirAMorse (String[] abecedario, String[] abcMorse, String cadenaAConvertir) {

        StringBuilder cadConvertida = new StringBuilder();

        String[] arrayAConvertir = cadenaAConvertir.split("");

        for (int i = 0; i < arrayAConvertir.length; i++) {
            // Si en la posicio i hay un espacio mete un # si no, mete el codigo morse, si i + 1 es un espacio no hace nada, si no mete un espacio
            if (arrayAConvertir[i].equals(" ")) cadConvertida.append("#");
            else cadConvertida.append(abcMorse[buscarPosAbecedario(abecedario, arrayAConvertir[i])]);
            if (i + 1 < arrayAConvertir.length -1 && arrayAConvertir[i + 1].equals(" ")) continue;
            else if (!arrayAConvertir[i].equals(" ")) cadConvertida.append(" ");

        }

        return cadConvertida.toString();

    }

    public static void main(String[] args) {

        String[] letrasAbecedario = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, letrasEnMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        String holaMundoMorse = convertirAMorse(letrasAbecedario, letrasEnMorse, "Hola Mundo asd".toLowerCase());

        System.out.println("La palabra Hola mundo traducida a morse es: " + holaMundoMorse);
        System.out.println("En morse esto " + holaMundoMorse + " significa " + convertirDeMorse(letrasAbecedario, letrasEnMorse, holaMundoMorse));


    }

}
