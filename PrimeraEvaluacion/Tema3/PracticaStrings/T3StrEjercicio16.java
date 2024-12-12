/*
  2. Mejora el método de la burbuja explicado anteriormente y utiliza una variable a modo de centinela o
  flag, de tal manera que ésta se active cuando hay algún intercambio. En el momento que no haya
  ningún intercambio, el algoritmo debería parar puesto que el vector ya está ordenado.
*/

import java.util.Arrays;

public class T3StrEjercicio16 {

  // Funcion para devolver un numero entre 1 y 100
  public static int genNum () {
    return (int) Math.ceil(Math.random() * 100);
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