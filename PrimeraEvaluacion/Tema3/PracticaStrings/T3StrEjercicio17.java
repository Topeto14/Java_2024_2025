/*
  3. Realiza un método que tome como parámetros de entrada dos arrays de enteros y devuelva como
  salida un único array con los dos elementos de los anteriores arrays ordenados de forma ascendente.
*/

import java.util.Arrays;

public class T3StrEjercicio17 {

  // Funcion para devolver un numero entre 1 y 100
  public static int genNum () {
    return (int) Math.ceil(Math.random() * 100);
  }

  // Rellenar arrays pasado por parametro con numeros aleatorios
  public static void rellenarArray (int[] nums) {
    
    for (int i = 0; i < nums.length; i++) {
      
      nums[i] = genNum();

    }

  }

  // Funcion para ordenar los numeros por parejas hasta que esten todos ordenados
  public static void ordenarArray (int[] nums) {

    int temp, contador = 0;
    
    for (int i = 0; i < nums.length; i++) {
      
      for (int j = 0; j < nums.length - 1; j++) {
        
        // Si el numero de la izquierda es mayor los intercambia sino los deja igual
        if (nums[j] > nums[j + 1]) {

          temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;

        } else contador++;

      }
      
      // Si contador vale nums.length - 1 rompe el bucle porque quiere decir que esta ordenado
      if (contador == nums.length -1) break;
      else contador = 0;

    }
  
  }

  // Funcion que ordena dos arrays pasadas por parametros en un solo array
  public static int[] unirArraysYOrdenar (int[] array1, int[] array2) {

    int[] arrayUnion = new int[array1.length + array2.length];
    
    for (int i = 0; i < array1.length; i++) {
      
      arrayUnion[i] = array1[i];

    }

    int pos = array1.length;

    for (int i = 0; i < array2.length; i++) {
      
      arrayUnion[pos] = array2[i];
      pos++;

    }

    ordenarArray(arrayUnion);

    return arrayUnion;
    
  }
  
  public static void main(String[] args) {

    int[] nums1 = new int[25], nums2 = new int[20];

    // Rellenar arrays llamando a la funcion rellenarArray
    rellenarArray(nums1);
    rellenarArray(nums2);

    System.out.println("El array 1 es: " + Arrays.toString(nums1));
    System.out.println("El array 2 es: " + Arrays.toString(nums2));

    System.out.println();

    System.out.println("El array que junta los dos arrays y los ordena es: " + Arrays.toString(unirArraysYOrdenar(nums1, nums2)));

  }

}