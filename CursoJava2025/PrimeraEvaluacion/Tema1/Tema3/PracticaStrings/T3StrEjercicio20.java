/*
  6. Realiza un programa que cree un vector de 100 posiciones con números aleatorios entre 1 y 100. Una
  vez creado el vector, el programa deberá ordenarlo y mostrar los números entre 1 y 100 que no han
  sido almacenados. Ten en cuenta a la hora de buscar un número en un array que no tienes que
  comparar con todo el array puesto que ya está ordenado.
*/

import java.util.Arrays;

public class T3StrEjercicio20 {

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

  // Pintar matriz
  public static void pintarMatriz (int[] nums) {
    
    System.out.println("La matriz es: " + Arrays.toString(nums));

  }

  // Comprueba en el array pasado por parametros si esta el numero pasado por parametro
  public static boolean hayCoincidencias (int[] array, int n) {

    for (int i = 0; i < array.length; i++) {
      
      if (array[i] == n) return true;

    }

    return false;
    
  }
  
  public static void main(String[] args) {

    int[] nums = new int[100];
    
    rellenarArray(nums);

    ordenarArray(nums);

    // Bucle que pasa por todos los numeros del 1 al 100 y comprueba si esta en el array, si no esta lo imprime por terminal
    for (int i = 1; i <= 100; i++) {
      
      if (!hayCoincidencias(nums, i)) System.out.println("El numero " + i + " no esta en el array generado");

    }

    pintarMatriz(nums);

  }

}