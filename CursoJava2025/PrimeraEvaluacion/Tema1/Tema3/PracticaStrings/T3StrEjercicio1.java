/*
  1. Crea un programa en Java que solicite al usuario la introducción de una cadena de caracteres y
  devuelva esta cadena invertida. Haz dos versiones, una con String y otra con StringBuffer.
*/

public class T3StrEjercicio1 {
  
  public static void main(String[] args) {

    try {
    
      System.out.println("Ingrese la cadena de caracteres a la que le quiere dar la vuelta");
      String palabra = System.console().readLine();

      // Forma con string
      String palabraAlReves = "";

      // Bucle para dar la vuelta a la palabra con el metodo charAt
      for (int i = (palabra.length() - 1); i >= 0; i--) {

        palabraAlReves += palabra.charAt(i);
        
      }

      System.out.println(palabraAlReves);

      // Forma con stringBuffer
      StringBuffer palabraStrBuffer = new StringBuffer(palabra);
      System.out.println(palabraStrBuffer.reverse());
    
    } catch (Exception e) {
    
        System.out.println("Error: " + e);
    
    }


  }

}