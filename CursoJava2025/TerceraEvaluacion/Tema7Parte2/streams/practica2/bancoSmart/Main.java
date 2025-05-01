package TerceraEvaluacion.Tema7Parte2.streams.practica2.bancoSmart;

import java.time.LocalDate;
import java.util.Random;

public class Main {
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

        Banco banco = new Banco();
        Random rand = new Random(); // Se crea una instancia de Random para generar datos aleatorios (numeros,booleanos,etc)

        // Se crea 10 clientes y cuentas
        for (int i = 0; i < 10; i++) {
            Cliente cliente = new Cliente(
                    "Dni" + i,
                    "Nombre" + i,
                    "Email" + i,
                    "Telefono" + i,
                    "Calle" + i,
                    "Murcia" + i,
                    "España"
            );

            Cuenta cuenta = new Cuenta(cliente); // Se crea una cuenta asociada al cliente
            banco.addCuenta(cuenta); // se agrega esa cuenta al banco
            // Generar de 1 a 10 transacciones aleatorias
            int numtransacciones = genNumAleatorioInteger(1,10); // int numTransacciones = 1 + random.nextInt(10);
            for (int j = 0; j < numtransacciones; j++) {  // Se repite esa cantidad de veces para generar cada transacción.
                TipoTransaccion tipo = rand.nextBoolean() ? TipoTransaccion.INGRESO: TipoTransaccion.GASTO; // Se elige aleatoriamente entre ingresos y gastos
                double importe = 100 +(900 * rand.nextDouble()); // Se genera un importe entre 100 y 1000
                LocalDate fecha = LocalDate.now().minusDays(rand.nextInt(60)); // Se genera una fecha aleatoria dentro de los ultimos 60 dias
                String descripcion = tipo == TipoTransaccion.INGRESO ? "ingreso de nomina" : "gasto de servicios"; // La descripcion depende del tipo

                Transaccion transaccion = new Transaccion(cuenta,importe,fecha, tipo,descripcion); // Se crea una transaccion con los datos anteriores
                cuenta.addTransaccion(transaccion); // Se agrega a la lista de transacciones de la cuenta
            }

        }
        // Mostrar resultados de cada método Stream
        System.out.println("=== Transacciones > 500€ ===");
        banco.getTransaccionesImporteMinimo(500.0).forEach(System.out::println);

        System.out.println("\n=== Total de Ingresos ===");
        System.out.println(banco.getIngresosTotales() + "€");

        System.out.println("\n=== Total de Gastos ===");
        System.out.println(banco.getGastosTotales() + "€");

        System.out.println("\n=== Cuentas por saldo descendente ===");
        banco.getCuentasPorSaldo().forEach(System.out::println);

        System.out.println("\n=== Número de transacciones por cuenta ===");
        banco.getNumTransaccionPorCuenta().forEach((id, count) ->
                System.out.println("Cuenta " + id + ": " + count + " transacciones"));

        System.out.println("\n=== Cuentas activas este mes ===");
        banco.getCuentasActivas().forEach(c ->
                System.out.println("Cuenta activa: " + c.getId()));

        System.out.println("\n=== Transacciones que contienen 'nómina' ===");
        banco.getTransaccionesPorDescripcion("nómina").forEach((id, transSet) -> {
            System.out.println("Cuenta: " + id);
            transSet.forEach(System.out::println);
        });

        System.out.println("\n=== Análisis temporal de ingresos y gastos ===");
        banco.showAnalisisTemporal();

    }
}
