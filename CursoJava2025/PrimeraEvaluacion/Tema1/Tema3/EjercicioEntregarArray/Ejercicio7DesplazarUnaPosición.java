package PrimeraEvaluacion.Tema1.Tema3.EjercicioEntregarArray;
import java.util.Arrays;
public class Ejercicio7DesplazarUnaPosición {
    public static int ingresarNum (int pos) throws Exception {

        System.out.println("Ingrese el " + pos + "º numero:");
        return Integer.parseInt(System.console().readLine());

    }
    /*
  7. Crear un programa que lea por teclado una tabla de 5 números enteros y la desplace una posición hacia la
  derecha: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. Igual que el
  anterior, pero desplazando N posiciones (N es un número introducido por el usuario).
*/

    public static void main(String[] args) {

        try {

            int[] nums1 = new int[5];

            System.out.println("Desplazar 1 direccion");
            System.out.println();

            // Bucle para ingresar datos en el array 1
            for (int i = 0; i < nums1.length; i++) {

                nums1[i] = ingresarNum(i + 1);

            }

            System.out.println("El array sin modificar es: " + Arrays.toString(nums1));

            int temp = nums1[nums1.length - 1];

            // Mover valores de un sitio a otro, habiendo antes guardado el valor del array en una variable temp
            for (int i = nums1.length - 1; i >= 0; i--) {

                if (i == 0) nums1[i] = temp;
                else nums1[i] = nums1[i - 1];

            }

            System.out.println("El array modificado es: " + Arrays.toString(nums1));
            System.out.println();

            System.out.println("Desplazando un numero dado por teclado");
            System.out.println();

            int[] nums2 = new int[5];

            // Bucle para ingresar datos en el array 2
            for (int i = 0; i < nums2.length; i++) {

                nums2[i] = ingresarNum(i + 1);

            }

            System.out.println("El array sin modificar es: " + Arrays.toString(nums2));

            System.out.println("Ingrese el desplazamiento de cada numero hacia la derecha");
            int desp = Integer.parseInt(System.console().readLine());

            int[] copiaNums2 = Arrays.copyOfRange(nums2, 0, nums2.length);

            // Si el numero ingresado es mayor que 5 hace el modulo para ahorrar tiempo
            desp %= nums2.length;

            System.out.println(Arrays.toString(copiaNums2));
            // Mover valores de un sitio a otro, habiendo antes guardado el valor del array en una variable temp2
            for (int i = 0; i < nums2.length; i++) {

                nums2[(i + desp) % nums2.length] = copiaNums2[i];

            }

            // Imprimir por terminal el array modificado
            System.out.println("El array modificado es: " + Arrays.toString(nums2));
            System.out.println();

        } catch (Exception e) {

            System.out.println("Error: " + e);

        }

    }

}
