/*
  10. Compara estos dos Strings sin tener en cuenta mayúsculas “Esta tarde no voy”, “esta tarde no VOY”.
*/

public class T3StrEjercicio10 {
  
  public static void main(String[] args) {

    try {

      // Pedir por terminal las cadenas y pasarlas a minusculas
      System.out.println("Ingrese la cadena 1 a comparar:");
      String cad1 = System.console().readLine().toLowerCase();

      System.out.println("Ingrese la cadena 2 a comparar:");
      String cad2 = System.console().readLine().toLowerCase();

      // Comparar si son iguales
      if (cad2.equals(cad1)) System.out.println("Las cadenas son iguales al pasarlas a minusculas");
      else System.out.println("Las cadenas no son iguales al pasarlas a minusculas");
      
    } catch (Exception e) {
      
      System.out.println("Error: " + e);

    }

  }

}