/*
  12. Escribe un método que te devuelva la mitad de una cadena.
*/

public class T3StrEjercicio12 {

  // Devolver la mitad del string ingresado por parametro
  public static StringBuilder devolverMitad (String cad) {

    StringBuilder mitadCad = new StringBuilder(cad.length());

    for (int i = 0; i < cad.length() / 2; i++) {

      mitadCad.append(cad.charAt(i));
      
    }

    return mitadCad;

  }
  
  public static void main(String[] args) {

    try {

      // Pedir la cadena a la que se le va a quitar la mitad y pintarla
      System.out.println("Ingrese la cadena a  la que se le quitara la mitad:");
      System.out.println(devolverMitad(System.console().readLine()));
    
    } catch (Exception e) {
    
        System.out.println("Error: " + e);
    
    }

  }

}