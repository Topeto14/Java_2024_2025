package TerceraEvaluacion.Tema7Parte2.InterfacesFuncionales.consumer;

import java.util.List;

public class EjemploConsumer2 {
    public static void main(String[] args) {

        List<Integer> nums = List.of(1,2,3,5,6,8,9);

        nums.stream()
                .forEach(n ->{
                    //Insertar en fichero
                    //Hacer lo que quiera
                    System.out.print(n + ", ");
                });
    }
}
