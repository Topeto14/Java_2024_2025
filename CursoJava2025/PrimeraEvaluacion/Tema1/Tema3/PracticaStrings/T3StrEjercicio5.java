/*
  5. Diseña un programa en Java que solicite al usuario una cadena de caracteres y muestre por pantalla un
  conteo de cuántas vocales, consonantes y espacios en blanco contiene la cadena introducida.
*/

public class T3StrEjercicio5 {
  
  public static void main(String[] args) {

    try {

      int numEspacios = 0;
      int numVocales = 0;

      // Ingresar cadena para contar caracteres
      System.out.println("Ingrese la cadena:");
      String frase = System.console().readLine();

      // Por cada caracter comparar si es espacio o vocal las consonantes se calculan dada la suma de espacios mas vocales menos la cantidad de caracteres del string
      for (int i = 0; i < frase.length(); i++) {
        
        if (frase.charAt(i) == ' ') numEspacios++;
        if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') numVocales++;

      }

      System.out.println("La cantidad de espacios que hay en la frase " + frase + " son " + numEspacios + " espacios.");
      System.out.println("La cantidad de vocales que hay en la frase " + frase + " son " + numVocales + " vocales.");
      System.out.println("La cantidad de consonantes que hay en la frase " + frase + " son " + (frase.length() - (numEspacios + numVocales)) + " consonates.");

    } catch (Exception e) {

      System.out.println("Error: " + e);

    }

  }

}