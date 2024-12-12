package Tema3.EjercicioEntregarString;

public class Ejercicio6Palíndromo {
    // Metodo que compara si la cadena ingresada es igual a cadena dada la vuelta
    public static boolean esPalindromo (StringBuilder cadena) {
        return (cadena.toString().equals(cadena.reverse().toString()));
    }

    public static void main(String[] args) {

        try {

            System.out.println("Ingresa una cadena y te dire si es palindromo:");
            StringBuilder cad = new StringBuilder(System.console().readLine());

            if (esPalindromo(cad)) System.out.println("La cadena ingresada es un palindromo");
            else System.out.println("La cadena ingresada no es un palindromo");

        } catch (Exception e) {

            System.out.println("Error: " + e);

        }

    }

}
