/*
  11. Elimina los espacios (intermedios también) de una cadena de texto.
*/

public class T3StrEjercicio11 {
  
  public static void main(String[] args) {

    try {
    
      System.out.println("Ingrese la cadena a la que le quiere quitar los espacios:");
      String cad = System.console().readLine();

      // Reemplazar los espacios por nada
      String cadMod = cad.replace(" ", "");

      System.out.println(cadMod);
    
    } catch (Exception e) {
    
      System.out.println("Error " + e);
    
    }

  }

}