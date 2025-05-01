package TerceraEvaluacion.Tema7Parte2.streams.practica2.bancoSmart;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.*;
import java.util.stream.Collectors;

public class Banco {
    // Atributos

    protected List<Cuenta> cuentas;

    // Constructores

    public Banco() {        // Constructor vacio
        this.cuentas = new ArrayList<>();
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }


    // Metodos
    public void addCuenta(Cuenta c) {
        cuentas.add(c);
    }

    public Cuenta getCuentaPorid(UUID id) {
        return cuentas.stream()
                .filter(cuenta -> cuenta.getId().equals(id)) // Se filtra en el Streams si coincide
                // el id introducido con alguno que ya este
                .findFirst() // Que encuentre el primero
                .orElse(null); //Si no existe ninguno saldra null
    }

    public List<Transaccion> getTodasTransacciones() {  // va devolver una lista de objetos <Transaccion>
        return cuentas.stream() //Se crea el flujo de datos
                .flatMap(cuenta -> cuenta.getTransacciones().stream()) // Se llama a la cuenta getTransaccion para convertirla en un stream
                .toList();
        // El flatmap : concatena y devuleve otro stream unico.
    }

    // To String muestra todas las cuentas
    @Override
    public String toString() {
        return cuentas.stream()
                .map(Cuenta::toString) // equivale  .map (cuenta-> cuenta.toString())
                .collect(Collectors.joining(" nª de cuenta ")); // Los une en una sola cadena
    }


    // Metodos Stream

    //1. getTransaccionesImporteMinimo(double valor): mostrar todas las transacciones
    // con importe superior a un valor dado (por ejemplo, 500€), ordenadas cronológicamente.
    // Filter y sorted

    public List<Transaccion> getTransaccionesImporteMinimo(Double valor) {
        return getTodasTransacciones().stream()
                .filter(transaccion -> transaccion.getImporte() > 500) // Se filtra por mayores de 500€
                .sorted(Comparator.comparing(Transaccion::getFecha)) // Se ordenan comparando las fechas
                .toList(); // Se ponen en lista
    }

    //2. getIngresosTotales(): el total de ingresos del banco.
    // Filter, reduce y summarizingDouble

    public Double getIngresosTotales() {
        return getTodasTransacciones().stream()
                .filter(transaccion -> transaccion.getTipo().equals(TipoTransaccion.INGRESO))
                .mapToDouble(Transaccion::getImporte)
                .sum();
    }
    //3. getGastosTotales(): lo mismo pero para gastos

    public Double getGastosTotales() {
        return getTodasTransacciones().stream()
                .filter(transaccion -> transaccion.getTipo().equals(TipoTransaccion.GASTO))
                .mapToDouble(Transaccion::getImporte)
                .sum();
    }

    // 4.getCuentasPorSaldo(): mostrar las cuentas ordenadas por saldo de mayor a menor (sorted)

    public List<Cuenta> getCuentasPorSaldo() {
        return cuentas.stream()
                .sorted(Comparator.comparingDouble(Cuenta::getSaldo).reversed())
                .toList();
    }

    // 5. getNumTransaccionesPorCuenta(): generar un mapa donde las claves sean los ids de cuentas,
    // y los valores sean el número de transacciones de cada cuenta.
    // Collectors.groupingBy, Collectors.counting
   /** public Map<String, Long> getNumTransaccionesPorCuenta() {
        return cuentas.stream()
                .flatMap(cuenta -> cuenta.getTransacciones().stream()
                        .map(t -> new AbstractMap.SimpleEntry<>(cuenta.getId(), t)))
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,     // Agrupar por ID de cuenta
                        Collectors.counting()  // Contar cuántas transacciones hay por cada cuenta
                ));
    }*/

    //Otra opcion
     public Map<UUID, Long> getNumTransaccionPorCuenta(){
        return cuentas.stream()
                .collect(Collectors.toMap(
                        Cuenta::getId, // clave es el ID
                    cuenta -> (long)cuenta.getTransacciones().size())); // valor: nª de transacciones

    }

    //6. getCuentasActivas(): mostrar las cuentas que tengan al menos una transacción este mes

    public List<Cuenta> getCuentasActivas(){
         return cuentas.stream() // la lista cuenta la convierte en Stream
                 .filter(cuenta -> cuenta.getTransacciones().stream() // Se filtran las cuentas obtenidas de transacciones y se convierten a stream
                         .anyMatch(transaccion -> YearMonth.from(transaccion.getFecha()).equals(YearMonth.now())))  //Nos devolvera true si cumplen con las condiciones
                         .toList(); // el stream resultante lo devuelve en una lista final

    }

    //7.getTransaccionesPorDescripcion(String palabra): devuelve un mapa
    // donde la clave sea el id de cuenta,
    // y el valor un set de las transacciones de esa cuenta que contengan la palabra.

    public Map<UUID, Set<Transaccion>> getTransaccionesPorDescripcion(String palabra){
         return cuentas.stream()
                 .collect(Collectors.toMap(Cuenta::getId, cuenta -> cuenta.getTransacciones().stream() // Se recolecta los resultados del stream en un mapa, la clave sera Id, las transacciones la transformamos en un stream
                         .filter(transaccion -> transaccion.getDescripcion().toLowerCase().contains(palabra.toLowerCase())) //filtramos las transacciones con las palabras ignorando mayus y minus
                         .collect(Collectors.toSet()) // las transacciones filtradas se recolectan en un set (sin duplicados)
                 ));
    }

    //8. showAnalisisTemporal():debe mostrar agrupadas por mes la suma total de ingresos y gastos:
    // marzo 2025 – ingresos: 5000€, gastos: 3000€

    public void showAnalisisTemporal() {
        Map<YearMonth, Map<TipoTransaccion, Double>> analisis = getTodasTransacciones().stream()
                .collect(Collectors.groupingBy(  // recolectamos los elementos del stream en un mapa usando Colletcors.group...
                        transaccion -> YearMonth.from(transaccion.getFecha()), // Lo agrupamos por mes y año, por cada transiscion se extrae el mes y año
                        Collectors.groupingBy( // dentro de cada mes se hace otra recoleccion, agrupado por tipo
                                Transaccion::getTipo,
                                Collectors.summingDouble(Transaccion::getImporte) // Se suma el importe total de las transacciones
                        )
                ));
        /**Si quiero imprimirlo necesito esto
         * analisis.forEach((mes, mapaTipoImporte) -> {
         *     System.out.println("Mes: " + mes);
         *     mapaTipoImporte.forEach((tipo, total) ->
         *         System.out.println("  " + tipo + ": " + total));
         * });
         * */

        analisis.forEach((mes, datos) -> {
            double ingresos = datos.getOrDefault(TipoTransaccion.INGRESO, 0.0);
            double gastos = datos.getOrDefault(TipoTransaccion.GASTO, 0.0);
            System.out.println(mes.getMonth() + " " + mes.getYear() +
                    " – ingresos: " + ingresos + "€, gastos: " + gastos + "€");
        });
    }
}


