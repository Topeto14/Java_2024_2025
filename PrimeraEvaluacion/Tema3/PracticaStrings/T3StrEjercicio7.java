/*
  7. Cuenta las vocales del texto “Me gusta programar en Java los sábados por la mañana”
*/

public class T3StrEjercicio7 {
  
  public static void main(String[] args) {

    String texto = "Me gusta programar en Java los sábados por la mañana";
    int nVocales = 0;

    // For para contar vocales
    for (int i = 0; i < texto.length(); i++) {
      if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u') nVocales++;
      if (texto.charAt(i) == 'á' || texto.charAt(i) == 'é' || texto.charAt(i) == 'í' || texto.charAt(i) == 'ó' || texto.charAt(i) == 'ú') nVocales++;
      if (texto.charAt(i) == 'A' || texto.charAt(i) == 'E' || texto.charAt(i) == 'I' || texto.charAt(i) == 'O' || texto.charAt(i) == 'U') nVocales++;
      if (texto.charAt(i) == 'Á' || texto.charAt(i) == 'É' || texto.charAt(i) == 'Í' || texto.charAt(i) == 'Ó' || texto.charAt(i) == 'Ú') nVocales++;
    }

    System.out.println("La cantidad de vocales que hay en la frase es: " + nVocales + " vocales.");

  }

}