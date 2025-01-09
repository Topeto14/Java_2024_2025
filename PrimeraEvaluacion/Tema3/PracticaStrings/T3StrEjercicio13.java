/*
  13. Encontrar la palabra de mayor longitud de este texto: “No se me ocurre ninguna frase larga”.
*/

public class T3StrEjercicio13 {
  
  public static void main(String[] args) {

    try {

      int posPalabra = -1;
      int contadorMaxLetras = 0;
      String[] frase = "No se me ocurre ninguna frase larga".split(" ");
      
      // For para recorrer el array creado al splitear la frase y si hay el lenght de la palabra es mayor que contadorMaxLetras se guarda la posicion de la palabra
      for (int i = 0; i < frase.length; i++) {
        
        if (frase[i].length() > contadorMaxLetras) {
          contadorMaxLetras = frase[i].length();
          posPalabra = i;
        }

      }

      System.out.println("La palabra mas larga es: " + frase[posPalabra]);
    
    } catch (Exception e) {
    
        System.out.println("Error: " + e);
    
    }

  }

}