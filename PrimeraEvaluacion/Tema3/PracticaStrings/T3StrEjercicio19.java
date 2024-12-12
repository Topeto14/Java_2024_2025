/*
  5. Realiza un programa que cree 100 números aleatorios entre 1 y 1000 y que muestre los 10 mayores 
*/

import java.util.Arrays;

public class T3StrEjercicio19 {

  // Funcion para devolver un numero entre 1 y 1000
  public static int genNum () {
    return (int) Math.ceil(Math.random() * 1000);
  }

  // Pintar matriz
  public static void pintarMatriz (int[] nums) {
    
    System.out.println("La matriz es: " + Arrays.toString(nums));

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

  // Funcion que devuelve los 10 numeros mayores del array
  public static int[] devolver10NumsMayores (int[] nums) {
    
    int[] mayores = new int[10];

    ordenarArray(nums);

    for (int i = 0; i < mayores.length; i++) {
      
      mayores[i] = nums[nums.length - 1 -i];

    }

    return mayores;

  }

  
  public static void main(String[] args) {

    int[] nums = new int[1000];

    rellenarArray(nums);

    pintarMatriz(nums);

    System.out.println();

    System.out.println("Los 10 numeros mas grandes son: " + Arrays.toString(devolver10NumsMayores(nums)));

  }

}