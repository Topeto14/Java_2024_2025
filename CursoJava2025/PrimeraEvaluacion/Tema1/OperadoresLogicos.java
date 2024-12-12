package PrimeraEvaluacion.Tema1;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // Operadores lógicos -> operadores de lógica booleana
        // ! -> Negación (true -> false, false -> true)
        // && -> Y LÓGICO (true si los dos valores son true, sino false)
        // || -> O LÓGICO (false si los dos valores son false, sino true)

        //Y LÓGICO
        int edad = 15;
        char sexo = 'h';

        boolean condicion = (edad == 15) && (sexo == 'h'); //true && true = true
        System.out.println(condicion);

        condicion = (edad >= 18) && (sexo == 'h'); //false && true = false
        System.out.println(condicion);

        condicion = (edad >= 16) && (sexo == 'm');  //false && false = false


        //O LÓGICO
        condicion = (edad == 15) || (sexo == 'h'); // true || true = true
        System.out.println(condicion);

        condicion = (edad > 20) || (sexo == 'h'); // false || true = true
        System.out.println(condicion);

        condicion = (edad >= 25) || (sexo == 'm'); // fasle || false = false
        System.out.println(condicion);

        //MEZCLAR ! Y,0
        condicion = ! ((edad >= 15) && (sexo == 'm')); // (true) && (false) -> false,  !false -> true
        System.out.println(condicion);

        condicion = (edad >= 15) && !(sexo == 'm'); // (true) && !(false) -> true && true -> true
        System.out.println(condicion);

        condicion = !((edad < 10) || (sexo == 'c')); // ! (false || false) -> true
        System.out.println(condicion);

        condicion = !(edad < 20) || (sexo == 'h'); // false || true -> true
        System.out.println(condicion);
    }
}
