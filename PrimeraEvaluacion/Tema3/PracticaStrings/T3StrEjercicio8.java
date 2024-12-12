/*
  8. Divide la cadena “http://www.iesjaroso.es/noticias” en “http”, “www.iesjaroso.es”, “noticias”.
*/

public class T3StrEjercicio8 {
  
  public static void main(String[] args) {

    // Reemplazar el :/ por nada y splitear la url por cada /
    String[] url = "http://www.iesjaroso.es/noticias".replace(":/", "").split("/");
    
    for (int i = 0; i < url.length; i++) {
      
      System.out.println(url[i]);

    }

  }

}