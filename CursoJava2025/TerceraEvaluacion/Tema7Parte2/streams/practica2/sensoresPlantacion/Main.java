package TerceraEvaluacion.Tema7Parte2.streams.practica2.sensoresPlantacion;
import TerceraEvaluacion.Tema7Parte2.streams.practica2.sensoresPlantacion.Registro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Generar un double max y min aleatorio
     * @param min num minimo
     * @param max num maximo
     * return double aleatorio entre min y max
    */
    public static Double genNumAleatorioDouble(Integer min, Integer max) {
        return (Math.random() * (max - min)) + min;
    }

    /**
     * Generar un entero aleatorio entre min y max
     * param min num minimo
     * param max num maximo
     * return entero aleatorio entre min y max
     */
    public static Integer genNumAleatorioInteger(Integer min, Integer max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public static void main(String[] args) {

        ArrayList<Registro> registros = new ArrayList<>();
        // Generar 100 registros de forma aleatoria
        for (int i = 0; i < 100; i++) {
            registros.add(
                    new Registro(LocalDateTime.of(genNumAleatorioInteger(2020,2030), // Año aleatorio entre 2020 y 2030
                            genNumAleatorioInteger(1,12),  // Año aleatorio entre 1 y 12
                            genNumAleatorioInteger(10,28), // Dia aleatorio entre 1 y 28
                            genNumAleatorioInteger(1,24),  // Hora aleatorio entre 1 y 24
                            genNumAleatorioInteger(1,60),  // Minuto aleatoria entre 1 y 60
                            genNumAleatorioInteger(1,60)  // Segundo aleatorio ebtre 1 y 60
                            ),
                            genNumAleatorioDouble(-10,50), // Temperatura aleatoria entre -10 y 50 grados
                            genNumAleatorioDouble(0,90)    // Humedad aleatoria entre 0 y 90
                    )
            );


        }

        //1. Filtrar los registros de temperatura que sean mayores a 25 grados, la humedad sea menor a 70 y la
        //fecha sea anterior a la fecha actual, y mostrarlos.

        System.out.println("Registros con temperaturas mayores a 25 grados, humedad menos a 70 y fechas anterior a la actual");

        registros.stream()
                .filter(registro -> registro.getTemperatura() > 25)
                .filter(registro -> registro.getHumedad() < 70)
                .filter(registro -> registro.getFechaHora().isBefore(LocalDateTime.now()))
                .forEach(System.out::println);
        System.out.println();;


        //2. Encontrar el registro con la temperatura más alta y mostrar el registro completo.
        System.out.println("Registro con la temperatura mas alta y mostrar el registro completo");
        System.out.println(
                registros.stream()
                .max((reg1, reg2) -> reg1.getTemperatura().compareTo(reg2.getTemperatura()))
                .get()  // se utiliza get porque se sabe que no esta vacio,
                        // si hay probabilidad de que este vacio se usa orElse o ifPresent
        );
        System.out.println();

    //3. Obtener una lista con las fechas/horas de todas las tomas de datos.
        System.out.println("Obtener una lista con las fechas/horas de todas las tomas de datos");
        List<LocalDateTime> fechasHora = registros.stream()
                .map(Registro::getFechaHora)
                .toList();
        fechasHora.forEach(System.out::println);

    // 4. Incrementar en 5 unidades la humedad de todos los registros y mostrar las temperaturas,
        //humedades y fechas/horas actualizadas.
        System.out.println(" Incrementar en 5 unidades la humedad de todos los registros y mostrar los demas datos ");
        registros.stream()
                .peek(registro -> registro.setHumedad(registro.getHumedad()+5))
                .forEach(System.out::println);

        System.out.println();

    // 5.Encontrar el registro con la temperatura más baja que tenga una humedad mayor a 80 y mostrar la
        //temperatura, humedad y fecha.
        System.out.println("Registro temperatura mas baja que tenga humedad mayor a 80. Mostrar todos los datos ");
        System.out.println(registros.stream()
                .filter(registro -> registro.getHumedad()>80)
                .min((reg1, reg2) -> reg1.getTemperatura().compareTo(reg2.getTemperatura()))
                .get()
        );
        System.out.println();

    // 6.Verificar si algún registro tiene una temperatura mayor a 30 grados, humedad mayor a 90 y la fecha
        // es de hoy. Mostrar un mensaje indicando si hay algún registro que cumple esta condición o no.

        System.out.println("Comprobar si hay un registro con temperatura mayor a 30 grados, humedad mayor a 90 y la fecha es hoy");

        System.out.println(
                registros.stream()
                        .anyMatch(registro -> registro.getHumedad()>30
                                && registro.getTemperatura()>90
                                && registro.getFechaHora().toLocalDate().equals(LocalDate.now()))
        );

    // 7. Muestra 10 registros saltandote los 5 primeros.
        System.out.println("Mostrar 10 registros saltando los 5 primeros");
        registros.stream()
                .skip(5)
                .limit(10)
                .forEach(System.out::println);
        System.out.println();

    // 8. Muestra los registros ordenados por fecha (sorted(Comparator))
        System.out.println("Mostrar los registros ordenados por fecha");
        registros.stream()
                .sorted((reg1,reg2)->reg1.getFechaHora().compareTo(reg2.getFechaHora()))
                .forEach(System.out::println);
        System.out.println();

    // 9. Cuenta los registros que tengan temperatura mayor a 35 grados (count())
        System.out.println("Cuenta los registros que tengan temperatura mayor a 35 grados");
        System.out.println(registros.stream()
                .filter(registro -> registro.getTemperatura()>35)
                .count()
        );
        System.out.println();
    // 10. Calcular la temperatura promedio de todos los registros (transformarlo en Stream<Double> y
        // llamar a average()).
        System.out.println("Calcular temperatura media de todos los registros");
        System.out.println("La temperatura media es " +
                registros.stream()
                        .mapToDouble(Registro::getTemperatura)
                        .average()
                        .getAsDouble()

        );



    }


}
