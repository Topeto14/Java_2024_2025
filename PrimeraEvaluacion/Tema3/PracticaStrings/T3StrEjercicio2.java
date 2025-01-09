/*
  2. Crea un programa que reciba una cadena de caracteres y la devuelva invertida con efecto espejo, este
  es, se concatena a la palabra original su inversa, compartiendo la última letra, que hará de espejo, por
  lo que la palabra obtenida se lee igual hacia adelante que hacia atrás. Por ejemplo, al introducir
  “teclado” devolverá “tecladodalcet” y al introducir “hola” devolverá “holaloh”. Haz dos versiones, una
  con String y otra con StringBuffer.
*/

public class T3StrEjercicio2 {
  
  public static void main(String[] args) {

    try {
    
      System.out.println("Ingrese la cadena de caracteres a la que le quiere dar la vuelta");
      String palabra = System.console().readLine();

      // Forma con string
      String palabraConEspejo = palabra;

      // Girar el string sin coger la primera letra
      for (int i = (palabra.length() - 2); i >= 0; i--) {

        palabraConEspejo += palabra.charAt(i);
        
      }

      System.out.println(palabraConEspejo);

      // Forma con stringBuffer
      StringBuffer palabraStrBuffer = new StringBuffer(palabra);

      System.out.println(palabraStrBuffer + palabraStrBuffer.reverse().substring(1));
    
    } catch (Exception e) {
    
        System.out.println("Error: " + e);
    
    }

  }

}