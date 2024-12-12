/*
  9. Crear una cadena de texto formada por tres cadenas “una”, “dos” y “tres” usando StringBuilder
*/

public class T3StrEjercicio9 {
  
  public static void main(String[] args) {

    String uno = "asd", dos = "asd2", tres = "asd3";
    StringBuilder cadena = new StringBuilder();

    // Meter las cadenas uno dos y tres ene la variable cadena con el metodo append
    cadena.append(uno);
    cadena.append(dos);
    cadena.append(tres);

    System.out.println("La cadena es: " + cadena);
 
  }

}