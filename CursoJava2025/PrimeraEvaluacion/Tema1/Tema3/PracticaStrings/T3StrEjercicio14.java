/*
  14. Cifrado César. Crea un algoritmo de encriptación que se le pase una frase y una clave (numérica). Lo
  que hará será sumar en ASCII esa clave a cada letra de la frase. Prueba a realizar una función para
  desencriptar. 
*/

public class T3StrEjercicio14 {

  // Funcion para desencritar
  public static String desencriptar (String cadEncriptada, int clave) {

    StringBuilder cadDesencriptada = new StringBuilder();

    for (int i = 0; i < cadEncriptada.length(); i++) {
      
      cadDesencriptada.append((char) (cadEncriptada.charAt(i) - clave));

    }

    return cadDesencriptada.toString();

  }
  
  
  // Funcion para encritar
  public static String encriptar (String cadAEncriptar, int clave) {

    StringBuilder cadEncriptada = new StringBuilder();

    for (int i = 0; i < cadAEncriptar.length(); i++) {
      
      cadEncriptada.append((char) (cadAEncriptar.charAt(i) + clave));

    }

    return cadEncriptada.toString();

  }
  

  
  public static void main(String[] args) {

    try {
      
      // Pedir valores por termina y encriptar la frase y desencriptarla
      System.out.println("Ingrese la frase encriptada: ");
      String cadAEncriptar = System.console().readLine();
      
      System.out.println("Ingrese la clave con la que esta encriptada: ");
      int clave = Integer.parseInt(System.console().readLine());

      String cadEncriptada = encriptar(cadAEncriptar, clave);

      System.out.println(cadEncriptada);

      String cadDesencriptada = desencriptar(cadEncriptada, clave);

      System.out.println(cadDesencriptada);


    
    } catch (Exception e) {
    
        System.out.println("Error: " + e);
    
    }

  }

}