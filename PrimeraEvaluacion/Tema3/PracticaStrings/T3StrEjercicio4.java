/*
  4. Crea un programa en Java que solicite al usuario dos cadenas de caracteres y que devuelva la primera
  cadena, pero transformando en mayúsculas la parte que coincide con la segunda cadena introducida.
  Por ejemplo, si se introducen las cadenas “Esta es mi amiga Ana” y “amiga” devolverá “Esta es mi
  AMIGA Ana”
*/

public class T3StrEjercicio4 {
  
  public static void main(String[] args) {

    try {

      // Ingresar cadena y cadena a buscar
      System.out.println("Ingrese la cadena:");
      StringBuilder frase = new StringBuilder(System.console().readLine());

      System.out.println("Ingrese la cadena a buscar");
      String fraseABuscar = System.console().readLine();

      int pos = 0;

      // Bucle que busca la cadena a buscar en la primera cadena subiendo el numero pos con la posicion en que se encuentra mas 1
      do {

        pos = frase.indexOf(fraseABuscar, pos);
        
        
        // Reemplazar la frase buscada por la frase buscada en mayus
        frase.replace(pos, pos + fraseABuscar.length(), fraseABuscar.toUpperCase());
        
      } while (frase.indexOf(fraseABuscar, pos) != -1);

      System.out.println(frase);

    } catch (Exception e) {

      System.out.println("Error: " + e);

    } 

  }

}