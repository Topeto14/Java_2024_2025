/*
  1. Realiza un programa que cree un array de 50 posiciones cargado con valores aleatorios. Los valores
  aleatorios deberán estar entre el 1 y el 100. Una vez cargado el vector, deberá ordenarlo mediante el
  método de la burbuja y mostrarlo ordenado por pantalla. Para el método de la burbuja deberás crear
  una función que reciba un array de números y lo devuelva ordenado.
*/

import java.util.Arrays;

public class T3StrEjercicio15 {

  // Funcion para devolver un numero entre 1 y 100
  public static int genNum () {
    return (int) Math.ceil(Math.random() * 100);
  }

  // Funcion para ordenar los numeros por parejas hasta que esten todos ordenados
  public static void ordenarArray (int[] nums) {

    int temp;
    
    for (int i = 0; i < nums.length; i++) {
      
      for (int j = 0; j < nums.length - 1; j++) {
        
        // Si el numero de la izquierda es mayor los intercambia sino los deja igual
        if (nums[j] > nums[j + 1]) {

          temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;

        }

      }

    }
  
  }
  
  public static void main(String[] args) {

    int[] nums = new int[50];

    for (int i = 0; i < nums.length; i++) {
      
      nums[i] = genNum();

    }

    System.out.println("El array sin ordenar es: " + Arrays.toString(nums));

    System.out.println();

    ordenarArray(nums);
    System.out.println("El array ordenado es: " + Arrays.toString(nums));

  }

}